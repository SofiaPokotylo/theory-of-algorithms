/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author macbook
 */

@Component
public class SortObj {
    
    public static ArrayList<ObjectFields> list = ListOfObj.listOfObj();
    
    public static ArrayList<Short> sortApproach1() {

        int s, t; //temp indexes
        
        ObjectFields m;

        List<Integer> result = new ArrayList<>();
        ArrayList<Short> strListObj = new ArrayList<>();
        //result.addAll(list);

        int n = list.size() - 1;
        int k = -1; //all unsorted

        //Put current minimal element into its place
        while (k != n) {
            s = k + 1;
            t = s;

            //find minimal elevent (index s) in index rang [k,n]
            while (t != n) {
                t++;
                if (list.get(t).getShr() < list.get(s).getShr()) {
                    s = t;
                }
            }

            // exchange elements with indexes s and k+1
            m = list.get(k + 1);
            list.set(k + 1, list.get(s));
            list.set(s, m);

            k++;
            strListObj.add(list.get(k).getShr());
        }
        
        return strListObj;
    }
    
    
    public static ArrayList<String> sortApproach12() {

        int s, t; //temp indexes
        
        ObjectFields m;

        List<Integer> result = new ArrayList<>();
        ArrayList<String> strListObj = new ArrayList<>();
        //result.addAll(list);

        int n = list.size() - 1;
        int k = -1; //all unsorted

        //Put current minimal element into its place
        while (k != n) {
            s = k + 1;
            t = s;

            //find minimal elevent (index s) in index rang [k,n]
            while (t != n) {
                t++;
                if (list.get(t).getStr().compareTo(list.get(s).getStr())<0) {
                    s = t;
                }
            }

            // exchange elements with indexes s and k+1
            m = list.get(k + 1);
            list.set(k + 1, list.get(s));
            list.set(s, m);

            k++;
            strListObj.add(list.get(k).getStr());
        }
        
        return strListObj;
    }
    
    public static ArrayList<Short> sortApproach2() {

        int s, t; //temp indexes
        
        ObjectFields m;
        
        ArrayList<Short> strListObj = new ArrayList<>();

        int n = list.size() - 1;
        int k = 0;

        while (k != n) {
            t = k + 1;

            while (t > 0 && list.get(t).getShr() < list.get(t - 1).getShr()) {
                m = list.get(t);
                list.set(t, list.get(t - 1));
                list.set(t - 1, m);
                t--;
            }

            k++;

        }
        k=0;
        while(k != n) {
            
            strListObj.add(list.get(k).getShr());
            
            k++;
            
        }

        return strListObj;
    }

    
    public static String sortApproach13(ArrayList<String> listStr, ArrayList<Short> listShr) {

        int s, t; //temp indexes
        
        ObjectFields m;

        List<Integer> result = new ArrayList<>();
        ArrayList<String> strListObj = new ArrayList<>();
        //result.addAll(list);

        int n = list.size() - 1;
        int k = -1; //all unsorted
        int p = 25;
        
        int r = 24237;
        
        for(int i=0,o=0,a=0,w=0;i<r;++i){
            
            /*for(int j=0;j<r;++j){
                
                if(list.get(i).getStr().equals(listStr.get(j))){ 
                    o=j;
                    break;list.
                }
                
            }
            
            for(int j=0;j<r;++j){
                
                if(list.get(i).getShr()==listShr.get(j)){ 
                    a=j;
                    break;
                }
                
            }
            
            w=o+a;
                    
            list.get(i).setIndex(w);*/
            list.get(i).setIndex(listStr.indexOf(list.get(i).getStr())+listShr.indexOf(list.get(i).getShr()));
            //list.get(i).setIndex(listStr.indexOf(list.get(i).getStr())+listShr.indexOf(list.get(i).getShr()));
            
        }

        //Put current minimal element into its place
        while (k != n) {
            s = k + 1;
            t = s;

            //find minimal elevent (index s) in index rang [k,n]
            while (t != n) {
                t++;
                if (list.get(t).getIndex()<list.get(s).getIndex()) {
                    s = t;
                }
            }

            // exchange elements with indexes s and k+1
            m = list.get(k + 1);
            list.set(k + 1, list.get(s));
            list.set(s, m);

            k++;
            strListObj.add(list.get(k).getStr()+" - "+list.get(k).getShr()+" - "+list.get(k).getIndex());
        }
        
        return strListObj.toString();
    }
    
    
}
