public class Rover {

    private int positionX;
    private int positionY;
    private Direction direction;
    private Planet planet;

    public Rover() {

    }

    public enum Direction {
        N, S, E, W
    }

    public void land(Planet planet, int positionX, int positionY, Direction direction) throws IllegalArgumentException {

        this.planet = planet;
        if (positionX < planet.getLengthX()) {
            this.positionX = positionX;
        }
        this.positionY = positionY;
        this.direction = direction;
    }

    public boolean scanForRock() {
        //TODO: implement this method
        return false;
    }

    public void moveForward() {
        //TODO: implement this method
    }

    public void moveBackward() {
        //TODO: implement this method
    }

    public void turnLeft() {
        //TODO: implement this method
    }

    public void turnRight() {
        //TODO: implement this method
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Direction getDirection() {
        return direction;
    }

    public Planet getPlanet() {
        return planet;
    }
}
