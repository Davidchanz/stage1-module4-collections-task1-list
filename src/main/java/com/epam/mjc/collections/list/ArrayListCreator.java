package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        sourceList.forEach(source -> {
            if((sourceList.indexOf(source)+1) % 3 == 0){
                result.add(source);
                result.add(source);
            }
        });
        return result;
    }
}
