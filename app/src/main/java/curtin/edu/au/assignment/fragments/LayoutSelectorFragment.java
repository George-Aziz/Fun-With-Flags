/*****************************************************************************
 * Author: George Aziz
 * Date Created: 04/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Fragment that displays the options to change recycler view layout
 *****************************************************************************/

package curtin.edu.au.assignment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import curtin.edu.au.assignment.R;

public class LayoutSelectorFragment extends Fragment
{
    private ImageButton orientArrow, oneCol, twoCol, threeCol;
    private boolean vertical = true; //By default it will be grid will be vertical
    private GridLayoutManager glm;

    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        View view = inflater.inflate(R.layout.fragment_layout_selector, ui, false);

        orientArrow = (ImageButton) view.findViewById(R.id.arrow);
        oneCol = (ImageButton) view.findViewById(R.id.oneCol);
        twoCol = (ImageButton) view.findViewById(R.id.twoCol);
        threeCol = (ImageButton) view.findViewById(R.id.threeCol);

        //Arrow that changes orientation of recyclerview scrolling
        orientArrow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (vertical) //If vertical is true that means it will go to Horizontal
                {
                    glm.setOrientation(GridLayoutManager.HORIZONTAL);
                    orientArrow.setRotation(90);
                    oneCol.setRotation(90);
                    twoCol.setRotation(90);
                    threeCol.setRotation(90);
                    vertical = false;
                }
                else //If vertical is false that means it will go to Vertical
                {
                    glm.setOrientation(GridLayoutManager.VERTICAL);
                    orientArrow.setRotation(0);
                    oneCol.setRotation(0);
                    twoCol.setRotation(0);
                    threeCol.setRotation(0);
                    vertical = true;
                }
            }
        });

        //Chnages Grid Layout to one column
        oneCol.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                glm.setSpanCount(1);
            }
        });

        //Changes Grid Layout to two columns
        twoCol.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                glm.setSpanCount(2);
            }
        });

        //Changes Grid Layout to three columns
        threeCol.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                glm.setSpanCount(3);
            }
        });

        return view;
    }

    //Mutator for the GridLayoutManager in order for the buttons to work
    public void setGlm(GridLayoutManager glm)
    {
        this.glm = glm;
    }
}

