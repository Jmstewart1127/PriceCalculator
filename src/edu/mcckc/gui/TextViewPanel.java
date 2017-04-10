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
        lblOutputVowels = new JLabel();
        lblCaptionConsonants = new JLabel("Consonants");
        lblOutputConsonants = new JLabel();
        lblCaptionNumbers = new JLabel("Numbers");
        lblOutputNumbers = new JLabel();
        lblCaptionSpaces = new JLabel("Spaces");
        lblOutputSpaces = new JLabel();
        lblCaptionPunctuation = new JLabel("Punctuation");
        lblOutputPunctuation = new JLabel();
    }

    public void processInputString(String inputString)
    {

    }
}
