package com.amazon.effective_java.studies.open_closed_principle.compliant_ocp;

import lombok.Data;

@Data
public class Subtraction implements CalculatorOperation{

    private double left;
    private double right;
    private double result;

    public Subtraction(double left , double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
        result = left - right;
    }
}
