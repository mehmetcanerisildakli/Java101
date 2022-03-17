package com.java101;

import java.util.List;
import java.util.Scanner;

public class NearValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("put the number . . .");
        int number = input.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,0};
        int count = Integer.MAX_VALUE ;
        int count_2 = Integer.MAX_VALUE ;
        int l = 0,h = 0;

        for (int i : list) {
            if (i < number) {
                if(number - i < count){
                    count = number -i ;
                    l = i;
                }
            }
            if (i > number) {
                if(i - number < count_2){
                    count_2 = i- number ;
                    h = i;
                }
            }
        }

        System.out.println("higher close " + h);
        System.out.println("lower close " + l);

    }
}
