package pl.javastart.task;

import java.util.Scanner;

public class Number {

    private boolean checkNumber(int number) {
        boolean result = false;
        if (number < 100) {
            System.out.println("Podana liczba jest za mała");
        } else if (number > 200) {
            System.out.println("Podana liczba za za duża");

        } else {
            if (number % 3 == 0) {
                System.out.println("Twoja liczba jest ok");
                result = true;
            } else {
                System.out.println("Podana liczba nie jest podzielna przez 3");
            }
        }
        return !result;
    }

    public void guessNumber(Scanner scanner) {
        int number;
        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();
        } while (checkNumber(number));
    }
}
