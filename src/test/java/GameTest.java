import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void isGreenLightTrueSpeedNotZeroTest() {
        Game game = new Game(true);
        int speed = 5;
        boolean expected = false;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightTrueSpeedZeroTest() {
        Game game = new Game(true);
        int speed = 0;
        boolean expected = false;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedNotZeroTest() {
        Game game = new Game(false);
        int speed = 5;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedZeroTest() {
        Game game = new Game(false);
        int speed = 0;
        boolean expected = false;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getterTest() {
        Game game = new Game(false);
        boolean expected = false;
        boolean actual = game.getIsGreenLight();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setterTest() {
        Game game = new Game(false);
        game.setIsGreenLight(true);
        boolean expected = true;
        boolean actual = game.getIsGreenLight();
        Assertions.assertEquals(expected, actual);
    }
}

