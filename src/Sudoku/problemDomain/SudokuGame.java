package Sudoku.problemDomain;

import Sudoku.computationLogic.SudokuUtilities;
import Sudoku.constans.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final int[][] gridState;
    private final GameState gameState;
    public static  int GRID_BOUNDARY = 9;
    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }

    public GameState getGameState() {
        return gameState;
    }

}
