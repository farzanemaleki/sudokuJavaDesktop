package Sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.view uiImpl;
    @Override
    public void start(Stage primaryStage) throws Exception {
        uiImpl = new UserInterfaceImol(primaryStage);
        try{
            SudokuBuildLogic.build(uiImpl);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args){
        launch(args);
    }
}