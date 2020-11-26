/*********************************************************************************************
 * Author: George Aziz
 * Date Created: 03/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Screen 1 Activity that displays the welcome screen with logo and start/end points
 ********************************************************************************************/

package curtin.edu.au.assignment.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import curtin.edu.au.assignment.models.Player;
import curtin.edu.au.assignment.R;

public class ScreenOneActivity extends AppCompatActivity
{
    private Button startButton;
    private TextView startPoint, targetPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_one);

        //GETTING ALL BUTTONS ON ACTIVITY SCREEN
        startButton = (Button) findViewById(R.id.startButton);
        startPoint = (TextView) findViewById(R.id.startPoint);
        targetPoint = (TextView) findViewById(R.id.targetPoint);

        Player player = Player.get(); //Creates Player Object here
        /* Assigning of view content */
        startPoint.setText(String.valueOf(player.getCurPoint()));
        targetPoint.setText(String.valueOf(player.getEndPoint()));
        startButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //When the start button is clicked/tapped on, ScreenTwoActivity will be displayed
                startActivity(new Intent(ScreenOneActivity.this, ScreenTwoActivity.class));
            }
        });
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Player player = Player.get();
        startPoint.setText(String.valueOf(player.getCurPoint()));
    }
}