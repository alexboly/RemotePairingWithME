package com.TicTacToe;

import static org.junit.Assert.*;

import org.junit.Test;


public class Tests {
	
	@Test
	public void OneByOneBoardFirstPlayerWins(){
		Board board = new Board(1);
		Player firstPlayer = new Player();
		Game game = new Game(board);
		game.setFirstPlayer(firstPlayer);
		
		game.playNextMove();
		
		assertEquals(firstPlayer, game.getWinner());
	}

	@Test
	public void test() {
		Board board = new Board(1);
		Player firstPlayer = new Player();
		Player secondPlayer = new Player();
		Game game = new Game(board);
		game.setPlayers(firstPlayer, secondPlayer);
		
		game.playNextMove(0,0);
		game.playNextMove(0,1);
		game.playNextMove(1,1);
		
		assertEquals(firstPlayer, game.getWinner());
	}
}
