package rover;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void process() {
        Main main = new Main();
        String input = "5 3\n" +
                "1 1 E\n" +
                "RFRFRFRF";
        String[] stringArray = {input};

        main.process(stringArray);
        System.out.println(main.process(stringArray));

    }
}