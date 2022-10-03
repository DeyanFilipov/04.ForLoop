package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double points = 0;
        double sum = 0;
        double points1 = 0;

        for (int i = 1; i <= n; i++) {
            String judge = scanner.nextLine();

            double pointsFormJudge = Double.parseDouble(scanner.nextLine());

            points = pointsAcademy + ((judge.length() * pointsFormJudge) / 2);
            sum += points;
            pointsAcademy = points;

            if (pointsAcademy > 1250.5) {
                break;
            }
        }
        double pointsNeeded = 1250.5 - points;

        if (points > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, pointsNeeded);
            }
        }
}