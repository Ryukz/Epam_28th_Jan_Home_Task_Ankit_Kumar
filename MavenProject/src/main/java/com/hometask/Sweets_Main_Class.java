package com.hometask;
import java.util.*;
import  java.lang.*;
import com.hometask.CompareByQuantity;
public class Sweets_Main_Class extends New_Year_Gift_Base_Class {
    public static void typeofSweet(String A,int x)
    {
      if(A.equals("Candies"))
      {
          int sum=x*getPrice_Candies();
          setTotal_Weight(sum);
      }
      else
          if(A.equals("Namkeen"))
          {
              int sum=x*getPrice_Namkeen();
              setTotal_Weight(sum);
          }

    }
    public static  void main(String args[]) {
        Scanner n = new Scanner(System.in);
        String A="";
        int x=0;
        System.out.println("Enter the number of Childrens");
        int z=n.nextInt();
        New_Year_Gift_Base_Class A1[]=new New_Year_Gift_Base_Class[z];//Arrays of Objects to create multiple user as per the requirements
        int sum=0;
        for(int i=0;i<z;i++) {
            System.out.println("Enter the name of "+(i+1)+"  Children");
            String C=n.next();
            System.out.println("Enter the type of Sweets( Either Namkeen or Candies Only!!) ");
            A = n.next();
            System.out.println("Enter the Quantity of " + A + " ");
            x = n.nextInt();
             A1[i] = new Sweets_Main_Class();
             A1[i].setNameofChild(C);
            A1[i].setName(A);
            A1[i].setQuantity(x);
            if(A.equals("Namkeen"))
            A1[i].setCurrentPrice(getPrice_Namkeen());
            else
                A1[i].setCurrentPrice(getPrice_Candies());
            typeofSweet(A, x);
            sum=sum+A1[i].finalprice;
        }
        System.out.println("Total weight of Gift's "+ sum);
        System.out.println("Deatils of Children who likes Candies!!");
        for(int i=0;i<z;i++)
        {   //A1[i]=new Sweets();
         if(A1[i].getName().equals("Candies"))
         {
             System.out.println("Name of Child "+A1[i].getNameofChild());
             System.out.println("Quantity of Candies he/she bought "+A1[i].getQuantity());
             System.out.println("Price of Candies RS "+A1[i].getPrice_Candies());
            // break;
         }

        }
       System.out.println("Sort the chocolates by which options Price or Quantity!!(Enter 1 for Price(Asc) or 2 for Quantity(Asc))");
       x=n.nextInt();
       if(x==1)
       {    System.out.println("Sorted by Price(Asc)!!!");
//           CompareByPrice cp=new CompareByPrice();
//           Collections.sort(Arrays.asList(A1),cp);
           Collections.sort(Arrays.asList(A1));
           for(int i=0;i<z;i++) {
               System.out.print("Name =="+A1[i].getNameofChild() + " Sweet's Name ==" + A1[i].getName() + " Quantity of Sweets == " + A1[i].getQuantity()+" ==");
               if(A1[i].getName().equals("Candies"))
                   System.out.println("Price Rs"+A1[i].getPrice_Candies());
               else
                   System.out.println(" Price Rs"+A1[i].getPrice_Namkeen());
           }
       }
       else
           if(x==2)
           {
               System.out.println("Sorted by Quantity(Asc)!!!");
               CompareByQuantity cq=new CompareByQuantity();
                Collections.sort(Arrays.asList(A1),cq);
               for(int i=0;i<z;i++) {
                   System.out.print("Name =="+A1[i].getNameofChild() + " Sweet's Name ==" + A1[i].getName() + " Quantity of Sweets == " + A1[i].getQuantity()+" ==");
                   if(A1[i].getName().equals("Candies"))
                       System.out.println("Price Rs"+A1[i].getPrice_Candies());
                   else
                       System.out.println(" Price Rs"+A1[i].getPrice_Namkeen());
               }

           }



    }

}
