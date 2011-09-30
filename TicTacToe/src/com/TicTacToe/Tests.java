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

}
