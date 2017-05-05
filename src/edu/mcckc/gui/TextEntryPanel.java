package edu.mcckc.gui;

import edu.mcckc.domain.PriceCalculator;

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
    private JDataEntry small;
    private JDataEntry med;
    private JDataEntry lrg;
    private JDataEntry xl;
    private JDataEntry xxl;
    private JDataEntry xxxl;
    private JDataEntry xxxxl;
    private JDataEntry xxxxxl;

    private JCheckBox pocket;
    private JCheckBox back;
    private JCheckBox photo;
    private JCheckBox rSleeve;
    private JCheckBox lSleeve;
    private JCheckBox multiLines;

    private JLabel pocketlbl;
    private JLabel backlbl;
    private JLabel photolbl;
    private JLabel rSleevelbl;
    private JLabel lSleevelbl;
    private JLabel multiLineslbl;

    private JButton btnSubmit;
    private JPanel row1;
    private JPanel row2;
    private JPanel row3;
    private TextViewPanel pnlView;
    private PriceCalculator pc;



    public TextEntryPanel()
    {
        deInput = new JDataEntry("Text:", 15, "");
        small = new JDataEntry("S:", 2, "");
        med = new JDataEntry("M:", 2, "");
        lrg = new JDataEntry("L:", 2, "");
        xl = new JDataEntry("XL:", 2, "");
        xxl = new JDataEntry("2XL:", 2, "");
        xxxl = new JDataEntry("3XL", 2, "");
        xxxxl = new JDataEntry("4XL:", 2, "");
        xxxxxl = new JDataEntry("5XL:", 2, "");

        pocket = new JCheckBox();
        back = new JCheckBox();
        photo = new JCheckBox();
        rSleeve = new JCheckBox();
        lSleeve = new JCheckBox();
        multiLines = new JCheckBox();

        pocketlbl = new JLabel("   Pocket:");
        backlbl = new JLabel("   Back:");
        photolbl = new JLabel("   Photo:");
        rSleevelbl = new JLabel("   R Sleeve:");
        lSleevelbl = new JLabel("   L Sleeve:");
        multiLineslbl = new JLabel("   Multiple Lines:");

        btnSubmit = new JButton("submit");
        row1 = new JPanel();
        row2 = new JPanel();
        row3 = new JPanel();
        pnlView = new TextViewPanel();

        btnSubmit.setActionCommand("submit");
        btnSubmit.addActionListener(this);

        setLayout(new GridLayout(3, 5));
        add(row1);
        add(row2);
        add(row3);
        row2.add(small);
        row2.add(med);
        row2.add(lrg);
        row2.add(xl);
        row2.add(xxl);
        row2.add(xxxl);
        row2.add(xxxxl);
        row2.add(xxxxxl);
        row1.add(photolbl);
        row1.add(photo);
        row1.add(multiLineslbl);
        row1.add(multiLines);
        row1.add(pocketlbl);
        row1.add(pocket);
        row1.add(backlbl);
        row1.add(back);
        row1.add(rSleevelbl);
        row1.add(rSleeve);
        row1.add(lSleevelbl);
        row1.add(lSleeve);
        row3.add(btnSubmit);
    }

    public void setViewPanelReference(TextViewPanel pnlView)
    {
        this.pnlView = pnlView;
    }

    public void setManagerReference(PriceCalculator priceCalculator)
    {
        this.pc = priceCalculator ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("submit"))
        {
            try
            {
                pc = new PriceCalculator(
                        small.getInt(), med.getInt(), lrg.getInt(), xl.getInt(),
                        xxl.getInt(), xxxl.getInt(), xxxxl.getInt(), xxxxxl.getInt(),
                        photo.isSelected(), pocket.isSelected(), back.isSelected(),
                        multiLines.isSelected(), lSleeve.isSelected(), rSleeve.isSelected(),
                        false, 0.0);

                pnlView.setLabel(pc.getTotalPrice());
                System.out.print(pc.getTotalPrice());
            }
            catch (Exception e1)
            {
                e1.printStackTrace();
            }

//            TextViewPanel tvp = new TextViewPanel();
//            tvp.totalCost.setText("hi");
//            tvp.setLabel(pc.getTotalPrice());
//            System.out.print(pc.getTotalPrice());
        }
    }


}
