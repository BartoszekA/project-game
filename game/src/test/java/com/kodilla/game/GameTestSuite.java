package com.kodilla.game;

import com.kodilla.game.logic.Board;
import com.kodilla.game.logic.Circle;
import com.kodilla.game.logic.Cross;
import com.kodilla.game.logic.TicTacToeLogic;
import org.junit.Assert;
import org.junit.Test;

public class GameTestSuite {
    @Test
    public void testCaseTicTacToe1() {
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
        boolean secondCheck = logic.areAnyBlankFieldsOnBoard(myBoard);
        //Then
        Assert.assertTrue(firstCheck);
        Assert.assertTrue(secondCheck);
    }

    @Test
    public void testCaseTicTacToe2() {
        //Given
        TicTacToeLogic logic = new TicTacToeLogic();
        Board myBoard = Board.createBoard();
        logic.nextMove(myBoard, 3, new Circle());
        logic.nextMove(myBoard, 8, new Cross());
        logic.nextMove(myBoard, 4, new Circle());
        logic.nextMove(myBoard, 7, new Cross());
        logic.nextMove(myBoard, 5, new Circle());
        //When
        boolean firstCheck = logic.checkIfVictory(myBoard);
        boolean secondCheck = logic.areAnyBlankFieldsOnBoard(myBoard);
        //Then
        Assert.assertTrue(firstCheck);
        Assert.assertTrue(secondCheck);
    }

    @Test
    public void testCaseTicTacToe3() {
        //Given
        TicTacToeLogic logic = new TicTacToeLogic();
        Board myBoard = Board.createBoard();
        logic.nextMove(myBoard, 1, new Circle());
        logic.nextMove(myBoard, 6, new Cross());
        logic.nextMove(myBoard, 4, new Circle());
        logic.nextMove(myBoard, 7, new Cross());
        logic.nextMove(myBoard, 5, new Circle());
        logic.nextMove(myBoard, 8, new Cross());
        //When
        boolean firstCheck = logic.checkIfVictory(myBoard);
        boolean secondCheck = logic.areAnyBlankFieldsOnBoard(myBoard);
        //Then
        Assert.assertTrue(firstCheck);
        Assert.assertTrue(secondCheck);
    }

    @Test
    public void testCaseTicTacToe4() {
        //Given
        TicTacToeLogic logic = new TicTacToeLogic();
        Board myBoard = Board.createBoard();
        logic.nextMove(myBoard, 0, new Circle());
        logic.nextMove(myBoard, 1, new Cross());
        logic.nextMove(myBoard, 4, new Circle());
        logic.nextMove(myBoard, 7, new Cross());
        logic.nextMove(myBoard, 8, new Circle());
        //When
        boolean firstCheck = logic.checkIfVictory(myBoard);
        boolean secondCheck = logic.areAnyBlankFieldsOnBoard(myBoard);
        //Then
        Assert.assertTrue(firstCheck);
        Assert.assertTrue(secondCheck);
    }

    @Test
    public void testCaseTicTacToe5() {
        //Given
        TicTacToeLogic logic = new TicTacToeLogic();
        Board myBoard = Board.createBoard();
        logic.nextMove(myBoard, 0, new Circle());
        logic.nextMove(myBoard, 2, new Cross());
        logic.nextMove(myBoard, 5, new Circle());
        logic.nextMove(myBoard, 4, new Cross());
        logic.nextMove(myBoard, 8, new Circle());
        //When
        boolean firstCheck = logic.checkIfVictory(myBoard);
        boolean secondCheck = logic.areAnyBlankFieldsOnBoard(myBoard);
        //Then
        Assert.assertFalse(firstCheck);
        Assert.assertTrue(secondCheck);
    }

    @Test
    public void testCaseTicTacToe6() {
        //Given
        TicTacToeLogic logic = new TicTacToeLogic();
        Board myBoard = Board.createBoard();
        logic.nextMove(myBoard, 0, new Circle());
        logic.nextMove(myBoard, 2, new Cross());
        logic.nextMove(myBoard, 5, new Circle());
        logic.nextMove(myBoard, 4, new Cross());
        logic.nextMove(myBoard, 8, new Circle());
        logic.nextMove(myBoard, 6, new Cross());
        //When
        boolean firstCheck = logic.checkIfVictory(myBoard);
        boolean secondCheck = logic.areAnyBlankFieldsOnBoard(myBoard);
        //Then
        Assert.assertTrue(firstCheck);
        Assert.assertTrue(secondCheck);

    }
}
