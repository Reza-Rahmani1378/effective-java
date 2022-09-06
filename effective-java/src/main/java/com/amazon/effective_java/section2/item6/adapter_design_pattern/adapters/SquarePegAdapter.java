package com.amazon.effective_java.section2.item6.adapter_design_pattern.adapters;

import com.amazon.effective_java.section2.item6.adapter_design_pattern.round.RoundPeg;
import com.amazon.effective_java.section2.item6.adapter_design_pattern.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;


    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }


    @Override
    public double getRadios() {
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }

}
