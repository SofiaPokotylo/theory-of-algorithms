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
    
    private static int numLetR(char d, String symb, int ind){
        
        if(ind == symb.length()) return 0;
        
        if(symb.charAt(ind)==Character.toLowerCase(d) || symb.charAt(ind)==Character.toUpperCase(d)){ 
            return (numLetR(d,symb,ind+1) + 1) ;
        }
        
        else return numLetR(d,symb,ind+1);
        
    }
    
    public static int numLet(char d, String symb, int ind){
        
        if(ind<0) ind=0;
        
        if(ind >= symb.length()) return 0;
        
        return numLetR(d,symb,ind);
        
    }
    
}
