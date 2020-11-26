/*********************************************************************
 * Author: George Aziz
 * Date Created: 07/09/2020
 * Date Last Modified : 10/09/2020
 * Purpose: Player class contains all information in regards to player
 *********************************************************************/

package curtin.edu.au.assignment.models;

import java.util.Random;

public class Player
{
    private static Player instance = null;
    private int curPoint, endPoint, curFlag; //curFlag Identifies which flag is currently selected by the player
    private int specialPoints = 0;
    private Question curQuestion; //Identifies which question is currently selected by the player

    private Player()
    {
        //Create start/end random point
        Random rand = new Random();
        //Random endRand = new Random();
        curPoint = rand.nextInt((300 - 100) + 1) + 100;
        endPoint = rand.nextInt((600 - (curPoint + 100)) + 1) + (curPoint + 100);
    }

    public static Player get()
    {
        if (instance == null)
        {
            instance = new Player();
        }
        return instance;
    }

    public void restartPlayer()
    {
        instance = null; //Once method is called a get() after will create a new player
    }

    public int getCurPoint()
    {
        return curPoint;
    }

    public int getEndPoint()
    {
        return endPoint;
    }

    public void setCurPoint(int curPoint)
    {
        this.curPoint = curPoint;
    }

    public boolean isWinner()
    {
        boolean winner = false;
        if (curPoint >= endPoint)
        {
            winner = true;
        }

        return winner;
    }

    public int getCurFlag()
    {
        return curFlag;
    }

    public void setCurFlag(int pos)
    {
        curFlag = pos;
    }

    public Question getCurQuestion()
    {
        return curQuestion;
    }

    public void setCurQuestion(Question curQuestion)
    {
        this.curQuestion = curQuestion;
    }

    public int getSpecialPoints()
    {
        return specialPoints;
    }

    public void setSpecialPoints(int specialPoints)
    {
        this.specialPoints = specialPoints;
    }
}
