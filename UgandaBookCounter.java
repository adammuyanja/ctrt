/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package t.aqianalyzer;

/**
 *
 * @author smithhenry
 */
import java.util.Scanner;
public class  UgandaBookCounter {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter book description:");
        String description = scanner.nextLine();

        // Convert description to lowercase for case-insensitive comparison
        String lowerDesc = description.toLowerCase();
        String keyword = "uganda";
        int count = 0;
        int index = lowerDesc.indexOf(keyword);

        while (index != -1) {
            count++;
            index = lowerDesc.indexOf(keyword, index + keyword.length());
        }

        System.out.println("The word 'Uganda' appears " + count + " times.");
        
        scanner.close();
    }
}
  

        
    

