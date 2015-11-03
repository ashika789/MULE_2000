package Controller;

import Model.Main;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by SaqlainGolandaz on 10/27/15.
 */
public class LoadGameScreenController implements Serializable {

    @FXML
    private Button yesButton;

    @FXML
    private Button noButton;

    @FXML
    /**
     * Set No button action to load Start scene.
     */
    private void setNoButton() {
        MasterController.getInstance().loadStartScene();
    }

    @FXML
    /**
     * Set Yes button action to load data.
     */
    private void setYesButton() throws IOException, ClassNotFoundException {
        Main.myGame.loadData();
    }


}
