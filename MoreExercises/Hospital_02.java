package ForLoop.MoreExercises;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysForExamination = Integer.parseInt(scanner.nextLine());

        int untreatedPatients = 0;
        int treatedPatients = 0;
        int countDays = 0;
        int countDoctors = 7;
        int sumTreated = 0;
        int sumUntreated = 0;

        for (int i = 1; i <= daysForExamination ; i++) {
            if (i % 3 == 0 && sumUntreated > sumTreated) {
                countDoctors++;
            }

            int patientsNumber = Integer.parseInt(scanner.nextLine());

            if (patientsNumber > countDoctors) {
                treatedPatients = countDoctors;
                untreatedPatients = patientsNumber - countDoctors;
            } else {
                treatedPatients = patientsNumber;
                untreatedPatients = 0;
            }

            sumTreated += treatedPatients;
            sumUntreated += untreatedPatients;
        }
        System.out.printf("Treated patients: %d.%n", sumTreated);
        System.out.printf("Untreated patients: %d.%n", sumUntreated);

    }
}