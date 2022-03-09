public class GameManager {

    private int[] speeds;

    public int[] getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int[] speeds) {
        this.speeds = speeds;
    }

    public GameManager(Game game) {
        this.game = game;
    }

    Game game = new Game(true);

    public int howManyRoundsWillLast(int[] speeds){
        int response = 0;
        for (int speed : speeds) {
            if (game.isFailed(speed) == false){
                response++;
            } else break;
        }
        return response;
    }
}
