package main;

import controller.CalculatorController;
import service.ArifmeticOperation;
import view.View;

public class Main {
    public static void main(String[] args) {
        ArifmeticOperation arifmeticOperation = new ArifmeticOperation();
        View view = new View();
        CalculatorController controller = new CalculatorController(arifmeticOperation, view);

        controller.start();
    }
}
