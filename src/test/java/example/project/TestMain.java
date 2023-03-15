package example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestMain {

    @Test
    public void testHelloWorld()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Main.main(null);

        // assertion
        assertEquals("Hello Software Reengineering!", bos.toString().trim());

        // undo the binding in System
        System.setOut(originalOut);
    }
}