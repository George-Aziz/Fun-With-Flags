/*****************************************************************
 * Author: George Aziz
 * Date Created: 08/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Fragment that displays all questions to be selected
 *****************************************************************/

package curtin.edu.au.assignment.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import curtin.edu.au.assignment.activities.ScreenThreeActivity;
import curtin.edu.au.assignment.activities.ScreenTwoActivity;
import curtin.edu.au.assignment.models.Flag;
import curtin.edu.au.assignment.models.FlagData;
import curtin.edu.au.assignment.models.Player;
import curtin.edu.au.assignment.models.Question;
import curtin.edu.au.assignment.R;
import curtin.edu.au.assignment.activities.ScreenFourActivity;

public class QuestionSelectorFragment extends Fragment
{
    private Player player = Player.get();
    private FlagData flagData = FlagData.get();
    private GridLayoutManager glm = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL,false);
    private static QuestionAdapter adapter;
    private ImageButton backBtn;

    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        View view = inflater.inflate(R.layout.fragment_question_selector, ui, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.questionSelectRecycler);
        rv.setLayoutManager(glm);

        int curFlagIdx = player.getCurFlag();
        Flag curFlag = flagData.get(curFlagIdx); //Gets Current Flag

        adapter = new QuestionAdapter(curFlag.getQuestions()); //Gives recycler view adapter questions to display
        rv.setAdapter(adapter);

        StatusBarFragment.updateCurScore();
        //Back Button
        StatusBarFragment.enableBackBtn(getActivity()); //Enables the Back Button
        backBtn = StatusBarFragment.getBackButton(); //Gets Back Button from Status Bar
        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getActivity(), ScreenTwoActivity.class));
            }
        });

        return view;
    }

    //Used in Activity to get the gridlayout manager to provide to FragmentA(LayoutSelectorFragment)
    public GridLayoutManager getGlm()
    {
        return glm;
    }

    //Used to update Question Fragment when in Tablet mode
    public static void updateQuestionView()
    {
        adapter.notifyDataSetChanged();
    }

    private class QuestionVHolder extends RecyclerView.ViewHolder
    {
        private Button questionLabel;

        public QuestionVHolder(LayoutInflater li, ViewGroup parent)
        {
            super(li.inflate(R.layout.question_button, parent, false));
            questionLabel = (Button) itemView.findViewById(R.id.qButton);
        }

        public void bind(Question data)
        {
            final Question question = data;
            String qNum = "Q";
            String reward = "\nPoint: ";
            String penalty = "\nPenalty: ";
            //String that will be displayed in each question button
            String finalString = qNum + String.valueOf(getAbsoluteAdapterPosition() + 1)+ reward + String.valueOf(data.getReward()) + penalty + String.valueOf(data.getPenalty());
            if (data.ifSpecial())
            {
                questionLabel.setText("(SPECIAL) " + finalString); //Add (Special) if question is Special
            }
            else
            {
                questionLabel.setText(finalString);
            }
            if (question.getAnswered() == true)
            {
                questionLabel.setClickable(false); //If question is answered then disable
                questionLabel.setAlpha(0.5f); //Visual feedback that button is disabled
            }
            else
            {
                questionLabel.setClickable(true);
                questionLabel.setAlpha(1.0f);

                questionLabel.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        player.setCurQuestion(question);

                        boolean isTablet = getResources().getBoolean(R.bool.isTablet);
                        if (isTablet == true) // If in tablet view then do not start new activity but display answer fragment to the right pane
                        {
                            ScreenThreeActivity.createAnswerScreen();
                        }
                        else //Start activity like normal if on mobile view
                        {
                            startActivity(new Intent(getActivity(), ScreenFourActivity.class));
                        }
                    }
                });
            }
        }
    }

    private class QuestionAdapter extends RecyclerView.Adapter<QuestionVHolder>
    {
        private List<Question> data;

        public QuestionAdapter(List<Question> data)
        {
            this.data = data;
        }

        @Override
        public int getItemCount()
        {
            return data.size();
        }

        @Override
        public QuestionVHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            LayoutInflater li = LayoutInflater.from(getActivity());
            return new QuestionVHolder(li, parent);
        }

        @Override
        public void onBindViewHolder(QuestionVHolder vh, final int index)
        {
            vh.bind(data.get(index));
        }
    }
}
