public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;

    // getters
    public double getAdditionResult() {
        return (this.firstNumber + this.secondNumber);
    }

    public double getSubtractionResult() {
        return (this.firstNumber - this.secondNumber);
    }

    public double getMultiplicationResult() {
        return (this.secondNumber * this.firstNumber);
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;
        }
        return (this.firstNumber / this.secondNumber);
    }

    // setters
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // getters
    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }
}