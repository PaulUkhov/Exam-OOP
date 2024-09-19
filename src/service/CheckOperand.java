package service;

import java.util.logging.Logger;

//Воспроизводит последовательность и логику работы между элементами 
public class CheckOperand  extends ArifmeticOperation implements checkOperation {

    public static final Logger logger = Logger.getLogger(CheckOperand.class.getName());
    public void checkOperand(char operation) {
        // Ввод первого числа
        double result = getNumber("Введите первое число:");
        logger.info("Первое число: " + result);
        while (true) {
            // Запрос и проверка оператора
            getOperation("Введите оператор (+, *, /) или = для завершения:");
            if (operation == '=') {
                logger.info("Завершение программы");
                // Завершение работы программы
                break;
            }

            // Ввод следующего числа
            double nextNumber = getNumber("Введите следующее число:");
            logger.info("Следующее число: " + nextNumber);

            // Обработка операций
            switch (operation) {
                case '+':
                    result = add(result, nextNumber);
                    logger.info("Результат сложения: " + result);
                    break;
                case '*':
                    result = multiply(result, nextNumber);
                    logger.info("Результат умножения: " + result);
                    break;
                case '/':
                    if (nextNumber == 0) {
                        logger.severe("Ошибка: попытка деления на ноль");
                        System.out.println("Ошибка: деление на ноль невозможно.");
                        continue;
                    }
                    result = divide(result, nextNumber);
                    logger.info("Результат деления: " + result);
                    break;
                default:
                    System.out.println("Ошибка: введите корректный оператор.");
                    logger.warning("Некорректный оператор: " + operation);
                    continue;// Продолжаем к следующей итерации цикла
            }
            System.out.println("Текущий результат: ");
        }
    }

    private void getOperation(String s) {
    }

    private double getNumber(String s) {
        return 0;
    }

    @Override
    public double checkNumber(String prompt) {
        return 0;
    }

    @Override
    public void checkOperation(String prompt) {

    }

    @Override
    public void getSimbol() {

    }
}


