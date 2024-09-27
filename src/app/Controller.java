package app;

import food.Apple;
import food.Sandwich;
import machine.Register;
import transactions.Payment;

public class Controller {

     public static void main(String[] args) {

          System.out.println("===============================================");
          System.out.println("COP 2210 - Project 1 Output");
          System.out.println("Katherine Barrios");
          System.out.println("6337804");
          System.out.println("U01");
          System.out.println("===============================================");
          System.out.println("\n");


          Register register = new Register(15,20, 10,20,50);

          register.cashInfo("Manager");
          register.cashInfo("Staff");



          Apple grannySmith = new Apple("Granny Smith", 1.51,140);
          grannySmith.displayInfo();

          Payment applePayment1 = new Payment(10,0,0,0,47);

          applePayment1.displayInfo();

          register.buyApple(grannySmith,applePayment1);

          register.cashInfo("Manager");

          Apple macintosh = new Apple("Macintosh", 1.70,150);
          macintosh.displayInfo();

          Payment applePayment2 = new Payment(0,2,0,0,0);

          applePayment2.displayInfo();

          register.buyApple(macintosh,applePayment2);

          register.cashInfo("Manager");


          Sandwich sandwich = new Sandwich(true, true, true);

          sandwich.displayInfo();

          Payment sandwichPayment1 = new Payment(5,2,1,1,2);

          sandwichPayment1.displayInfo();

          register.buySandwich(sandwich,sandwichPayment1);

          register.cashInfo("Manager");


          boolean meat;
          boolean cheese;
          boolean veggies;

          System.out.println();
          for(int s = 1; s <= 8; s++){
               if(s <= 4){
                    meat = true;
               } else{
                    meat = false;
               }
               if(s%2 == 0){
                    veggies = false;
               } else{
                    veggies = true;
               }
               if(s <= 2 || s == 5 || s == 6){
                    cheese = true;
               }else {
                    cheese = false;
               }
               System.out.println("========================================================");
               System.out.println("========================================================");
               Payment payment10 = new Payment(10,0,0,0,0);
               Sandwich sandwich10 = new Sandwich(meat, cheese, veggies);
               sandwich10.displayInfo();
               payment10.displayInfo();
               register.buySandwich(sandwich10, payment10);
               register.cashInfo("Manager");
               System.out.println("========================================================");
               System.out.println("========================================================");
               System.out.println();
          }

     } // end main

} //end class
