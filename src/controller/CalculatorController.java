package controller;

import service.ArifmeticOperation;
import service.checkOperation;
import view.View;

import java.util.logging.Logger;

public class CalculatorController {
    private final ArifmeticOperation arifmeticOperation;
    private final View view;
    private final Logger logger =  Logger.getLogger(CalculatorController.class.getName());
    public CalculatorController(ArifmeticOperation arifmeticOperation, View view) {
        this.arifmeticOperation = arifmeticOperation;
        this.view = view;
    }

    public void start() {
        double result = view.getNumber("Введите первое число:");
        logger.info("Первое число: " + result);
        while (true) {
            char operation = view.getOperation("Введите оператор (+, *, /) или = для завершения:");
            if (operation == '=') {
                logger.info("Завершение программы");
                view.displayResult(result);
                break;
            }
            double nextNumber = view.getNumber("Введите следующее число:");
            logger.info("Следующее число: " + nextNumber);

            switch (operation) {
                case '+':
                    result = arifmeticOperation.add(result, nextNumber);
                    break;
                case '*':
                    result = arifmeticOperation.multiply(result, nextNumber);
                    break;
                case '/':
                    result = arifmeticOperation.divide(result, nextNumber);
                    break;
                default:
                    view.displayMessage("Ошибка: некорректный оператор.");
                    logger.warning("Неккоректный ввод");
            }

            view.displayResult(result);
        }
    }
}
