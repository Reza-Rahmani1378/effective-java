package com.amazon.effective_java.studies.open_closed_principle.non_compliant;

import java.security.InvalidParameterException;
import java.util.Objects;

/*
*Although this may seem fine, it's not a good example of the OCP.
* When a new requirement of adding multiplication or divide functionality comes in, we've no way besides changing the calculate method of the Calculator class.
* Hence, we can say this code is not OCP compliant.
* */
public class Calculator {
    public static void calculateOperation(CalculateOperation operation) {
        if (Objects.isNull(operation)) {
            throw new InvalidParameterException("Can not perform operation");
        }

        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        }
        if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }

    public static void main(String[] args) {
        Addition addition = new Addition(23.9,4.0);
        calculateOperation(addition);
        System.out.println(addition.getResult());
    }
}
