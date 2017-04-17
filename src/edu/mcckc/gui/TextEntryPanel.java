package edu.mcckc.gui;

import edu.mcckc.domain.TextManager;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rharris on 4/4/2017.
 */
public class TextEntryPanel extends JPanel implements ActionListener
{
    private JDataEntry deInput;
    private JButton btnSubmit;
    private JPanel row1;
    private JPanel row2;
    private TextViewPanel pnlView;
    private TextManager manager;



    public TextEntryPanel()
    {
        deInput = new JDataEntry("Text:", 15, "");
        btnSubmit = new JButton("submit");
        row1 = new JPanel();
        row2 = new JPanel();
        pnlView = new TextViewPanel();
        manager = new TextManager();

        btnSubmit.setActionCommand("submit");
        btnSubmit.addActionListener(this);

        setLayout(new GridLayout(5, 2));

        add(deInput);
        add(btnSubmit);
    }

    public void setViewPanelReference(TextViewPanel pnlView)
    {
        this.pnlView = pnlView;
    }

    public void setManagerReference(TextManager manager)
    {
        this.manager = manager;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("submit"))
        {
            TextManager tm = new TextManager();
            tm.processInputString(deInput.getText());

            pnlView.lblOutputVowels.setText(tm.getVowelCount());
            pnlView.lblOutputPunctuation.setText(" " + tm.getPunctuationCount());
            pnlView.lblOutputConsonants.setText(" " + tm.getConsonantCount());
            pnlView.lblOutputNumbers.setText(tm.getNumberCount());
            pnlView.lblOutputSpaces.setText(tm.getSpaceCount());
        }
    }


}
