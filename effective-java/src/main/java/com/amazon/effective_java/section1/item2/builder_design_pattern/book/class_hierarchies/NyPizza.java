package com.amazon.effective_java.section1.item2.builder_design_pattern.book.class_hierarchies;

import java.util.Objects;

public class NyPizza extends Pizza{

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }
        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
