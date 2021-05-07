/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.util.Arrays;
import knu.fit.ist.ta.lab5.SortSearch;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author macbook
 */
@SpringBootTest
public class Lab5Tests {
    @Test
        void test1(){
            
            String a = "This ? is a text$ FoR testing, {the} first   method!";
            String b = "these are words for the second and third methods";
            
            assertEquals(Arrays.asList("and","are","for","methods","second","the",
                    "these","third","words"),SortSearch.sortApproach3(b));
            
        }
}
