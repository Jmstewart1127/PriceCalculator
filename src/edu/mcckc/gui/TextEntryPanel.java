package edu.mcckc.gui;

import edu.mcckc.domain.TextManager;

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
    private  JPanel row1;
    private  JPanel row2;
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

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("submit"))
        {

        }
    }


}
