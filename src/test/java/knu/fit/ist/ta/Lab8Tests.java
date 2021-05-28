/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import knu.fit.ist.ta.lab8.QuickSort;
import knu.fit.ist.ta.lab8.SortRadix;
import knu.fit.ist.ta.lab8.SumOfDigits;
import knu.fit.ist.ta.lab8.Tickets;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author macbook
 */

@SpringBootTest
public class Lab8Tests {

    @Test
    
    void test1(){
        
        List<Integer> list = new ArrayList<>();
        
        Tickets.setTickets(list);
        
        assertEquals(Arrays.asList(),Tickets.winTickets());
        
    }
    
    @Test 
    
    void test2(){
        Tickets.setWinTickets(Arrays.asList(4298, 5943, 6945, 3214, 5431));
        List<Integer> list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(3214, 5431, 5943, 4298, 6945),SortRadix.radixsortL(list));
        
        Tickets.setWinTickets(Arrays.asList(1482, 4343, 4545, 3234, 7241));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(3234, 4343, 7241, 1482, 4545),SortRadix.radixsortL(list));
        
        Tickets.setWinTickets(Arrays.asList(1204, 4352, 2359));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(1204, 4352, 2359),SortRadix.radixsortL(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, 0000));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(0, 5943, 4298),SortRadix.radixsortL(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, -321));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(4298, 5943, -321),SortRadix.radixsortL(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 59, 5, 3214, 543));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(5, 3214, 543, 59, 4298),SortRadix.radixsortL(list));
        
        Tickets.setWinTickets(Arrays.asList(298, 0, 6945, 0, 5431));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(0, 0, 5431, 298, 6945),SortRadix.radixsortL(list)); 
        
    }
    
    @Test
    
    void test3(){
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, 6945, 3214, 5431));
        List<Integer> list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(3214, 5431, 5943, 4298, 6945),SortRadix.radixsort(list));
        
        Tickets.setWinTickets(Arrays.asList(1482, 4343, 4545, 3234, 7241));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(3234, 4343, 7241, 1482, 4545),SortRadix.radixsort(list));
        
        Tickets.setWinTickets(Arrays.asList(1204, 4352, 2359));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(1204, 4352, 2359),SortRadix.radixsort(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, 0000));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(0, 5943, 4298),SortRadix.radixsort(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, -321));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(4298, 5943, -321),SortRadix.radixsort(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 59, 5, 3214, 543));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(5, 3214, 543, 59, 4298),SortRadix.radixsort(list));
        
        Tickets.setWinTickets(Arrays.asList(298, 0, 6945, 0, 5431));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(0, 0, 5431, 298, 6945),SortRadix.radixsort(list)); 
    
    }
    
    @Test
    
    void test4(){
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, 6945, 3214, 5431));
        List<Integer> list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(3214, 5431, 5943, 4298, 6945),QuickSort.quickSortA(list));
        
        Tickets.setWinTickets(Arrays.asList(1482, 4343, 4545, 3234, 7241));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(3234, 7241, 4343, 1482, 4545),QuickSort.quickSortA(list));
        
        Tickets.setWinTickets(Arrays.asList(1204, 4352, 2359));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(1204, 4352, 2359),QuickSort.quickSortA(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, 0000));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(0, 5943, 4298),QuickSort.quickSortA(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, -321));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(-321, 5943, 4298),QuickSort.quickSortA(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 59, 5, 3214, 543));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(5, 3214, 543, 59, 4298),QuickSort.quickSortA(list));
        
        Tickets.setWinTickets(Arrays.asList(298, 0, 6945, 0, 5431));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(0, 0, 5431, 298, 6945),QuickSort.quickSortA(list)); 
    
    }
    
    @Test
    
    void test5(){
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, 6945, 3214, 5431));
        List<Integer> list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(3214, 5431, 5943, 4298, 6945),QuickSort.quickSortLA(list));
        
        Tickets.setWinTickets(Arrays.asList(1482, 4343, 4545, 3234, 7241));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(3234, 7241, 4343, 1482, 4545),QuickSort.quickSortLA(list));
        
        Tickets.setWinTickets(Arrays.asList(1204, 4352, 2359));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(1204, 4352, 2359),QuickSort.quickSortLA(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, 0000));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(0, 5943, 4298),QuickSort.quickSortLA(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 5943, -321));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(-321, 5943, 4298),QuickSort.quickSortLA(list));
        
        Tickets.setWinTickets(Arrays.asList(4298, 59, 5, 3214, 543));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(5, 3214, 543, 59, 4298),QuickSort.quickSortLA(list));
        
        Tickets.setWinTickets(Arrays.asList(298, 0, 6945, 0, 5431));
        list = Tickets.winTickets;
        
        assertEquals(Arrays.asList(0, 0, 5431, 298, 6945),QuickSort.quickSortLA(list));
    
    }
    
    @Test
    
    void test6(){
        
        List<Integer> list = Arrays.asList(358, 5343, 4506);
        Tickets.setWinTickets(list);
        assertEquals(Arrays.asList(16, 15, 15),SumOfDigits.listOfSum());
        
        list = Arrays.asList(0, -2, 34, -45);
        Tickets.setWinTickets(list);
        assertEquals(Arrays.asList(0, -2, 7, -9),SumOfDigits.listOfSum());
        
    }
    
}
