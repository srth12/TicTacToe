package com.example.tictacktoo;

import java.util.List;

public class TicTackTooBoardFactory {

    public static TicTackTooBoard getBoard(List<Player> players, int sizeOfBoard) throws Exception {
        if (players.size() == 2){
            return new TicTackTooBasicBoard(sizeOfBoard);
        }
        throw new Exception("Board not found for given players");
    }
}
