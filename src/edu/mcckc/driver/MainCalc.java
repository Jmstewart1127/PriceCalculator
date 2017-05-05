package edu.mcckc.driver;

import edu.mcckc.domain.PriceCalculator;

import java.util.Scanner;

/**
 * Created by Jacob Stewart on 5/5/2017.
 */
public class MainCalc
{

    public static void main(String[] atgs)
    {


        double totalPrice = 0.0;

        Scanner scn = new Scanner(System.in);

        System.out.print("enter # of sizes s-5xl");
        int s = scn.nextInt();
        int m = scn.nextInt();
        int l = scn.nextInt();
        int xl = scn.nextInt();
        int xxl = scn.nextInt();
        int xxxl = scn.nextInt();
        int xxxxl = scn.nextInt();
        int xxxxxl = scn.nextInt();

        System.out.print("true for yes on locations 8 total");
        boolean back = scn.nextBoolean();
        boolean pocket = scn.nextBoolean();
        boolean rsleeve = scn.nextBoolean();
        boolean lsleeve = scn.nextBoolean();
        boolean multipleLines = scn.nextBoolean();
        boolean photoGraphic = scn.nextBoolean();
        boolean premiumVinyl = scn.nextBoolean();

        PriceCalculator pc = new PriceCalculator(s, m , l, xl, xxl, xxxl, xxxxl, xxxxxl, photoGraphic, pocket, back, multipleLines, lsleeve, rsleeve, premiumVinyl, totalPrice);

        System.out.println("total:" + pc.getTotalPrice());



    }


}
