/**************************************************************************
 * Author: George Aziz
 * Date Created: 07/09/2020
 * Date Last Modified : 10/09/2020
 * Purpose: QuestionData file contains all hardcoded questions for this app
 **************************************************************************/

package curtin.edu.au.assignment.models;

import java.util.Arrays;
import java.util.List;

public class QuestionData
{
    private List<Question> questionsArmenia = Arrays.asList( new Question[] {
            new Question("What is the official language of Armenia?", (new String[] {"French", "Spanish", "Portuguese", "Armenian"}),3,5,9,false),
            new Question("In what continent is Armenia in?", (new String[] {"Asia", "Europe", "North America", "South America"}),0,4,10,false),
            new Question("What is the Armenian currency?", (new String[] {"Boliviano", "Dram", "Peso", "Pounds"}),1,20,19,false),
            new Question("What is the population of Armenia?", (new String[] {"1.9 Million", "2.9 Million", "3.9 Million", "4.9 Million"}),1,15,14,false),
            new Question("What is the capital city of Armenia?", (new String[] {"Baku", "Yerevan", "Gyumri", "Kapan"}),1,10,8,false),
            new Question("When is the National Day in Armenia?", (new String[] {"20th  of September", "21st of September", "25th of September", "30th of September"}),1,8,6,true),
            new Question("Armenia was the first nation to adopt Christianity", (new String[] {"True", "False"}),0,20,20,false),
            new Question("Chess is part of the curriculum in Armenia", (new String[] {"True", "False"}),0,10,10,false)
    });

    private List<Question> questionsBelgium = Arrays.asList( new Question[] {
            new Question("What are the official languages of Belgium?", (new String[] {"Dutch,French,German", "Dutch,German,Belgian", "Belgian,French,German"}),0,10,8,false),
            new Question("The Official name of 'Belgium is the Kingdom of Belgium'", (new String[] {"True", "False"}),0,15,14,false),
            new Question("In what continent is Belgium in?", (new String[] {"Asia", "Europe", "North America", "South America"}),1,5,4,false),
            new Question("What is the Belgium currency?", (new String[] {"Euro", "Pound", "Krone", "Dollar"}),0,8,12,false),
            new Question("What is the population of Belgium?", (new String[] {"11.58 Million", "20.43 Million", "15.67 Million", "13.42 Million"}),0,15,13,false),
            new Question("What is the capital city of Belgium?", (new String[] {"Berlin", "Barcelona", "Athens", "Brussels"}),3,12,7,false),
            new Question("When is the National Day in Belgium?", (new String[] {"4th of July", "21st of July", "21st of June", "15th of July"}),1,25,22,true),
            new Question("The smallest town in the world is in Belgium", (new String[] {"True", "False"}),0,6,6,false),
            new Question("Cities in Belgium:", (new String[] {"Antwerp", "Leuven", "Ghent", "All the Above"}),3,16,15,false)
    });

    private List<Question> questionsBrazil = Arrays.asList( new Question[] {
            new Question("What is the official language of Brazil?", (new String[] {"English", "Spanish", "Portuguese", "Brazilian"}),2,14,12,false),
            new Question("The Official name of Brazil is Brasil", (new String[] {"True", "False"}),1,12,12,false),
            new Question("In what continent is Brazil in?", (new String[] {"Asia", "Europe", "North America", "South America"}),3,11,9,false),
            new Question("What is the currency in Brazil?", (new String[] {"Boliviano", "Brazilian Real", "Peso", "U.S Dollar"}),1,9,12,false),
            new Question("What is the population of Brazil?", (new String[] {"109.5 Million", "209.5 Million", "309.5 Million", "409.5 Million"}),1,9,6,false),
            new Question("What is the capital city of Brazil?", (new String[] {"Rio de Janeiro", "Sao Paulo", "Brasilia"}),2,8,7,false),
            new Question("When is the National Day in Brazil?", (new String[] {"1st of September", "3rd of September", "4th of September", "7th of September"}),3,15,12,true),
            new Question("The Christ the Redeemer statue is in Brazil", (new String[] {"True", "False"}),0,19,19,false),
            new Question("Cities in Brazil:", (new String[] {"Recife", "Vienna", "Cuba", "Chile"}),0,6,4,false),
    });

    private List<Question> questionsChina = Arrays.asList( new Question[] {
            new Question("What is the official language of China?", (new String[] {"Malay", "Mandarin", "Tagalog", "Tamil"}),1,4,3,false),
            new Question("In what continent is China in?", (new String[] {"Asia", "South America", "North America", "Europe"}),0,5,5,false),
            new Question("What is the currency in China?", (new String[] {"Peso", "Renminbi", "Dollar", "Yen"}),1,5,4,false),
            new Question("What is the population in China?", (new String[] {"1.29 Billion", "1.39 Billion", "1.45 Billion", "1.55 Billion"}),1,15,12,true),
            new Question("What is the capital city of China?", (new String[] {"Osaka","Hong Kong", "Beijing", "Hokkaido"}),2,7,7,false)
    });

    private List<Question> questionsCzech = Arrays.asList( new Question[] {
            new Question("What is the shorter name of Czech Republic?", (new String[] {"Czechia", "Prague", "Cesky Krumlov", "Czechoslovakia"}),0,5,4,false),
            new Question("In what continent is the Czech Republic in?", (new String[] {"Europe", "Asia", "South America", "North America"}),0,5,10,false),
            new Question("What is the Czechian currency?", (new String[] {"Euro", "Pound", "Czech koruna", "Dollar"}),2,5,3,false),
            new Question("What is the population of the Czech Republic in 2019?", (new String[] {"10.65 Million", "3.45 Million", "5.89 Million", "15.21 Million"}),0,15,14,true),
            new Question("What is the capital city of the Czech Republic?", (new String[] {"Berlin", "Venezuela", "Athens", "Prague"}),3,13,10,false),
            new Question("What is the former name of Czech Republic?", (new String[] {"Czechoslovakia", "Slovakia", "Czechia", "Switzerland"}),0,8,5,false)
    });

    private List<Question> questionsDenmark = Arrays.asList( new Question[] {
            new Question("What is the official language in Denmark?", (new String[] {"Dutch", "Danish", "German", "Nordic"}),1,6,5,false),
            new Question("In what continent is Denmark in?", (new String[] {"Europe", "Asia", "Antarctica", "North America"}),0,6,5,false),
            new Question("What is the Denmark currency?", (new String[] {"Reichsmark", "Pfennig", "Deutsche Mark", "Krone"}),3,10,8,false),
            new Question("What is the population of Denmark?", (new String[] {"5.8 Million","6.8 Million","7.7 Million","9.8 Million"}),0,9,7,false),
            new Question("What is the capital city of Denmark?", (new String[] {"Munich", "Copenhagen", "Oslo", "Helsinki"}),1,8,6,false),
            new Question("When is the National Day in Denmark?", (new String[] {"1st of June", "2nd of June", "4th of June", "5th of June"}),3,12,10,true),
            new Question("Cities in Denmark are:  ", (new String[] {"Aarhus", "Aalborg", "Odense", "All the Above"}),3,6,6,false)
    });

    private List<Question> questionsFrance = Arrays.asList( new Question[] {
            new Question("What is the official language of France?", (new String[] {"French", "Spanish", "Portuguese", "English"}),0,2,1,false),
            new Question("In what continent is France in?", (new String[] {"Asia", "Europe", "Antarctica", "South America"}),1,4,4,false),
            new Question("What is the currency in France?", (new String[] {"Euro", "CFP Franc", "All the above", "None of the above"}),2,5,4,false),
            new Question("What is the population of France?", (new String[] {"55.2 Million", "60.5 Million","65.2 Million", "70.5 Million"}),2,8,7,false),
            new Question("What is the capital city of France?", (new String[] {"Lourdes", "Marseille","Paris", "Bordeaux"}),2,5,5,false),
            new Question("When is the National Day in France?", (new String[] {"4th of July", "14th of July", "18th of July", "20th of July"}),1,15,12,true),
            new Question("The Pyrenées form a natural border between France and Spain", (new String[] {"True", "False"}),0,10,10,false),
            new Question("What are some Tourist Attractions in France?", (new String[] {"Eiffel Tower", "Louvre", "Arc de Triomphe", "All of the Above"}),3,5,4,false)
    });

    private List<Question> questionsGermany = Arrays.asList( new Question[] {
            new Question("What is the official language of Germany?", (new String[] {"Dutch", "French", "German", "Sorbian"}),2,2,2,false),
            new Question("In what continent is Germany in?", (new String[] {"Asia", "Europe", "Antarctica", "South America"}),1,4,3,false),
            new Question("What is the Germany currency?", (new String[] {"Euro","Reichsmark","Pfennig", "Deutsche Mark"}),0,10,7,false),
            new Question("What is the population of Germany?", (new String[] {"59.3 Million", "65.5 Million","83 Million", "85 Million"}),2,12,10,false),
            new Question("What is the capital city of Germany?", (new String[] {"Munich","Berlin","Cologne","Frankfurt"}),1,15,14,false),
            new Question("When is the National Day in Germany?", (new String[] {"3rd of October","5th of October","10th of October","10th of November"}),0,20,15,true),
            new Question("65% of the highways in Germany have no speed limits", (new String[] {"True","False"}),0,12,12,false),
            new Question("Which of these is a tourist attraction in Germany?", (new String[] {"Berlin Wall Memorial", "Louvre Museum", "Van Gogh Museum"}),0,5,3,false)
    });

    private List<Question> questionsGreece = Arrays.asList( new Question[] {
            new Question("What is the official language in Greece?", (new String[] {"Greek", "Coptic","Albanian","Slavic"}),0,5,4,false),
            new Question("In what continent is Greece in?", (new String[] {"Asia", "South America", "North America", "Europe"}),3,7,6,false),
            new Question("What is the currency in Greece?", (new String[] {"Pound", "Krone", "Euro","Peso"}),2,5,4,false),
            new Question("What is the population in Greece?", (new String[] {"10.12 Million", "10.72 Million", "10.90 Million", "11.14 Million"}),1,8,7,true),
            new Question("What is the capital city of Greece?", (new String[] {"Athens", "Thessaloniki", "Heraklion", "Patras"}),0,8,6,false),
            new Question("When is the National Day in Greece?", (new String[] {"24th of March", "25th of March", "26th of March", "27th of March"}),1,8,7,false)
    });

    private List<Question> questionsItaly = Arrays.asList( new Question[] {
            new Question("The Colosseum is in Italy", (new String[] {"True", "False"}),0,7,12,false),
            new Question("The Leaning tower of Pisa is in Italy", (new String[] {"True", "False"}),0,5,20,false),
            new Question("Italy’s Largest Island is Rome", (new String[] {"True", "False"}),1,10,15,false),
            new Question("In what continent is Italy in?", (new String[] {"Asia", "Europe", "North America", "South America"}),1,8,15,false),
            new Question("What is the Italian currency?", (new String[] {"Euro", "Pound", "Krone", "Dollar"}),0,5,4,false),
            new Question("What is the population of Italy in 2019?", (new String[] {"62 Million", "34 Million", "58 Million", "70 Million"}),0,20,18,false),
            new Question("What is the capital city of Italy?", (new String[] {"Berlin", "Barcelona", "Athens", "Rome"}),3,6,4,false),
            new Question("When is the National Day in Italy?", (new String[] {"1st of July", "2nd of June", "3rd of June", "4th of July"}),1,30,30,true),
            new Question("Vienna is in Italy", (new String[] {"True", "False"}),1,10,15,false),
            new Question("Cities in Italy:", (new String[] {"Florence", "Ravenna", "All the Above"}),2,5,4,false)
    });

    private List<Question> questionsJapan = Arrays.asList( new Question[] {
            new Question("What is the official language of Japan?", (new String[] {"Japanese", "Mandarin", "Tagalog"}),0,4,4,false),
            new Question("In what continent is Japan in?", (new String[] {"Asia", "South America", "North America", "Europe"}),0,5,5,false),
            new Question("What is the currency in Japan?", (new String[] {"Peso", "Yuan", "Dollar", "Yen"}),3,6,5,false),
            new Question("What is the population in Japan?", (new String[] {"126.5 Million", "136.5 Million","146.5 Million", "156 Million"}),0,10,8,true),
            new Question("What is the capital city of Japan?", (new String[] {"Osaka", "Kanagawa", "Hokkaido", "Tokyo"}),3,9,6,false)
    });

    private List<Question> questionsLithuania = Arrays.asList( new Question[] {
            new Question("What is the official language of Lithuania?", (new String[] {"Lithuanian", "Baltic", "Latvian", "Belarusian"}),0,6,3,false),
            new Question("In what continent is Lithuania in?", (new String[] {"Asia", "South America", "North America", "Europe"}),3,8,6,false),
            new Question("What is the currency in Lithuania?", (new String[] {"Euro", "Krone", "Rouble", "Franc"}),0,4,2,false),
            new Question("What is the population in Lithuania?", (new String[] {"1.53 Million", "2.79 Million", "3.83 Million", "4.21 Million"}),1,5,4,false),
            new Question("What is the capital city of Lithuania?", (new String[] {"Tallinn", "Kaunas", "Vilnius", "Riga"}),2,18,16,true)
    });

    private List<Question> questionsNetherlands = Arrays.asList( new Question[] {
            new Question("What is the official language of Netherlands?", (new String[] {"Dutch", "French", "German", "Nordic"}),0,3,3,false),
            new Question("In what continent is Netherlands in?", (new String[] {"Asia", "Europe", "Antarctica", "South America"}),1,5,4,false),
            new Question("What is the Netherlands currency?", (new String[] {"Euro","Reichsmark","Pfennig", "Deutsche Mark"}),0,8,5,false),
            new Question("What is the population of Netherlands?", (new String[] {"3.93 Million", "5.28 Million" ,"7.28 Million","17.28 Million"}),3,15,12,false),
            new Question("What is the capital city of Netherlands?", (new String[] {"Munich","Amsterdam","Cologne","Frankfurt"}),1,6,5,false),
            new Question("When is the National Day in Netherlands?", (new String[] {"3rd of March", "5th of May","10th of May","10th of May"}),1,10,10,true),
            new Question("The Van Gogh Museum is in the Netherlands?", (new String[] {"True","False"}),0,5,5,false)
    });

    private List<Question> questionsSpain = Arrays.asList( new Question[] {
            new Question("What are the languages spoken in Spain?", (new String[] {"Spanish", "Castilian", "Galician", "All the above"}),3,8,7,false),
            new Question("In what continent is Spain in?", (new String[] {"Asia", "South America", "North America", "Europe"}),3,5,8,false),
            new Question("What is the currency in Spain?", (new String[] {"Pound", "Czech koruna", "Euro","Dollar"}),2,5,4,false),
            new Question("What is the population in Spain?", (new String[] {"45.56 Million", "46.54 Million", "46.94 Million", "50.94 Million"}),2,12,12,true),
            new Question("What is the capital city of Spain?", (new String[] {"Madrid", "Barcelona", "Seville", "Granada"}),0,10,8,false),
            new Question("When is the National Day in Spain?", (new String[] {"11th of October", "12th of October", "13th of October", "14th of October"}),1,11,11,false)
    });

    private List<Question> questionsSwitzerland = Arrays.asList( new Question[] {
            new Question("German, Romansh, French & Italian are official languages of Switzerland?", (new String[] {"True", "False"}),0,5,4,false),
            new Question("In what continent is Switzerland in?", (new String[] {"Asia", "Europe", "Antarctica", "South America"}),1,4,2,false),
            new Question("What is the Switzerland currency?", (new String[] {"Swiss Franc", "Reichsmark", "Pfennig", "Deutsche Mark"}),0,6,5,false),
            new Question("What is the population of Switzerland?", (new String[] {"5.57 Million","6.57 Million","8.57 Million","9.57 Million"}),2,10,8,false),
            new Question("What is the capital city of Switzerland?", (new String[] {"Munich","Amsterdam","Bern","Berlin"}),2,10,8,false),
            new Question("When is the National Day in Netherlands?", (new String[] {"30th of July", "1st of August","2nd of August", "3rd of August"}),1,15,12,true),
            new Question("Cities in Switzerland: ", (new String[] {"Zurich","Munich", "Lourdes", "Marseille"}),0,8,8,false)
    });

    private List<Question> questionsUAE = Arrays.asList( new Question[] {
            new Question("What is the largest Emirate in the United Arab Emirates?", (new String[] {"Sharjah", "Dubai", "Fujirah", "Abu Dhabi"}),3,10,8,false),
            new Question("What is the smallest Emirate in the United Arab Emirates?", (new String[] {"Sharjah", "Dubai", "Ajman", "Umm al-Quain"}),2,10,9,false),
            new Question("What is the name of the largest building in the world that is in the United Arab Emirates?", (new String[] {"Burj Khalifa", "Burj Al Arab", "Burj Dubai", "Burj Sharjah"}),0,5,10,false),
            new Question("How many Emirates are there in the United Arab Emirates?", (new String[] {"1", "5", "7", "9"}),2,20,18,true),
            new Question("In which Emirate is the Ferrari Theme Park located?", (new String[] {"Sharjah", "Dubai", "Abu Dhabi", "Ajman"}),2,15,12,false),
            new Question("What is the capital of the United Arab Emirates?", (new String[] {"Abu Dhabi", "Ras Al Khaimah", "Ajman", "Dubai"}),0,10,8,false),
            new Question("What is the population of the United Arab Emirates as of 2020?", (new String[] {"2.32 Million", "9.89 Million", "6.42 Million", "12.1 Million"}),1,10,8,false),
            new Question("What is the official language of the United Arab Emirates?", (new String[] {"English", "French", "Spanish", "Arabic"}),3,3,5,false),
            new Question("When is the National Day of the United Arab Emirates?", (new String[] {"3rd of December", "4th of December", "2nd of December", "5th of December"}),2,30,25,false),
            new Question("In what continent is the United Arab Emirates in?", (new String[] {"Asia", "Africa", "Europe", "Middle East"}),0,5,15,false)
    });

    private static QuestionData instance = null;

    public static QuestionData get()
    {
        if(instance == null)
        {
            instance = new QuestionData();
        }
        return instance;
    }

    protected QuestionData() {}

    //Method that retrieves questions for a flag with index
    public List<Question> getQuestions(int flagIdx)
    {
        List<Question> selectedList = null;
        switch (flagIdx)
        {
            case 0:
                selectedList = questionsArmenia;
                break;
            case 1:
                selectedList = questionsBelgium;
                break;
            case 2:
                selectedList = questionsBrazil;
                break;
            case 3:
                selectedList = questionsChina;
                break;
            case 4:
                selectedList = questionsCzech;
                break;
            case 5:
                selectedList = questionsDenmark;
                break;
            case 6:
                selectedList = questionsFrance;
                break;
            case 7:
                selectedList = questionsGermany;
                break;
            case 8:
                selectedList = questionsGreece;
                break;
            case 9:
                selectedList = questionsItaly;
                break;
            case 10:
                selectedList = questionsJapan;
                break;
            case 11:
                selectedList = questionsLithuania;
                break;
            case 12:
                selectedList = questionsNetherlands;
                break;
            case 13:
                selectedList = questionsSpain;
                break;
            case 14:
                selectedList = questionsSwitzerland;
                break;
            case 15:
                selectedList = questionsUAE;
                break;
        }
        return selectedList;
    }

    public void restartQuestions()
    {
        instance = null; //Once method is called a get() after will create a new player
    }
}
