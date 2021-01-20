package com.sail;

public class OperationMultiply extends Operation{
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
