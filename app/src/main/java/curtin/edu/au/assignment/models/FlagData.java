/***************************************************************
 * Author: George Aziz
 * Date Created: 05/09/2020
 * Date Last Modified : 10/09/2020
 * Purpose: FlagData class that contains all flags in the app
 ***************************************************************/

package curtin.edu.au.assignment.models;

import java.util.Arrays;
import java.util.List;

import curtin.edu.au.assignment.R;

public class FlagData
{
    private QuestionData questionData = QuestionData.get();
    public static final int[] DRAWABLES = {
            0, // No structure
            R.drawable.flag_am, R.drawable.flag_be, R.drawable.flag_br,R.drawable.flag_cn,
            R.drawable.flag_cz,R.drawable.flag_dk,R.drawable.flag_fr, R.drawable.flag_de,
            R.drawable.flag_gr,R.drawable.flag_it,R.drawable.flag_jp, R.drawable.flag_lt,
            R.drawable.flag_nl,R.drawable.flag_es, R.drawable.flag_ch,R.drawable.flag_ae };

    private List<Flag> flagList = Arrays.asList(new Flag[] {
            new Flag(R.drawable.flag_am, "Armenia", questionData.getQuestions(0)),
            new Flag(R.drawable.flag_be, "Belguim", questionData.getQuestions(1)),
            new Flag(R.drawable.flag_br, "Brazil", questionData.getQuestions(2)),
            new Flag(R.drawable.flag_cn, "China", questionData.getQuestions(3)),
            new Flag(R.drawable.flag_cz, "Czechia", questionData.getQuestions(4)),
            new Flag(R.drawable.flag_dk, "Denmark", questionData.getQuestions(5)),
            new Flag(R.drawable.flag_fr, "France", questionData.getQuestions(6)),
            new Flag(R.drawable.flag_de, "Germany", questionData.getQuestions(7)),
            new Flag(R.drawable.flag_gr, "Greece", questionData.getQuestions(8)),
            new Flag(R.drawable.flag_it, "Italy", questionData.getQuestions(9)),
            new Flag(R.drawable.flag_jp, "Japan", questionData.getQuestions(10)),
            new Flag(R.drawable.flag_lt, "Lithuania", questionData.getQuestions(11)),
            new Flag(R.drawable.flag_nl, "Netherlands", questionData.getQuestions(12)),
            new Flag(R.drawable.flag_es, "Spain", questionData.getQuestions(13)),
            new Flag(R.drawable.flag_ch, "Switzerland", questionData.getQuestions(14)),
            new Flag(R.drawable.flag_ae, "U.A.E", questionData.getQuestions(15))
    });

    private static FlagData instance = null;

    public static FlagData get()
    {
        if(instance == null)
        {
            instance = new FlagData();
        }
        return instance;
    }

    protected FlagData() {}

    public Flag get(int i)
    {
        return flagList.get(i);
    }

    public int size()
    {
        return flagList.size();
    }

    public void restartFlag()
    {
        instance = null;
    }
}
