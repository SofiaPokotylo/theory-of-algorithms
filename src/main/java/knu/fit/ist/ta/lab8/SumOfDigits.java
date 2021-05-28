/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.util.ArrayList;
import java.util.List;
import static knu.fit.ist.ta.lab8.Tickets.winTickets;

/**
 *
 * @author macbook
 */
public class SumOfDigits {
    
    public static int sumRec(int v, int r, int sum){
        
        if(v == 0) return sum;
        
        r = v%10; 
        v /= 10;  
        sum += r; 
        ++Lab8Show.iter;
        return sumRec(v,r,sum);
        
    }
    
    public static List<Integer> listOfSum(){
        
        List<Integer> listSum = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.addAll(Tickets.winTickets);
        int n = list.size();
        int sum;
        for(int i=0, v; i<n; ++i){
            sum = 0;
            v = list.get(i);
            sum = sumRec(v,sum,sum);
            listSum.add(sum);
        }
        return listSum;
    }
    
    
}
