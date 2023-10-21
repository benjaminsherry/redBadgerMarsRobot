package rover.entity;

import rover.input.Instruction;

import java.util.List;

public class Rover {

    private Direction direction;
    private Location location;
    private Grid grid;
    boolean lost = false;

    public Rover(Location location, Direction direction, Grid grid) {
        this.location = location;
        this.direction = direction;
        this.grid = grid;
    }

    public void goForward(){
        Location updatedLocation = location.updatedLocation(direction);
        if(onGrid(updatedLocation)){
            location = updatedLocation;
        }
        else if (!grid.containsScent(location)){
            grid.addScent(location);
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

    public void followInstuctions(List<Instruction> instructionList) {
        for (Instruction instruction : instructionList) {
        if(!lost){
            instruction.runCommands(this);
        }
        }
    }


}
