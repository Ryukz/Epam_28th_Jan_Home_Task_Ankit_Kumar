package com.hometask;

import java.util.Scanner;

public  abstract  class New_Year_Gift_Base_Class implements Comparable<New_Year_Gift_Base_Class>   //MAIN CLASS
{


    //Price of the three types of Sweets and Names to identify the types of Sweets in main class
    private static int price_Candies=70;
    private  static int price_Namkeen=60;
    public  static int finalprice=0;
    public static int getPrice_Candies() {
        return price_Candies;
    }

    public static int getPrice_Namkeen() {
        return price_Namkeen;
    }

    public String getName() {
        return name;
    }

    String name="";

    public String getNameofChild() {
        return nameofChild;
    }

    public void setNameofChild(String nameofChild) {
        this.nameofChild = nameofChild;
    }

    String nameofChild="";
   int quantity=0;

    public  int getCurrentPrice() {
        return currentPrice;
    }

    public   void  setCurrentPrice(int currentPrice) {
       this.currentPrice = currentPrice;
    }

   private   int currentPrice=0;

    public int getTotal_Weight() {
        //finalprice=total_Weight;
        return finalprice;

    }

    public static void setTotal_Weight(int total_Weight) {
        finalprice=finalprice+total_Weight;
//        this.total_Weight = total_Weight;
    }

    private  int total_Weight=0;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(New_Year_Gift_Base_Class o) {
       // int compareQuantity = o.getQuantity();

        //ascending order
       // return o.getName().compareTo(name);
        return  getCurrentPrice()-o.getCurrentPrice();
    }
}
