package com.java101;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheList {

    public static boolean isThere(int[] list, int x){

        for (int i = 0 ; i < list.length; i ++){
            if (list[i] == x)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m = Integer.MAX_VALUE ;

        System.out.println("what is the length of the array");
        int l = input.nextInt();
        int[] list = new int[l];
        int[] list2 = new int[l];

        for (int i = 0 ; i < list.length; i ++){
            list[i] = Integer.MAX_VALUE;
            list2[i] = Integer.MAX_VALUE;
        }

        for (int i = 0 ; i < list.length; i ++){
            int in ;
            do {
                System.out.println("put "+ (i + 1) +"'th value (must be diffrent!)");
                in = input.nextInt();
            }while (!isThere(list, in ));
            list[i] = in ;
        }

        for (int i = 0 ; i < list.length; i ++){
            for (int j = 0 ; j < list.length; j ++){
                if (list[j] < list[i]){
                    if ( list[j] < m && isThere(list2, list[j]) ){
                        m = list[j];
                    }
                } else {
                    if ( list[i] < m && isThere(list2, list[j])) {
                        m = list[j];
                    }
                }
            }
            list2[i] = m ;
            m = Integer.MAX_VALUE ;
        }

        System.out.println("-->sorted list : " + Arrays.toString(list2));
    }
}
