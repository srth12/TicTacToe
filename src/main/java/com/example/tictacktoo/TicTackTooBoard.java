package com.example.tictacktoo;

public interface TicTackTooBoard {

    public boolean isAlreadyStriked(int n, int m);

    public MOVE_STATUS strikeAt(int row, int column, Player player);
}
