package com.rana_aditya.tic_tac_toe;


import android.content.Context;
import android.content.Intent;

public class Board {
    public int array[][] = new int[3][3];
    public int  player=-1;         //if (player==-1) (then it is no one} if(player==1){then it is opponent for AI i.e user }else if(player==2){then it is AI itself}...

    public Board() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = 0;
            }
        }
    }

    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = 0;
            }
        }
        player = -1;


    }

    public boolean check_game() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] != 0) {
                    //right side checking
                    if (array[i][j] != 0) {
                        if (check_right(array)) {
                            reset();
                            return true;
                        }


                        //check left side
                        if (j == 2) {
                            if (check_left(array))
                                return true;
                        }
                        if (i == 0) {
                            if (check_down(array))
                                return true;
                        }
                        if (i == 2) {
                            if (check_up(array))
                                return true;
                        }
                        if (i == 1 && j == 1) {
                            if (check_diagonally(array))
                                return true;
                        }
                    }
                }

            }
        }
        return false;
    }

    private boolean check_right(int str[][]) {
        for (int i = 0; i < 3; i++) {
            if (str[i][0]!=0){

            if (str[i][0] == str[i][1] && str[i][1] == str[i][2])
                return true;

        }}
        return false;


    }
    private boolean  check_left( int str[][]){
        for (int i=0;i<3;i++){
            if (str[i][2]!=0){
            if (str[i][2]==str[i][1]&&str[i][1]==str[i][0])
                return  true;
        }}
        return false;
    }
    private   boolean check_down(int str[][]){
        for (int k=0;k<3;k++){
            if (str[0][k]!=0){
            if (str[0][k]==str[1][k]&&str[1][k]==str[2][k])
                return  true;
        }}
        return false;
    }
    private boolean check_up(int str[][]){
        for (int k=0;k<3;k++){
            if (str[2][k]!=0){
            if (str[2][k]==str[1][k]&&str[1][k]==str[0][k])
                return true;
        }}
        return false;
    }
    private boolean check_diagonally(int str[][]){
        if (str[1][1]!=0){
            if (str[1][1] == str[0][2] && str[1][1] == str[2][0]) return true;
            if (str[1][1] == str[0][0] && str[1][1] == str[2][2]) return true;

        }
        return false;
    }
    public void update_user(int row,int col){
        if (array[row][col]==0)
        array[row][col]=1;

    }
    public void update_ai(int row,int col){
        if (array[row][col]==0)
        array[row][col]=2;
    }
}
