// package com.example.trip;

// /**
//  * Represents a segment of a trip with basic geographical coordinates.
//  */
// public class TripSegment {
//     private double latitude;
//     private double longitude;

//     /**
//      * Constructor for creating a new TripSegment.
//      *
//      * @param latitude  The latitude of the segment.
//      * @param longitude The longitude of the segment.
//      */
//     public TripSegment(double latitude, double longitude) {
//         this.latitude = latitude;
//         this.longitude = longitude;
//     }

//     /**
//      * Calculates a simplified distance to another segment
//      * using the Euclidean distance formula.
//      *
//      * @param other The other segment to calculate the distance to.
//      * @return The calculated distance.
//      */
//     public double distanceTo(TripSegment other) {
//         double dLatitude = other.latitude - this.latitude;
//         double dLongitude = other.longitude - this.longitude;
//         return Math.sqrt(dLatitude * dLatitude + dLongitude * dLongitude);
//     }
// }
