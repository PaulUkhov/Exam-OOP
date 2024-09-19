package model;

public class NextNumber extends ModelNumber{
    private int nextNumber;
    public NextNumber() {
        super();
    }

    public NextNumber(int nextNumber) {
        this.nextNumber = nextNumber;
    }

    public int getNextNumber() {
        return nextNumber;
    }
}
