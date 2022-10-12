package ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLoads = Integer.parseInt(scanner.nextLine());

        int totalTonnage = 0;
        int busTonnage = 0;
        int truckTonnage = 0;
        int trainTonnage = 0;

        for (int i = 0; i < numberOfLoads; i++) {
            int tonnage = Integer.parseInt(scanner.nextLine());
            if (tonnage <= 3) {
                busTonnage += tonnage;
            }
            else if (tonnage <= 11) {
                truckTonnage += tonnage;
            }
            else {
                trainTonnage += tonnage;
            }
            totalTonnage += tonnage;
        }
            double avgPrice = (busTonnage * 200 + truckTonnage * 175 + trainTonnage * 120 * 1.0) / totalTonnage;
            double busPercent = busTonnage * 1.0 / totalTonnage * 100;
            double truckPercent = truckTonnage * 1.0 / totalTonnage * 100;
            double trainPercent = trainTonnage * 1.0 / totalTonnage * 100;

        System.out.printf("%.2f%n", avgPrice);
        System.out.printf("%.2f%%%n", busPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%%n", trainPercent);
    }
}