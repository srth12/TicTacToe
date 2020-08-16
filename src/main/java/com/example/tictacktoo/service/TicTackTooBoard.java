package com.example.tictacktoo.service;

import com.example.tictacktoo.enums.MOVE_STATUS;
import com.example.tictacktoo.dao.Player;

public interface TicTackTooBoard {

    public boolean isAlreadyStriked(int n, int m);

    public MOVE_STATUS strikeAt(int row, int column, Player player);
}
