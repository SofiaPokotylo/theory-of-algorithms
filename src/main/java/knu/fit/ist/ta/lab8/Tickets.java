/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author macbook
 */
public class Tickets {
    
    public static List<Integer> tickets = new ArrayList<>();

    public static void setTickets(List<Integer> ticketsA) {
        Tickets.tickets = ticketsA;
    }
    
    public static int numT = 100;

    public static void setNumT(int numT) {
        Tickets.numT = numT;
    }
    
    private static int seed = 5;

    public static void setSeed(int s) {
        Tickets.seed = s;
    }
    
    public static List<Integer> tickets(){
        
        Random rnd = new Random(seed);
        List<Integer> list = new ArrayList<>();
        int min = 1000, max = 10000; 
        int num = rnd.nextInt(max-min)+min;
        for (int n = numT, i=0;i<n;++i){
            
           while(list.contains(num)){ num = rnd.nextInt(max-min)+min;}
           list.add(num);
            
        }
        
        return list;//O(nk)
    }
    
    public static List<Integer> winTickets = new ArrayList<>();

    public static void setWinTickets(List<Integer> winTick) {
        Tickets.winTickets = winTick;
    }
    
    public static List<Integer> winTickets(){
        
        List<Integer> list = tickets;
        
        for(int c = 0,f,t,d=2; c < list.size(); ++c){
            
            f = list.get(c)%10;
            t = (list.get(c)/100)%10;
            if(Math.abs(f-t)!=d){ 
                list.remove(c);
                --c;
            }
            
        }
        return list;
    }
    
}