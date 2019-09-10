package com.kodilla.game;

import org.junit.Assert;
import org.junit.Test;

public class GameTestSuite {
    @Test
    public void testCaseTicTacToe() {
        //Given
        TicTacToeLogic logic = new TicTacToeLogic();
        Board myBoard = Board.createBoard();
        logic.nextMove(myBoard, 0, new Circle());
        logic.nextMove(myBoard, 8, new Cross());
        logic.nextMove(myBoard, 1, new Circle());
        logic.nextMove(myBoard, 7, new Cross());
        logic.nextMove(myBoard, 2, new Circle());
        //When
        boolean firstCheck = logic.checkIfVictory(myBoard);
        boolean secondCheck = logic.checkLoss(myBoard);
        //Then
        Assert.assertTrue(firstCheck);
        Assert.assertTrue(secondCheck);
    }
}
