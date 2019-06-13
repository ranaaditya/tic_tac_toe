package com.rana_aditya.tic_tac_toe;

public class Move {
    public   int row, col;
    public Move(){
        this.col=-1;
        this.row=-1;

    }
    public void reset(){
        this.row=-1;
        this.col=-1;
    }

}
