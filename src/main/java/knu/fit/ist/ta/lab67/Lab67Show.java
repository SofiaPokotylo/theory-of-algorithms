/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author macbook
 */

@Service
public class Lab67Show {
    
    static BinaryTree bt = SymmetricTree.startSymTree();

    public static void setBt() {
        Lab67Show.bt = SymmetricTree.startSymTree();
    }
    
    public String treetIO(String str){
    
        if(str.equals("")){
            return BinaryTreeS.traverseInOrderS(bt.root);
        }
        List<String> listStr = Arrays.asList(str.split(" "));
        for(int i=0;i<listStr.size();++i){
            if(!listStr.get(i).matches("^\\d{1,}$")){
                return BinaryTreeS.traverseInOrderS(bt.root);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<listStr.size();++i){
            int k = Integer.parseInt(listStr.get(i));
            list.add(k);
        }
        
        SortClearList.setList(list);
        bt = SymmetricTree.startSymTree();
        return BinaryTreeS.traverseInOrderS(bt.root);
    
    }
    
    public String tree(){
    
        return BinaryTreeS.tree(bt.root);
    
    }
    
    public String treetPO(){
    
        return BinaryTreeS.traversePreOrderS(bt.root);
    
    }
    
    public String treetPostO(){
        return BinaryTreeS.traversePostOrderS(bt.root);
    }
    
    public String addS(String str){
        if(!str.equals("") && str.matches("^\\d{1,}$")){
            int s = Integer.parseInt(str);
            bt.add(s);
            return BinaryTreeS.traverseLevelOrder(bt.root);
        }
        if(str.equals("")){
            return "You have not entered the value to add to the tree";
        }
        return "Please, enter an integer";
    }
    
    public String treeCS(String str){
        if(!str.equals("") && str.matches("^\\d{1,}$")){
            int s = Integer.parseInt(str);
            bt.containsNode(s);
            if(bt.containsNode(s)){
                return "The tree contains the value "+s+": "+BinaryTreeS.traverseLevelOrder(bt.root);
            }
            else{
                return "The tree doesn`t contain the value "+s+": "+BinaryTreeS.traverseLevelOrder(bt.root);
            }
        }
        if(str.equals("")){
            return "You have not entered the value";
        }
        return "Please, enter an integer";
    }
    
    public String smallest(){
        return "The smallest value - "+bt.findSmallestValue(bt.root);
    }  
    
    public String largest(){
        return "The largest value - "+bt.findLargestValue(bt.root);
    }
    
    public String treetPostONotRS(){
        return AdditionalTask.treetPostONotR().toString();
    }
    
    public String deleteS(String str){
        
        if(!str.equals("") && str.matches("^\\d{1,}$")){
            int s = Integer.parseInt(str);
            String tree = "The tree: "+BinaryTreeS.traverseLevelOrder(bt.root);
            bt.delete(s);
            return tree+", the tree after deleteing the value: "+BinaryTreeS.traverseLevelOrder(bt.root);
        }
        if(str.equals("")){
            return "You have not entered the value to delete";
        }
        return "Please, enter an integer";
        
    }
    
    public String treetLO(){
        return BinaryTreeS.traverseLevelOrder(bt.root);
    }
    

    
    public String numLet(String l, String str, String ind){
    
        if(str.equals("")) return "Please, enter the character string";
        if(l.equals("") && ind.equals("")){ 
            if(Recursion.numLet('d', str, 0)==0) return "This string doesn`t contain the letter \'d\'";
            return "The number of letters \'d\' in the line - "+
                Recursion.numLet('d', str, 0);
        }
        if(l.equals("")){ 
            int i = Integer.parseInt(ind);
            if(i<0) return "The index must be >=0";
            if(i>str.length()) return "The index is greater than the length of the string";
            if(Recursion.numLet('d', str, i)==0) return "This string doesn`t contain the letter \'d\'";
            return "The number of letters \'d\' in the line - "+
                Recursion.numLet('d', str, i);
        }
        if(ind.equals("")){ 
            if(l.length()>1 && !l.substring(1).matches("^\\s{1,}$")){ 
                return "Please, enter one symbol";
            }
            if(Recursion.numLet(l.charAt(0), str, 0)==0) return "This string doesn`t contain the letter \'"+
                    l.charAt(0)+"\'";
            return "The number of letters \'"+l.charAt(0)+"\' in the line - "+
                Recursion.numLet(l.charAt(0), str, 0);
        }
    
        else{
            
            int i = Integer.parseInt(ind);
            if(i<0) return "The index must be >=0";
            if(i>str.length()) return "The index is greater than the length of the string";
            if(l.length()>1 && !l.substring(1).matches("^\\s{1,}$")){ 
                return "Please, enter one symbol";
            }
            if(Recursion.numLet(l.charAt(0), str, i)==0) return "This string doesn`t contain the letter \'"+
                    l.charAt(0)+"\'";
            return "The number of letters \'"+l.charAt(0)+"\' in the line - "+
                Recursion.numLet(l.charAt(0), str, i);
            
        }
        
    }
    
}
