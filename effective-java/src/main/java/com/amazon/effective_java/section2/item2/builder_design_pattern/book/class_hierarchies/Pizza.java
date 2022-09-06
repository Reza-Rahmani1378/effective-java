package com.amazon.effective_java.section2.item2.builder_design_pattern.book.class_hierarchies;

import java.util.EnumSet;
import java.util.Set;


public abstract class Pizza {

    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();
        protected abstract T self();

    }

    public Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }


    public static void main(String[] args) {

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
        System.out.println(pizza.toppings);
    }
}
