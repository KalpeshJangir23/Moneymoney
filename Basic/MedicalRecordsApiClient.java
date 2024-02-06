package Basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MedicalRecordsApiClient {

    public static void main(String[] args) {
        // API endpoint URL
        String apiUrl = "https://jsonmock.hackerrank.com/api/medical_records";

        try {
            // Customize the page number for testing
            int pageNumber = 2; // Change this to your desired page number

            // Perform GET request
            URL url = new URL(apiUrl + "?page=" + pageNumber);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Check for successful response code (200 OK)
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // Read response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse and process the JSON response
                processJsonResponse(response.toString());
            } else {
                System.out.println("HTTP GET request failed with response code: " + connection.getResponseCode());
            }

            // Close the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processJsonResponse(String jsonResponse) {
        // Parse the JSON response and extract relevant information
        // You can use a JSON library like Jackson or Gson for parsing

        // For simplicity, let's print the raw JSON response
        System.out.println("JSON Response:\n" + jsonResponse);
    }
}