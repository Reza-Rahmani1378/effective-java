package com.amazon.effective_java.section1.item1.flyweight_design_pattern.trees;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();


    public void plantTree(int x, int y, String name, Color color, String otherData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
