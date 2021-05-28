/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.util.ArrayList;
import java.util.List;
import static knu.fit.ist.ta.lab8.QuickSort.quickSort;
import static knu.fit.ist.ta.lab8.SortRadix.radixsort;

/**
 *
 * @author macbook
 */
public class Jackpot {
    
    private static int numJ = 5;

    public static void setNumJ(int numJ) {
        Jackpot.numJ = numJ;
    }

    public static int getNumJ() {
        return numJ;
    }
    
    public static List<Integer> winJackpot(List<Integer> listT){
        
        if(listT.isEmpty()) return listT;
        
        if(listT.size()<numJ) numJ=listT.size();
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numJ; ++i){
            list.add(listT.get(i));   
        }
        
        return list;
        
    }
    
}
