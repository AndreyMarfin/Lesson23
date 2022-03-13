import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    // блок Game
    // isGreenLight = true
    @Test
    public void greenLightTest() {
        GameManager gameManager = new GameManager(new Game(true));
        int expected = 5;
        int actual = gameManager.howManyRoundsWillLast(new int[]{1, 2, 0, 4, 5});
        Assertions.assertEquals(expected, actual);
    }

    // isGreenLight = false

    @Test
    public void redLightSpeedStopInFront() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 1;
        int actual = gameManager.howManyRoundsWillLast(new int[]{1, 2, 0, 4, 5});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightSpeedStopInMiddle() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 2;
        int actual = gameManager.howManyRoundsWillLast(new int[]{0, 0, 1, 3, 5});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightSpeedStopInRear() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 4;
        int actual = gameManager.howManyRoundsWillLast(new int[]{0, 0, 0, 0, 5});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightSpeedNonStop() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 5;
        int actual = gameManager.howManyRoundsWillLast(new int[]{0, 0, 0, 0, 0});
        Assertions.assertEquals(expected, actual);
    }

    // блок speedyGame
    // isGreenLight = true

    @Test
    public void greenLightSpeedInFrontMaxSpeedNonZeroTest() {
        GameManager gameManager = new GameManager(new SpeedyGame(true, 2));
        int expected = 5;
        int actual = gameManager.howManyRoundsWillLast(new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(expected, actual);
    }

    // isGreenLight = false

    @Test
    public void redLightSpeedInFrontMaxSpeedNonZeroTest() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 2));
        int expected = 1;
        int actual = gameManager.howManyRoundsWillLast(new int[]{5, 2, 3, 4, 5});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightSpeedInFrontMaxSpeedZeroTest() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 0));
        int expected = 0;
        int actual = gameManager.howManyRoundsWillLast(new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightSpeedInMiddleMaxSpeedNonZeroTest() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 2));
        int expected = 2;
        int actual = gameManager.howManyRoundsWillLast(new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightSpeedInMiddleMaxSpeedZeroTest() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 0));
        int expected = 2;
        int actual = gameManager.howManyRoundsWillLast(new int[]{0, 0, 3, 4, 5});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightSpeedNonStopMaxSpeedNonZeroTest() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 2));
        int expected = 5;
        int actual = gameManager.howManyRoundsWillLast(new int[]{0, 1, 1, 2, 1});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightSpeedNonStopMaxSpeedZeroTest() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 0));
        int expected = 5;
        int actual = gameManager.howManyRoundsWillLast(new int[]{0, 0, 0, 0, 0});
        Assertions.assertEquals(expected, actual);
    }
}
