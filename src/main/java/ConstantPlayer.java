public class ConstantPlayer implements Movable {

    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    public ConstantPlayer(int speed) {

        this.speed = speed;
    }
}
