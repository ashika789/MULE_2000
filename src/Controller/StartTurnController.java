package Controller;

import Model.Game;
import Model.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.Serializable;

/**
 * Created by William on 10/6/2015.
 */
public class StartTurnController implements Serializable {

    @FXML
    private Label startTurnLabel;
    @FXML
    private Button startBtn;

    public void initialize() {
        Game game = Main.myGame;
        if (game.getCurrentPlayer() != null) {
            if (game.getRoundNumber() > 0) {
                startTurnLabel.setText("Round " + game.getRoundNumber() + ": " + game.getCurrentPlayer().getName() + "'s turn!");
            } else {
                startTurnLabel.setText("Land Selection Phase: " + game.getCurrentPlayer().getName() + "'s turn!");
            }
        }
    }

    @FXML
    public void setStartBtn(MouseEvent event) {
        Main.myGame.startTurn();
    }
}
