package com.example.trip;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Trip class.
 */
class TripTest {

    /**
     * Test to check the total distance calculation with multiple segments.
     */
    @Test
    void calculateTotalDistance() {
        TripSegment segment1 = new TripSegment(0, 0);
        TripSegment segment2 = new TripSegment(3, 4);
        TripSegment segment3 = new TripSegment(6, 8);
        List<TripSegment> segments = Arrays.asList(segment1, segment2, segment3);
        Trip trip = new Trip(segments, 20, 5);
        double totalDistance = trip.calculateTotalDistance();
        assertEquals(10, totalDistance, 0.001);
    }

    /**
     * Test to check the total cost calculation with multiple segments.
     */
    @Test
    void calculateTotalCost() {
        TripSegment segment1 = new TripSegment(0, 0);
        TripSegment segment2 = new TripSegment(3, 4);
        TripSegment segment3 = new TripSegment(6, 8);
        List<TripSegment> segments = Arrays.asList(segment1, segment2, segment3);
        Trip trip = new Trip(segments, 20, 5);
        double totalCost = trip.calculateTotalCost();
        assertEquals(2.5, totalCost, 0.001);
    }

    /**
     * Test to check the total distance and cost calculation with no segments.
     */
    @Test
    void tripWithNoSegments() {
        List<TripSegment> segments = Arrays.asList();
        Trip trip = new Trip(segments, 20, 5);
        double totalDistance = trip.calculateTotalDistance();
        assertEquals(0, totalDistance, 0.001);
        double totalCost = trip.calculateTotalCost();
        assertEquals(0, totalCost, 0.001);
    }
}
