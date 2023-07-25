package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int v1 = Integer.parseInt(a);
        int v2 = Integer.parseInt(b);
        return function(v1) > function(v2) ? 1 :
                function(v1) < function(v2) ? -1 :
                        v1 > v2 ? 0 : -1;
    }

    private int function(int v){
        return 5*v*v+3;
    }
}
