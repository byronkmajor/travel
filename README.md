# Trip Application

## Overview
The Trip Application is a Java-based application that allows users to plan a trip by entering various segments. The application calculates the total distance and cost of the trip based on the fuel efficiency and cost of gasoline.

## Prerequisites
- Java 11 or higher
- Maven

## Getting Started
1. Clone the repository to your local machine.
2. Navigate to the project directory in the terminal.
3. Run `mvn clean install` to build the project and install dependencies.
4. Run `mvn exec:java -Dexec.mainClass="com.example.trip.TripApplication"` to start the application.
5. Follow the prompts to enter the fuel efficiency, cost of gasoline, and trip segments.

## Running Tests
1. Navigate to the project directory in the terminal.
2. Run `mvn test` to execute the unit tests.

## Viewing Test Report
1. Run `mvn surefire-report:report` to generate the Surefire test report.
2. Open `target/site/surefire-report.html` in your web browser to view the report.

## Features
- Prompt for fuel efficiency and cost of gasoline.
- Add multiple trip segments by entering the latitude and longitude of each segment.
- Calculate the distance and cost of each segment, as well as the total distance and cost of the trip.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)