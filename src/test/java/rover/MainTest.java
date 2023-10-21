package rover;

import org.junit.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void process() {
        Main main = new Main();
        String input = "5 3\n" +
                "1 1 E\n" +
                "RFRFRFRF\n" +
                "3 2 N\n" +
                "FRRFLLFFRRFLL\n" +
                "0 3 W\n" +
                "LLFFFLFLFL";
        String[] stringArray = {input};

        String output = main.process(stringArray);
        Assert.assertEquals(output,"1 1 E\n" +
                "3 3 N LOST\n" +
                "2 3 S\n");

    }
}