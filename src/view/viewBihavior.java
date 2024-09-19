package view;

public interface viewBihavior {
    double getNumber(String prompt);
    char getOperation(String prompt);
    void displayResult(double result);
    void displayMessage(String message);
}
