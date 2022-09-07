package com.amazon.effective_java.section3.item14.comparable;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<BigDecimal> treeSet = new TreeSet();
        treeSet.add(new BigDecimal("1.0"));
        treeSet.add(new BigDecimal("1.00"));
        System.out.println(treeSet.size());
        HashSet<BigDecimal> set = new HashSet<>();
        set.add(new BigDecimal("1.0"));
        set.add(new BigDecimal("1.00"));
        System.out.println(set.size());
    }
}
