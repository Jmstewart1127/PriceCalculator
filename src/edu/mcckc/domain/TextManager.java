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
    private ArrayList<String> lstNum;
    private ArrayList<String> lstConsonant;
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
        lstConsonant = new ArrayList<String>();
        lstNum = new ArrayList<String>();

        initEverything();
    }

    private void initEverything()
    {
        initVowels();
        initPunctuation();
        initConsonants();
        initNumbers();
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

    private void initConsonants()
    {
        lstConsonant.add("b");
        lstConsonant.add("c");
        lstConsonant.add("d");
        lstConsonant.add("f");
        lstConsonant.add("g");
        lstConsonant.add("h");
        lstConsonant.add("j");
        lstConsonant.add("k");
        lstConsonant.add("l");
        lstConsonant.add("m");
        lstConsonant.add("n");
        lstConsonant.add("p");
        lstConsonant.add("q");
        lstConsonant.add("r");
        lstConsonant.add("s");
        lstConsonant.add("t");
        lstConsonant.add("v");
        lstConsonant.add("w");
        lstConsonant.add("x");
        lstConsonant.add("z");
    }

    private void initNumbers()
    {
        lstNum.add("0");
        lstNum.add("1");
        lstNum.add("2");
        lstNum.add("3");
        lstNum.add("4");
        lstNum.add("5");
        lstNum.add("6");
        lstNum.add("7");
        lstNum.add("8");
        lstNum.add("9");
    }

    public void processInputString(String inputString)
    {
        for (int i = 0; i < inputString.length(); i++)
        {
            Character c = inputString.charAt(i);
            userInputString = "" + c;
            processVowel(userInputString);
            processConsonant(userInputString);
            processPunctuation(userInputString);
            processNumeric(userInputString);
            processSpace(userInputString);
        }

        //processVowel(userInputString);
       // processPunctuation(userInputString);
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
               vowelCount++;
            }
        }
    }

    private void processPunctuation(String stringToken)
    {
        for (String s : lstPunctuation)
        {
            if (s.equals(stringToken))
            {
                punctuationCount++;
            }
        }
    }

    private void processSpace(String stringToken)
    {

            if (stringToken.equals(" "))
            {
                spaceCount++;
            }
    }

    private void processConsonant(String stringToken)
    {
        for (String s : lstConsonant)
        {
            if (s.equals(stringToken))
            {
                consonantCount++;
            }
        }
    }

    private void processNumeric(String stringToken)
    {
        for (String s : lstNum)
        {
            if (s.equals(stringToken))
            {
                numberCount++;
            }
        }
    }

    public String getConsonantCount()
    {
        return Integer.toString(this.consonantCount);
    }

    public String getVowelCount()
    {
        return Integer.toString(this.vowelCount);
    }

    public String getNumberCount()
    {
        return Integer.toString(this.numberCount);
    }

    public String getPunctuationCount()
    {
        return Integer.toString(this.punctuationCount);
    }

    public String getSpaceCount()
    {
        return Integer.toString(this.spaceCount);
    }

}
