/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import knu.fit.ist.ta.lab67.AdditionalTask;
import knu.fit.ist.ta.lab67.BinaryTree;
import knu.fit.ist.ta.lab67.BinaryTreeS;
import knu.fit.ist.ta.lab67.Recursion;
import knu.fit.ist.ta.lab67.SortClearList;
import knu.fit.ist.ta.lab67.SymmetricTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author macbook
 */

@SpringBootTest
public class Lab67Tests {
    
    @Test
                
        void test1(){
            
            BinaryTree bt = SymmetricTree.startSymTree();
            
            assertEquals("6 4 2 5 9 7 8 10",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 4 5 6 7 8 9 10",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 5 4 8 7 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 7 10 8",BinaryTreeS.traverseLevelOrder(bt.root));
            
            bt.add(4);
            
            assertEquals("6 4 2 5 9 7 8 10",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 4 5 6 7 8 9 10",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 5 4 8 7 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 7 10 8",BinaryTreeS.traverseLevelOrder(bt.root));
            
            bt.add(12);
            
            assertEquals("6 4 2 5 9 7 8 10 12",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 4 5 6 7 8 9 10 12",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 5 4 8 7 12 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 7 10 8 12",BinaryTreeS.traverseLevelOrder(bt.root));
            
            bt.add(-1);
            
            assertEquals("6 4 2 -1 5 9 7 8 10 12",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("-1 2 4 5 6 7 8 9 10 12",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("-1 2 5 4 8 7 12 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 7 10 -1 8 12",BinaryTreeS.traverseLevelOrder(bt.root));
            
            bt.delete(-1);
            
            bt.add(0);
            
            assertEquals("6 4 2 0 5 9 7 8 10 12",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("0 2 4 5 6 7 8 9 10 12",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("0 2 5 4 8 7 12 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 7 10 0 8 12",BinaryTreeS.traverseLevelOrder(bt.root));
            
            bt.delete(0);
            
            assertTrue(bt.containsNode(5));
            assertFalse(bt.containsNode(1));
            
            bt.delete(12);
            
            assertEquals("6 4 2 5 9 7 8 10",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 4 5 6 7 8 9 10",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 5 4 8 7 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 7 10 8",BinaryTreeS.traverseLevelOrder(bt.root));
            
            bt.delete(1);
            
            assertEquals("6 4 2 5 9 7 8 10",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 4 5 6 7 8 9 10",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 5 4 8 7 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 7 10 8",BinaryTreeS.traverseLevelOrder(bt.root));
            
            bt.delete(7);
            
            assertEquals("6 4 2 5 9 8 10",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 4 5 6 8 9 10",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 5 4 8 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 8 10",BinaryTreeS.traverseLevelOrder(bt.root));
            
            bt.delete(6);
            
            assertEquals("8 4 2 5 9 10",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 4 5 8 9 10",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 5 4 10 9 8",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("8 4 9 2 5 10",BinaryTreeS.traverseLevelOrder(bt.root));
            
            assertEquals(2,bt.findSmallestValue(bt.root));
            assertEquals(10,bt.findLargestValue(bt.root));
            
            
            List<Integer> list = Arrays.asList(5,34,7,9,2,13,62);
            SortClearList.setList(list);
            
            bt = SymmetricTree.startSymTree();
            
            assertEquals("9 5 2 7 34 13 62",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 5 7 9 13 34 62",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 7 5 13 62 34 9",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("9 5 34 2 7 13 62",BinaryTreeS.traverseLevelOrder(bt.root));
            
            List<Integer> emptyList = new ArrayList<>();
            SortClearList.setList(emptyList);
            
            bt = SymmetricTree.startSymTree();
            
            assertEquals("6 4 2 5 9 7 8 10",BinaryTreeS.traversePreOrderS(bt.root));
            assertEquals("2 4 5 6 7 8 9 10",BinaryTreeS.traverseInOrderS(bt.root));
            assertEquals("2 5 4 8 7 10 9 6",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals("6 4 9 2 5 7 10 8",BinaryTreeS.traverseLevelOrder(bt.root));

        }
        
    @Test
    
        void test2(){
            
            List<Integer> list = Arrays.asList(4,8,23,7,1,9,75);
            
            SortClearList.setList(list);
            
            assertEquals(Arrays.asList(1,4,7,8,9,23,75),SortClearList.sortClearValues());
            
            List<Integer> emptyList = new ArrayList<>();
            
            SortClearList.setList(emptyList);
            
            assertEquals(Arrays.asList(2,4,5,6,7,8,9,10),SortClearList.sortClearValues());
            
        }
        
    @Test
    
        void test3(){
            
            assertEquals(4,Recursion.numLet('d', "ifejf ndcf orkDm IEnfsdde", 0));
            assertEquals(0,Recursion.numLet('d', "ifejf ncf orkm IEnfse", 0));
            assertEquals(2,Recursion.numLet('d', "ifejf ndcf orkDm IEnfse", 0));
            assertEquals(0,Recursion.numLet('d', "ifejf ndcf orkDm IEnfse", 15));
            assertEquals(0,Recursion.numLet('d', "ifejf ndcf orkDm IEnfse", 45));
            assertEquals(2,Recursion.numLet('d', "ifejf ndcf orkDm IEnfse", -5));
            assertEquals(4,Recursion.numLet('f', "ifejf ndcf orkDm IEnfse", 0));
            assertEquals(0,Recursion.numLet('p', "ifejf ndcf orkDm IEnfse", 15));
            assertEquals(0,Recursion.numLet('d', "", 15));
            
        }
        
    @Test
    
        void test4(){
            
            List<Integer> list = Arrays.asList(5,34,7,9,2,13,62);
            SortClearList.setList(list);
            
            BinaryTree bt = SymmetricTree.startSymTree();
            
            assertEquals("2 7 5 13 62 34 9",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals(Arrays.asList(2,7,5,13,62,34,9),AdditionalTask.treetPostONotR());
            
            list = Arrays.asList(5,34,7,9,2,13,62,348,1,54,954,3);
            SortClearList.setList(list);
            bt = SymmetricTree.startSymTree();
            
            assertEquals("1 2 5 7 3 13 54 34 954 348 62 9",BinaryTreeS.traversePostOrderS(bt.root));
            assertEquals(Arrays.asList(1,2,5,7,3,13,54,34,954,348,62,9),AdditionalTask.treetPostONotR());
            
            List<Integer> emptyList = new ArrayList<>();
            
            SortClearList.setList(emptyList);
            
            assertEquals(Arrays.asList(2,5,4,8,7,10,9,6),AdditionalTask.treetPostONotR());
            
            List<Integer> list1 = Arrays.asList(2);
            
            SortClearList.setList(list1);
             
            assertEquals(Arrays.asList(2),AdditionalTask.treetPostONotR());
            
            List<Integer> list12 = Arrays.asList(2,1);
            
            SortClearList.setList(list12);
            
            assertEquals(Arrays.asList(1,2),AdditionalTask.treetPostONotR());
            
        }
    
}
