/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.text.DecimalFormat;
import org.springframework.stereotype.Service;

/**
 *
 * @author macbook
 */
@Service
public class Lab3Show {
    
    //DecimalFormat df = new DecimalFormat("###.##");
    
    public String showResult(String kString, String nString, String sString){
        
        if(kString.equals("") || nString.equals("") || sString.equals("")){
            return "Please enter all values";}
        int k = Integer.parseInt(kString);
        int n = Integer.parseInt(nString);
        int s = Integer.parseInt(sString);
        
        
        if(k<=0 || n<=0){return "Wrong k or/and n. Must be natural numbers";}
        
        if(k>n){return "The range of the numbers must be more than or equal "
                + "to the number of elements of the array";}
        else{
            return "The array: {" + Task10.arrayPrint(Task10.arrayNatural(
            k,n,Task10.arrayShuffle(Task10.arrayNumbers(n),s))) +
            "}, the largest values of the array: " + Task10.arrayPrint(
            Task10.find3Biggest(Task10.arrayNatural(k,n,Task10.arrayShuffle(
            Task10.arrayNumbers(n),s)),k));}
    }
    
}
