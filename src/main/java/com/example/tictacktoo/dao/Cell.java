package com.example.tictacktoo.dao;

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
