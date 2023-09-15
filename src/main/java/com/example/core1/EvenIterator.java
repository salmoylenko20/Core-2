package com.example.core1;

import java.util.Iterator;
import java.util.List;

public class EvenIterator implements Iterator<Integer> {
    private Iterator<Integer> iterList;
    private Integer next = null;

    public EvenIterator(List<Integer> list) {
        this.iterList = list.iterator();
    }


    @Override
    public boolean hasNext() {
        Integer tmp = null;
        next = null;
        if(!iterList.hasNext()) return false;

        while(iterList.hasNext() && (tmp = iterList.next()) % 2 != 0){
            if(!iterList.hasNext()) return false;
        }
        next = tmp;
        return true;
    }

    @Override
    public Integer next() {
        if(next != null) {
            var result = next;
            next = null;
            return result;
        }
        if(this.hasNext()){
            var result = next;
            next = null;
            return result;
        }
        return null;
    }
}
