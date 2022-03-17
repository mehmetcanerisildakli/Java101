package com.java101;

import java.util.Objects;
import java.util.Scanner;

public class ConditionalOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Calculator -->

//        int result = 0;
//        System.out.print("first number?");
//        int first = input.nextInt();
//
//        System.out.print("second number?");
//        int second = input.nextInt();
//
//        System.out.print("which operation?");
//        String operation = input.next();
//
//        if (operation == "+")
//            result = first+second;
//        if (operation == "-")
//            result = first-second;
//        if (operation == "*")
//            result = first*second;
//        if (operation == "/")
//            result = first/second;
//
//        System.out.println("Result is : " + result);

        // User login -->

//        String username, password = "123456";
//
//
//        System.out.print("username?");
//        username = input.nextLine();
//
//        System.out.print("password?");
//        String password_user = input.nextLine();
//
//        if (!Objects.equals(password, password_user)){
//            System.out.println("password is wrong ,do you want to change it?");
//            System.out.print("password?");
//            String password_new = input.nextLine();
//            if (password != password_new && password_new != password_user){
//                System.out.print("password is changed successfully");
//            }
//            else
//                System.out.print("password is not changed!");
//
//        }

        //  Pass or Fail --->

//        int phy, math, chem, tur, mus,total=0;
//
//
//        System.out.print("phy grade?");
//        phy = input.nextInt();
//        if (phy < 101 && phy > -1)
//            total = total + phy;
//
//        System.out.print("chem grade?");
//        chem = input.nextInt();
//        if (chem < 101 && chem > -1)
//            total = total + chem;
//
//        System.out.print("tur grade?");
//        tur = input.nextInt();
//        if (tur < 101 && tur > -1)
//            total = total + tur;
//
//        System.out.print("math grade?");
//        math = input.nextInt();
//        if (math < 101 && math > -1)
//            total = total + math;
//
//        System.out.print("mus grade?");
//        mus = input.nextInt();
//        if (mus < 101 && mus > -1)
//            total = total + mus;
//
//        double result = total/6.0;
//
//        String message = (result >= 60) ? " you pass" : " you fail";
//        System.out.print(message);


        // Activities Dependent on Whether Condition  -->

//        int temperature;
//
//        System.out.print("What is temperature?");
//        temperature = input.nextInt();
//
//        if (temperature < 5)
//            System.out.print("it is time to ski");
//        if (temperature >= 5 && temperature <= 15)
//            System.out.print("it is time to cinema");
//        if (temperature >= 15 && temperature <= 25)
//            System.out.print("it is time to picnic");
//        else
//            System.out.print("it is time to swim");


        // Order from the Biggest the Smallest  -->

//        System.out.print("first number?");
//        int first = input.nextInt();
//        System.out.print("second number?");
//        int second = input.nextInt();
//        System.out.print("third number?");
//        int third = input.nextInt();
//
//        if(first > second && first > third){
//            if (second > third)
//                System.out.print(first+">"+second+">"+third);
//            else
//                System.out.print(first+">"+third+">"+second);
//        }
//
//        else if (second > third){
//            if (first > third)
//            System.out.print(second+">"+first+">"+third);
//            else
//                System.out.print(second+">"+third+">"+first);
//        }
//
//        else {
//            if (first > second)
//                System.out.print(third+">"+first+">"+second);
//            else
//                System.out.print(third+">"+second+">"+first);
//        }


        // Horoscope Finding -->

//        System.out.print("What is your birth month?(between 1-12)");
//        int month = input.nextInt();
//
//        System.out.print("which day of the month?(between 1-31)");
//        int day = input.nextInt();
//
//        if (month == 1){
//            if (day <=21)
//                System.out.print("Capricorn");
//            else
//                System.out.print("Aquarius");
//        }
//        if (month == 2){
//            if (day <=19)
//                System.out.print("Aquarius");
//            else
//                System.out.print("Pisces");
//        }
//        if (month == 3){
//            if (day <=20)
//                System.out.print("Pisces");
//            else
//                System.out.print("Aries");
//        }
//        if (month == 4){
//            if (day <=20)
//                System.out.print("Aries");
//            else
//                System.out.print("Taurus");
//        }
//        if (month == 5){
//            if (day <=21)
//                System.out.print("Taurus");
//            else
//                System.out.print("Gemini");
//        }
//        if (month == 6){
//            if (day <=22)
//                System.out.print("Gemini");
//            else
//                System.out.print("Cancer");
//        }
//        if (month == 7){
//            if (day <=22)
//                System.out.print("Cancer");
//            else
//                System.out.print("Leo");
//        }
//        if (month == 8){
//            if (day <=22)
//                System.out.print("Leo");
//            else
//                System.out.print("Virgo");
//        }
//        if (month == 9){
//            if (day <=22)
//                System.out.print("Virgo");
//            else
//                System.out.print("Libra");
//        }
//        if (month == 10){
//            if (day <=22)
//                System.out.print("Libra");
//            else
//                System.out.print("Scorpio");
//        }
//        if (month == 11){
//            if (day <=21)
//                System.out.print("Scorpio");
//            else
//                System.out.print("Sagitarius");
//        }
//        if (month == 12){
//            if (day <=21)
//                System.out.print("Sagitarius");
//            else
//                System.out.print("Capricorn");
//        }

        // Flight Ticket Calculator  -->

//        double fee = 0.1 ;
//        boolean situation = true;
//
//        System.out.print("What is the distance?");
//        int dis = input.nextInt();
//        System.out.print("What is the age?");
//        int age = input.nextInt();
//        System.out.print("What is the travel type?(1 or 2)");
//        int type = input.nextInt();
//        if (!Objects.equals(type, 1) && !Objects.equals(type, 2))
//            situation = false ;
//
//        double total_fee = dis * fee ;
//
//        if (age <=12 && situation)
//            total_fee = total_fee - (total_fee * 0.5) ;
//        if (age > 12 && age <=24 && situation)
//            total_fee = total_fee - (total_fee * 0.1) ;
//        if (age > 65 && situation)
//            total_fee = total_fee - (total_fee * 0.3) ;
//        if (type == 2 && situation) {
//            total_fee = total_fee - (total_fee * 0.2);
//            total_fee = total_fee * 2;
//        }
//
//        if (situation)
//            System.out.println("Ticket fee is : " + total_fee);
//        else
//            System.out.println("Type is wrong!! ");

        // Chinese Zodiac  -->

//        System.out.print("What is the year of your birth?");
//        int year = input.nextInt();
//        int zodiac = year % 12 ;
//
//        switch (zodiac){
//            case 0 : System.out.println("monkey"); break;
//            case 1 : System.out.println("rooster"); break;
//            case 2 : System.out.println("Dog "); break;
//            case 3 : System.out.println("pig"); break;
//            case 4 : System.out.println("mice"); break;
//            case 5 : System.out.println("ox"); break;
//            case 6 : System.out.println("tiger"); break;
//            case 7 : System.out.println("rabbit"); break;
//            case 8 : System.out.println("dragon"); break;
//            case 9 : System.out.println("snake"); break;
//            case 10 : System.out.println("horse "); break;
//            case 11 : System.out.println("sheep"); break;
//        }


        // Leap Year  -->

//        System.out.print("what year?");
//        int year = input.nextInt();
//
//        if (year % 100 == 0 && year % 400 == 0){
//            System.out.print("leep year : " + year);
//        }
//        if (year % 100 != 0 && year % 4 == 0){
//            System.out.print("leep year : " + year);
//        }



    }
}
