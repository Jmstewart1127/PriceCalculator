package edu.mcckc.gui;

import edu.mcckc.domain.PriceCalculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rharris on 4/4/2017.
 */
public class TextViewPanel extends JPanel
{
    private JLabel lblTotalCost;
    private JLabel totalCost;

    private PriceCalculator manager;


    public TextViewPanel()
    {
        lblTotalCost = new JLabel("Total Cost");
        totalCost = new JLabel("");

        setLayout(new GridLayout(5, 2));
        add(lblTotalCost);
        add(totalCost);
    }

    public void setManagerReference(PriceCalculator manager)
    {
        this.manager = manager;
    }

    public void setLabel(double total)
    {
        this.totalCost.setText(Double.toString(total));
    }

}
