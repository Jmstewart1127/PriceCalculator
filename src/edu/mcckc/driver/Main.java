package edu.mcckc.driver;

import edu.mcckc.gui.TextFrame;
//import org.apache.log4j.Logger;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        TextFrame frmApp = new TextFrame();
        frmApp.setTitle("Text Manager");
        frmApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmApp.setSize(900, 400);
        frmApp.setVisible(true);
    }
}
