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

        if (positionX > planet.getLengthX() || positionY > planet.getLengthY() || positionX < 0 || positionY < 0) {
            throw new IllegalArgumentException("land error");
        }
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
        this.planet = planet;
    }

    public boolean scanForRock() {
        for (Rock rock : planet.getRocks()){
            if(positionX == rock.getPositionX() && positionY == rock.getPositionY()){
                return true;
            }
        }
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
