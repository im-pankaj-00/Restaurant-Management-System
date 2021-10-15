package com.pankaj;
// It's a java program of Resturant Management

import java.util.*;

// Compiler version JDK 11.0.2
public class Main {  //Resturant_management
    //class opened

    public static void main(String[] args) {
        // //main opened


        Scanner in = new Scanner(System.in);
        String more = "", choice2 = "Y";
        int choice = 0;
        int total = 0, totals = 0, cost = 0, price = 0, i = 0, tp = 0, tot = 0;
        int tamt = 0, tamt1 = 0, tamt2 = 0, tamt3 = 0, tamt4 = 0, tamt6 = 0;

        System.out.println("---------------------------------" + "------------------------");
        System.out.println("           Welcome to our Sharma Restaurant");
        while (choice2.equalsIgnoreCase("Y")) {
            System.out.println("---------------------------------" + "------------------------");
            System.out.println("           Enter 1 for Starters");
            System.out.println("           Enter 2 for main course");
            System.out.println("           Enter 3 for Dessert");
            System.out.println("---------------------------------" + "------------------------");
            System.out.print("Please make your choice = ");
            choice = in.nextInt();
            System.out.println("---------------------------------" + "------------------------");
            switch (choice) {  //switch brace opening
                case 1: {
                    System.out.println("---------------------------------" + "------------------------");
                    System.out.println(" Welcome to Starters");
                    System.out.println("Enter V for Vegetarian");
                    System.out.println("Enter N for  Non Vegetarian");
                    System.out.println("---------------------------------" + "------------------------");
                    char choice1 = in.next().charAt(0);
                    if (choice1 == 'V') {
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println(" Welcome to Starters Vegetarians");
                        System.out.println("1 :Paneer Tikka --Rs60");
                        System.out.println("2 :green frie   --Rs70");
                        System.out.println("3 :Pani poori   --Rs60");
                        System.out.println("4 :mango juice  --Rs70");
                        System.out.println("5 :Allo Tikka.  --Rs50");
                        System.out.println("6 :Nimbu Panni  --Rs20");
                        System.out.println("7 :mango juice  --Rs40");
                        System.out.println("8 :Dall Bhat    --Rs40");
                        System.out.println("9 :Mini Samosa  --Rs20");
                        System.out.println("10:Sarbat.      --Rs10");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.print("Please enter the number of the item you choice = ");
                        int item = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.print("Enter the quantity = ");
                        int quantity = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        if ((item == 1) || (item == 3)) totals = (quantity * 60);
                        if ((item == 2) || (item == 4)) totals = (quantity * 70);
                        if ((item == 6) || (item == 9)) totals = (quantity * 20);
                        if ((item == 7) || (item == 8)) totals = (quantity * 40);
                        if (item == 10) totals = (quantity * 10);
                        if (item == 5) totals = (quantity * 50);
                        tamt = tamt + totals;
                        System.out.println("Do you want to place more order?");
                        System.out.println("Enter'Y' for Yes or 'N' for No.");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.print("Your Reply = ");
                        choice2 = in.next();
                    }
                    if (choice1 == 'N') {
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println(" Welcome to Starters Non Vegetarian");
                        System.out.println("1 :chiken pakora    --Rs70");
                        System.out.println("2 :Egg Roll         --Rs60");
                        System.out.println("3 :Chilly chiken    --Rs70");
                        System.out.println("4 :Dim chop         --Rs70");
                        System.out.println("5 :chomin           --Rs50");
                        System.out.println("6 :Chicken Tandoori --Rs60");
                        System.out.println("7 :Chicken Lolipop  --Rs30");
                        System.out.println("8 :Fish orly        --Rs50");
                        System.out.println("9 :Fish Balls       --Rs50");
                        System.out.println("10 Fish Roll        --Rs50");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println("Please enter the number of the item you choice");
                        i = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println("Enter the quantity");
                        int q = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        if ((i == 1) || (i == 3) || (i == 4))
                            tp = (q * 70);
                        if ((i == 2) || (i == 6))
                            tp = (q * 60);
                        if ((i == 7))
                            tp = (q * 30);
                        if ((i == 5) || (i == 8) || (i == 9) || (i == 10))
                            tp = (q * 50);
                        tamt1 = tamt1 + tp;
                        System.out.println("Do you want to place more order?");
                        System.out.println("Enter'Y' for Yes or 'N' for No.");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.print("Your Reply = ");
                        choice2 = in.next();
                    }
                }
                break;
                case 2: {
                    System.out.println("---------------------------------" + "------------------------");
                    System.out.println(".          Welcome to Main course");
                    System.out.println("Enter V for Vegetarian");
                    System.out.println("Enter N for  Non Vegetarian");
                    System.out.println("Enter C for  Chinese food ");
                    System.out.println("---------------------------------" + "------------------------");
                    System.out.print("Your Reply = ");
                    char choice1 = in.next().charAt(0);
                    if (choice1 == 'V') {
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println(" Welcome to Main course Vegetarian");
                        System.out.println("1 :Veg biryani           --Rs60");
                        System.out.println("2 :Rajma chawal          --Rs70");
                        System.out.println("3 :Kolkata Briyani       --Rs60");
                        System.out.println("4 :Chana masala.         --Rs70");
                        System.out.println("5 :Samosa.               --Rs30");
                        System.out.println("6 :Chilli paneer         --Rs60");
                        System.out.println("7 :Mushroom Matar        --Rs50");
                        System.out.println("8 :Mirch Pakore.         --Rs70");
                        System.out.println("9 :Paneer Spinach Roll.  --Rs50");
                        System.out.println("10:Cashewnut matar.      --Rs45");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.print("Please enter the number of the item you choice = ");
                        int item = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.print("Enter the quantity = ");
                        int quantitys = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        if ((item == 1) || (item == 3) || (item == 6))
                            total = (quantitys * 60);
                        if ((item == 2) || (item == 4) || (item == 8))
                            total = (quantitys * 70);
                        if ((item == 7) || (item == 9))
                            total = (quantitys * 50);
                        if (item == 5) total = (quantitys * 30);
                        if (item == 10) total = (quantitys * 45);
                        tamt2 = tamt2 + total;
                        System.out.println("Do you want to place more order?");
                        System.out.println("Enter'Y' for Yes or 'N' for No.");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.print("Your Reply = ");
                        choice2 = in.next();
                    }
                    if (choice1 == 'N') {
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println(" Welcome to main course Non Vegetarian");
                        System.out.println("1 :Spicy Chicken Masala --Rs160");
                        System.out.println("2 :Chicken Chettinad    --Rs80");
                        System.out.println("3 :Malabar Fish Biryani --Rs160");
                        System.out.println("4 :Tandoori Lamb Chops  --Rs75");
                        System.out.println("5 :Mutton korma         --Rs160");
                        System.out.println("6 :Chicken kema Slider. --Rs70");
                        System.out.println("7 :Chicken kema Samosa. --Rs70");
                        System.out.println("8 :Tandoori Salmon      --Rs90");
                        System.out.println("9 :Fish Achar.          --Rs40");
                        System.out.println("10:Fish Amritsari.      --Rs80");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println("Please enter the number of the item you choice");
                        int items = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println("Enter the quantity");
                        int quantitys = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        if ((items == 1) || (items == 3) || (items == 5)) price = (quantitys * 160);
                        if (items == 2 || (items == 10))
                            price = (quantitys * 80);
                        if (items == 4) price = (quantitys * 75);
                        if ((items == 6) || (items == 7))
                            price = (quantitys * 70);
                        if (items == 8) price = (quantitys * 90);
                        if (items == 9) price = (quantitys * 40);
                        tamt3 = tamt3 + price;
                        System.out.println("Do you want to place more order?");
                        System.out.println("Enter'Y' for Yes or 'N' for No.");
                        System.out.println("---------------------------------" + "------------------------");
                        choice2 = in.next();
                    }
                    if (choice1 == 'C') {
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println("     Welcome to  Chinese dishes ");
                        System.out.println("1 :chilly chicken           --Rs40");
                        System.out.println("2 :Chicken Noodle           --Rs50");
                        System.out.println("3 :Chicken Fried Rice       --Rs60");
                        System.out.println("4 :Chilly Paneer            --Rs70");
                        System.out.println("5 :Veg.Fried Rice           --Rs80");
                        System.out.println("6 :Paneer Manchurian        --Rs90");
                        System.out.println("7 :Chicken Manchurian       --Rs50");
                        System.out.println("8 :Kim hi Rice Veg          --Rs70");
                        System.out.println("9 :Shanghai Fried Rice      --Rs60");
                        System.out.println("10:Schezwan Fried Rice      --Rs40");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println("Please enter the number of the item you choice");
                        int item = in.nextInt();
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.println("Enter the quantity");
                        System.out.println("---------------------------------" + "------------------------");
                        int quantity = in.nextInt();
                        if ((item == 1) || (item == 10))
                            tot = (quantity * 40);
                        if ((item == 2) || (item == 7))
                            tot = (quantity * 50);
                        if ((item == 3) || (item == 9))
                            tot = (quantity * 60);
                        if ((item == 4) || (item == 8))
                            tot = (quantity * 70);
                        if (item == 5) tot = (quantity * 80);
                        if (item == 6) tot = (quantity * 90);
                        tamt6 = tamt6 + tot;
                        System.out.println("Do you want to place more order?");
                        System.out.println("Enter'Y' for Yes or 'N' for No.");
                        System.out.println("---------------------------------" + "------------------------");
                        System.out.print("Your Reply = ");
                        choice2 = in.next();
                    }
                }
                break;
                case 3: {
                    System.out.println("---------------------------------" + "------------------------");
                    System.out.println("           Welcome to desserts");
                    System.out.println("1 :Angel food cake              --Rs140");
                    System.out.println("2 :Tiramisu                     --Rs65");
                    System.out.println("3 :Apple cinnamon custard cake  --Rs80");
                    System.out.println("4 :Almond and date cake         --Rs140");
                    System.out.println("5 :'Not so fried' ice-cream     --Rs65");
                    System.out.println("6 :Banana Split.                --Rs40");
                    System.out.println("7 :Ics Cream                    --Rs50");
                    System.out.println("8 :Almond Banana.               --Rs40");
                    System.out.println("9 :Roasted Strawberry Crumble.  --Rs60");
                    System.out.println("10:Almond Cake                  --Rs50");
                    System.out.println("---------------------------------" + "------------------------");
                    System.out.print("Please enter the number of the item you choice = ");
                    int items = in.nextInt();
                    System.out.println("---------------------------------" + "------------------------");
                    System.out.print("Enter the quantity = ");
                    int quantitys = in.nextInt();
                    System.out.println("---------------------------------" + "------------------------");
                    if ((items == 1) || (items == 4))
                        cost = (quantitys * 140);
                    if ((items == 2) || (items == 5))
                        cost = (quantitys * 65);
                    if (items == 3) cost = (quantitys * 80);
                    if ((items == 8) || (items == 6))
                        cost = (quantitys * 40);
                    if (items == 9) cost = (quantitys * 60);
                    if ((items == 7) || (items == 10))
                        cost = (quantitys * 50);
                    tamt4 = tamt4 + cost;
                    System.out.println("Do you want to place more order?");
                    System.out.println("Enter'Y' for Yes or 'N' for No.");
                    System.out.println("---------------------------------" + "------------------------");
                    System.out.print("Your Reply = ");
                    choice2 = in.next();
                }
                default: {
                    System.out.println("Error occurred!!!!!");
                }
            } //Switch statement closed
        } // while condition closed
        if (choice2.equalsIgnoreCase("N")) {
            System.out.println("---------------------------------" + "------------------------");
            System.out.println("---------------------------------" + "------------------------");
            int starter = (tamt + tamt1);
            int mainC = (tamt2 + tamt3 + tamt6);
            System.out.println("Total Cost of Stater is : " + "Rs" + starter);
            System.out.println("---------------------------------" + "------------------------");
            System.out.println("Total Cost of Main course is : " + "Rs" + mainC);
            System.out.println("---------------------------------" + "------------------------");
            System.out.println("Total Cost of Deserts is : " + "Rs" + tamt4);
            int Ta = (tamt + tamt1 + tamt2 + tamt3 + tamt4);
            System.out.println("---------------------------------" + "------------------------");
            System.out.println("---------------------------------" + "------------------------");
            System.out.println("Total amount to be paid is : " + "Rs" + Ta);
            System.out.println("---------------------------------" + "------------------------");
            System.out.println("Thank you for visiting our Restaurant");
            System.out.println("Do visit again......");
            System.out.println("Your Pleasure our comfort...");
            System.out.println("---------------------------------" + "------------------------");
            System.out.println("                                        Your Faithfully ");
            System.out.println("                                        Sharma Restaurant ");
        }
    } //main closed
} //class closed

