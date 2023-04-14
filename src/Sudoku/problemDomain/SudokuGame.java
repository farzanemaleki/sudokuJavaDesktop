package Sudoku.problemDomain;

import Sudoku.constans.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final int[][] gridState;
    private final GameState gameState;
    public static  int GRID_BOUNDERY = 9;
    public SudokuGame(int[][] gridState, GameState gameState) {
        this.gridState = gridState;
        this.gameState = gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }

    public GameState getGameState() {
        return gameState;
    }

}
