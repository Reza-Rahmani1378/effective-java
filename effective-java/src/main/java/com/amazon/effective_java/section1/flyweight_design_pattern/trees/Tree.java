package com.amazon.effective_java.section1.flyweight_design_pattern.trees;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tree {

    private int x;
    private int y;
    private TreeType treeType;
}
