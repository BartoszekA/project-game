package com.kodilla.game;

import org.junit.Test;

import static com.kodilla.game.Board.createBoard;

public class GameTestSuite {
    @Test
    public void testCaseTicTacToe() {
        //Given
        nextMove(createBoard(), 0, new Circle());
        //When
    }
}
