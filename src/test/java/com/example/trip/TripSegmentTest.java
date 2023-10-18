package com.example.trip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the TripSegment class.
 */
class TripSegmentTest {

    /**
     * Test to check the distanceTo method with different points.
     */
    @Test
    void distanceTo() {
        TripSegment segment1 = new TripSegment(0, 0);
        TripSegment segment2 = new TripSegment(3, 4);
        double distance = segment1.distanceTo(segment2);
        assertEquals(5, distance, 0.001);
    }

    /**
     * Test to check the distanceTo method with the same point.
     */
    @Test
    void distanceToSelf() {
        TripSegment segment = new TripSegment(0, 0);
        double distance = segment.distanceTo(segment);
        assertEquals(0, distance, 0.001);
    }
}
