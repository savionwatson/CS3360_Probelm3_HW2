import java.util.Random;
import java.util.Scanner;

/**
 * Program to generate random numbers, floats, and calculate probabilities per Problem 3 of the assignment.
 */
public class Problem3 {
    /**
     * Generates a specified number of random integers and prints them to the console.
     * @param count The number of random integers to generate.
     */
    public static void ProblemA(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100); // Generates a random number between 0 and 99
            System.out.println(randomNumber);
        }
    }

    /**
     * Generates a specified number of random floats within a given range and prints them to the console.
     * @param minRange The minimum value of the range.
     * @param maxRange The maximum value of the range.
     * @param count The number of random floats to generate.
     */
    public static void ProblemB(double minRange, double maxRange, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            float randomFloat = (float) (minRange + random.nextFloat() * (maxRange - minRange));
            System.out.println(randomFloat);
        }
    }

    /**
     * Generates a specified number of random outcomes based on defined probabilities and prints them to the console.
     * @param count The number of random outcomes to generate.
     */
    public static void ProblemC(int count) {
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            double outcome = random.nextDouble();

            if (outcome < 0.50) {
                System.out.println(1);
            } else if (outcome < 0.70) {
                System.out.println(2);
            } else {
                float randomFloat = 3.0f + random.nextFloat();
                System.out.println(randomFloat);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Select a problem to run (A, B, or C):");
        String choice = input.nextLine().toUpperCase();

        switch (choice) {
            case "A":
                ProblemA(100);
                break;
            case "B":
                ProblemB(0.25, 0.5, 100);
                break;
            case "C":
                ProblemC(100);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}
