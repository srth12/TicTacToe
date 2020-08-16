package com.example.tictacktoo.service;

import com.example.tictacktoo.enums.MOVE_STATUS;
import com.example.tictacktoo.dao.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Player> players;
    private Player currentPlayer;

    private int boardSize = 0;

    public Game(Player player, int boardSize){
        this.players = new ArrayList<>();
        this.players.add(player);
        this.currentPlayer = player;
        this.boardSize = boardSize;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startGame() throws Exception {

        TicTackTooBoard gameBoard = TicTackTooBoardFactory.getBoard(this.players, this.boardSize);
        int totalMoves = 0;
        Scanner scanner = new Scanner(System.in);

        while (totalMoves < this.boardSize * 2){
            System.out.println(this.currentPlayer.getPlayerId() + " enter strike row and column");
            int row = scanner.nextInt();
            int column = scanner.nextInt();

            MOVE_STATUS moveStatus = gameBoard.strikeAt(row, column, currentPlayer);

            if(moveStatus == MOVE_STATUS.INVALID) {
                System.out.println("Already contains entry, enter new location");
                continue;
            }
            if(moveStatus == MOVE_STATUS.WON) {
                System.out.println(currentPlayer.getPlayerId() + " won the game");
                return;
            }

            totalMoves += 1;
            this.currentPlayer = this.players.get(totalMoves % this.players.size());

        }

        System.out.println("It's a tie!");

    }
}
