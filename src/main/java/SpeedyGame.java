public class SpeedyGame extends Game {
    private int MAX_SPEED;

    public SpeedyGame(boolean isGreenLight, int MAX_SPEED) {
        super(isGreenLight);
        this.MAX_SPEED = MAX_SPEED;
    }

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public void setMAX_SPEED(int MAX_SPEED) {
        this.MAX_SPEED = MAX_SPEED;
    }

    @Override
    public boolean isFailed(int speed) {
        if ((getIsGreenLight() == false) && (speed > MAX_SPEED)) {
            return true;
        } else {
            return false;
        }
    }
}