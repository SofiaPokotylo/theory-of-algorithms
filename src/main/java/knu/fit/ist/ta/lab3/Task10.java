/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author macbook
 */


@Component
public class Task10 {
    
    //static Random random = new Random();

    public static int[] arrayNumbers(int n){
        int[] result = new int[n];
        for (int j = 0; j < n; ++j) {
            result[j]=j+1;
        }
        return result;
    }
    
    public static int[] arrayShuffle(int[] array, int seed) {
        Random rand = new Random(seed);        
        int t;
        int len = array.length;
        
        for (int j = 0; j < len; ++j) {
            int indexToSwap = rand.nextInt(len);
            t = array[indexToSwap];
            array[indexToSwap] = array[j];
            array[j] = t;
        }        
        
        return array;
    }
    
    public static int[] arrayNatural(int k, int n, int [] array) {

        int[] result = new int[k];
      
        for (int j = 0; j < k; j++) {
            result[j] = array[j];
                       
        }

        return result;
    }
    
     public static String arrayPrint(int[] intArray) {
        String result = "";

        for (int i : intArray) {
            result += i + ", ";
        }
        result=result.substring(0, result.length()-2);
        
        return result;
    }
    
    public static int[] find3Biggest(int[] array, int k){
        
        int lenArray3 = 3;
        if(k<3) lenArray3 = k;
        int[] res = new int[lenArray3];
        int[] copyArray = new int[k];
        for(int j=0;j<k;++j){
            
            copyArray[j] = array[j];
            
        }
        
        for(int j = 0, index = 0, elem = 0; j< lenArray3; ++j){
            index = 0;
            elem = copyArray[0];
            for(int i = 1; i < k; ++i){
                
                if(elem<copyArray[i]){ 

                    elem = copyArray[i];
                    index = i;

                }

            }
            
            res[j] = copyArray[index];
            copyArray[index] = 0;
        
        } 
        
        return res;
    }
    
    /*public static int find3(int k){
        
        int n = 0;
        
        for(int i = 0; i < k; ++i){
            
            result
            
        }
        
        
    }*/
    
}
    


