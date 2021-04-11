/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import static java.lang.Float.NaN;
import knu.fit.ist.ta.lab2.MyEquation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author macbook
 */
@SpringBootTest
public class Lab2Tests {
    
        @Test
        void test1(){
            assertEquals(0.943,MyEquation.solve(1),0.01);
            assertEquals(0,MyEquation.solve(0),0.01);
            assertEquals(-0.36,MyEquation.solve(2),0.01);
            assertEquals(-0.015,MyEquation.solve(11),0.01);
            assertEquals(NaN,MyEquation.solve(-1));
            assertEquals(Integer.MAX_VALUE,MyEquation.solve((float) 1.2874342));
            
        }
    
}
