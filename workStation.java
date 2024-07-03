import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class workStation {
    public static void main(String[] args) {
        // Path to the file containing reviews
        String filePath = "reviews.txt"; 

        // Try-with-resources statement to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int reviewCount = 0; // Counter for the number of reviews
            int totalLength = 0; // Total length of all reviews combined
            String longestReview = ""; // Variable to store the longest review
            String shortestReview = null; // Variable to store the shortest review

            // Read each line (review) from the file
            while ((line = br.readLine()) != null) {
                reviewCount++; // Increment the review counter
                totalLength += line.length(); // Add the length of the current review to the total length

                // Update the longest review if the current review is longer
                if (line.length() > longestReview.length()) {
                    longestReview = line;
                }

                // Update the shortest review if it's the first review or the current review is shorter
                if (shortestReview == null || line.length() < shortestReview.length()) {
                    shortestReview = line;
                }
            }

            // If there are reviews, calculate and print the statistics
            if (reviewCount > 0) {
                double averageLength = (double) totalLength / reviewCount; // Calculate the average review length
                System.out.println("Number of reviews: " + reviewCount);
                System.out.println("Average review length: " + averageLength);
                System.out.println("Longest review: " + longestReview);
                System.out.println("Shortest review: " + shortestReview);
            } else {
                // If no reviews were found in the file
                System.out.println("No reviews found in the file.");
            }

        } catch (IOException e) {
            // Handle any I/O exceptions that occur
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}