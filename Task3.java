//      Task3
//Travel Itinerary Planner

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Travel Itinerary Planner!");

        System.out.print("Enter the number of destinations you want to visit: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] destinations = new String[numDestinations];
        String[] dates = new String[numDestinations];

        // Input destinations and dates
        for (int i = 0; i < numDestinations; i++) {
            System.out.print("Enter destination #" + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();
            System.out.print("Enter date for destination #" + (i + 1) + ": ");
            dates[i] = scanner.nextLine();
        }

        // Display itinerary with Google Maps URL and weather information
        System.out.println("\nYour Travel Itinerary:");
        for (int i = 0; i < numDestinations; i++) {
            System.out.println("Destination #" + (i + 1) + ": " + destinations[i] + " - Date: " + dates[i]);
            String googleMapsUrl = "https://www.google.com/maps/search/?api=1&query=" + destinations[i];
            System.out.println("Google Maps URL: " + googleMapsUrl);

            // Assume weather information is retrieved from an external API
            String weatherInfo = getWeatherInformation(destinations[i], dates[i]);
            System.out.println("Weather Information: " + weatherInfo);
        }

        // Budget calculations
        System.out.print("\nEnter your total budget for the trip: ");
        double budget = scanner.nextDouble();

        // Calculate estimated expenses
        double totalExpenses = calculateExpenses(destinations.length);
        System.out.println("Estimated Total Expenses: $" + totalExpenses);

        if (totalExpenses > budget) {
            System.out.println("Warning: Your expenses exceed your budget!");
        } else {
            double remainingBudget = budget - totalExpenses;
            System.out.println("Remaining Budget: $" + remainingBudget);
        }
    }

    // Method to get weather information (dummy implementation)
    private static String getWeatherInformation(String destination, String date) {
        // Assume weather information is retrieved from an external API
        return "Sunny";
    }

    // Method to calculate estimated expenses (dummy implementation)
    private static double calculateExpenses(int numDestinations) {
        // Assume a fixed cost per destination
        double costPerDestination = 200.0;
        return costPerDestination * numDestinations;
    }
}
