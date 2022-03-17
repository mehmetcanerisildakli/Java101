package com.java101.minefieldgame;

import java.util.Objects;
import java.util.Scanner;

public class MineSweeper {

    int row;
    int column;
    String[][] field,field_2;

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void run() {

        if (this.row > 1 && this.column > 1){

            this.field = new String[this.row + 2][this.column + 2];
            this.field_2 = new String[this.row][this.column];
            putEarth();
            putBomb();
            putNumbers();
            showGame();
            playGame();

        }else{

            System.out.println("You must select row and column numbers bigger than 2 !!");
        }

    }

    void playGame(){
        Scanner input = new Scanner(System.in);
        int rw, clm ;
        int count = 0 ;
        int toWin = (this.row * this.column) - ((this.row * this.column) / 4) ;
        boolean game = true;
        while (game){

            while (true) {
                System.out.println("Write the row number ");
                rw = input.nextInt();
                if (rw <= this.row - 1 && rw >= 0 ){
                    break;
                }

            }

            while (true) {
                System.out.println("Write the column number ");
                clm = input.nextInt();
                if (clm <= this.column - 1 && clm >= 0 ){
                    break;
                }
            }

            if (Objects.equals(field[rw + 1][clm + 1], " * ")){
                field_2[rw][clm] = field[rw + 1][clm + 1] ;
                System.out.println("Game Over ..! ");
                showUnderEarth();
                game = false ;
            }
            else{
                if (Objects.equals(field_2[rw][clm], " - ")){
                    field_2[rw][clm] = field[rw + 1][clm + 1] ;
                    count++;
                }else
                    System.out.println("***WARNING*** --> You have already selected these numbers!!");

            }

            if (Objects.equals(count, toWin)){
                System.out.println("You Win =)");
                game = false ;

            }

            showGame();
        }

    }

    void putEarth(){
        for (int i = 0; i < this.field_2.length; i++) {
            for (int j = 0; j < this.field_2.length; j++) {
                field_2[i][j] = " - " ;
            }
        }
    }

    void putBomb(){
        int count = 0;
        int numberOfBomb = (this.row * this.column) / 4  ;
        while (count < numberOfBomb) {
            for (int i = 1; i < this.field.length - 1 ; i++) {
                for (int j = 1; j < this.field.length - 1 ; j++) {
                    int rdm = (int) (Math.random() * 100);
                    if (rdm < 30 && !Objects.equals(this.field[i][j], " * ")) { // when condition is < 30, bombs disperse wider field
                        if (count < numberOfBomb) {
                            this.field[i][j] = " * ";
                            count++;
                        }
                    }
                }
            }
        }

    }

    void putNumbers(){

        int count ;
        for (int i = 1; i < this.field.length-1; i++) {
            count = 0;
            for (int j = 1; j < this.field.length-1; j++) {
                if (!Objects.equals(this.field[i][j], " * ")){
                    count = count + checkAround_1(i,j);
                    count = count + checkAround_2(i,j);
                    count = count + checkAround_3(i,j);
                    this.field[i][j] = " " + count + " ";
                    count = 0 ;
                }

            }
        }
    }

    int checkAround_1(int r, int c) {

        int count = 0;
        for (int i = c - 1; i <= c + 1; i++){
             if (Objects.equals(this.field[r + 1][i], " * ")){
                    count ++ ;
                }
            }
        return count;
    }

    int checkAround_2(int r, int c) {

        int count = 0;
        for (int i = c - 1; i <= c + 1; i++){
            if (Objects.equals(this.field[r - 1][i], " * ")){
                    count ++ ;
                }
            }
        return count;
    }

    int checkAround_3(int r, int c) {

        int count = 0;
        for (int i = c - 1; i <= c + 1; i= i + 2){
            if (Objects.equals(this.field[r][i], " * ")){
                    count ++ ;
                }
            }
        return count;
    }

     void showUnderEarth(){
        System.out.println("====================");
        for (int i = 1; i < this.field.length - 1 ; i++) {
            for (int j = 1; j < this.field.length - 1 ; j++) {
                System.out.print(this.field[i][j] + " ");
            }
            System.out.println(" ");
        }
         System.out.println("====================");
    }

    void showGame(){
        System.out.println("====================");
        for (int i = 0; i < this.field_2.length ; i++) {
            for (int j = 0; j < this.field_2.length ; j++) {
                System.out.print(this.field_2[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("====================");
    }




}
