package com.java101;

import java.util.Scanner;

public class Traspose {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("row number");
        int row =input.nextInt();
        System.out.println("column number");
        int column =input.nextInt();
        int[][] matrix = new int[row][column];
        int[][] matrix2 = new int[column][row];

        for (int i = 0 ; i < matrix.length; i ++){
            for (int j = 0 ; j < matrix.length; j ++){
                System.out.println("put index of a " + "(" + i + "," + j + ")");
                matrix[i][j] = input.nextInt() ;
            }
        }

        for (int i = 0 ; i < matrix2.length; i ++){
            for (int j = 0 ; j < matrix2.length; j ++){
                System.out.print(" " + matrix[j][i] + " ");
            }
            System.out.println(" ");
        }


    }
}
