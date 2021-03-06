package main.java.com.mule;

import main.java.com.mule.Controller.MasterController;
import javafx.application.Application;
import javafx.stage.Stage;
import main.java.com.mule.Model.Game;

import java.io.Serializable;
/**
* Main Class.
*/

public class Main extends Application implements Serializable {
  /**
   * One instance of game to be used throughout the program.
  **/
  public static Game myGame = new Game();

  /**
   * Required start() method for extension of Application class. Sets the Stage
   * and loads the Start Scene.
   *
   * @param stage Stage
   */
  public final void start(final Stage stage) {
    MasterController controller = MasterController.getInstance();
    controller.setStage(stage);
    controller.loadStartScene();
    stage.setTitle("M.U.L.E. - Deep Thought");
    stage.setResizable(false);
    stage.show();
  }

  /**
   * Launches the program.
   *
   * @param args String[]
   */
  public static void main(String[] args) {
      launch(args);
  }

  /**
   * Sets the game.
   *
   * @param game Game
   */
  public static void setMyGame(final Game game) {
    myGame = game;
  }
}
