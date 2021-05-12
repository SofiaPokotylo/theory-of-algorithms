/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 *
 * @author macbook
 */

@Component
public class SearchWord {
    
    public static List<String> mergeLists(List<String> inputList1, List<String> inputList2) {
        List<String> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < inputList1.size() || i2 < inputList2.size()) {
            if (!(i1 < inputList1.size())) {
                result.add(inputList2.get(i2));
                i2++;

            } else if (!(i2 < inputList2.size())) {
                result.add(inputList1.get(i1));
                i1++;
            } else {
                if (inputList1.get(i1).compareTo(inputList2.get(i2)) <= 0) {
                    result.add(inputList1.get(i1));
                    i1++;

                } else {
                    result.add(inputList2.get(i2));
                    i2++;

                }

            }
        }

        return result;
    }

    public static List<String> sortApproach3(String text) {

        int p, q, r, t;
        
        List<String> unsortedList = Arrays.asList(text.split(" "));

        List<String> result = new ArrayList<>();
        result.addAll(unsortedList);

        int n = result.size() - 1;

        int k = 1;

        while (k <= n) {
            List<String> tempList = new ArrayList<>();
            t = 0;
            while (t < n+1) {
                p = t;
                q = t + k;
                if (q > n + 1) {
                    q = n + 1;
                }
                r = t + 2 * k;
                if (r > n + 1) {
                    r = n + 1;
                }
                t = r;

               
                tempList.addAll(mergeLists(result.subList(p, q), result.subList(q, r)));
                

            }

            result = tempList;

            k *= 2;
        }

        return result;
    }
    
    public static List<Integer> linearSearch(String find, String text) {
        List<Integer> result = new ArrayList<>();
        if(text.isBlank() || find.isBlank()) return result;
        List<String> list = Arrays.asList(text.split(" "));
        if(list.isEmpty()) return result;
        int n = list.size();

        for (int i = 0, j=n-1; i<=j ; i++) {
            if (list.get(i).equals(find)) {
                result.add(i);
            }
            if (list.get(j).equals(find) && i!=j) {
                result.add(j);
            }
            --j;
        }
        return result;
    }
    
    public static ArrayList<String> startNum(List<String> sortedList){
        
        ArrayList<String> result = new ArrayList<>();
        int p = 0;
        int n = sortedList.size();
        for(int j=97, i=0;j<=122;++j){
            for(;i<n;){

                if(sortedList.get(i).charAt(p)==j){

                    result.add((char)j+" - "+i);
                    break;

                }
                else if(sortedList.get(i).charAt(p)==j-1)++i;
                else{
                    break;
                }

            }
        }
        return result;
        
    }
    
     public static List<Integer> linearSearch(String find, int start, String text) {
        List<Integer> result = new ArrayList<>();
        if(text.isBlank() || find.isBlank()) return result;
        if(start<0) start = 0;
        List<String> list = Arrays.asList(text.split(" "));
        if(list.isEmpty()) return result;
        int n = list.size();

        for (int i = start, j=n-1; i<=j; i++) {
            if (list.get(i).equals(find)) {
                result.add(i);
            }
            if (list.get(j).equals(find) && i!=j) {
                result.add(j);
            }
            --j;
        }
        
        return result;
    }
    
    public static List<Integer> linearSearch(String find, int start, int finish, String text) {
        List<Integer> result = new ArrayList<>();
        if(text.isBlank() || find.isBlank()) return result;
        if(start<0) start=0;
        List<String> list = Arrays.asList(text.split(" "));
        if(list.isEmpty()) return result;
        int n = list.size();
        if(finish>n) finish = n;

        for (int i = start, j=finish-1; i <= j; i++) {
            if (list.get(i).equals(find)) {
                result.add(i);
            }
            if (list.get(j).equals(find) && i!=j) {
                result.add(j);
            }
            --j;
        }
        return result;
    }
    
    public static List<Integer> linearSearch(String find, String text, int finish) {
        List<Integer> result = new ArrayList<>();
        if(text.isBlank() || find.isBlank()) return result;
        List<String> list = Arrays.asList(text.split(" "));
        if(list.isEmpty()) return result;
        int n = list.size();
        if(finish>n) finish = n;

        for (int i = 0, j=finish-1; i <= j; i++) {
            if (list.get(i).equals(find)) {
                result.add(i);
            }
            if (list.get(j).equals(find) && i!=j) {
                result.add(j);
            }
            --j;
        }
        return result;
    }
     
    public static String linSFirstLet(char find, String text) {
        String result = "No word in the text begins with a letter \""+find+"\"";
        List<String> list = Arrays.asList(text.split(" "));
        int n = list.size();
        int[] a = new int[n];

        ArrayList<String> res = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (list.get(i).charAt(0)==find) {
                if(i!=0 && res.contains(list.get(i))){ 
                    ++a[res.indexOf(list.get(i))];
                }
                else{
                    res.add(list.get(i));
                    a[res.indexOf(list.get(i))]=1;
                }
            }
        }
        if(res.isEmpty()){
            return result;
        }
        for(int i=0;i<res.size();++i){
            res.set(i, res.get(i)+" - "+a[i]);
        }
        return res.toString();
    }
     
    public static String linSFirstLet(int ind, List<String> list) {
        
        int n = list.size();
        String result = "This index is too large";
        if(ind>=n) return result;
        char u = list.get(ind).charAt(0);

        ArrayList<String> res = new ArrayList<>();
        
        for (int i = ind+1, h=1;; i++) {
            
            if(i==n) {
                res.add(list.get(i-1)+" - "+h);
                return res.toString();
            }
            
            if(list.get(i).charAt(0)!=u){ 
                res.add(list.get(i-1)+" - "+h);
                break;
            }
            
            if(list.get(i).equals(list.get(i-1))) ++h;
            else {
                res.add(list.get(i-1)+" - "+h);
                h=1;
            }
        }
        return res.toString();
    }
     
    public static String linSSeq(String find, Set<String> set) {
        String result = "No word in the text contains a sequence \""+find+"\"";
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
        int n = list.size();

        ArrayList<String> res = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (list.get(i).contains(find)) {
                res.add(list.get(i));
            }
        }
        if(res.isEmpty()){
            return result;
        }
        else return res.toString();
    }
     
     public static String linSNumLet(String find, Set<String> set) {
        String result = "No word in the text consists of "+find+" letters";
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
        int n = list.size();

        ArrayList<String> res = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (list.get(i).matches("\\b[a-z]{"+find+"}\\b")) {
                res.add(list.get(i));
            }
        }
        if(res.isEmpty()){
            return result;
        }
        else return res.toString();
    }
    
}
