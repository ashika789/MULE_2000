package Model

import sun.jvm.hotspot.debugger.win32.coff.TestDebugInfo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class GameTest {
    Game game;

    public GameTest() {
        game = new Game();
        game.currentPlayer = new Player("AI", "Flapper", "TesterBob", "blue");
    }


    @Test
    public void testGetTimeAfterFoodCheck() throws Exception {

        int[] foodRq = [0, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5];
        int food = game.getCurrentPlayer().getFood();
        if (game.getRoundNumber() == 1) {
            assertEquals(50, game.getTimeLeft());
        }
        if (food >= foodRq[game.getRoundNumber()]) {
            assertEquals(0, game.getCurrentPlayer().getFood());
            assertEquals(0, game.getTimeLeft());
        } else if (food == 0) {
            assertEquals(5, game.getTimeLeft());
        } else {
            assertEquals(food * -1, game.getCurrentPlayer().getFood());
            assertEquals(30, game.getTimeLeft());
        }
    }

    // Tucker LoCicero
    @Test
    public void testNumMules() {
        Player p = new Player("AI", "Flapper", "TesterBob", "blue")
        p.setMuleEmplaced(0, 0, Mule.FOOD);
        assertEquals(1, p.getNumMules());
        p.setMuleEmplaced(4, 8, Mule.SMITHORE);
        assertEquals(2, p.getNumMules());
        p.setMuleEmplaced(4, 0, Mule.FLOWER);
        assertEquals(3, p.getNumMules());
        p.setMuleEmplaced(0, 8, Mule.ENERGY);
        assertEquals(4, p.getNumMules());
    }

    //Saqlain Golandaz
    @Test
    public void testPlayerType() {
        Player p = new Player("Human", "Pegasite", "Player 1", "blue");
        if (p.getMoney() == 1600 && p.getFood() == 0) {
            assertEquals("Flapper", p.getRace());
        } else if (p.getMoney() == 600 && p.getFood() == 0) {
            assertEquals("Human", p.getRace());
        } else if (p.getMoney() == 550 && p.getFood() == 10) {
            assertEquals("Pegasite", p.getRace());
        } else if (p.getMoney() == 2000 && p.getFood() == 15) {
            assertEquals("Techoid", p.getRace());
        } else if (p.getMoney() == 200 && p.getFood() == 10) {
            assertEquals("Strandroid", p.getRace());
        } else {
            System.out.println("It's a standard player");
        }
    }

    @Test
    public void testDoProduction() {

    }
}
