package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        if(sourceList.size()<3){return new ArrayList<>();}
        ArrayList<String> res = new ArrayList<>();
        for (int i =0; sourceList.size()>i;i++){
            if((i)%3==2){continue;}
            res.add(sourceList.get(2+((i)/3)*3));
            if(sourceList.size()<6&&i==1){break;}
        }
        return res;
    }
}

