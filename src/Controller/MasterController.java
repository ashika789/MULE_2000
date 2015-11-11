package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;

/**
 * Master Controller Class
 */
public class MasterController implements Serializable {

  /*
    stage
   */
  private Stage stage;
  /*
    config 1 scene
   */
  private Scene config1Scene;
  /*
    config 2 scene
   */
  private Scene config2Scene;
  /*
    inside pub scene
   */
  private Scene insidePubScene;
  /*
    inside store scene
   */
  private Scene insideStoreScene;
  /*
    store transaction scene for food
   */
  private Scene storeTransactionSceneFood;
  /*
    store transaction scene for energy
   */
  private Scene storeTransactionSceneEnergy;
  /*
    store transaction scene for smithore
   */
  private Scene storeTransactionSceneSmithore;
  /*
    inside town scene
   */
  private Scene insideTownScene;
  /*
    rules scene
   */
  private Scene rulesScene;
  /*
    map scene
   */
  private Scene mapScene;
  /*
    start scene
   */
  private Scene startScene;
  /*
    mule transaction scene
   */
  private Scene muleTransactionScene;
  /*
    load game scene
   */
  private Scene loadGameScreen;
  /*
    loader
   */
  private FXMLLoader loader;
  /*
    map controller
   */
  private MapController mapController;

  // create a singleton
  /**
   * Creates a singleton
   */
  private static MasterController masterController = new MasterController();

  /**
   * Returns the single instance of MasterController within the entire scope of
   * the project.
   *
   * @return MasterController
   */
  public static MasterController getInstance() {
    return masterController;
  }

  /**
   * Constructor for Master Controller. Loads all the scenes.
   */
  public MasterController() {
    Parent root;
    try {
      root = FXMLLoader.load(getClass().getResource("/View/Config1.fxml"));
      config1Scene = new Scene(root);

      root = FXMLLoader.load(getClass().getResource("/View/Config2.fxml"));
      config2Scene = new Scene(root);

      root = FXMLLoader.load(getClass().getResource("/View/Pub.fxml"));
      insidePubScene = new Scene(root);

      root = FXMLLoader.load(getClass().getResource("/View/Store.fxml"));
      insideStoreScene = new Scene(root);

      root = FXMLLoader.load(getClass().getResource(
          "/View/StoreTransactionScreenFood.fxml"));
      storeTransactionSceneFood = new Scene(root);

      root = FXMLLoader.load(getClass().getResource(
          "/View/StoreTransactionScreenEnergy.fxml"));
      storeTransactionSceneEnergy = new Scene(root);

      root = FXMLLoader.load(getClass().getResource(
          "/View/StoreTransactionScreenSmithore.fxml"));
      storeTransactionSceneSmithore = new Scene(root);

      root = FXMLLoader.load(getClass().getResource(
          "/View/MuleTransactionScreen.fxml"));
      muleTransactionScene = new Scene(root);

      root = FXMLLoader.load(getClass().getResource("/View/Town.fxml"));
      insideTownScene = new Scene(root);

      loader = new FXMLLoader(getClass().getResource("/View/Map.fxml"));
      root = (Parent) loader.load();
      mapScene = new Scene(root);
      mapController = (MapController) loader.getController();
      System.out.println("master Controller" + mapController);

      root = FXMLLoader
          .load(getClass().getResource("/View/RulesScreen.fxml"));
      rulesScene = new Scene(root);

      root = FXMLLoader.load(getClass().getResource(
          "/View/loadGameScreen.fxml"));
      loadGameScreen = new Scene(root);

      root = FXMLLoader.load(getClass().getResource("/View/Start.fxml"));
      startScene = new Scene(root);

    } catch (IOException e) {
      System.out.println("MasterController(): " + e);
    }

  }

  /**
   * Load Config1 scene.
   */
  public final void loadConfig1Scene() {
    stage.setScene(config1Scene);
  }

  /**
   * Load Config 2 scene.
   */
  public final void loadConfig2Scene() {
    stage.setScene(config2Scene);
  }

  /**
   * Load Pub scene.
   */
  public final void loadPubScene() {
    stage.setScene(insidePubScene);
  }

  /**
   * Load Store scene.
   */
  public final void loadStoreScene() {
    stage.setScene(insideStoreScene);
  }

  /**
   * Load food Store Transaction Scene.
   */
  public final void loadStoreTransactionSceneFood() {
    stage.setScene(storeTransactionSceneFood);
  }

  /**
   * Load energy Store Transaction Scene.
   */
  public final void loadStoreTransactionSceneEnergy() {
    stage.setScene(storeTransactionSceneEnergy);
  }

  /**
   * Load smithore Store Transaction Scene.
   */
  public final void loadStoreTransactionSceneSmithore() {
    stage.setScene(storeTransactionSceneSmithore);
  }

  /**
   * Load mule Transaction Scene.
   */
  public final void loadMuleTransactionScene() {
    stage.setScene(muleTransactionScene);
  }

  /**
   * Load town Scene.
   */
  public final void loadTownScene() {
    stage.setScene(insideTownScene);
  }

  /**
   * Load Map Scene.
   */
  public final void loadMapScene() {
    stage.setScene(mapScene);
  }

  /**
   * Load Rules Scene.
   */
  public final void loadRulesScene() {
    stage.setScene(rulesScene);
  }

  /**
   * Load Start Scene.
   */
  public final void loadStartScene() {
    stage.setScene(startScene);
  }

  /**
   * Load Load Screen.
   */
  public final void loadLoadScreenScene() {
    stage.setScene(loadGameScreen);
  }

  /**
   * Load Event Scene.
   */
  public final void loadEventScene() {
    try {
      stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(
          "/View/EventScreen.fxml"))));
    } catch (IOException e) {
      System.out.println("IO EXCEPTION");
    }
  }

  /**
   * Load Land Office Scene.
   */
  public final void loadLandOfficeScene() {
    try {
      stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(
          "/View/LandOffice.fxml"))));
    } catch (IOException e) {
      System.out.println("IO EXCEPTION");
    }
  }

  /**
   * Load Start Turn Scene.
   */
  public final void loadStartTurnScene() {
    try {
      stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(
          "/View/StartTurn.fxml"))));
    } catch (IOException e) {
      System.out.println("IO EXCEPTION");
    }
  }

  /**
   * Load Gambling Results Scene.
   */
  public final void loadGamblingResultsScene() {
    try {
      stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(
          "/View/GamblingResults.fxml"))));
    } catch (IOException e) {
      System.out.println("IO EXCEPTION");
    }
  }

  /**
   * Return MapController.
   *
   * @return MapController
   */
  public final MapController getMapController() {
    return mapController;
  }

  /**
   * Sets stage to given Stage.
   *
   * @param stage Stage
   */
  public final void setStage(final Stage stage) {
    this.stage = stage;
  }

}
