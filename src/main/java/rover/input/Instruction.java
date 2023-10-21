package rover.input;

import rover.entity.Rover;

import java.util.Arrays;

public enum Instruction {

    LEFT('L'),
    RIGHT('R'),
    FORWARD('F');

    private char command;

    Instruction(char command) {
        this.command = command;
    }

    public void runCommands(Rover rover){
        switch (this){
            case LEFT:
                rover.rotateLeft();
                break;
            case RIGHT:
                rover.rotateRight();
                break;
            case FORWARD:
                rover.goForward();
                break;
        }
    }

    public static Instruction parseWithInput(char val) {
        return Arrays.stream(values()).filter(i -> i.command == val).findFirst().orElseThrow(() -> new IllegalStateException(String.valueOf(val)));
    }
}
