/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;


import knu.fit.ist.ta.lab3.Task10;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static java.lang.Float.NaN;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author macbook
 */
@SpringBootTest
public class Lab3Tests {
    @Test
        void test1(){
            
            int[] a = {17,14,3,6,19,1};
            int[] b = {19,17,14};
            int[] c = {1,2,3,4,5,6,7};
            
            assertArrayEquals(b,Task10.find3Biggest(a,6));
            
            assertArrayEquals(c,Task10.arrayNumbers(7));
            
            assertEquals("19, 17, 14",Task10.arrayPrint(Task10.find3Biggest(a,6)));
            
        }
}
