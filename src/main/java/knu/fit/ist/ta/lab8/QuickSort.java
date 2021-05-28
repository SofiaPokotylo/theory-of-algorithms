/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.util.ArrayList;
import java.util.List;
import static knu.fit.ist.ta.lab8.SumOfDigits.sumRec;

/**
 *
 * @author macbook
 */

public class QuickSort {
    
    static void swap(List<Integer> list, int i, int j){
	int temp = list.get(i); 
        list.set(i, list.get(j)); 
        list.set(j, temp); 
    }

    static int partition(List<Integer> list, int low, int high){
        int sum=0, k;
	int pivot = sumRec(list.get(high),sum,sum);
	
	int i = (low - 1); 

	for(int j = low; j <= high - 1; j++){
            sum=0;
            k = sumRec(list.get(j),sum,sum); 
            if (k < pivot){
		i++; 
		swap(list, i, j);
            }
            ++Lab8Show.iter;
	}
	swap(list, i + 1, high);
	return (i + 1);
    }

    static void quickSort(List<Integer> list, int low, int high){
	if (low < high){
		int pi = partition(list, low, high); 
		quickSort(list, low, pi - 1); 
		quickSort(list, pi + 1, high); 
	}
    }
    
    public static List<Integer> quickSortA(List<Integer> list){
	int low = 0;
        int high = list.size()-1;
        quickSort(list, low, high);
        return list;
    }
    
    
    static int partitionL(List<Integer> list, int low, int high, List<Integer> listS){
        int k;
	int pivot = listS.get(high);
	
	int i = (low - 1); 

	for(int j = low; j <= high - 1; j++){
            k = listS.get(j); 
            if (k < pivot){
		i++; 
		swap(list, i, j);
                swap(listS, i, j);
            }
            ++Lab8Show.iter;
	}
	swap(list, i + 1, high);
        swap(listS, i + 1, high);
	return (i + 1);
    }
    
    
    static void quickSortL(List<Integer> list, int low, int high, List<Integer> listS){
	if (low < high){
		int pi = partitionL(list, low, high, listS); 
		quickSortL(list, low, pi - 1, listS); 
		quickSortL(list, pi + 1, high, listS); 
	}
    }
    
    public static List<Integer> quickSortLA(List<Integer> list){
	int low = 0;
        int high = list.size()-1;
        List<Integer> listS = SumOfDigits.listOfSum();
        quickSortL(list, low, high, listS);
        return list;
    }

    static void printArray(List<Integer> list, int size, long time){
	for(int i = 0; i < size; i++)
            System.out.print(list.get(i) + " ");
        
        System.out.println();
        System.out.println("time - "+time);
	System.out.println();
        System.out.println("number of iterations - "+Lab8Show.iter);
        System.out.println();
    }        
}
