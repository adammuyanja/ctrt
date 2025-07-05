/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package t.aqianalyzer;

/**
 *
 * @author samyrgaston5
 */
import java.util.Arrays;
import java.util.Random;

public class AQIMonitor {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random rand = new Random();

        // i) Generate 30 random AQI values between 1 and 300
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = rand.nextInt(300) + 1; // 1 to 300 inclusive
        }

        // Display generated AQI readings
        System.out.println("AQI Readings for 30 days:");
        System.out.println(Arrays.toString(aqiReadings));

        // ii) Compute median
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }

        System.out.println("Median AQI value: " + median);

        // iii) Count hazardous days (AQI > 200)
        int hazardousCount = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousCount++;
            }
        }

        System.out.println("Number of hazardous days (AQI > 200): " + hazardousCount);
    }
}


