package edu.mcckc.domain;

import java.util.ArrayList;

/**
 * Created by rharris on 4/4/2017.
 */
public class TextManager
{
    private String userInputString;
    private ArrayList<String> lstVowels;
    private ArrayList<String> lstPunctuation;
    private int vowelCount;
    private int punctuationCount;
    private int consonantCount;
    private int numberCount;
    private int spaceCount;

    private boolean isVowel;
    private boolean isPunctuation;
    private boolean isNumber;
    private boolean isSpace;

    public TextManager()
    {
        lstVowels = new ArrayList<String>();
        lstPunctuation = new ArrayList<String>();

        initEverything();
    }

    private void initEverything()
    {
        initVowels();
        initPunctuation();
    }

    private void initCounts()
    {

    }

    private void initBooleanFlags()
    {

    }

    private void initVowels()
    {
        lstVowels.add("a");
        lstVowels.add("e");
        lstVowels.add("i");
        lstVowels.add("o");
        lstVowels.add("u");
        lstVowels.add("y");
    }

    private void initPunctuation()
    {
        lstPunctuation.add(".");
        lstPunctuation.add("?");
        lstPunctuation.add("!");
        lstPunctuation.add(";");
        lstPunctuation.add("'");
    }

    public void processInputString(String inputString)
    {
        for (int i = 0; i < inputString.length(); i++)
        {
            Character c = inputString.charAt(i);
            userInputString = "" + c;
        }

        processVowel(userInputString);
        processPunctuation(userInputString);
    }

    private void processAllCases(String stringToken)
    {

    }

    private void processVowel(String stringToken)
    {
        for (String s : lstVowels)
        {
            if (s.equals(stringToken))
            {
               vowelCount = stringToken.length();
            }
            else
            {
                consonantCount = stringToken.length();
            }
        }
    }

    private void processPunctuation(String stringToken)
    {
        for (String s : lstPunctuation)
        {
            if (s.equals(stringToken))
            {
                punctuationCount = stringToken.length();
            }
        }
    }

    private void processSpace(String stringToken)
    {

    }

    private void processNumeric(String stringToken)
    {

    }

    public String getConsonantCount()
    {
        return Integer.toString(this.consonantCount);
    }

    public String getVowelCount()
    {
        return Integer.toString(this.vowelCount);
    }

//    public String getNumberCount()
//    {
//
//    }

    public String getPunctuationCount()
    {
        return Integer.toString(this.punctuationCount);
    }

//    public String getSpaceCount()
//    {
//
//    }
}
