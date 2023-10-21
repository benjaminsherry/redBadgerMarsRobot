package rover.entity;

public enum Direction
{
    NORTH('N', 0, 1),
    EAST('E', 1, 0),
    SOUTH('S', 0, -1),
    WEST('W', -1, 0);

    private char orientation;
    private int moveinX;
    private int moveinY;

    Direction(char orientation, int moveinX, int moveinY){
        this.orientation = orientation;
        this.moveinX = moveinX;
        this.moveinY = moveinY;
    }

    public Direction rotateLeft(){
        return values()[(ordinal()-1 %4)];
    }

    public Direction rotateRight(){
        return values()[(ordinal()+1 %4)];
    }

    public char getOrientation() {
        return orientation;
    }

    public int getMoveinX() {
        return moveinX;
    }

    public int getMoveinY() {
        return moveinY;
    }
}

