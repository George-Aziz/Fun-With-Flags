/***************************************************************
 * Author: George Aziz
 * Date Created: 05/09/2020
 * Date Last Modified : 10/09/2020
 * Purpose: Flag Model class that contains all info for a flag
 ***************************************************************/

package curtin.edu.au.assignment.models;

import java.util.List;

public class Flag
{
    private final int drawableId;
    private String label;
    private List<Question> questions;

    public Flag(int drawableId, String label, List<Question> questions)
    {
        this.drawableId = drawableId;
        this.label = label;
        this.questions = questions;
    }

    public int getDrawableId()
    {
        return drawableId;
    }

    public String getLabel()
    {
        return label;
    }

    public List<Question> getQuestions()
    {
        return questions;
    }
}
