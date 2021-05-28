/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;


/**
 *
 * @author macbook
 */
public class BinaryTreeS {
    
    public static String tree(Node root) {
        String str = "";
        Stack stack = new Stack();
        stack.push(root);
        int i = SortClearList.sortClearValues().size();
        boolean isRowEmpty = false;
        while(isRowEmpty==false){
            
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<i; ++j){ str = str.concat(" "); }
            while(stack.isEmpty()==false){
                
                Node temp = (Node) stack.pop();
                if(temp!=null){
                    
                    str = str.concat(" "+temp.value);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if(temp.left!=null || temp.right!=null) isRowEmpty = false;
                    
                }
                else{
                    
                    
                    localStack.push(null);
                    localStack.push(null);
                    
                }
                for(int j=0; j<i*2-2; ++j) str = str.concat(" ");
            }
            
            str = str.concat("__");
            i /=2;
            while(localStack.isEmpty()==false) stack.push(localStack.pop());
        }
        
        return str;
    }
    
    public static String traverseInOrder(Node node, String str) {
        if (node != null) {
            str = traverseInOrder(node.left,str);
            str = str.concat(" " + node.value);
            str = traverseInOrder(node.right,str);
        }
        return str;
    }
    
    public static String traverseInOrderS(Node node) {
        String str = new String();
        if(node==null) return str;
        return traverseInOrder(node, str).substring(1);
    }
    
    public static String traversePreOrder(Node node, String str) {
        if (node != null) {
            str = str.concat(" " + node.value);
            str = traversePreOrder(node.left,str);
            str = traversePreOrder(node.right,str);
        }
        return str;
    }
    
    public static String traversePreOrderS(Node node) {
        String str = new String();
        if(node==null) return str;
        return traversePreOrder(node, str).substring(1);
    }
    
    public static String traversePostOrder(Node node, String str) {
        if (node != null) {
            str = traversePostOrder(node.left,str);
            str = traversePostOrder(node.right,str);
            str = str.concat(" " + node.value);
        }
        return str;
    }
    
    public static String traversePostOrderS(Node node) {
        String str = new String();
        if(node==null) return str;
        return traversePostOrder(node, str).substring(1);
    }

    public static String traverseLevelOrder(Node root) {
        
        String str = new String();

        if (root == null) {
            return str;
        }
        
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        
        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            str = str.concat(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        return str.substring(1);
    }
    
}
