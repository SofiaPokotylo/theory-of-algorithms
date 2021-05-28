/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static knu.fit.ist.ta.lab8.Jackpot.winJackpot;
import static knu.fit.ist.ta.lab8.QuickSort.printArray;
import static knu.fit.ist.ta.lab8.QuickSort.quickSort;
import static knu.fit.ist.ta.lab8.QuickSort.quickSortL;
import static knu.fit.ist.ta.lab8.SortRadix.print;
import static knu.fit.ist.ta.lab8.SortRadix.radixsort;
import static knu.fit.ist.ta.lab8.SortRadix.radixsortL;
/**
 *
 * @author macbook
 */
public class AlgorythmsRun {
    
    static long time = System.currentTimeMillis();
    
    public static void main(String[] args){
	//int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        Tickets.tickets();
        //Tickets.winTickets();
        time = System.currentTimeMillis();
        Tickets.winTickets();
        List<Integer> list = Tickets.winTickets;
        time = System.currentTimeMillis() - time;
        System.out.println();
        System.out.println("iterations time - "+time);
        System.out.println();
        //System.out.println("number of iterations - "+Tickets.iter);
        System.out.println();
        
        //time = System.currentTimeMillis();
        //List<Integer> listR = Tickets.winTicketsR();
        //time = System.currentTimeMillis() - time;
        System.out.println();
        System.out.println("recursion time - "+time);
        System.out.println();
        //System.out.println("number of iterations in rec - "+Tickets.rec);
        System.out.println();
        
        List<Integer> list1 = Arrays.asList(10,7,8,9,1,5);
        
	int n = list.size();
        
	List<Integer> list2 = new ArrayList<>();
        
        list2.addAll(list);
        
        System.out.println("Number of elements - "+list.size());
        System.out.println();
        
        time = System.currentTimeMillis();
	quickSort(list2, 0, n - 1);
        time = System.currentTimeMillis() - time;
	System.out.println("Quick Sort: ");
	printArray(list2, n,time);
        System.out.println();
        System.out.println("List of Jackpot tickets");
        System.out.println();
        for(int i =0; i<winJackpot(list2).size();++i){
            System.out.print(winJackpot(list2).get(i)+"   ");
        }
        System.out.println();
        
        List<Integer> list3 = new ArrayList<>();
        
        list3.addAll(list);
        
        //QuickSort.setListS();
        time = System.currentTimeMillis();
	//quickSortL(list3, 0, n - 1);
        time = System.currentTimeMillis() - time;
	System.out.println("Quick Sort list: ");
	printArray(list3, n,time);
        System.out.println();
        
        List<Integer> list4 = new ArrayList<>();
        
        list4.addAll(list);
        
        System.out.println();
        System.out.println("Radix Sort: ");
        time = System.currentTimeMillis();
        radixsort(list4);
        time = System.currentTimeMillis() - time;
	print(list4,time);
        
        
        System.out.println();
        //SortRadix.setListS();
        System.out.println("Radix Sort list: ");
        time = System.currentTimeMillis();
        radixsortL(list);
        time = System.currentTimeMillis() - time;
	print(list,time);
        
        
        System.out.println();
        System.out.println("List of Jackpot tickets");
        System.out.println();
        for(int i =0; i<winJackpot(list).size();++i){
            System.out.print(winJackpot(list).get(i)+"   ");
        }
        System.out.println();
        
    }   
}
