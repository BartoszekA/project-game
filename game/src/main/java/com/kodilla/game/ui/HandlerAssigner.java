//package com.kodilla.game.ui;
//
//import com.kodilla.game.logic.Blank;
//import com.kodilla.game.logic.Board;
//import com.kodilla.game.logic.Symbol;
//import com.kodilla.game.logic.TicTacToeLogic;
//import com.sun.javafx.geom.Rectangle;
//import javafx.event.EventHandler;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//import java.util.List;
//
//public class HandlerAssigner {
//
//    public void assignFieldHandler(GridPane grid, Stage myStage, Board board, TicTacToeLogic logic, RectangleFactory factory, List<Rectangle> fields) {
//
//        Computer computer = new Computer();
//        VictoryChecker victoryChecker = new VictoryChecker();
//        MoveDrawer moveDrawer = new MoveDrawer();
//
//            grid.getChildren().get(0).setOnMouseClicked(new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    if (board.getBoard().get(0) instanceof Blank) {
//                        Symbol nextSymbol = logic.getNextSymbol();
//                        if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                            moveDrawer.drawCircle(grid, 0, 0);
//                        } else {
//                            moveDrawer.drawCross(grid, 0, 0);
//                        }
//                        logic.nextMove(board, 0, nextSymbol);
//                        boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                        if (victory) {
//                            System.out.println("Victory!");
//                            victoryChecker.victory(myStage);
//                        } else {
//                            System.out.println("Try again!");
//                            computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                        }
//                    }
//                }
//            });
//       // }
//        factory.getFields(grid).get(0).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(0) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 0, 0);
//                    } else {
//                        moveDrawer.drawCross(grid, 0, 0);
//                    }
//                    logic.nextMove(board, 0, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//
//        factory.getFields(grid).get(1).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(1) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 1, 1);
//                    } else {
//                        moveDrawer.drawCross(grid, 1, 1);
//                    }
//                    logic.nextMove(board, 1, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//
//        factory.getFields(grid).get(2).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(2) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 2, 2);
//                    } else {
//                        moveDrawer.drawCross(grid, 2, 2);
//                    }
//                    logic.nextMove(board, 2, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//
//        factory.getFields(grid).get(3).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(3) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 3, 3);
//                    } else {
//                        moveDrawer.drawCross(grid, 3, 3);
//                    }
//                    logic.nextMove(board, 3, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//
//        factory.getFields(grid).get(4).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(4) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 4, 4);
//                    } else {
//                        moveDrawer.drawCross(grid, 4, 4);
//                    }
//                    logic.nextMove(board, 4, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//
//        factory.getFields(grid).get(5).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(5) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 5, 5);
//                    } else {
//                        moveDrawer.drawCross(grid, 5, 5);
//                    }
//                    logic.nextMove(board, 5, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//
//        factory.getFields(grid).get(6).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(6) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 6, 6);
//                    } else {
//                        moveDrawer.drawCross(grid, 6, 6);
//                    }
//                    logic.nextMove(board, 6, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//
//        factory.getFields(grid).get(7).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(7) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 7, 7);
//                    } else {
//                        moveDrawer.drawCross(grid, 7, 7);
//                    }
//                    logic.nextMove(board, 7, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//
//        factory.getFields(grid).get(8).setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (board.getBoard().get(8) instanceof Blank) {
//                    Symbol nextSymbol = logic.getNextSymbol();
//                    if (nextSymbol instanceof com.kodilla.game.logic.Circle) {
//                        moveDrawer.drawCircle(grid, 8, 8);
//                    } else {
//                        moveDrawer.drawCross(grid, 8, 8);
//                    }
//                    logic.nextMove(board, 8, nextSymbol);
//                    boolean victory = logic.checkIfVictory(logic.getCurrentBoard());
//                    if (victory) {
//                        System.out.println("Victory!");
//                        victoryChecker.victory(myStage);
//                    } else {
//                        System.out.println("Try again!");
//                        computer.computerMove(grid, myStage, board, logic, factory.getFields(grid), moveDrawer, factory);
//                    }
//                }
//            }
//        });
//    }
//}
