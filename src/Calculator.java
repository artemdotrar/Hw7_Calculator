public class Calculator implements CalculatorInterface {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public double action(int operationID) {
        switch (operationID) {
            case 1:
                return firstNumber + secondNumber;
            case 2:
                return firstNumber - secondNumber;
            case 3:
                return  firstNumber * secondNumber;
            case 4:
                return  firstNumber / secondNumber;
        }
        return 0;
    }
}
