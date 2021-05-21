/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author macbook
 */
public class SortClearList {
    
    private static List<Integer> list = new ArrayList<>();
    
    public static void clearList() {
        SortClearList.list = new ArrayList<>();
    }

    public static void setList(List<Integer> list) {
        SortClearList.list = list;
    }
    
    public static List<Integer> sortClearValues(){
        
        if(list.isEmpty()) list = Arrays.asList(5,8,7,2,6,10,4,9);
        int n = list.size() - 1;
        int k = 0,t;
        
        while (k != n) {
            t = k + 1;

            while (t > 0 && list.get(t) < list.get(t - 1)) {
                list.set(t, list.get(t-1)+list.get(t));
                list.set(t - 1, list.get(t)-list.get(t - 1));
                list.set(t, list.get(t)-list.get(t - 1));
                t--;
            }

            k++;

        }
        
        for(int i=1;i<list.size();++i){
        
            if(list.get(i).equals(list.get(i-1))){
                list.remove(list.get(i));
                --i;
            }
            
        }
        
        return list;
    
    }
    
}
