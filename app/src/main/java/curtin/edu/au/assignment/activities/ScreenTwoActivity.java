/*********************************************************************************************
 * Author: George Aziz
 * Date Created: 04/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Screen 2 Activity which displays flags to the user which contain questions in each
 ********************************************************************************************/

package curtin.edu.au.assignment.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import curtin.edu.au.assignment.fragments.FlagSelectorFragment;
import curtin.edu.au.assignment.fragments.LayoutSelectorFragment;
import curtin.edu.au.assignment.R;
import curtin.edu.au.assignment.fragments.StatusBarFragment;

public class ScreenTwoActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);

        FragmentManager fm = getSupportFragmentManager();

        //Flag Selector Fragment displays all flags in the app to the user
        FlagSelectorFragment flagFrag = (FlagSelectorFragment) fm.findFragmentById(R.id.flagSelector);
        if (flagFrag == null)
        {
            flagFrag = new FlagSelectorFragment();
            fm.beginTransaction().add(R.id.flagSelector, flagFrag).commit();
        }

        //Fragment that allows Flags to be displayed in either 1/2/3 rows/columns and scroll horizontal/vertical
        LayoutSelectorFragment selectorFrag = (LayoutSelectorFragment) fm.findFragmentById(R.id.layoutSelector);
        if (selectorFrag == null)
        {
            selectorFrag = new LayoutSelectorFragment();
            fm.beginTransaction().add(R.id.layoutSelector, selectorFrag).commit();
        }

        //Status bar that displays current points of user, back button and also whether player is winner or loser
        StatusBarFragment statusFrag = (StatusBarFragment) fm.findFragmentById(R.id.statusBarSection);
        if (statusFrag == null)
        {
            statusFrag = new StatusBarFragment();
            fm.beginTransaction().add(R.id.statusBarSection, statusFrag).commit();
        }
        //Gives the layout selector fragment the grid layout manager of flag selector frag to be able to work
        selectorFrag.setGlm(flagFrag.getGlm());
    }
}