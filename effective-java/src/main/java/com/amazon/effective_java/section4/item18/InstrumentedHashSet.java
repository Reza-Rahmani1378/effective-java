package com.amazon.effective_java.section4.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
/**
 *
 * @author reza-vivo
 */
/*
*  Unlike method invocation, inheritance violates encapsulation.
* We would expect the getAddCount method to return three at this point, but it returns six.
*  What went wrong? Internally, HashSet’s addAll method is implemented on top of its add method, although HashSet, quite reasonably, does not document this implementation detail. The addAll method in InstrumentedHashSet added three to addCount and then invoked HashSet’s addAll implementation using super.addAll. This in turn invoked the add method, as overridden in InstrumentedHashSet, once for each element. Each of these three invocations added one more to addCount, for a total increase of six: each element added with the addAll method is double-counted.
* */
public class InstrumentedHashSet <E> extends HashSet<E> {
    private int addCount;
    public InstrumentedHashSet() {
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
        InstrumentedHashSet<String> test = new InstrumentedHashSet<>();
        test.addAll(List.of("Hi","Bye"));
        System.out.println(test.getAddCount());
    }
}
