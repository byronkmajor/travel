package com.example.trip;

import java.util.List;

/**
 * Represents a trip with multiple segments and methods to calculate total distance and cost.
 */
public final class Trip {

    private List<SegmentFactory.Segment> segments;
    private double milesPerGallon;
    private double costPerGallon;

    /**
     * Constructor for creating a new Trip.
     *
     * @param segments       The list of trip segments.
     * @param milesPerGallon The fuel efficiency in miles per gallon.
     * @param costPerGallon  The cost of gasoline per gallon.
     */
    public Trip(List<SegmentFactory.Segment> segments, double milesPerGallon, double costPerGallon) {
        this.segments = segments;
        this.milesPerGallon = milesPerGallon;
        this.costPerGallon = costPerGallon;
    }

    /**
     * Calculates the total distance of the trip.
     *
     * @return The total distance of all segments.
     */
    public double calculateTotalDistance() {
        if (segments.size() < 2) {
            return 0;
        }

        double totalDistance = 0;
        for (int i = 0; i < segments.size() - 1; i++) {
            totalDistance += calculateDistance(segments.get(i), segments.get(i + 1));
        }
        return totalDistance;
    }

    /**
     * Calculates the distance between two segments.
     *
     * @param from The starting segment.
     * @param to   The ending segment.
     * @return The distance between the segments.
     */
    private double calculateDistance(SegmentFactory.Segment from, SegmentFactory.Segment to) {
        double dLatitude = to.getLatitude() - from.getLatitude();
        double dLongitude = to.getLongitude() - from.getLongitude();
        return Math.sqrt(dLatitude * dLatitude + dLongitude * dLongitude);
    }

    /**
     * Calculates the total cost of the trip based on the fuel efficiency and gasoline cost.
     *
     * @return The total cost of the trip.
     */
    public double calculateTotalCost() {
        double totalDistance = calculateTotalDistance();
        return (totalDistance / milesPerGallon) * costPerGallon;
    }
}
