package edu.mcckc.domain;

import java.util.ArrayList;

/**
 * Created by Jacob Stewart on 5/4/2017.
 */
public class PriceCalculator
{
    private int s;
    private int m;
    private int l;
    private int xl;
    private int twoXl;
    private int threeXl;
    private int fourXl;
    private int fiveXl;

    private int numOfAdultShirts;
    private int numOfHoodies;
    private int numOfXlShirts;
    private int numOfToddlerShirts;
    private int totalNumberOfShirts;

    private double adultShirtCost;
    private double xlShirtPrice;
    private double hoodiePrice;
    private double babyShirtPrice;
    private double kidsShirtPrice;

    private double photoGraphicCost;
    private double pocketTextCost;
    private double multipleLinesCost;
    private double backText;
    private double leftSleeveCost;
    private double rightSleeveCost;
    private double totalGraphicsCost;

    private boolean photoGraphic = false;
    private boolean pocketGraphic = false;
    private boolean backGraphic = false;
    private boolean multiLinesGraphic = false;
    private boolean leftSleeveGraphic = false;
    private boolean rightSleeveGraphic = false;
    private boolean premiumVinyl = false;

    private double totalPrice;



    // Constructors
    public PriceCalculator()
    {
    }


    public PriceCalculator(int s, int m, int l, int xl, int twoXl, int threeXl, int fourXl, int fiveXl,
                           boolean photoGraphic, boolean pocketGraphic, boolean backGraphic,
                           boolean multiLinesGraphic, boolean leftSleeveGraphic, boolean rightSleeveGraphic,
                           boolean premiumVinyl, double totalPrice)
    {
        this.s = s;
        this.m = m;
        this.l = l;
        this.xl = xl;
        this.twoXl = twoXl;
        this.threeXl = threeXl;
        this.fourXl = fourXl;
        this.fiveXl = fiveXl;
        this.photoGraphic = photoGraphic;
        this.pocketGraphic = pocketGraphic;
        this.backGraphic = backGraphic;
        this.multiLinesGraphic = multiLinesGraphic;
        this.leftSleeveGraphic = leftSleeveGraphic;
        this.rightSleeveGraphic = rightSleeveGraphic;
        this.premiumVinyl = premiumVinyl;
        this.totalPrice = totalPrice;

        calcAdultShirtCost();
        calcXlShirtsCost();
        calcGraphicsCost();
        calculateTotalPrice();

    }

    private void calcAdultShirtCost()
    {
        numOfAdultShirts = s + m + l + xl;

        if (numOfAdultShirts > 1)
        {
            this.adultShirtCost = 12.50;
            totalPrice += this.adultShirtCost * numOfAdultShirts;
        }
        else
        {
            this.adultShirtCost = 15.00;
            totalPrice += this.adultShirtCost * numOfAdultShirts;
        }
    }

    public void calcXlShirtsCost()
    {
        numOfXlShirts = twoXl + threeXl + fourXl + fiveXl;

        if (numOfXlShirts > 1)
        {
            this.xlShirtPrice = 16.00;
            totalPrice += this.xlShirtPrice * numOfXlShirts;
        }
        else
        {
            this.xlShirtPrice = 18.00;
            totalPrice += this.xlShirtPrice * numOfXlShirts;
        }
    }

    private void calcGraphicsCost()
    {
        if (photoGraphic == true)
        {
            this.photoGraphicCost = 10.00;
            this.totalGraphicsCost += this.photoGraphicCost;
        }
        if (backGraphic == true)
        {
            this.backText = 5.00;
            this.totalGraphicsCost += this.backText;
        }
        if (multiLinesGraphic == true)
        {
            this.multipleLinesCost = 5.00;
            this.totalGraphicsCost += this.multipleLinesCost;
        }
        if (pocketGraphic == true)
        {
            this.pocketTextCost = 3.00;
            this.totalGraphicsCost += this.pocketTextCost;
        }
        if (leftSleeveGraphic == true)
        {
            this.leftSleeveCost = 2.00;
            this.totalGraphicsCost += this.leftSleeveCost;
        }
        if (rightSleeveGraphic)
        {
            this.rightSleeveCost = 2.00;
            this.totalGraphicsCost += this.rightSleeveCost;
        }

    }

    private void calculateTotalPrice()
    {
        double graphics = this.totalNumberOfShirts * this.totalGraphicsCost;

        totalPrice += graphics;
    }

    public double getTotalPrice()
    {
        return this.totalPrice;
    }






}
