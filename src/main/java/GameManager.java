public class GameManager {

    public GameManager(Game game) {

        this.game = game;
    }

    Game game;

    public int howManyRoundsWillLast(int[] speeds) {
        int response = 0;
        for (int speed : speeds) {
            if (!game.isFailed(speed)) {
                response++;
            } else continue;
        }
        return response;
    }


    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        int response = 0;
        int i = 0;
        while (i <= rounds) {
            if (game.isFailed(p1.getSpeed())) {
                if (game.isFailed(p2.getSpeed())) {
                    response = 0;
                    break;
                } else {
                    response = -1;
                    break;
                }
            } else {
                if (game.isFailed(p2.getSpeed())) {
                    response = 1;
                    break;
                }
            }
            i++;
        }

        return response;
    }
}
