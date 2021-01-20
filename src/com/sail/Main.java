package com.sail;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Operation operation = OperationFactory.creatOperation(OperationType.OPERATION_DIVIDE);
        operation.setNumberA(1);
        operation.setNumberB(0);
        double result = operation.getResult();
        System.out.println(result);
    }
}
