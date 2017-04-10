package edu.mcckc.gui;

import edu.mcckc.domain.TextManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rharris on 4/4/2017.
 */
public class TextFrame extends JFrame
{
    private TextEntryPanel pnlEntry;
    private TextViewPanel pnlView;
    private TextManager manager;

    public TextFrame()
    {
        pnlEntry = new TextEntryPanel();
        pnlView = new TextViewPanel();
        manager = new TextManager();

        pnlEntry.setViewPanelReference(manager);
    }
}
