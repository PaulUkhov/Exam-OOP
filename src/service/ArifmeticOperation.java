package service;
// Методы для арифметических операций
public class ArifmeticOperation implements calcBihavior {

    @Override
    public double add(double a, double b) {
        return a + b;
    }
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль.");
            return a;
        }
        return a / b;
    }
}

