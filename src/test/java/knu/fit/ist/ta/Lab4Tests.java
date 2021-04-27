/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;


import knu.fit.ist.ta.lab4.Text;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static java.lang.Float.NaN;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author macbook
 */
@SpringBootTest
public class Lab4Tests {
    @Test
        void test1(){
            
            String a = "This ? is a text$ FoR testing, {the} first   method!";
            String b = "these are words for the second and third methods";
            String c = "these are words are these these for the words the fourth"
                    + " method fourth are";
            String d = "hello these are words for the sixth method the the are "
                    + "hello these hello method often not often often often hard "
                    + "these hard hard easy often the hard";
            String u = "unique utility method word just sport skiing consumer must";
            String e = "four summer sea jump computer internet five more vector line";
            String f = "winner window find trainer raining mind wind swimming manner";
            
            assertEquals("this text for testing first method",Text.cleanText(a));
            
            assertEquals(Arrays.asList("these","are","words", "for", "the", 
                    "second", "and", "third", "methods"),Text.getList(b));
            
            assertEquals(9,Text.sizeOfList(b));
            
            assertEquals(14,Text.sizeOfList(c));
            
            assertEquals(7,Text.sizeOfSet(c));
            
            assertEquals(Arrays.asList("often - 5", "the - 4", "hard - 4", "hello - 3", 
                    "these - 3", "are - 2", "method - 2"),Text.first7Often(d));
            
            assertEquals(4,Text.notU(u));
            
            assertEquals(5,Text.words4Letters(e));
            
            assertEquals(Arrays.asList("ind - 4", "win - 3", "ner - 3", "nne - 2", 
                     "rai - 2", "ain - 2"),Text.seq3Let(f));
            
        }
}

