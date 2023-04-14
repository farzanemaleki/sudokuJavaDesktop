package Sudoku.buildlogic;

import Sudoku.computationLogic.GameLogic;
import Sudoku.persistence.LocalStorageImpl;
import Sudoku.problemDomain.IStorage;
import Sudoku.problemDomain.SudokuGame;
import Sudoku.userinterface.IUserInterfaceContract;
import Sudoku.userinterface.logic.ContorlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try {

            initialState = storage.getGameData();
        } catch (IOException e) {

            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic = new ContorlLogic(storage, userInterface);
        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
