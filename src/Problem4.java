import java.util.Random;

public class Problem4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int numOfProcesses = 1000;
        double arrivalTime = 0.0;
        double totalInterarrivalTime = 0.0;
        double totalServiceTime = 0.0;

        System.out.println("Process_ID\tArrival_Time\tService_Time");

        for (int processId = 1; processId <= numOfProcesses; processId++) {
            double interarrivalTime = exponentialSample(rand, 2.0);
            double serviceTime = exponentialSample(rand, 1.0);

            arrivalTime += interarrivalTime;
            totalInterarrivalTime += interarrivalTime;
            totalServiceTime += serviceTime;

            System.out.printf("%d\t\t%.4f\t\t%.4f%n", processId, arrivalTime, serviceTime);
        }

        double averageInterarrivalTime = totalInterarrivalTime / numOfProcesses;
        double actualArrivalRate = 1.0 / averageInterarrivalTime;
        double averageServiceTime = totalServiceTime / numOfProcesses;

        System.out.printf("%nActual average arrival rate: %.4f processes/second%n", actualArrivalRate);
        System.out.printf("Generated average service time: %.4f seconds%n", averageServiceTime);
    }

    private static double exponentialSample(Random rand, double rate) {
        return -Math.log(1.0 - rand.nextDouble()) / rate;
    }
}
