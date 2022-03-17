package com.java101;

import java.util.Arrays;

public class RepetitiveNumbers {

    static boolean isFind(int[] arr, int value){
        for (int i : arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[] list = {5,4,6,4,8,9,5,4,3,2,1,2,5,5,5,6,9,5,};
        int[] duplicate = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if(!isFind(duplicate, list[i]) && list[i] % 2 == 0){
                        duplicate[index++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));
    }
}
