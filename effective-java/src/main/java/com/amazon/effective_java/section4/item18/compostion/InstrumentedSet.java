package com.amazon.effective_java.section4.item18.compostion;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E>  {


    private int addCount = 0;
    public InstrumentedSet(Set<E> s) {
        super(s);
    }
    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        Set<String> hi = new HashSet<>(Set.of("Hi","Bye"));
        InstrumentedSet<String> test = new InstrumentedSet<>(hi);
        test.addAll(Set.of("GSGSFGS","DFSGSG","apple"));
        System.out.println(test.getAddCount());
    }
}
