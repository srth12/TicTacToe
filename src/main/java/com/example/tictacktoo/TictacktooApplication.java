package com.example.tictacktoo;

import com.example.tictacktoo.dao.Player;
import com.example.tictacktoo.service.Game;

public class TictacktooApplication {

	public static void main(String[] args) throws Exception {
		Player player1 = new Player(1);
		Game game = new Game(player1, 4);
		Player player2 = new Player(2);
		game.addPlayer(player2);

		game.startGame();

	}

}
