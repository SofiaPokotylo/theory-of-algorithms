/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import knu.fit.ist.ta.lab5.LinearSearch;
import knu.fit.ist.ta.lab5.ListInt;
import knu.fit.ist.ta.lab5.ListOfObj;
import knu.fit.ist.ta.lab5.MultiThreadStart;
import knu.fit.ist.ta.lab5.ObjectFields;
import knu.fit.ist.ta.lab5.SearchWord;
import knu.fit.ist.ta.lab5.SortObj;
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
            
            String text = "text sun sea replace create center learn sun program event all";
            
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create", text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("none", text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("", text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sea", ""));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("", ""));
            assertEquals(Arrays.asList(1,7),SearchWord.linearSearch("sun", text));
            assertEquals(Arrays.asList(5),SearchWord.linearSearch("center", text));
            assertEquals(Arrays.asList(0),SearchWord.linearSearch("text", text));
            assertEquals(Arrays.asList(10),SearchWord.linearSearch("all", text));
            
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",2,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",6,text));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",4,text));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",-7,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",28,text));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",0,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",11,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",10,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("",0,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sea",0,""));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("",0,""));
            assertEquals(Arrays.asList(1,7),SearchWord.linearSearch("sun",0,text));
            assertEquals(Arrays.asList(1,7),SearchWord.linearSearch("sun",1,text));
            assertEquals(Arrays.asList(7),SearchWord.linearSearch("sun",2,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sun",8,text));
            assertEquals(Arrays.asList(0),SearchWord.linearSearch("text",0,text));
            assertEquals(Arrays.asList(10),SearchWord.linearSearch("all",10,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("all",11,text));
            
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",text,4));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",text,5));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",text,10));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",text,11));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",text,34));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",text,3));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",text,-1));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("",text,11));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sea","",11));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("","",11));
            assertEquals(Arrays.asList(7,1),SearchWord.linearSearch("sun",text,8));
            assertEquals(Arrays.asList(1),SearchWord.linearSearch("sun",text,7));
            assertEquals(Arrays.asList(1),SearchWord.linearSearch("sun",text,5));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sun",text,1));
            assertEquals(Arrays.asList(1,7),SearchWord.linearSearch("sun",text,52));
            assertEquals(Arrays.asList(0),SearchWord.linearSearch("text",text,1));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("text",text,0));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("text",text,-1));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("all",text,9));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("all",text,10));
            assertEquals(Arrays.asList(10),SearchWord.linearSearch("all",text,11));
            
            
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",2,5,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",6,10,text));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",4,5,text));
            assertEquals(Arrays.asList(4),SearchWord.linearSearch("create",-3,25,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",4,4,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",-1,-6,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",3,2,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("create",0,4,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("",0,11,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sea",0,11,""));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("",0,11,""));
            assertEquals(Arrays.asList(1,7),SearchWord.linearSearch("sun",0,11,text));
            assertEquals(Arrays.asList(1,7),SearchWord.linearSearch("sun",1,8,text));
            assertEquals(Arrays.asList(7),SearchWord.linearSearch("sun",2,8,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sun",8,11,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sun",0,1,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("sun",8,7,text));
            assertEquals(Arrays.asList(1),SearchWord.linearSearch("sun",1,4,text));
            assertEquals(Arrays.asList(0),SearchWord.linearSearch("text",0,6,text));
            assertEquals(Arrays.asList(0),SearchWord.linearSearch("text",-5,1,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("text",0,0,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("text",1,6,text));
            assertEquals(Arrays.asList(10),SearchWord.linearSearch("all",0,11,text));
            assertEquals(Arrays.asList(10),SearchWord.linearSearch("all",10,11,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("all",0,10,text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("all",11,21,text));
            
        }
        
    @Test
                
        void test2(){
            
            List<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(-2,-1,0,1,2,3,4,5,6,7,8,9,10));
            
            assertEquals(2,LinearSearch.linearSearch(0,list));
            assertEquals(8,LinearSearch.linearSearch(6,list));
            assertEquals(-1,LinearSearch.linearSearch(32,list));
            assertEquals(-1,LinearSearch.linearSearch(-8,list));
            assertEquals(0,LinearSearch.linearSearch(-2,list));
            assertEquals(1,LinearSearch.linearSearch(-1,list));
            assertEquals(-1,LinearSearch.linearSearch(0,Arrays.asList()));
            
        }
        
    @Test
        
        void test3(){
            
            assertEquals(Arrays.asList(),ListInt.listOfInt(0));
            assertEquals(Arrays.asList(0),ListInt.listOfInt(1));
            assertEquals(Arrays.asList(),ListInt.listOfInt(-6));
        }
        
    @Test
        
        void test4(){
            
            assertEquals(Arrays.asList(),ListOfObj.listOfObj(0));
            assertEquals(Arrays.asList(),ListOfObj.listOfObj(-2));
            
        }
        
    @Test
        
        void test5(){
            
            assertEquals(Arrays.asList(),SortObj.listObj());
            assertEquals(Arrays.asList(),SortObj.sortApproach1());
            assertEquals(Arrays.asList(),SortObj.sortApproach2());
            assertEquals(Arrays.asList(),SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()));
            
            ArrayList<ObjectFields> list = new ArrayList<>();
            int n = 5;
            List<String> str = new ArrayList<>();
            str.addAll(Arrays.asList("think","lake","aqua","way","time"));
            
            for(int i=0;i<n;++i){
                ObjectFields obj = new ObjectFields();
                obj.setShr((short) i);
                obj.setStr(str.get(i));
                list.add(obj);
            }
            
            SortObj.setList(list);
            ArrayList<String> strList = new ArrayList<>();
            strList.addAll(Arrays.asList("aqua","lake","think","time"));
            ArrayList<Short> shrList = new ArrayList<>();
            shrList.addAll(Arrays.asList((short) 0,(short) 1,(short) 2,(short) 3));
            
            assertEquals(Arrays.asList("think - 0","lake - 1","aqua - 2","way - 3","time - 4"),SortObj.listObj());
            assertEquals(Arrays.asList("aqua","lake","think","time","way"),SortObj.sortApproach1());
            assertEquals("[0, 1, 2, 3, 4]",SortObj.sortApproach2().toString());
            assertEquals(Arrays.asList("aqua - 2 - 2","lake - 1 - 2","think - 0 - 2","time - 4 - 7","way - 3 - 7"),
                    SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()));
            assertEquals(Arrays.asList(),SortObj.sortApproach1All(strList, SortObj.sortApproach2()));
            assertEquals(Arrays.asList(),SortObj.sortApproach1All(SortObj.sortApproach1(),shrList));
            
            strList.clear();
            shrList.clear();
            strList.addAll(Arrays.asList("think","lake","aqua","way","time"));
            shrList.addAll(Arrays.asList((short) 2,(short) 1,(short) 3,(short) 0, (short) 4));
            
            assertEquals(Arrays.asList("aqua - 2 - 2","lake - 1 - 2","think - 0 - 3","way - 3 - 5","time - 4 - 8"),
                    SortObj.sortApproach1All(strList,shrList));
            
            strList.set(0, "none");
            
            assertEquals(Arrays.asList("aqua - 2 - 2","lake - 1 - 2","think - 0 - 2","way - 3 - 5","time - 4 - 8"),
                    SortObj.sortApproach1All(strList,shrList));
            
            shrList.set(1, (short) 3);
            
            assertEquals(Arrays.asList("lake - 1 - 0","aqua - 2 - 2","think - 0 - 2","way - 3 - 4","time - 4 - 8"),
                    SortObj.sortApproach1All(strList,shrList));
            
            strList.clear();
            shrList.clear();
            strList.addAll(Arrays.asList("none","none","none","none","none"));
            shrList.addAll(Arrays.asList((short) 0,(short) 1,(short) 2,(short) 3, (short) 4));
            
            assertEquals(Arrays.asList("think - 0 - -1","lake - 1 - 0","aqua - 2 - 1","way - 3 - 2","time - 4 - 3"),
                     SortObj.sortApproach1All(strList,shrList));
             
            strList.set(0, "time"); 
            
            assertEquals(Arrays.asList("think - 0 - -1","lake - 1 - 0","aqua - 2 - 1","way - 3 - 2","time - 4 - 4"),
                     SortObj.sortApproach1All(strList,shrList));
            
            strList.clear();
            shrList.clear();
            strList.addAll(Arrays.asList("think","lake","aqua","way","time"));
            shrList.addAll(Arrays.asList((short) 5,(short) 5,(short) 5,(short) 5, (short) 5));
            
            assertEquals(Arrays.asList("think - 0 - -1","lake - 1 - 0","aqua - 2 - 1","way - 3 - 2","time - 4 - 3"),
                     SortObj.sortApproach1All(strList,shrList));
            
            shrList.set(4, (short) 4); 
            
            assertEquals(Arrays.asList("think - 0 - -1","lake - 1 - 0","aqua - 2 - 1","way - 3 - 2","time - 4 - 8"),
                     SortObj.sortApproach1All(strList,shrList));
            
            list.removeAll(list);
            
            for(int i=0;i<n;++i){
                ObjectFields obj = new ObjectFields();
                if(i>2)obj.setShr((short) i);
                obj.setStr(str.get(i));
                list.add(obj);
            }
            
            SortObj.setList(list);
            
            assertEquals(Arrays.asList("think - "+Short.MAX_VALUE,"lake - "+Short.MAX_VALUE,"aqua - "+Short.MAX_VALUE,"way - 3","time - 4"),SortObj.listObj());
            assertEquals(Arrays.asList("aqua","lake","think","time","way"),SortObj.sortApproach1());
            assertEquals("[3, 4, "+Short.MAX_VALUE+", "+Short.MAX_VALUE+", "+Short.MAX_VALUE+"]",SortObj.sortApproach2().toString());
            assertEquals(Arrays.asList("aqua - "+Short.MAX_VALUE+" - 2","lake - "+Short.MAX_VALUE+" - 3","think - "+Short.MAX_VALUE+" - 4","time - 4 - 4","way - 3 - 4"),
                    SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()));
            
            list.removeAll(list);
            
            for(int i=0;i<n;++i){
                ObjectFields obj = new ObjectFields();
                obj.setStr(str.get(i));
                list.add(obj);
            }
            
            SortObj.setList(list);
            
            assertEquals(Arrays.asList("think - "+Short.MAX_VALUE,"lake - "+Short.MAX_VALUE,"aqua - "+
                    Short.MAX_VALUE,"way - "+Short.MAX_VALUE,"time - "+Short.MAX_VALUE),SortObj.listObj());
            assertEquals(Arrays.asList("aqua","lake","think","time","way"),SortObj.sortApproach1());
            assertEquals("["+Short.MAX_VALUE+", "+Short.MAX_VALUE+", "+Short.MAX_VALUE+", "+Short.MAX_VALUE+", "+Short.MAX_VALUE+"]",
                    SortObj.sortApproach2().toString());
            assertEquals(Arrays.asList("aqua - "+Short.MAX_VALUE+" - 0","lake - "+Short.MAX_VALUE+" - 1",
                    "think - "+Short.MAX_VALUE+" - 2","time - "+Short.MAX_VALUE+" - 3","way - "+Short.MAX_VALUE+" - 4"),
                    SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()));
            
            str.removeAll(str);
            str.addAll(Arrays.asList("think","lake","aqua"));
            list.removeAll(list);
            
            for(int i=0;i<n;++i){
                ObjectFields obj = new ObjectFields();
                obj.setShr((short) i);
                if(str.size()>i)obj.setStr(str.get(i));
                list.add(obj);
            }
            
            SortObj.setList(list);
            
            assertEquals(Arrays.asList("think - 0","lake - 1","aqua - 2"," - 3"," - 4"),SortObj.listObj());
            assertEquals(Arrays.asList("","","aqua","lake","think"),SortObj.sortApproach1());
            assertEquals("[0, 1, 2, 3, 4]",SortObj.sortApproach2().toString());
            assertEquals(Arrays.asList(" - 3 - 3"," - 4 - 4","aqua - 2 - 4","lake - 1 - 4","think - 0 - 4"),
                    SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()));
            
            list.removeAll(list);
            
            for(int i=0;i<n;++i){
                ObjectFields obj = new ObjectFields();
                obj.setShr((short) i);
                list.add(obj);
            }
            
            SortObj.setList(list);
            
            assertEquals(Arrays.asList(" - 0"," - 1"," - 2"," - 3"," - 4"),SortObj.listObj());
            assertEquals(Arrays.asList("","","","",""),SortObj.sortApproach1());
            assertEquals("[0, 1, 2, 3, 4]",SortObj.sortApproach2().toString());
            assertEquals(Arrays.asList(" - 0 - 0"," - 1 - 1"," - 2 - 2"," - 3 - 3"," - 4 - 4"),
                    SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()));
            
            list.removeAll(list);
            
            for(int i=0;i<n;++i){
                ObjectFields obj = new ObjectFields();
                list.add(obj);
            }
            
            SortObj.setList(list);
            
            assertEquals(Arrays.asList(" - "+Short.MAX_VALUE," - "+Short.MAX_VALUE," - "+
                    Short.MAX_VALUE," - "+Short.MAX_VALUE," - "+Short.MAX_VALUE),SortObj.listObj());
            assertEquals(Arrays.asList("","","","",""),SortObj.sortApproach1());
            assertEquals("["+Short.MAX_VALUE+", "+Short.MAX_VALUE+", "+Short.MAX_VALUE+", "+Short.MAX_VALUE+
                    ", "+Short.MAX_VALUE+"]",SortObj.sortApproach2().toString());
            assertEquals(Arrays.asList(" - "+Short.MAX_VALUE+" - 0"," - "+Short.MAX_VALUE+" - 0"," - "+
                    Short.MAX_VALUE+" - 0"," - "+Short.MAX_VALUE+" - 0"," - "+Short.MAX_VALUE+" - 0"),
                    SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()));
            
        }
        
    @Test
        
        void test6(){
            
            List<Integer> list = new ArrayList<>();
            int n = 10;
            for(int i=0;i<n;++i){
                list.add(i);
            }
            
            assertEquals("The size of list - "+list.size()+", the thread + [the index of the element in the thread] +"
                + " the index of the element in the list: "+Arrays.asList("Thread1 - [0] - 0"),MultiThreadStart.showTest(10, 0, list));
            assertEquals("The size of list - "+list.size()+", the thread + [the index of the element in the thread] +"
                + " the index of the element in the list: "+Arrays.asList("Thread3 - [1] - 8"),MultiThreadStart.showTest(3, 7, list));
            assertEquals("The number of threads and the search value must be >0",MultiThreadStart.showTest(-5, 0, list));
            assertEquals("The number of threads and the search value must be >0",MultiThreadStart.showTest(0, 4, list));
            assertEquals("The number of threads and the search value must be >0",MultiThreadStart.showTest(5, -4, list));
            assertEquals("The number of threads and the search value must be >0",MultiThreadStart.showTest(-5, -2, list));
            assertEquals("The number of the threads is too large, enter new value",MultiThreadStart.showTest(17, 0, list));
            assertEquals("The size of list - "+list.size()+", the list doesn`t contain 10",MultiThreadStart.showTest(9, 10, list));
            
            list.set(5, 1);
            
            assertEquals("The size of list - "+list.size()+", the thread + [the index of the element in the thread] +"
                + " the index of the element in the list: "+Arrays.asList("Thread1 - [1] - 1","Thread2 - [2] - 6"),
                    MultiThreadStart.showTest(3, 1, list));
            
            list.removeAll(list);
            
            assertEquals("The list is empty",MultiThreadStart.showTest(2, 0, list));
        }
}
