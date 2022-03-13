import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerLoserTest {

    @Test
    public void greenLightTest() {
        GameManager gameManager = new GameManager(new Game(true));
        int expected = 0;
        int actual = gameManager.loser(new FastPlayer(0,1), new FastPlayer(0,1), new Game(true),5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightConstantConstantTest() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 0;
        int actual = gameManager.loser(new ConstantPlayer(0), new ConstantPlayer(0), new Game(false),5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightConstantFastTest() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = -1;
        int actual = gameManager.loser(new ConstantPlayer(1), new FastPlayer(0,1), new Game(false),5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightFastConstantTest() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 1;
        int actual = gameManager.loser(new FastPlayer(0,1), new ConstantPlayer(1), new Game(false),5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void redLightFastFastTest() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 0;
        int actual = gameManager.loser(new FastPlayer(0,1), new FastPlayer(0,1), new Game(false),5);
        Assertions.assertEquals(expected, actual);
    }

}
