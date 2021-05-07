/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import knu.fit.ist.ta.lab4.Text;

/**
 *
 * @author macbook
 */

@Service
public class Lab5Show {
    
    public String showIndex(String word, String seq, String startStr, String finishStr){
        
        return SortObj.sortApproach2().toString();
        
        //return SortObj.sortApproach13(SortObj.sortApproach12(), SortObj.sortApproach1());
        
        /*if(word.equals("") && seq.equals("")){
            return "Please, enter the word(sequence) to look for";
        }
        
        if(startStr=="" && finishStr==""){
            
            if(word.matches("\\d{1,}")){
                
                return SortSearch.linearSearch3(word,SortSearch.sortApproach3(Text.cleanText(Text.text)));
                
            }
            
            if(word.substring(1).equals("") || word.substring(1).matches(" {1,}")){
                return SortSearch.linearSearch1(word.charAt(0),SortSearch.sortApproach3(Text.cleanText(Text.text)));
            }
           
            if(SortSearch.linearSearch(word,SortSearch.sortApproach3(Text.cleanText(Text.text)))==-1){
                
                return "This text does not contain the search word";
                
            }
            
            else{
                return "The index of the search word is: "+SortSearch.linearSearch(word,SortSearch.sortApproach3(Text.cleanText(Text.text)));
            }
            
        }
        
        if(startStr=="" && finishStr==""){
            
            return SortSearch.linearSearch2(seq,SortSearch.sortApproach3(Text.cleanText(Text.text)));
            
        }
        
        if(startStr.equals("") && !finishStr.equals("")){
            return "Please, enter the start index";
        }
        
        int start = Integer.parseInt(startStr);
        
        if(!startStr.equals("") && finishStr.equals("")){
            
            return "The index of the search word is: "+SortSearch.linearSearch(word,start,SortSearch.sortApproach3(Text.cleanText(Text.text)));
            
        }
        
        int finish = Integer.parseInt(finishStr);
        
        
        if(start<=0 || finish<=0){return "The indices must be >=0";}
        
        if(start>finish){
            
            return "The start index must be less than the finish index";
            
        } 
        
        else{
            return "The index of the search word is: "+SortSearch.linearSearch(word,start,finish,SortSearch.sortApproach3(Text.cleanText(Text.text)));
        }*/
    }
    
}
