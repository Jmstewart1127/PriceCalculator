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
    public JLabel lblOutputVowels;
    private JLabel lblCaptionConsonants;
    public JLabel lblOutputConsonants;
    private JLabel lblCaptionNumbers;
    public JLabel lblOutputNumbers;
    private JLabel lblCaptionSpaces;
    public JLabel lblOutputSpaces;
    private JLabel lblCaptionPunctuation;
    public JLabel lblOutputPunctuation;

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

        setLayout(new GridLayout(5, 2));
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

}
