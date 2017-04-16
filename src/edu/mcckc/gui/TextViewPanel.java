package edu.mcckc.gui;

import edu.mcckc.domain.TextManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rharris on 4/4/2017.
 */
public class TextViewPanel extends JPanel
{
    private JLabel lblCaptionVowels;
    private JLabel lblOutputVowels;
    private JLabel lblCaptionConsonants;
    private JLabel lblOutputConsonants;
    private JLabel lblCaptionNumbers;
    private JLabel lblOutputNumbers;
    private JLabel lblCaptionSpaces;
    private JLabel lblOutputSpaces;
    private JLabel lblCaptionPunctuation;
    private JLabel lblOutputPunctuation;

    private TextManager manager;



    public TextViewPanel()
    {
        lblCaptionVowels = new JLabel("Vowels");
        lblOutputVowels = new JLabel("");
        lblCaptionConsonants = new JLabel("Consonants");
        lblOutputConsonants = new JLabel("");
        lblCaptionNumbers = new JLabel("Numbers");
        lblOutputNumbers = new JLabel("");
        lblCaptionSpaces = new JLabel("Spaces");
        lblOutputSpaces = new JLabel("");
        lblCaptionPunctuation = new JLabel("Punctuation");
        lblOutputPunctuation = new JLabel("");

        setLayout(new GridLayout(2, 5));
        add(lblCaptionVowels);
        add(lblOutputVowels);
        add(lblCaptionConsonants);
        add(lblOutputConsonants);
        add(lblCaptionNumbers);
        add(lblOutputNumbers);
        add(lblCaptionSpaces);
        add(lblOutputSpaces);
        add(lblCaptionPunctuation);
        add(lblOutputPunctuation);
    }

    public void setManagerReference(TextManager manager)
    {
        this.manager = manager;
    }

    public void processInputString(String inputString)
    {
        TextManager t = new TextManager();
        t.processInputString(inputString);
        System.out.println("________");
        System.out.println("v" + t.getVowelCount());
        System.out.println("c" + t.getConsonantCount());
        System.out.println("p" + t.getPunctuationCount());
        System.out.println("n" + t.getNumberCount());
        System.out.println("s" + t.getSpaceCount());

        lblOutputVowels.setText(t.getVowelCount());
        lblOutputConsonants.setText(t.getConsonantCount());
        lblOutputPunctuation.setText(t.getPunctuationCount());
        lblOutputNumbers.setText(t.getNumberCount());
        lblOutputSpaces.setText(t.getSpaceCount());

    }

    public void setLabel(String vowelOutput, String consOutput, String  puncOutput, String numOutput, String spaceOutput)
    {
        lblOutputVowels.setText(vowelOutput);
        lblOutputConsonants.setText(consOutput);
        lblOutputPunctuation.setText(puncOutput);
        lblOutputNumbers.setText(numOutput);
        lblOutputSpaces.setText(spaceOutput);
    }

//    public void setLabel()
//    {
//        TextManager tm = new TextManager();
//        lblOutputVowels.setText(tm.getVowelCount());
//        lblOutputConsonants.setText(tm.getConsonantCount());
//        lblOutputPunctuation.setText(tm.getPunctuationCount());
//        lblOutputNumbers.setText(tm.getNumberCount());
//        lblOutputSpaces.setText(tm.getSpaceCount());
//    }

}
