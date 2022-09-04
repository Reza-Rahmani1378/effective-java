package com.amazon.effective_java.section2.item1.flyweight_design_pattern.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TreeFactory {

    private static final Map<String , TreeType> treeTypes = new HashMap<>();


    public static TreeType getTreeType(String name , Color color , String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (Objects.isNull(result)) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name , result);
        }

        return result;
    }
}
