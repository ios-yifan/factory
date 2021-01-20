package com.sail;

public class OperationFactory {

    public static Operation creatOperation(OperationType type){

        switch (type){
            case OPERATION_ADD:
                return new OperationAdd();
            case OPERATION_MINUS:
                return new OperationMinus();
            case OPERATION_MULTIPLY:
                return new OperationMultiply();
            case OPERATION_DIVIDE:
                return new OperationDivide();
        }
        return null;
    }
}
