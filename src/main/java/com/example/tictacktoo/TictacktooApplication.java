package com.example.tictacktoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TictacktooApplication {

	public static void main(String[] args) throws Exception {
//		SpringApplication.run(TictacktooApplication.class, args);
		Player player1 = new Player(1);
		Game game = new Game(player1, 3);
		Player player2 = new Player(2);
		game.addPlayer(player2);

		game.startGame();

	}

}
