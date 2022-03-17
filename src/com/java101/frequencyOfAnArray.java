package com.java101;

import java.util.Arrays;

public class frequencyOfAnArray {

    public static int count(int[] list, int x){

        int count = 0;
        for (int i = 0 ; i < list.length; i ++){
            if (list[i] == x)
                count++;
        }
        return count;
    }
    public static boolean isThere(int[] list, int x){

        for (int i = 0 ; i < list.length; i ++){
            if (list[i] == x)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int [] list = new int[] {1,2,5,4,8,9,6,6,6,5,4,8,8,7,9,9,2,3,1,5} ;
        System.out.println("List --> " + Arrays.toString(list)) ;
        System.out.println("====================") ;
        int [] list2 = new int[list.length] ;
        for (int i = 0 ; i < list2.length; i ++){
            list2[i] = Integer.MAX_VALUE;
        }

        for (int i = 0 ; i < list.length; i ++){
            if (isThere(list2, list[i])){
                list2[i] = list[i] ;
            }
        }

        for (int i = 0 ; i < list.length; i ++){
            if (!isThere(list, list2[i])){
                System.out.println("There are/is  "  + count(list, list[i]) + " X " + "(" + list[i] + ")" +  " in the list") ;
            }

        }

    }
}
