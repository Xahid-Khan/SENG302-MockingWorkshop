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
        if (this.direction == Direction.N) {
            if(positionY == planet.getLengthY()){
                positionY = 0;
            } else {
                positionY ++;
            }
        } else if (this.direction == Direction.E){
            if(positionX == planet.getLengthX()){
                positionX = 0;
            } else {
                positionX ++;
            }
        } else if (this.direction == Direction.S) {
            if(positionY == 0){
                positionY = planet.getLengthY();
            } else {
                positionY --;
            }
        } else if(this.direction == Direction.W ) {
            if(positionX == 0){
                positionX = planet.getLengthX();
            } else {
                positionX --;
            }
        }
    }

    public void moveBackward() {
        if (this.direction == Direction.S) {
            if(positionY == planet.getLengthY()){
                positionY = 0;
            } else {
                positionY ++;
            }
        } else if (this.direction == Direction.W){
            if(positionX == planet.getLengthX()){
                positionX = 0;
            } else {
                positionX ++;
            }
        } else if (this.direction == Direction.N) {
            if(positionY == 0){
                positionY = planet.getLengthY();
            } else {
                positionY --;
            }
        } else if(this.direction == Direction.E ) {
            if(positionX == 0){
                positionX = planet.getLengthX();
            } else {
                positionX --;
            }
        }
    }

    public void turnLeft() {
        switch(direction){
            case N:
                direction = Direction.W;
                break;
            case W:
                direction = Direction.S;
                break;
            case S:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.N;
                break;
        }
    }

    public void turnRight() {
        switch(direction){
            case W:
                direction = Direction.N;
                break;
            case N:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.S;
                break;
            case S:
                direction = Direction.W;
                break;
        }
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
