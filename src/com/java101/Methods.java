package com.java101;

import java.util.Objects;
import java.util.Scanner;

public class Methods {

    static void isPalindrom(int number){
        int x ,reverse = 0, lastnumber,count = 1;
        x= number;
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        count = (int) Math.pow(10, length-1);
        while (x != 0){
            lastnumber = x % 10 ;
            reverse = reverse + (lastnumber * count);
            count = count / 10 ;
            x = x / 10 ;
        }
        if (reverse == number)
            System.out.print("Palidrom number ...");
        else
            System.out.print("not palidrom");

    }

    static int findingExponential(int number, int power){
        if (power== 0){
            return 1;
        }

        return number * findingExponential(number,power-1);
    }

    static void isPrimeNumber(int number, int i){

        if(i == 1){
            System.out.print("it is a PRIME number");
            return;
        }
        else
        {
            if(number % i == 0){
                System.out.print("it is not a prime number");
                return;
            }
            else
                isPrimeNumber(number, i-1);
        }

    }

    static void pattern(int number, boolean b, int k){

        System.out.print(number + " ");
        if (number < 0 || number == 0) {
            b = false;
            pattern(number + 5, b,k);
        }
        else if (!Objects.equals(b,false))
        {
            pattern(number - 5, b,k);
        }
        if (Objects.equals(b,false)){
            if (number == k){return;}
            pattern(number + 5, b,k);
        }
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Checking Palindrom

//        System.out.print("Write the number . . .(palidrom) ");
//        int number = input.nextInt();
//        isPalindrom(number);

        // Exponential using Recursive Method

//        System.out.print("Write the number . . . (exponential) ");
//        int number = input.nextInt();
//        System.out.print("Write the power . . . (exponential) ");
//        int power = input.nextInt();
//
//        System.out.print(findingExponential(number,power));

        // Whether Prime Number or not

//        System.out.print("Write the number . . . (prime?) ");
//        int number = input.nextInt();
//        isPrimeNumber(number,number / 2);

        // -5 +5 Pattern Method

//        System.out.print("Write the number . . . (pattern?) ");
//        int number = input.nextInt();
//        int k= number ;
//        if (number > 0)
//            pattern(number,true,k);
//        else
//            System.out.print("must be positive . . .");


    }
}
