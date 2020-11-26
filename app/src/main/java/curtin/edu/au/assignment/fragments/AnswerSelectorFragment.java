/*******************************************************************************
 * Author: George Aziz
 * Date Created: 09/09/2020
 * Date Last Modified : 18/09/2020
 * Purpose: Fragment that contains all answer options and the question displayed
 *******************************************************************************/

package curtin.edu.au.assignment.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.Arrays;
import java.util.List;

import curtin.edu.au.assignment.activities.ScreenThreeActivity;
import curtin.edu.au.assignment.models.Player;
import curtin.edu.au.assignment.models.Question;
import curtin.edu.au.assignment.R;

public class AnswerSelectorFragment extends Fragment
{
    private Player player = Player.get();
    private TextView question;
    private ImageButton backBtn;
    private Button answer1,answer2,answer3,answer4;
    private Question curQuestion;

    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        View view = null;

        boolean isTablet = getResources().getBoolean(R.bool.isTablet);
        if(!isTablet) //Back Button not needed for when tablet landscape mode is active
        {
            StatusBarFragment.enableBackBtn(getActivity());
            backBtn = StatusBarFragment.getBackButton(); //Gets the current back button

            //Makes Back button go to previous activity which is ScreenThree
            backBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    startActivity(new Intent(getActivity(), ScreenThreeActivity.class));
                }
            });
        }

        curQuestion = player.getCurQuestion(); //Gets the current selected question
        if(curQuestion != null)
        {
            List<String> answers = Arrays.asList(curQuestion.getAnswers());
            //Since there are different layouts for different amount of answers per question size must be obtained
            int answersAmount = answers.size();

            //For each answer button when click happens, it will disable every button on the screen with it and check answer
            if (answersAmount == 4) //4 Answers
            {
                view = inflater.inflate(R.layout.answers_layout4, ui, false);
                question = (TextView) view.findViewById(R.id.question);
                answer1 = (Button) view.findViewById(R.id.answer1);
                answer2 = (Button) view.findViewById(R.id.answer2);
                answer3 = (Button) view.findViewById(R.id.answer3);
                answer4 = (Button) view.findViewById(R.id.answer4);

                question.setText(curQuestion.getQuestion());
                answer1.setText(answers.get(0));
                answer2.setText(answers.get(1));
                answer3.setText(answers.get(2));
                answer4.setText(answers.get(3));

                answer1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(0);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                        answer4.setEnabled(false);
                    }
                });

                answer2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(1);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                        answer4.setEnabled(false);
                    }
                });

                answer3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(2);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                        answer4.setEnabled(false);
                    }
                });

                answer4.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(3);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                        answer4.setEnabled(false);
                    }
                });
            } else if (answersAmount == 3) //3 Answers
            {
                view = inflater.inflate(R.layout.answers_layout3, ui, false);
                question = (TextView) view.findViewById(R.id.question);
                answer1 = (Button) view.findViewById(R.id.answer1);
                answer2 = (Button) view.findViewById(R.id.answer2);
                answer3 = (Button) view.findViewById(R.id.answer3);

                question.setText(curQuestion.getQuestion());
                answer1.setText(answers.get(0));
                answer2.setText(answers.get(1));
                answer3.setText(answers.get(2));


                answer1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(0);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                    }
                });

                answer2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(1);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                    }
                });

                answer3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(2);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                    }
                });

            } else if (answersAmount == 2) //2 Answers
            {
                view = inflater.inflate(R.layout.answers_layout2, ui, false);
                question = (TextView) view.findViewById(R.id.question);
                answer1 = (Button) view.findViewById(R.id.answer1);
                answer2 = (Button) view.findViewById(R.id.answer2);

                question.setText(curQuestion.getQuestion());
                answer1.setText(answers.get(0));
                answer2.setText(answers.get(1));

                answer1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(0);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                    }
                });

                answer2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        checkAnswer(1);
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                    }
                });
            }
        }

            return view;
        }

    @Override
    public void onResume() //onResume needed for when screen is rotated to make sure buttons stays disabled if answered
    {
        super.onResume();
        int size = Arrays.asList(curQuestion.getAnswers()).size();
        if(curQuestion.getAnswered())
        {
            answer1.setEnabled(false);
            answer2.setEnabled(false);

            if (size == 4)
            {
                answer3.setEnabled(false);
                answer4.setEnabled(false);
            } else if (size == 3)
            {
                answer3.setEnabled(false);
            }
        }
    }

    //Method that checks Selected Answer
    public void checkAnswer(int curBtnIdx)
        {
            QuestionSelectorFragment.updateQuestionView(); //When on Tablet mode QuestionFragment will update selected question button to be disabled
            int answerPos = curQuestion.getAnswerPos();
            if (answerPos == curBtnIdx) //If answer is correct
            {
                if (curQuestion.ifSpecial() == true) //Check if special
                {
                    player.setSpecialPoints(player.getSpecialPoints() + 10); //Add 10 points for special question although in future could be random
                    Toast.makeText(getActivity(), "Correct Special Answer! Your next selected country will get an extra 10 points for each question", Toast.LENGTH_LONG).show();
                } else
                {
                    Toast.makeText(getActivity(), "Correct Answer! You may navigate back to the questions by pressing the back button.", Toast.LENGTH_LONG).show();
                }
                player.setCurPoint(player.getCurPoint() + curQuestion.getReward());

                if (player.getCurPoint() >= player.getEndPoint())
                {
                    StatusBarFragment.finalStateWinner(); //Indicates to the player that they have won
                }
            } else
            {
                Toast.makeText(getActivity(), "Wrong Answer! You may navigate back to the questions by pressing the back button.", Toast.LENGTH_LONG).show();
                player.setCurPoint(player.getCurPoint() - curQuestion.getPenalty());
                if (player.getCurPoint() <= 0)
                {
                    StatusBarFragment.finalStateLoser(); //Indicates to the player that they have lost
                }
            }
            StatusBarFragment.updateCurScore(); //Updates points in status bar
            curQuestion.setAnswered(true); //Sets the question to become answered so that it cant be accessed again
    }
}
