import googlemaps

# Segment Class: Represents a single segment of a trip
class Segment:
    def __init__(self, start_address, stop_address, gmaps):
        # Initialize start and stop addresses and Google Maps client
        self.start_address = start_address
        self.stop_address = stop_address
        self.gmaps = gmaps

    def calculate_distance(self):
        # Use Google Maps API to get the distance between start and stop addresses
        result = self.gmaps.distance_matrix(self.start_address, self.stop_address, mode="driving")
        # Extract distance in meters from the API response
        distance = result['rows'][0]['elements'][0]['distance']['value']
        # Convert distance to miles and return
        return distance * 0.000621371

# Trip Class: Represents an entire trip consisting of multiple segments
class Trip:
    def __init__(self, price_per_gallon, mpg, gmaps):
        # Initialize list to store segments, price per gallon, mpg, and Google Maps client
        self.segments = []
        self.price_per_gallon = price_per_gallon
        self.mpg = mpg
        self.gmaps = gmaps

    def add_segment(self, start_address, stop_address):
        # Create a new Segment and add it to the list of segments
        segment = Segment(start_address, stop_address, self.gmaps)
        self.segments.append(segment)

    def calculate_total_distance(self):
        # Calculate the total distance of the trip by summing up the distances of all segments
        return sum(segment.calculate_distance() for segment in self.segments)

    def calculate_gas_needed(self):
        # Calculate the total amount of gas needed for the trip
        total_distance = self.calculate_total_distance()
        return total_distance / self.mpg

    def calculate_trip_cost(self):
        # Calculate the total cost of the trip based on gas needed and price per gallon
        gas_needed = self.calculate_gas_needed()
        return gas_needed * self.price_per_gallon

# Client Code: The main function to interact with the user
def main():
    # Replace with your actual Google Maps API key
    
    gmaps = googlemaps.Client(key=api_key)

    # Get user input for price per gallon and mpg
    price_per_gallon = float(input("Enter the price per gallon of gas: "))
    mpg = float(input("Enter the miles per gallon for your vehicle: "))
    
    # Create a new Trip object
    trip = Trip(price_per_gallon, mpg, gmaps)
    
    # Loop to add multiple segments to the trip
    while True:
        start_address = input("Enter the start address for this segment: ")
        stop_address = input("Enter the stop address for this segment: ")
        
        # Add the new segment to the trip
        trip.add_segment(start_address, stop_address)
        
        # Ask the user if they want to add more segments
        more_segments = input("Would you like to add another segment? (y/n): ")
        if more_segments.lower() != 'y':
            break
    
    # Display the calculated details of the trip
    print(f"\nTotal distance of the trip: {trip.calculate_total_distance():.2f} miles")
    print(f"Total gas needed for the trip: {trip.calculate_gas_needed():.2f} gallons")
    print(f"Total cost of the trip: ${trip.calculate_trip_cost():.2f}")

# Run the client code if this script is executed
if __name__ == "__main__":
    main()
