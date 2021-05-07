/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author macbook
 */

@Component
public class SortSearch {
    
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
    
    public static int linearSearch(String find, List<String> list) {
        int result = -1;
        int n = list.size();

        for (int i = 0; i < n; i++) {
            if (list.get(i).equals(find)) {
                return i;
            }
        }
        return result;
    }
    
    public static ArrayList<String> startNum(List<String> sortedList){
        
        ArrayList<String> result = new ArrayList<>();
        int p = 0;
        int r = 25;
        int n = sortedList.size();
        for(int j=98, i=0;j<=122;++j){
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
    
     public static int linearSearch(String find, int start, List<String> list) {
        int result = -1;
        int n = list.size();

        for (int i = start; i < n; i++) {
            if (list.get(i).equals(find)) {
                return i;
            }
        }
        return result;
    }
     
     public static String linearSearch1(char find, List<String> list) {
        String result = "No word in the text begins with a letter "+find;
        int n = list.size();

        ArrayList<String> res = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (list.get(i).charAt(0)==find) {
                res.add(list.get(i));
            }
        }
        if(res.isEmpty()){
            return result;
        }
        else return res.toString();
    }
     
     public static String linearSearch2(String find, List<String> list) {
        String result = "No word in the text contains a sequence "+find;
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
     
     public static String linearSearch3(String find, List<String> list) {
        String result = "No word in the text contains a sequence "+find;
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
     
     public static int linearSearch(String find, int start, int finish, List<String> list) {
        int result = -1;
        int n = list.size();

        for (int i = start; i < finish; i++) {
            if (list.get(i).equals(find)) {
                return i;
            }
        }
        return result;
    }
    
}
