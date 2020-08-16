package com.example.tictacktoo.service;

import com.example.tictacktoo.dao.Player;
import com.example.tictacktoo.service.TicTackTooBasicBoard;
import com.example.tictacktoo.service.TicTackTooBoard;

import java.util.List;

public class TicTackTooBoardFactory {

    public static TicTackTooBoard getBoard(List<Player> players, int sizeOfBoard) throws Exception {
        if (players.size() == 2){
            return new TicTackTooBasicBoard(sizeOfBoard);
        }
        throw new Exception("Board not found for given players");
    }
}
