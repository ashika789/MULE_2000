package main.java.com.mule.Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Enum MapTile.
**/
public enum MapTile implements Serializable {
  /**
   * Plain tile.
  **/
  P(4, 2, 0),
  /**
   * River tile.
  **/
  R(2, 3, 1),
  /**
   * Mountain 1 tile.
  **/
  M1(1, 1, 2),
  /**
   * Mountain 2 tile.
  **/
  M2(1, 1, 3),
  /**
   * Mountain 3 tile.
  **/
  M3(1, 1, 4),
  /**
   * Town tile.
  **/
  Town(0, 0, 0),
  /**
   * F tile?.
  **/
  F(5, 5, 5);
  /**
   * URL paths of the image, <tile type, URL>.
   */
  private final Map<String, String> imagePath;
  /**
   * Integer amount of food production.
   */
  private final int foodProduction;
  /**
   * Integer amount of energy production.
   */
  private final int energyProduction;
  /**
   * Integer amount of smithore production.
   */
  private final int smithoreProduction;

  /**
  * Constructor for a MapTile. Adds the appropriate images and sets
  * food, energy, and smithore production on it.
  *
  * @param food foodProduction
  * @param energy energyProduction
  * @param smith smithoreProduction
  * */
  MapTile(final int food, final int energy, final int smith) {
    foodProduction = food;
    energyProduction = energy;
    smithoreProduction = smith;
    imagePath = new HashMap<>();
    imagePath.put("P", "/main/resources/View/Resources/TilePlain.png");
    imagePath.put("R", "/main/resources/View/Resources/TileRiver.png");
    imagePath.put("M1", "/main/resources/View/Resources/TileMountain1.png");
    imagePath.put("M2", "/main/resources/View/Resources/TileMountain2.png");
    imagePath.put("M3", "/main/resources/View/Resources/TileMountain3.png");
    imagePath.put("Town", "/main/resources/View/Resources/TileTown.png");
    imagePath.put("F", "/main/resources/View/Resources/TileFlowers.png");
  }

  /**
  * Gets food production of the tile.
  *
  * @return int
  */
  public int getFoodProduction() {
    return foodProduction;
  }

  /**
  * Gets energy production of the tile.
  *
  * @return int
  */
  public int getEnergyProduction() {
    return energyProduction;
  }

  /**
  * Gets smithore production of the tile.
  *
  * @return int
  */
  public int getSmithoreProduction() {
    return smithoreProduction;
  }

  /**
  * Gets image path of the tile.
  *
  * @return String
  */
  public String imagePath() {
    return imagePath.getOrDefault(this.name(), imagePath.get("P"));
  }
}
