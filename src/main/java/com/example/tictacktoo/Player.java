package com.example.tictacktoo;

import lombok.Getter;

@Getter
public class Player {
    private int playerId;

    public Player(int id){
        this.playerId = id;
    }
}
