import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {


    @Test
    public void isGreenLightTrueSpeedNotZeroTest() {
        SpeedyGame speedyGame = new SpeedyGame(true, 2);
        int speed = 5;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedEqualMaxSpeedTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 2);
        int speed = 2;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedLessMaxSpeedTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 2);
        int speed = 1;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedMoreMaxSpeedTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 2);
        int speed = 3;
        boolean expected = true;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGreenLightFalseSpeedZeroMaxSpeedZeroTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);
        int speed = 0;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getterIsGreenLightTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);
        boolean expected = false;
        boolean actual = speedyGame.getIsGreenLight();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setterIsGreenLightTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);
        speedyGame.setIsGreenLight(true);
        boolean expected = true;
        boolean actual = speedyGame.getIsGreenLight();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getterMaxSpeedTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);
        int expected = 0;
        int actual = speedyGame.getMAX_SPEED();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setterMaxSpeedTest() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);
        speedyGame.setMAX_SPEED(8);
        int expected = 8;
        int actual = speedyGame.getMAX_SPEED();
        Assertions.assertEquals(expected, actual);
    }
}
