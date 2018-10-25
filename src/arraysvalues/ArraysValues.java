/*
 * Peter Horne-Deus 
 * Allows a user to enter 20 values and add them up
 * ArraysVallues.java
 * October 25,2018
 */

package arraysvalues;

//Importing java
import java.util.Scanner;

public class ArraysValues {

    
    public static void main(String[] args) {
        //Creating scanner
        Scanner keyedInput = new Scanner (System.in);
        
        //Creating array
        int [ ] numbers = new int [20];
        //Creating variables
        int total = 0;
        
        //Prompt for user to enter information
        System.out.println("Enter twenty integers and they will be added together:");
        //allows user to enter the numbers into an array
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        //Adds the array to a total
        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        //Output the total
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
