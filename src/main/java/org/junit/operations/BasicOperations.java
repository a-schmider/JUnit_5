package org.junit.operations;

public class BasicOperations {

    int operand1;
    int operand2;


    public BasicOperations(int op1, int op2) {
        operand1 = op1;
        operand2 = op2;
    }


    public void setOperand1(int op) {
        operand1 = op;
    }

    public void setOperand2(int op) {
        this.operand2 = op;
    }


    public int add() {
        return operand1 + operand2;
    }

    public int sub() {
        return operand1 - operand2;
    }

    public int mult() {
        return operand1 * operand2;
    }

    public int div() throws ArithmeticException {
        return operand1 / operand2;
    }

}