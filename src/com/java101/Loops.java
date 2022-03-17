package com.java101;

import java.util.Objects;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Finding Even Numbers

//        System.out.println("insert an integer . . .");
//        int number = input.nextInt();
//        for (int i = 0; i <= number; i+=2){
//            System.out.println(i);
//        }

        // Sum of Even Numbers

//        int num,total = 0 ;
//
//        do{
//            System.out.println("write a number . . .");
//            num = input.nextInt();
//            total = total + num;
//            System.out.println("Total of even numbers : "+ total);
//        }while(num % 2 == 0);
//        System.out.println("---end---");

        // Exponentials of 4 and 5

//        System.out.println("write the power . . .");
//        int till = input.nextInt();
//        int k =1,l=1;
//
//        for (int i = 1; i <= till; k*=4){
//            System.out.print(k);
//            System.out.print("--");
//            ++i;
//        }
//        System.out.println(" ");
//        for (int a = 1; a <= till; l*=5){
//            System.out.print(l);
//            System.out.print("--");
//            ++a;
//        }

        // Combination Calculation  "C(n,r) = n! / (r! * (n-r)!"

//        System.out.println("write the n. . .");
//        int n = input.nextInt();
//        System.out.println("write the r . . .");
//        int r = input.nextInt();
//
//        int fact1=0,fact2=0,fact3=0;
//        for (int i = 2; i <= n; i++) {
//            fact1 = fact1 * i;
//        }
//        for (int i = 2; i <= r; i++) {
//            fact1 = fact1 * i;
//        }
//        for (int i = 2; i <= n-r; i++) {
//            fact3 = fact3 * i;
//        }
//
//        System.out.println(fact1/(fact2*(fact3)));

        // Sum of Digits of a Number

//        int total = 0, remain =0;
//        System.out.println("write the nunber . . .");
//        int number = input.nextInt();
//
//        int length = 0;
//        long temp = 1;
//        while (temp <= number) {
//            length++;
//            temp *= 10;
//        }
//
//        for (int i = 0; i < length; i++) {
//
//           remain = remain + number % 10 ;
//           number = number / 10 ;
//        }
//
//        System.out.println(remain);

        // Harmonic Series

//        int sum = 1;
//        System.out.println("write the border (1 -> ...)");
//        int number = input.nextInt();
//        if (number > 0){
//
//            for (int i = 1; i <= number; i++) {
//
//                if (number == 1) {break;}
//                sum = sum + 1/i ;
//            }
//        }

        // Star Triangle

//        Scanner klavye = new Scanner(System.in);
//        System.out.println("Bir Sayı Giriniz :");
//        int n = klavye.nextInt();
//
//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j < (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i + 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//
//        for (int i = n-1; i >-1  ; i--) {
//            for (int j = (n - i); j > -1; j--) {
//                System.out.print(" ");
//            }
//            for (int k = (2 * i + 1); k > 0; k--) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // Bank Application

//        String userName, password;
//        int right = 3;
//        long balance = 1500;
//        int select;
//        while (right > 0) {
//            System.out.print("Kullanıcı Adınız :");
//            userName = input.nextLine();
//            System.out.print("Parolanız : ");
//            password = input.nextLine();
//
//            if (userName.equals("patika") && password.equals("dev123")) {
//                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
//                do {
//                    System.out.println("1-Para yatırma\n" +
//                            "2-Para Çekme\n" +
//                            "3-Bakiye Sorgula\n" +
//                            "4-Çıkış Yap");
//                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
//                    select = input.nextInt();
//                    switch (select){
//                        case 1: {
//                            System.out.print("Para miktarı : ");
//                            int price = input.nextInt();
//                            balance += price;
//                            break;}
//                        case 2: {
//                            System.out.print("Para miktarı : ");
//                            int price = input.nextInt();
//                            if (price > balance) {
//                                System.out.println("Bakiye yetersiz.");
//                            }
//                            else {
//                                balance -= price;
//                            }
//                            break;}
//                        case 3: System.out.println("Bakiyeniz : " + balance); break;
//                    }
//                } while (select != 4);
//                System.out.println("Tekrar görüşmek üzere.");
//                break;
//            }
//            else {
//                right--;
//                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
//                if (right == 0) {
//                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
//                } else {
//                    System.out.println("Kalan Hakkınız : " + right);
//                }
//            }
//        }

        //  The Biggest Common Denominator and The Smallest Common Mutiple

//        System.out.print("write the first number : ");
//        int number1 = input.nextInt();
//        System.out.print("write the second number : ");
//        int number2 = input.nextInt();
//        int smaller,ebob = 0,ekok,c = 1 ;
//
//        if (number1 < number2)
//            smaller = number1;
//        else
//            smaller = number2;
//
//        while (c <= smaller){
//            if (number1 % c == 0 && number2 % c == 0){
//                ebob = c;
//            }
//            c++;
//        }
//        ekok = (number1 * number2)/ebob ;
//
//        System.out.println("The Biggest Common Denominator :"+ ebob);
//        System.out.print("The Smallest Common Mutiple :" +ekok);


        // The Biggest and The Smallest Number in a Set

//        System.out.print("How many number will you write? : ");
//        int number = input.nextInt();
//        int n1,n2 = 0,biggest = Integer.MIN_VALUE,smallest = Integer.MAX_VALUE;
//
//        System.out.print("Enter a number ");
//        n1 = input.nextInt();
//        for (int i = 1; i < number; i++){
//            System.out.print("Enter a number ");
//            n2 = input.nextInt();
//            if (n1 > n2) {
//                biggest = n1;
//                if (n2 < smallest){ smallest  = n2;}
//            }
//            else {
//                biggest = n2;
//                if (n1 < smallest){ smallest  = n1;}
//            }
//        }
//        System.out.println("the smallest : " + smallest);
//        System.out.print("the biggest : " + biggest);


        // The Great Number

//        System.out.print(" Write a number ..");
//        int number = input.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i < number; i++){
//            if (number % i == 0){
//                sum = sum + i;
//            }
//        }
//
//        if (sum == number)
//            System.out.print(" it is GREAT");
//        else
//            System.out.print(" it is not great");


        // Prime Number (1-100)

//        boolean situation ;
//
//        for (int i = 2; i < 101; i++){
//            situation = true ;
//            for (int j = 2; j < i; j++){
//                if (i % j == 0 && !Objects.equals(i,2))
//                    situation = false;
//            }
//            if (situation == true)
//                System.out.print(i + "--");
//        }

        // Fibonacci Series

//        System.out.print(" Write series length");
//        int number = input.nextInt();
//        int n1 = 0,n2 = 1,n3;
//
//        for(int i=2;i<number;++i)
//        {
//            n3= n1+ n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }


    }
}
