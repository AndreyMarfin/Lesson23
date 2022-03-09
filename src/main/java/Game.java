public class Game {

    private boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getIsGreenLight() {
        return isGreenLight;
    }

    public void setIsGreenLight(boolean newIsGreenLight) {
        isGreenLight = newIsGreenLight;
    }

    public boolean isFailed(int speed) {
        if ((isGreenLight == false) && (speed != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
