/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author macbook
 */
public class AdditionalTask {
    
    public static List<Integer> treetPostONotR() {
        
        List<Integer> list = new ArrayList<>();
        BinaryTree bt = SymmetricTree.startSymTree();
        
        Node node = bt.root;
        if(node==null) return list;
        List<Node> nodeLList = new ArrayList<>();
        List<Node> nodeList = new ArrayList<>();
        
        Node nodeR;
        Node nodeL;
        nodeList.add(node);
        for(int j=nodeList.size()-1;j>=0;){
            nodeL = nodeList.get(j);
            
            if(nodeL.left==null){
                nodeR = nodeL.right;
                if(nodeR!=null && !list.contains(nodeR.value)){
                    nodeList.add(nodeR);
                    j=nodeList.size()-1;
                }
                else {
                    list.add(nodeL.value);
                    nodeList.remove(j);//--j;
                    if(!nodeLList.isEmpty() && !nodeList.contains(nodeLList.get(nodeLList.size()-1)) && 
                            nodeLList.contains(nodeList.get(nodeList.size()-1))){
                        nodeList.add(nodeLList.get(nodeLList.size()-1));
                    }
                    if(!nodeLList.isEmpty() && nodeLList.contains(nodeList.get(nodeList.size()-1))){ 
                        nodeLList.remove(nodeLList.size()-1);
                    }    
                    j=nodeList.size()-1;
                }
            }
            else if(list.contains(nodeL.left.value) && list.contains(nodeL.right.value)){ 
                list.add(nodeL.value);
                nodeList.remove(j);//j--;
                if(!nodeLList.isEmpty() && !nodeList.contains(nodeLList.get(nodeLList.size()-1)) && 
                        nodeLList.contains(nodeList.get(nodeList.size()-1))){
                    nodeList.add(nodeLList.get(nodeLList.size()-1));
                }
                if(!nodeLList.isEmpty() && nodeLList.contains(nodeList.get(nodeList.size()-1))){
                    nodeLList.remove(nodeLList.size()-1);
                }       
                j=nodeList.size()-1;
            }
            else if(list.contains(nodeL.left.value)){ 
                if(nodeL.right!=null){
                    nodeList.add(nodeL.right);
                    j=nodeList.size()-1;
                }
                else {
                    list.add(nodeL.value);
                    nodeList.remove(j);//j--;
                    if(!nodeLList.isEmpty() && !nodeList.contains(nodeLList.get(nodeLList.size()-1)) && 
                            nodeLList.contains(nodeList.get(nodeList.size()-1))){
                        nodeList.add(nodeLList.get(nodeLList.size()-1));
                    }
                    if(!nodeLList.isEmpty() && nodeLList.contains(nodeList.get(nodeList.size()-1))){
                        nodeLList.remove(nodeLList.size()-1);
                    }
                    j=nodeList.size()-1;
                }
            }
            else{
                while (nodeL != null){
                    nodeLList.add(nodeL);
                    nodeL = nodeL.left;  
                }
                for(int i=nodeLList.size()-1;i>=0;){
                    nodeR = nodeLList.get(i).right;
                    if(nodeR!=null && !list.contains(nodeR.value)){
                        nodeList.add(nodeR);
                        j=nodeList.size()-1;
                        break;
                    }
                    else{
                        list.add(nodeLList.get(i).value);
                        if(nodeList.contains(nodeLList.get(i))){ 
                            nodeList.remove(j);
                            j = nodeList.size()-1;
                        }
                        nodeLList.remove(i);
                        i=nodeLList.size()-1;
                    }
                }
            }
        }
        return list;
    }
}





