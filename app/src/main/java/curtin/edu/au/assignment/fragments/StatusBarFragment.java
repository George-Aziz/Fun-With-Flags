/*****************************************************************
 * Author: George Aziz
 * Date Created: 05/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Fragment that displays the status bar to the user
 *****************************************************************/

package curtin.edu.au.assignment.fragments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import curtin.edu.au.assignment.activities.ScreenOneActivity;
import curtin.edu.au.assignment.activities.ScreenThreeActivity;
import curtin.edu.au.assignment.models.FlagData;
import curtin.edu.au.assignment.models.Player;
import curtin.edu.au.assignment.R;
import curtin.edu.au.assignment.models.QuestionData;

public class StatusBarFragment extends Fragment
{
    private Player player = Player.get();
    private static View view;
    private static Button finalState;
    private static ImageButton backButton;
    private static TextView currentScore;

    private static int greenColour;
    private static int redColour;

    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        view = inflater.inflate(R.layout.fragment_statusbar, ui, false);

        backButton = (ImageButton) view.findViewById(R.id.backButton);
        currentScore = (TextView) view.findViewById(R.id.curScorePoint);
        finalState = (Button) view.findViewById(R.id.finalButton);
        currentScore.setText(String.valueOf(String.valueOf(player.getCurPoint())));

        finalState.setAlpha(0.0f);
        finalState.setEnabled(false);
        finalState.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                player.restartPlayer(); //Restarts Player
                FlagData.get().restartFlag(); //Restarts Flags and enables any flag that has been disabled before
                QuestionData.get().restartQuestions(); //Restarts all questions and sets them to unanswered
                startActivity(new Intent(getContext(), ScreenOneActivity.class));
            }
        });

        //Gets colours to use for finalState button
        greenColour = getResources().getColor(R.color.colorWinner);
        redColour = getResources().getColor(R.color.colorLoser);

        return view;
    }

    @Override
    public void onResume()
    {
        super.onResume();
        updateCurScore();
        finalState.setAlpha(0.0f);
        finalState.setEnabled(false);
        if (player.getCurPoint() >= player.getEndPoint())
        {
            finalStateWinner();
        } else if (player.getCurPoint() <= 0)
        {
            finalStateLoser();
        }
    }


    public static void updateCurScore()
    {
        currentScore.setText(String.valueOf(Player.get().getCurPoint()));
    }

    public static void enableBackBtn(final Activity activity)
    {
        backButton.setEnabled(true);
        backButton.setAlpha(1.0f);

    }

    public static void finalStateWinner()
    {
        finalState.setText("YOU'VE WON - CLICK HERE");
        finalState.setBackgroundColor(greenColour);
        finalState.bringToFront();
        finalState.setEnabled(true);
        finalState.setAlpha(1.0f);
    }

    public static void finalStateLoser()
    {
        finalState.setText("YOU'VE LOST - CLICK HERE");
        finalState.setBackgroundColor(redColour);
        finalState.bringToFront();
        finalState.setEnabled(true);
        finalState.setAlpha(1.0f);
    }

    public static ImageButton getBackButton()
    {
        return backButton;
    }

}
