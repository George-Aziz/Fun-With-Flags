/*********************************************************************
 * Author: George Aziz
 * Date Created: 07/09/2020
 * Date Last Modified : 10/09/2020
 * Purpose: Class for Question to be able to retrieve question's info
 ********************************************************************/

package curtin.edu.au.assignment.models;

public class Question
{
    private String question;
    private String[] answers;
    private int answerPos, reward, penalty;
    private boolean isSpecial;
    private boolean answered = false;

    public Question(String question, String[] answers, int answerPos, int reward, int penalty, boolean isSpecial)
    {
        this.question = question;
        this.answers = answers;
        this.answerPos = answerPos;
        this.reward = reward;
        this.penalty = penalty;
        this.isSpecial = isSpecial;
    }

    public String getQuestion()
    {
        return question;
    }

    public String[] getAnswers()
    {
        return answers;
    }

    public int getAnswerPos()
    {
        return answerPos;
    }

    public int getReward()
    {
        return reward;
    }

    public int getPenalty()
    {
        return penalty;
    }

    public boolean ifSpecial()
    {
        return isSpecial;
    }

    public boolean getAnswered()
    {
        return answered;
    }

    public void setAnswered (boolean answered)
    {
        this.answered = answered;
    }

    public void setPoints(int reward)
    {
        this.reward = reward;
    }
}
