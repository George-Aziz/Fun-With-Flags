/**************************************************************************
 * Author: George Aziz
 * Date Created: 09/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Screen 4 Activity for Mobile only where questions are displayed
 **************************************************************************/

package curtin.edu.au.assignment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import curtin.edu.au.assignment.fragments.AnswerSelectorFragment;
import curtin.edu.au.assignment.R;
import curtin.edu.au.assignment.fragments.StatusBarFragment;


public class ScreenFourActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_four);

        FragmentManager fm = getSupportFragmentManager();

        //Fragment that displays status bar which indicates whether player is a winner or not and their points with back button
        StatusBarFragment statusFrag = (StatusBarFragment) fm.findFragmentById(R.id.statusBarSection);
        if (statusFrag == null)
        {
            statusFrag = new StatusBarFragment();
            fm.beginTransaction().add(R.id.statusBarSection, statusFrag).commit();
        }

        //Fragment that displays the question with all the answer options for each question
        AnswerSelectorFragment answerFrag = (AnswerSelectorFragment) fm.findFragmentById(R.id.answerSelector);
        if (answerFrag == null)
        {
            answerFrag = new AnswerSelectorFragment();
            fm.beginTransaction().add(R.id.answerSelector, answerFrag).commit();
        }
    }
}