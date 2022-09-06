package com.amazon.effective_java.studies.open_closed_principle.compliant_ocp;

import java.security.InvalidParameterException;
import java.util.Objects;

/*
* That way the class is closed for modification but open for an extension.
* */
public class Calculate {

    public static void calculate(CalculatorOperation operation) {
        if (Objects.isNull(operation)) {
            throw new InvalidParameterException("Can not perform operation.");
        }
        operation.perform();
    }


    public static void main(String[] args) {
        Subtraction subtraction = new Subtraction(34 , 243);
        calculate(subtraction);
        System.out.println(subtraction.getResult());
    }
}
