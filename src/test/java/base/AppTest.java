package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_isCorrect() {
        App myApp = new App();

        String input = "beef";

        String expectedOutput = "beef has 4 characters.";

        assertEquals(expectedOutput, input + " has " + input.length() + " characters.");
    }
}