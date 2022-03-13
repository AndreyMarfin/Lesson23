public class FastPlayer implements Movable {

    private int newSpeed;
    private int startSpeed;
    private int speedStep;

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    @Override
    public int getSpeed() {
        int newSpeed = startSpeed;
        this.startSpeed = startSpeed + speedStep;
        return newSpeed;
    }
}
