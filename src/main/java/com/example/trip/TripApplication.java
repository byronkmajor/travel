package com.example.trip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Orchestrates the interaction between the Trip and TripSegment
 * classes to calculate and display the total distance and cost
 * of a trip based on user input.
 */
public class TripApplication {

    /**
     * let's gets the trip going, start here
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter cost per gallon: ");
        double costPerGallon = scanner.nextDouble();

        
        // create a list and add each segment to the list. 
        List<TripSegment> segments = new ArrayList<>();
        while (true) {
            System.out.print("Enter latitude number or type 'done'',(d)' to finish: ");
            String latitudeInput = scanner.next();
            if (latitudeInput.equals("done")) break;
            if (latitudeInput.equals("d")) break;


            double latitude = Double.parseDouble(latitudeInput);
            
            System.out.print("Enter longitude: ");
            double longitude = scanner.nextDouble();

            segments.add(new TripSegment(latitude, longitude));
        }

        Trip trip = new Trip(segments, milesPerGallon, costPerGallon);
        double totalDistance = trip.calculateTotalDistance();
        double totalCost = trip.calculateTotalCost();

        System.out.printf("Total: %.2f miles, $%.2f\n", totalDistance, totalCost);

        scanner.close();
    }
}
