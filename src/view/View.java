package view;

import service.CheckOperand;

import java.util.Scanner;
import java.util.logging.Logger;

public class View  implements viewBihavior{
    private final Scanner scanner = new Scanner(System.in);

    public  double  getNumber(String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите корректное число.");
            scanner.next(); // очищаем ввод
        }
        return scanner.nextDouble();
    }

    public char getOperation(String prompt) {
        System.out.println(prompt);
        return scanner.next().charAt(0);
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}