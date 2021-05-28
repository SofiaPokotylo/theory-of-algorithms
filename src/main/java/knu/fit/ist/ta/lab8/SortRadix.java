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
public class SortRadix {
    /*
    private static int iter = 0;
    
    public static void setIter(int iter) {
    SortRadix.iter = 0;
    }*/
    
    /*private static List<Integer> listS = new ArrayList<>();
    
    public static void setListS() {
    listS.addAll(listOfSum());
    }*/
    
    private static int getMax(List<Integer> list){
            
        int sum = 0, m;
        int max = sumRec(list.get(0),sum,sum); 
                
	for (int i = 1; i < list.size(); ++i){
            sum = 0;
            m = sumRec(list.get(i),sum,sum); 
            if (m > max) max = m;
            ++Lab8Show.iter;
        }
	return max;
    }

    static void countSort(List<Integer> list, int exp){
        List<Integer> output = new ArrayList<>();
        output.addAll(list);
        List<Integer> count = new ArrayList<>();
	int i, sum, f, s;
        int j=0;
        
        for(int q = 0;q<10;++q){
            count.add(0);
        }
        
	for (i = 0; i < list.size(); ++i){ 
            if(list.get(i)<0) return;
            sum = 0;
            f = sumRec(list.get(i),j,sum);
            s = (f / exp)%10;
            j = count.get(s);
            j++;
            count.set(s, j);
            ++Lab8Show.iter;
        }
        
	for (i = 1; i < count.size(); ++i){
            j = count.get(i) + count.get(i-1);
            count.set(i, j);
        }
        
	for (i = list.size() - 1; i >= 0; --i) {
            
            sum = 0;
            f =sumRec(list.get(i),j,sum);
            j = count.get((f/exp)%10) - 1;
            output.set(j, list.get(i));
            j = count.get((f/exp)%10);
            --j;
             count.set((f/exp)%10, j);
            ++Lab8Show.iter;
             
	}
        
	for (i = 0; i < list.size(); i++){
            list.set(i, output.get(i));
            ++Lab8Show.iter;
        }
    }
    
    public static List<Integer> radixsort(List<Integer> list){
        
	int m = getMax(list);

	for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(list, exp);
        
        return list;
        
    }
    //491 + 268*list.size

    static void print(List<Integer> list, long time){
        
	for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
        System.out.println("time - "+time);
        System.out.println();
        System.out.println("number of iterations - "+Lab8Show.iter);
        System.out.println();
    }       
    
    
    
    private static int getMaxL(List<Integer> list, List<Integer> listS){
            
        int m;
        int max = listS.get(0); 
                
	for (int i = 1; i < list.size(); ++i){
            m = listS.get(i); 
            if (m > max) max = m;
            ++Lab8Show.iter;
        }
	return max;
    }

    static void countSortL(List<Integer> list, int exp, List<Integer> listSm){
        List<Integer> output = new ArrayList<>();
        List<Integer> outputS = new ArrayList<>();
        output.addAll(list);
        outputS.addAll(listSm);
        
        List<Integer> count = new ArrayList<>();
	int i, f, s, j;
        
        for(int q = 0;q<10;++q){
            count.add(0);
        }
        
	for (i = 0; i < list.size(); ++i){ 
            
            if(list.get(i)<0) return;
            
            f = listSm.get(i);
            s = (f / exp)%10;
            j = count.get(s);
            j++;
            count.set(s, j);
            ++Lab8Show.iter;
        }
        
	for (i = 1; i < count.size(); ++i){
            j = count.get(i) + count.get(i-1);
            count.set(i, j);
        }
        
	for (i = list.size() - 1; i >= 0; --i) {
            
            f = listSm.get(i);
            j = count.get((f/exp)%10) - 1;
            output.set(j, list.get(i));
            outputS.set(j, listSm.get(i));
            j = count.get((f/exp)%10);
            --j;
             count.set((f/exp)%10, j);
            ++Lab8Show.iter;
             
	}
        
	for (i = 0; i < list.size(); i++){
            list.set(i, output.get(i));
            listSm.set(i, outputS.get(i));
            ++Lab8Show.iter;
        }
    }
    
    public static List<Integer> radixsortL(List<Integer> list){
        
        List<Integer> listS = SumOfDigits.listOfSum();
        
	int m = getMaxL(list,listS);

	for (int exp = 1; m / exp > 0; exp *= 10){
            countSortL(list, exp, listS);
        }
        
        return list;
        
    }
    //491 + 268*list.size
    
    
}
