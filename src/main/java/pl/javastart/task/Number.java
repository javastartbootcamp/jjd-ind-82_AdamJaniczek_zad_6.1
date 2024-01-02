package pl.javastart.task;

import java.util.Scanner;

public class Number {
    private int number;

    private boolean checkNumber() {
        boolean result = false;
        if (number < 100) {
            showMessage("Podana liczba jest za mała");
            result = false;
        } else if (number >= 100 && number <= 200) {
            if (number % 3 == 0) {
                showMessage("Twoja liczba jest ok");
                result = true;
            } else {
                showMessage("Podana liczba nie jest podzielna przez 3");
                result = false;
            }
        } else if (number > 200) {
            showMessage("Podana liczba jest za duża");
            result = false;
        }
        return !result;
    }

    public void guessNumber(Scanner scanner) {
        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();
        } while (checkNumber());
    }

    private void showMessage(String message) {
        System.out.println(message);
    }
}
