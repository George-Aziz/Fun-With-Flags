/************************************************************
 * Author: George Aziz
 * Date Created: 05/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Fragment that displays all flags to be selected
 ************************************************************/

package curtin.edu.au.assignment.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import curtin.edu.au.assignment.models.Flag;
import curtin.edu.au.assignment.models.FlagData;
import curtin.edu.au.assignment.models.Player;
import curtin.edu.au.assignment.R;
import curtin.edu.au.assignment.activities.ScreenThreeActivity;
import curtin.edu.au.assignment.models.Question;

public class FlagSelectorFragment extends Fragment
{
    private FlagAdapter adapter;
    private GridLayoutManager glm = new GridLayoutManager( getActivity(), 2, GridLayoutManager.VERTICAL,false);

    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        View view = inflater.inflate(R.layout.fragment_flag_selector, ui, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.flagSelectRecycler);
        rv.setLayoutManager(glm);

        FlagData data = FlagData.get();
        adapter = new FlagAdapter(data);
        rv.setAdapter(adapter);

        return view;
    }

    @Override
    public void onResume() //onResume view gets updated to update
    {
        adapter.notifyDataSetChanged();
        StatusBarFragment.updateCurScore();
        super.onResume();
    }

    //Method that returns the grid layout manager so that FragmentA(LayoutSelector) can change layout
    public GridLayoutManager getGlm()
    {
        return glm;
    }

    private class FlagVHolder extends RecyclerView.ViewHolder
    {
        private ImageView flagBtn;
        private TextView flagLabel;
        private int answeredAmount = 0; //Each flag has amount of answered questions

        public FlagVHolder(LayoutInflater li, ViewGroup parent)
        {
            super(li.inflate(R.layout.flag_element, parent, false));
            flagBtn = (ImageView) itemView.findViewById(R.id.flagButton);
            flagLabel = (TextView) itemView.findViewById(R.id.flagName);
        }

        public void bind(final Flag data)
        {
            flagBtn.setImageResource(data.getDrawableId());
            flagLabel.setText(data.getLabel());

            flagBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Player player = Player.get();
                    player.setCurFlag(getAbsoluteAdapterPosition());

                    if(player.getSpecialPoints() > 0)
                    {
                        for (Question curQ : data.getQuestions())
                        {
                            curQ.setPoints(curQ.getReward() + player.getSpecialPoints());
                        }
                        player.setSpecialPoints(0);
                    }
                    Intent intent = new Intent(getActivity(), ScreenThreeActivity.class);
                    startActivity(intent);
                }
            });

            for(Question curQ : data.getQuestions()) //For each question in a flag
            {
                if(curQ.getAnswered() == true) //Checks if the question is answered
                {
                    answeredAmount = answeredAmount + 1;
                }
            }

            if(answeredAmount == data.getQuestions().size()) //If all questions have been answered
            {
                flagBtn.setEnabled(false); //Disables button
                flagBtn.setAlpha(.5f); //Provides visual feedback for disabled button
            }
            else
            {
                flagBtn.setEnabled(true); //Keeps button enabled
                flagBtn.setAlpha(1.0f);
            }
            answeredAmount = 0; //Resets answeredAmount after every click to make sure nothing unexpected happens
        }
    }

    private class FlagAdapter extends RecyclerView.Adapter<FlagVHolder>
    {
        private FlagData data;

        public FlagAdapter(FlagData data)
        {
            this.data = data;
        }

        @Override
        public int getItemCount()
        {
            return data.size();
        }

        @Override
        public FlagVHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            LayoutInflater li = LayoutInflater.from(getActivity());
            return new FlagSelectorFragment.FlagVHolder(li, parent);
        }

        @Override
        public void onBindViewHolder(FlagVHolder vh, int index)
        {
            vh.bind(data.get(index));
        }
    }
}
