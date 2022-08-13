package com.amazon.effective_java.section1.flyweight_design_pattern.trees;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class TreeType {

    private String name;
    private Color color;
    private String otherTreeData;


    public void draw(Graphics graphics , int x , int y) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x-1 , y , 3 , 5);
        graphics.setColor(color);
        graphics.fillOval(x-5 , y-10 , 10 , 10);
    }

}
