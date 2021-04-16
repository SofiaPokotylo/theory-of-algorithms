/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

import org.springframework.stereotype.Component;

/**
 *
 * @author macbook
 */

@Component
public class MyEquation {
    
    private static float a = -5, b = 1, c = 7, d = 8;
    
    public static float solve(float x){
       
        
        float dE = (float) (Math.pow(b, 2) - 4*a*c);
     
        if(dE>=0){
            
            float x1 = (float) ((-b+Math.sqrt(dE))/(2*a));
            float x2 = (float) ((-b-Math.sqrt(dE))/(2*a));
            
            if(x==x2 || x==x1){return Integer.MAX_VALUE;}
          
        }
        
        return  (float) (Math.sqrt(d*x)/(a*x*x+b*x+c));
        
    }
    
    public static float part1(float x){
        
        return (float) Math.sqrt(d*x);
        
    }
    
    public static float part2(float x){
        
        return (float) (a*x*x+b*x+c);
        
    }
    
}
