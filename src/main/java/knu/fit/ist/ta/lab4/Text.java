/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 *
 * @author macbook
 */
@Component
public class Text {
    public String text;
    Matcher matcher;
    Pattern pattern;
    
    public Text(){
        text = "Smart electric meters help consumers save on energy costs "+
        "while enabling the utility companies to optimize network load and avoid "+
        "blackouts. Radio Frequency Identification (RFID) tags help us talk to the"+
        " things around us, such as garments on the shelf of a store, to determine "+
        "what’s in stock and what needs to be reordered. " + "Connected cars help"+
        " monitor performance, including tire wear. Cars communicate with one "+
        "another to better navigate in traffic. Usage-based car insurance systems "+
        "help insurance companies better manage risk, offer lower premiums to "+
        "better drivers, and help drivers improve through instant feedback, thus "+
        "making everyone safer. "+"Small tracking devices help recover lost "+
        "children or pets. Covert tracking devices help law enforcement quickly "+
        "recover the stolen cargo. Smart cargo packages can ensure that valuable "+
        "cargo arrives on time and undamaged. "+"And, if that’s not enough, we can"+
        " talk about tracking endangered animals, Tweeting plants, body sensors as"+
        " small as temporary tattoos, connected contact lenses, driverless cars, "+
        "and more. "+"All these things are possible because of M2M technology, and"+
        " all these examples represent the Internet of Things. As Glenn Lurie, "+
        "president of AT&T Emerging Devices Organization (EDO), says, “Any device "+
        "that is connected is smart. Any device that is not connected is dumb. In"+
        " the future, everything’s going to be smart.” Technology is making things"+
        " around us smarter, yet we’re often not even aware of it. "+"In a "+
        "nutshell, the biggest benefit of the Internet of Things is that it gives "+
        "us a unique opportunity to talk to the analog world around us (machines, "+
        "people, animals, plants, things) in a digital way, with all the benefits "+
        "of digital communication: speed of light, easy multiplication of data, "+
        "and easy integration with other digital systems. All this, combined with "+
        "wireless communication, produces an effect of machine telepathy, a "+
        "condition where things can communicate over large distances unconstrained"+
        " by wires.";
}
    
    public String cleanText(String ctext){
        
        ctext = ctext.toLowerCase();
        //ctext = ctext.replaceAll("-{2,}","");
        //ctext = ctext.replaceAll(" {2,}"," ");
        ctext = ctext.replaceAll("[^\\w -]", "").trim();       
        return ctext;
    }
    
    public List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }
    
    public int sizeOfList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result.size();
    }
    
    public Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }
    
    public int sizeOfSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result.size();
    }
    
    public ArrayList<String> first7Often(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        int size = words.size();
        int m = 7;
        int[] n = new int[m];
        int[] t = new int[m];
        ArrayList<String> result = new ArrayList<String>();
        for(int k=0;k<m;++k){
            for(int j=0, p=0, d=0;j<size;++j){
                p=0;
                d=0;
                for(int q=0;q<k;++q){
                if(words.get(j).equals(result.get(q))){
                    d=1;
                }
                }
                if(d!=1){
                for(int i=0; i<size ;++i){
                    if(words.get(j).equals(words.get(i))){
                        ++p;
                    }
                /*if(k==0){
                    for(int i=0; i<size ;++i){
                        if(words.get(j).equals(words.get(i))){
                            ++p;
                        }
                    }
                }
                else{
                    for(int q=0;q<k;++q){
                        if(words.get(j).equals(result.get(q))){
                            break;
                        }
                        else{
                            for(int i=0; i<size ;++i){
                                //pattern = Pattern.compile(result.get(i));
                                //matcher = pattern.matcher(result.toString());
                                /*for(int q=0;k>=1 && q<size;++q){
                                   if(words.get(q).equals(result.get(k-1))){
                                     words.r
                                   }
                                }
                                if(words.get(j).equals(words.get(i))){
                                    ++p;
                                }
                            }
                        }
                    }
                }*/
                if(p>t[k]){
                    t[k]=p;
                    n[k]=j;
                }
            }
            }
            }
            result.add(words.get(n[k])+"-"+t[k]);
        }
        return result;
    }
    
    public int notU(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-tv-z]+\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public int words4Letters(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-z]{4}\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public String seq3Let(String text){
        int p = 0;
        String regex = "[^\\w{3}]";
        String te = text;
        te = te.substring(0, 2);
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return regex+" - "+p;
    }
    
    /*public String sizeOfList(){
        
        return getList.result;
        
    }
    */
    public void showResult() {
        System.out.println(text);
        System.out.println(cleanText(text));
    }
    
    public void main(String[] args) {
       
       System.out.println(text);
       
   }
    
}
