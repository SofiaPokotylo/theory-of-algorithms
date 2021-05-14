/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

/**
 *
 * @author macbook
 */
public class Recursion {
    
    public static int numLet(char d, String symb, int ind){
        
        if(ind == symb.length()) return 0;
        
        if(symb.charAt(ind)==d) return (numLet(d,symb,ind+1) + 1) ;
        
        else return numLet(d,symb,ind+1);
        
    }
    
}
