/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author macbook
 */
public class Lab67Run {
    
    private static long time;
    public static void main(String[] args) {
        String text = "asdrb sebsa taven%cn*ca Bdn3aB5fA";
        //public int numLet(char d, String symb, int ind){
        System.out.println(Recursion.numLet('a',text,0));
        System.out.println(Recursion.numLet('b',text,0));
        System.out.println(Recursion.numLet('3',text,0));
        System.out.println(Recursion.numLet('5',text,0));
        System.out.println(Recursion.numLet('*',text,0));
        System.out.println(Recursion.numLet('a',text,3));
        System.out.println(Recursion.numLet('%',text,0));
        text = "";
        System.out.println(Recursion.numLet('a',text,0));
        
        BinaryTree t = SymmetricTree.startSymTree();
        t.traversePreOrder(t.root);
        System.out.println();
        t.traverseLevelOrder(t.root);
        System.out.println();
        t.traverseInOrder(t.root);
        System.out.println();
        System.out.println("PostOrder");
        t.traversePostOrder(t.root);
        System.out.println();
        
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,6,2,8,13,9,54,21,18,321,11,83,121,606,92,19,4,1,7,12,37));
        SortClearList.setList(list);
        BinaryTree bt = SymmetricTree.startSymTree();
        BinaryTree btNS = new BinaryTree();
        for(int i=0;i<list.size();++i){
            btNS.add(list.get(i));
        }
        
        bt.traverseLevelOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.println("PostOrder");
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println(bt.containsNode(0));
        System.out.println();
        System.out.println(bt.findSmallestValue(bt.root));
        System.out.println();
        bt.delete(6);
        bt.traverseLevelOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println(bt.findLargestValue(bt.root));
        
        /*System.out.println();
        System.out.println("Monster");
        //bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println();
        bt.traversePostOrder(btNS.root);
        System.out.println();*/
        /*List<Integer> monster = new ArrayList<>();
        monster = AdditionalTask.traversePostOrder(bt.root);
        for(int i=0;i<monster.size();++i){
        
        System.out.println(list.get(i));
        
        }*/
    }
    
}
