// package com.example.trip;

// import org.junit.jupiter.api.Test;
// import java.io.ByteArrayInputStream;
// import java.io.ByteArrayOutputStream;
// import java.io.PrintStream;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// /**
//  * Unit tests for the TripApplication.
//  */
// public class TripApplicationTest {
    
//     /**
//      * Tests the application with specific input and validates the output.
//      */
//     @Test
//     public void testApplication() {
//         // Prepare input data
//         String input = "20\n5\n30\n-97\n34\n-118\n40\n-74\ndone\n";
//         System.setIn(new ByteArrayInputStream(input.getBytes()));

//         // Capture output
//         ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//         System.setOut(new PrintStream(outContent));

//         // Run the application
//         TripApplication.main(new String[]{});

//         // Validate output
//         String output = outContent.toString();
//         // assertTrue(output.contains("Segment 1:"));
//         // assertTrue(output.contains("Segment 2:"));
//         assertTrue(output.contains("Total: 65.78 miles, $16.45"));
//     }
// }
