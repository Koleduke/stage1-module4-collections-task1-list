package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        List <String> res = new ArrayList<>(sourceList);
        Comparator df = new ListComparator();

        if(sourceList.isEmpty()){return;}

        for (int i =0; sourceList.size()>i;i++)
        {
            int min = Integer.parseInt(res.get(0));

                for (int j =0; res.size()>j;j++){
                    min = df.compare(String.valueOf(min),res.get(j));
                    sourceList.set(i, String.valueOf(min));
                }

                res.remove(res.indexOf(String.valueOf(min)));
        }

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aC = Integer.parseInt(a);
        int bC = Integer.parseInt(b);
        if(aC*aC*5+3<bC*bC*5+3){return Integer.parseInt(a);}

        return Integer.parseInt(b);
    }
}
