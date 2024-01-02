package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        number.guessNumber(scanner);
    }
}
