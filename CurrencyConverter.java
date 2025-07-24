import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");

        System.out.print("Change from currency:");
        String baseCurrency = sc.next().toUpperCase();

        System.out.print("Change to currency:");
        String targetCurrency = sc.next().toUpperCase();


        System.out.print("Enter amount to convert:");
        double amount = sc.nextDouble();

        try {
            String apiUrl = "https://api.exchangerate.host/convert?from=" + baseCurrency + "&to=" + targetCurrency + "&amount=" + amount;

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            String resultStr = response.toString();
            double result = extractValue(resultStr, "\"result\":");

            System.out.printf("Converted Amount: %.2f %s\n", result, targetCurrency);

        } catch (Exception e) {
            System.out.println("Error fetching exchange rate: " + e.getMessage());
        }
    }

    public static double extractValue(String json, String key) {
        int index = json.indexOf(key);
        if (index == -1) return -1;
        int start = index + key.length();
        int end = json.indexOf(",", start);
        if (end == -1) end = json.indexOf("}", start);
        String valueStr = json.substring(start, end).trim();
        return Double.parseDouble(valueStr);
    }
}
