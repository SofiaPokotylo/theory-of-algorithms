/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.util.List;

/**
 *
 * @author macbook
 */
public class SymmetricTree {
    
    private static BinaryTree symTree(List<Integer> list,int n, BinaryTree t){
        
        int k=0;
        
        if((list.size()%2)!=0){
            
            k = ((list.size()+1)/2)-1;
            
            if(k==0){               // 1 value
                
                t.add(list.get(k));
                return t;
                
            }
            
            if(k==1){               // 3 values
                
                t.add(list.get(k));
                t.add(list.get(k-1));
                t.add(list.get(k+1));
                
                return t;
                
            }
            
        }
        
        else{
            
            k = (list.size()/2)-1;
            if(k==0){               // 2 values
                
                if(list.get(k)>n){          //right part of the initial list
                    t.add(list.get(k));
                    t.add(list.get(k+1));
                }
                
                else{
                    t.add(list.get(k+1));
                    t.add(list.get(k));
                }
                
                return t;
                
            }
            if(list.get(k)>n) ++k;
            
        }
        
        t.add(list.get(k));
        t = symTree(list.subList(0, k),n,t);                //left subtree
        t = symTree(list.subList(k+1, list.size()),n,t);    //right subtree
        
        return t;
    }
    
    public static BinaryTree startSymTree(){
        
        List<Integer> list = SortClearList.sortClearValues();
        
        BinaryTree bt = new BinaryTree();
        
        if(list.isEmpty()) return bt;
        
        if((list.size()%2)!=0){
            
            return symTree(list,list.get(((list.size()+1)/2)-1),bt);
            
        }
        
        else return symTree(list,list.get((list.size()/2)-1),bt); 
        
    }
    
}
