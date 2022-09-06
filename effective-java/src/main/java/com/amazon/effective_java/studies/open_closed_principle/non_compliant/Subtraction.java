package com.amazon.effective_java.studies.open_closed_principle.non_compliant;

import lombok.Data;

@Data
public class Subtraction implements CalculateOperation {

    private double left;
    private double right;
    private double result = 0.0;

    public Subtraction(double left , double right) {
        this.left = left;
        this.right = right;
    }
    
}
