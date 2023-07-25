package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        sourceList.forEach(source -> {
            if(source % 2 == 0){
                result.addLast(source);
            }else
                result.addFirst(source);
        });
        return result;
    }
}
