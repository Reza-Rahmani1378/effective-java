package com.amazon.effective_java.section3.item10.violates_symmetry;

import java.util.ArrayList;
import java.util.List;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }

        return false;

    }



    /*
    * This method is correct.
    *
    * */
 /*
  @Override public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }*/


    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Publish");
        String test = "publish";
    /*    System.out.println(cis.equals(test));
        System.out.println(test.equals(cis));*/

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        System.out.println(list.contains(test));
    }
}
