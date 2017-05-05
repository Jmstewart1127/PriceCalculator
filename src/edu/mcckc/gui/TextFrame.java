package edu.mcckc.gui;

import edu.mcckc.domain.PriceCalculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rharris on 4/4/2017.
 */
public class TextFrame extends JFrame
{
    private TextEntryPanel pnlEntry;
    private TextViewPanel pnlView;
    private PriceCalculator manager;

    public TextFrame()
    {
        pnlEntry = new TextEntryPanel();
        pnlView = new TextViewPanel();
        manager = new PriceCalculator();

        pnlEntry.setViewPanelReference(pnlView);

        pnlEntry.setManagerReference(manager);
        pnlView.setManagerReference(manager);

        add(pnlEntry, BorderLayout.WEST);
        add(pnlView, BorderLayout.EAST);
    }
}
