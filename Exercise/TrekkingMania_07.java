package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());

        int musalaCounter = 0;
        int moblanCounter = 0;
        int kelimandjaroCounter = 0;
        int k2Counter = 0;
        int everestCounter = 0;

        for (int i = 1; i <= group; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num <=5) {
                musalaCounter += num;
            }
            else if (num <= 12) {
                moblanCounter += num;
            }
            else if (num <= 25) {
                kelimandjaroCounter += num;
            }
            else if (num <= 40) {
                k2Counter += num;
            }
            else  {
                everestCounter += num;
            }
        }

        int sum =  musalaCounter + moblanCounter + kelimandjaroCounter + k2Counter + everestCounter;
        double p1 = musalaCounter * 1.0 / sum * 100;
        double p2 = moblanCounter * 1.0 / sum * 100;
        double p3 = kelimandjaroCounter * 1.0 / sum * 100;
        double p4 = k2Counter * 1.0 / sum * 100;
        double p5 = everestCounter * 1.0 / sum * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
