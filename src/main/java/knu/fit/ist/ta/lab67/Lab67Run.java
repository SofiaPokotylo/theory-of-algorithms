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
public class Lab67Run {
    
    private static long time;
    public static void main(String[] args) {
        String text = "asdrb sebsa tavencnca";
        //public int numLet(char d, String symb, int ind){
        System.out.println(Recursion.numLet('a',text,0));
        System.out.println(Recursion.numLet('b',text,0));
        System.out.println(Recursion.numLet('a',text,3));
        
    }
    
}
