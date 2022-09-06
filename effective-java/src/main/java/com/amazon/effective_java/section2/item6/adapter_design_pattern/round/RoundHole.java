package com.amazon.effective_java.section2.item6.adapter_design_pattern.round;

public class RoundHole {

    private double radios;

    public RoundHole(double radios) {
        this.radios = radios;
    }


    public double getRadios() {
        return radios;
    }


    public boolean fits(RoundPeg peg) {
        return this.radios >= peg.getRadios();
    }
}
