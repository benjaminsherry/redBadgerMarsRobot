package rover.entity;

public class Rover {

    private Direction direction;
    private Location location;
    private Grid grid;
    boolean lost = false;

    public Rover(Location location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    public void goForward(){
        Location updatedLocation = location.updatedLocation(direction);
        if(onGrid(updatedLocation)){
            location = updatedLocation;
        }
        else{
            grid.addScent(updatedLocation);
            lost = true;
        }
    }

    public void rotateLeft(){
        direction = direction.rotateLeft();
    }

    public void rotateRight(){
        direction = direction.rotateRight();
    }

    public Boolean onGrid(Location location){
        return grid.onGrid(location);
    }


}
