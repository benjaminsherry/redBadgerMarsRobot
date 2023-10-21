package rover;

import rover.entity.Direction;
import rover.entity.Grid;
import rover.entity.Location;
import rover.entity.Rover;
import rover.input.Instruction;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args) {
        String output = new Main().process(args);
        System.out.println(output);
    }

    public String process(String args){
        Scanner sc = new Scanner(args);
        StringBuilder sb = new StringBuilder();
        Grid grid = initGrid(sc.nextLine());
        while (sc.hasNext()){
            String newline = sc.nextLine();
            if(!newline.isEmpty()){
                Rover rover = initRover(newline,grid);
                rover.followInstuctions(getInstructions(sc.nextLine()));
                sb.append(rover).append("\n");
            }
        }
        return sb.toString();
    }

    private Grid initGrid(String lineOne){
        String[] axis = lineOne.split(" ");
        return new Grid(Integer.parseInt(axis[0]),Integer.parseInt(axis[1]));
    }

    private Rover initRover(String lineTwo, Grid grid){
        String[] axis = lineTwo.split(" ");
        Location location = new Location(Integer.parseInt(axis[0]),Integer.parseInt(axis[1]));
        Direction direction = Direction.parseWithInput(axis[2].charAt(0));
                return new Rover(location, direction, grid);
    }

    private List<Instruction> getInstructions(String lineThree){
        return lineThree.chars().mapToObj(i -> Instruction.parseWithInput((char) i)).collect(Collectors.toList());
    }
}