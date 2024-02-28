/**
 * Ethan Barber
 * CSC-331
 * Lab 2
 * This program takes a minimum and maximum radius of a circle/sphere for input
 * and calculates the circumference, area, surface area, and volume
 */
// import scanner before class
import java.util.Scanner;
public class RadiusCalculationsBarberEthan {
    //main method
    public static void main(String[] args){
// creating variable for scanner to get input from the user
        Scanner input = new Scanner(System.in);
// asking user for minimum radius
        System.out.print("Enter the minimum integer radius value. ");
        int lowerRadius = input.nextInt();
// asking user for maximum radius
        System.out.print("Enter the maximum integer radius value. ");
        int upperRadius = input.nextInt();
// Printing headers for columns
        System.out.println("Circle and Sphere Measurements for Integer Radius Values");
        System.out.println("\t\tRadius\t\tCircumference\t\tArea\t\tSurface Area\t\tVolume");
// for loop displaying results for calculations
        for (int counter = lowerRadius;  counter <= upperRadius; counter++) {
            double circumference = 2 * (Math.PI * counter);
            double area = (Math.PI) * Math.pow(counter, 2);
            double surfaceArea = 4 * (Math.PI * Math.pow(counter, 2));
            double volume = (4.0 / 3) * (Math.PI * Math.pow(counter, 3));
            // formatted print statement
            System.out.printf("%,14d%,19.2f%,11.2f%,20.2f%,14.2f%n", counter, circumference, area, surfaceArea, volume);
        }
    }
}