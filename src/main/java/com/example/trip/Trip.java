package com.example.trip;

import java.util.List;

/**
 * a trip has many segmetns, and also the method to calculate total distance and cost. 
 */
public class Trip {

    private List<TripSegment> segments;
    private double milesPerGallon;
    private double costPerGallon;

    /**
     * Constructor for creating a new Trip.
     *
     * @param segments       The list of trip segments.
     * @param milesPerGallon The fuel efficiency in miles per gallon.
     * @param costPerGallon  The cost of gasoline per gallon.
     */
    public Trip(List<TripSegment> segments, double milesPerGallon, double costPerGallon) {
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
        double totalDistance = 0;
        for (int i = 0; i < segments.size() - 1; i++) {
            totalDistance += segments.get(i).distanceTo(segments.get(i + 1));
        }
        return totalDistance;
    }

    /**
     * Calculates the total cost of the trip
     * based on the fuel efficiency and gasoline cost.
     * this was the equation from Jerry's white board. 
     * @return The total cost of the trip.
     */
    public double calculateTotalCost() {
        double totalDistance = calculateTotalDistance();
        return (totalDistance / milesPerGallon) * costPerGallon;
    }
}
