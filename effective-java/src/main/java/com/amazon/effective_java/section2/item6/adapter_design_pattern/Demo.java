package com.amazon.effective_java.section2.item6.adapter_design_pattern;

import com.amazon.effective_java.section2.item6.adapter_design_pattern.adapters.SquarePegAdapter;
import com.amazon.effective_java.section2.item6.adapter_design_pattern.round.RoundHole;
import com.amazon.effective_java.section2.item6.adapter_design_pattern.round.RoundPeg;
import com.amazon.effective_java.section2.item6.adapter_design_pattern.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}

