package service;

import java.util.Scanner;

public class getOperation implements getOperations {
//  Метод для получения и проверки оператора
    Scanner scanner = new Scanner(System.in);
    @Override
    public char getOperation(String prompt) {

        char operation;
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim(); // Чтение строки и удаление лишних пробелов
            if (input.length() == 1) {
                operation = input.charAt(0);
                if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '=') {
                    break;
                } else {
                    System.out.println("Ошибка: введите корректный оператор (+, -, *, /) или =.");
                }
            } else {
                System.out.println("Ошибка: введите один символ.");
            }
        }
        return operation;
    }
}
