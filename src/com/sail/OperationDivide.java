package com.sail;

public class OperationDivide extends Operation{
    @Override
    public double getResult() {
        if (getNumberB() == 0){
            throw new NumberFormatException();
        }
        return getNumberA() / getNumberB();
    }
}
