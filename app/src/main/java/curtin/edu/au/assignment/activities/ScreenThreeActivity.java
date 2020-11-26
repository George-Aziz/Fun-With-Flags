/*********************************************************************************************
 * Author: George Aziz
 * Date Created: 08/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Screen 2 Activity which displays the question selection only in mobile and additionally
 *          in tablet mode displays the question with its answers in tablet mode
 ********************************************************************************************/

package curtin.edu.au.assignment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import curtin.edu.au.assignment.fragments.AnswerSelectorFragment;
import curtin.edu.au.assignment.fragments.LayoutSelectorFragment;
import curtin.edu.au.assignment.fragments.QuestionSelectorFragment;
import curtin.edu.au.assignment.R;
import curtin.edu.au.assignment.fragments.StatusBarFragment;

public class ScreenThreeActivity extends AppCompatActivity
{
    private static FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_three);

        fm = getSupportFragmentManager();

        //Status bar that displays current points of user, back button and also whether player is winner or loser
        StatusBarFragment statusFrag = (StatusBarFragment) fm.findFragmentById(R.id.statusBarSection);
        if (statusFrag == null)
        {
            statusFrag = new StatusBarFragment();
            fm.beginTransaction().add(R.id.statusBarSection, statusFrag).commit();
        }

        //Fragment that displays question buttons to the user
        QuestionSelectorFragment qFrag = (QuestionSelectorFragment) fm.findFragmentById(R.id.questionSelector);
        if (qFrag == null)
        {
            qFrag = new QuestionSelectorFragment();
            fm.beginTransaction().add(R.id.questionSelector, qFrag).commit();
        }

        //Fragment that allows Question Buttons to be displayed in either 1/2/3 rows/columns and scroll horizontal/vertical
        LayoutSelectorFragment selectorFrag = (LayoutSelectorFragment) fm.findFragmentById(R.id.layoutGridSelector);
        if (selectorFrag == null)
        {
            selectorFrag = new LayoutSelectorFragment();
            fm.beginTransaction().add(R.id.layoutGridSelector, selectorFrag).commit();
        }
        //Gives the layout selector fragment the grid layout manager of question frag to be able to work
        selectorFrag.setGlm(qFrag.getGlm());
    }

    //Method that is only used when in tablet mode that allows answer fragment to be displayed beside Question Fragment
    public static void createAnswerScreen()
    {
        AnswerSelectorFragment answerFrag = (AnswerSelectorFragment) fm.findFragmentById(R.id.answerSelector);
        if (answerFrag == null)
        {
            answerFrag = new AnswerSelectorFragment();
            fm.beginTransaction().add(R.id.answerSelector, answerFrag).commit();
        }
        else //Rather than adding/creating a new fragment all the time, a replace is more suitable since its same fragment
        {
            answerFrag = new AnswerSelectorFragment();
            fm.beginTransaction().replace(R.id.answerSelector, answerFrag).commit();
        }
    }
}