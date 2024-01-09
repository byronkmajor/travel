package com.example.trip;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for creating segments of a trip.
 */
public final class SegmentFactory {

    private static SegmentFactory instance = new SegmentFactory();

    private SegmentFactory() {
    }

    public static SegmentFactory getInstance() {
        return instance;
    }

    /**
     * Creates a list of segments between two geographical points.
     *
     * @param startLat  Starting latitude.
     * @param stopLat   Ending latitude.
     * @param startLong Starting longitude.
     * @param stopLong  Ending longitude.
     * @return List of segments.
     */
    public List<Segment> getSegments(double startLat, double stopLat, double startLong, double stopLong) {
        List<Segment> segments = new ArrayList<>();

        // Example implementation: Create a simple straight line path
        // This is a basic implementation and can be replaced with more complex logic
        segments.add(new Segment(startLat, startLong));
        segments.add(new Segment(stopLat, stopLong));

        return segments;
    }

    /**
     * Inner class to represent a segment with latitude and longitude.
     */
    public static class Segment {
        private double latitude;
        private double longitude;

        public Segment(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        // Getters
        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }
    }
}
