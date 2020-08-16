package com.example.tictacktoo;

public class Cell {

    private Player player;

    public Cell(Player player){
        this.player = player;
    }

    public boolean containsAnyPlayer() {
        if (player == null)
            return false;
        else return true;
    }
}
