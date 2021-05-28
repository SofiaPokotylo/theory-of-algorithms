/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

/**
 *
 * @author macbook
 */

@Service
public class Lab8Show {
    
    public static int iter = 0;
    
    private long time = 0;

    public static void cleanIter() {
        Lab8Show.iter = 0;
    }
    
    Random rnd = new Random();
    
    public String winTicketsN(String strI){
        
        if(strI.isEmpty()){ 
            
            int seed = rnd.nextInt();
            
            Tickets.setSeed(seed);
            
            Tickets.setTickets(Tickets.tickets());
            
            time = System.currentTimeMillis();
            Tickets.setWinTickets(Tickets.winTickets());
            time = System.currentTimeMillis() - time;
            
            if(Tickets.winTickets.isEmpty()) return "There is no winning ticket";
             
            return "The number of tickets - "+Tickets.numT+" ___ The number of winning tickets - "+
                Tickets.winTickets.size()+
            " ___ Time of iterative method of compiling a list of winning tickets - "+time+
            " ms ___ Time complexity - O(n)";
            
        }
        
        int seed = rnd.nextInt();
        
        int i = Integer.parseInt(strI);

        if(i<=0) return "The nubmer of tickets must be >0";
        
        Tickets.setSeed(seed);
            
        Tickets.setNumT(i);

        Tickets.setTickets(Tickets.tickets());
            
        time = System.currentTimeMillis();
        Tickets.setWinTickets(Tickets.winTickets());
        time = System.currentTimeMillis() - time;
            
        if(Tickets.winTickets.isEmpty()) return "There is no winning ticket";
                
        else return "The number of tickets - "+Tickets.numT+" ___ The number of winning tickets - "+
                Tickets.winTickets.size()+
            " ___ Time of iterative method of compiling a list of winning tickets - "+time+
            " ms ___ Time complexity - O(n)";
    }
    
    public String radixL(){
        
        iter = 0;
        
        List<Integer> list = Tickets.winTickets; 
        List<Integer> listR; 
        
        //SortRadix.setListS();
        time = System.currentTimeMillis();
        listR = SortRadix.radixsortL(list);
        time = System.currentTimeMillis() - time;
        
        return "Time - "+time+" ms ___ Iterations - "+iter+" ___ Time compexity - O(nk)"+
                " ___ The list of winning tickets: "+listR;
        
    }
    
    public String radix(){
        
        iter = 0;
        
        List<Integer> list = Tickets.winTickets;
        List<Integer> listR; 
        
        time = System.currentTimeMillis();
        listR = SortRadix.radixsort(list);
        time = System.currentTimeMillis() - time;
        
        return "Time - "+time+" ms ___ Iterations - "+ iter+" ___ Time compexity - O(nkt)"+
                " ___ The list of winning tickets: "+listR;
        
    }
 
    public String quickL(){
        
        iter = 0;
        
        List<Integer> list = Tickets.winTickets;
        List<Integer> listR;
        
        int n = Tickets.winTickets.size();
        
        time = System.currentTimeMillis();
        //QuickSort.setListS();
        listR = QuickSort.quickSortLA(list);
        time = System.currentTimeMillis() - time;
        
        return "Time - "+time+" ms ___ Iterations - "+iter+" ___ Time compexity - O(nlog(n))"+
                " ___ The list of winning tickets: "+listR;
        
    }
    
    public String quick(){
        
        iter = 0;
        
        List<Integer> list = Tickets.winTickets;
        List<Integer> listR;
        
        int n = Tickets.winTickets.size();
        
        time = System.currentTimeMillis();
        listR = QuickSort.quickSortA(list);
        time = System.currentTimeMillis() - time;
        
        return "Time - "+time+" ms ___ Iterations - "+iter+
                " ___ Time compexity - O(nklog(n))"+" ___ The list of winning tickets: "+listR;
        
    }
    
    public String jackpot(String strI, String strJ){
        
        if(strI.isEmpty() && strJ.isEmpty()){
            
            List<Integer> list = Tickets.winTickets;
            
            int n = list.size();
            
            SortRadix.radixsortL(list);
            
            List<Integer> listQ = Tickets.winTickets;
            
            QuickSort.quickSortLA(listQ);
            
            if(n<Jackpot.getNumJ()) return "The number of jackpot tickets is too large";
            
            return "Radix: "+Jackpot.winJackpot(list)+" ___ Quick: "+Jackpot.winJackpot(listQ);   
            
        }
        
        if(strJ.isEmpty()){
        
            int i = Integer.parseInt(strI);

            if(i<=0) return "...";
            
            List<Integer> list = Tickets.winTickets;
            
            int n = list.size();
            
            SortRadix.radixsortL(list);
            
            List<Integer> listQ = Tickets.winTickets;
            
            QuickSort.quickSortLA(listQ);
            
            if(n<Jackpot.getNumJ()) return "The number of jackpot tickets is too large";
            
            return "Radix: "+Jackpot.winJackpot(list)+" ___ Quick: "+Jackpot.winJackpot(listQ);
            
        }
        
        if(strI.isEmpty()){
            
            int i = Integer.parseInt(strJ);

            if(i<=0) return "...";
            
            List<Integer> list = new ArrayList<>();
            
            list.addAll(Tickets.winTickets);
            
            int n = list.size();
            
            SortRadix.radixsortL(list);
            
            List<Integer> listQ = new ArrayList<>();
            
            listQ.addAll(Tickets.winTickets);
            
            QuickSort.quickSortLA(listQ);
            
            Jackpot.setNumJ(i);
            
            if(n<i) return "The number of jackpot tickets is too large";
            
            return "Radix: "+Jackpot.winJackpot(list)+" ___ Quick: "+Jackpot.winJackpot(listQ);
            
        }
        
        int i = Integer.parseInt(strI);
        int j = Integer.parseInt(strJ);

            if(i<=0) return "...";
            
             if(j<=0) return "The number of jackpot tickets must be >0";
            
            List<Integer> list = Tickets.winTickets;
            
            int n = list.size();
            
            SortRadix.radixsortL(list);
            
            List<Integer> listQ = Tickets.winTickets;
            
            QuickSort.quickSortLA(listQ);
            
            Jackpot.setNumJ(j);
            
            if(n<j) return "The number of jackpot tickets is too large";
            
            return "Radix: "+Jackpot.winJackpot(list)+" ___ Quick: "+Jackpot.winJackpot(listQ);
        
    }
    
}