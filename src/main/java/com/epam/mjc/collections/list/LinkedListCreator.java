package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int i =0; sourceList.size()>i;i++){
            if((sourceList.get(i))%2!=1){continue;}
            res.addFirst(sourceList.get(i));
        }
        for (int i =0; sourceList.size()>i;i++){
            if((sourceList.get(i))%2==1){continue;}
            res.addLast(sourceList.get(i));
        }
        return res;
    }
}
