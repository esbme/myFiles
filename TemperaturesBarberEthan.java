/**
 * Ethan Barber
 * CSC-331
 * Lab 4 - Temperatures
 * Description: This program takes 2 arrays of temperatures collected throughout a month and displays
 * the highest, lowest, average, and the daily difference of temperature
 */

public class TemperaturesBarberEthan {
    // main method
    public static void main(String[] args){
        // creating my 2 arrays using given numbers
        int [] highTemps = {48, 48, 46, 66, 46, 46, 41, 42, 57, 60, 50, 50, 42, 35, 30, 35, 39, 39, 37, 51, 51, 51, 59, 66, 55, 48, 62, 75};
        int [] lowTemps = { 35, 33, 30, 50, 33, 28, 33, 35, 30, 37, 37, 30, 39, 24, 19, 17, 24, 32, 33, 35, 35, 35, 39, 44, 48, 42, 42, 53};


        // displays results for highTemps
        System.out.println("High Temperatures:");
        System.out.println("Maximum: " + highestTemp(highTemps));
        System.out.println("Minimum: " + lowestTemp(highTemps));
        System.out.println("Average: " + averageTemp(highTemps));

        // displays results for lowTemps
        System.out.println("\nLow Temperatures:");
        System.out.println("Maximum: " + highestTemp(lowTemps));
        System.out.println("Minimum: " + lowestTemp(lowTemps));
        System.out.println("Average: " + averageTemp(lowTemps));

        // displays daily temperatures alongside the corresponding day
        int[] tempDifferences = dailyTempDiff(highTemps, lowTemps);
        System.out.println("\nDaily Temperature Differences:");
        for (int i = 0; i < tempDifferences.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + tempDifferences[i]);
        }

    }
    /*Non-main methods*/

    /**
     *
     * @param temps array of temperatures
     * @return returns maximum temperature of array given
     */
    public static int highestTemp(int[] temps){
        int max = temps[0];
        for (int temp : temps){
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }

    /**
     *
     * @param temps array of temperatures
     * @return returns minimum temperature of array given
     */
    public static int lowestTemp(int [] temps){
        int min = temps[0];
        for (int temp : temps){
            if (temp < min){
                min = temp;
            }
        }
        return min;
    }

    /**
     *
     * @param temps array of temperatures
     * @return returns average of temperatures from array given
     */
    public static int averageTemp(int [] temps){
        int total = 0;
        int numberOfTemps = 0;
        for (int temp : temps){
            numberOfTemps = numberOfTemps + 1;
            total = total + temp;
        }
        return total / numberOfTemps;
        //return Math.round((float)total / (float)numberOfTemps);
    }
    // Method to calculate the difference between high and low temperatures for each day

    /**
     *
     * @param highTemps array of high temperatures of the month
     * @param lowTemps array of high temperatures of the month
     * @return returns the differences between daily temperatures
     */
    public static int[] dailyTempDiff(int[] highTemps, int[] lowTemps) {

        int[] differences = new int[highTemps.length];
        for (int i = 0; i < highTemps.length; i++) {
            differences[i] = highTemps[i] - lowTemps[i];
        }
        return differences;
    }
}
