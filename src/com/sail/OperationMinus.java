package com.sail;

public class OperationMinus extends Operation{

    @Override
    public double getResult() {
        double result = getNumberA() - getNumberB();
        return result;
    }
}
