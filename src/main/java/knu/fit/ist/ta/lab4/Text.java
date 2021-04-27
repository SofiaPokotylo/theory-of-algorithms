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
    static Matcher matcher;
    static Pattern pattern;
    
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
    
    public static String cleanText(String ctext){
        
        ctext = ctext.toLowerCase();
        ctext = ctext.replaceAll("\\bthe|and\\b", "").trim().strip();
        ctext = ctext.replaceAll("\\b\\w{1,2}\\b", "").trim();
        ctext = ctext.replaceAll("[^\\w -]", "").trim();
        ctext = ctext.replaceAll("-{2,}","");
        ctext = ctext.replaceAll(" {2,}"," ");
        return ctext;
    }
    
    public static List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }
    
    public static int sizeOfList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result.size();
    }
    
    public static Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }
    
    public static int sizeOfSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result.size();
    }
    
    public static ArrayList<String> first7Often(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        ArrayList<String> result = new ArrayList<String>();
        
        int size = words.size();
        int m = 7; // m - the number of words to perform calculations for
        int[] z = new int[size]; 
        // z[i] - frequency of occurrence of the word with serial number i
        int[] n = new int[m];
        int[] t = new int[m];
        for(int j=0;j<size;++j){
            z[j]=0;
            for(int i=0; i<size ;++i){
                    
                if(words.get(j).equals(words.get(i))){
                    z[j]=z[j]+1;
                }
                
            }
            for(int q=0;q<j;++q){   //avoid the same words
                if(words.get(j).equals(words.get(q))) z[j]=0;
            }
        }
            
        for(int j=0; j<m;++j){
            for(int i=0;i<size;++i){
                   
                if(z[i]>t[j]){
                    t[j]=z[i];  //the highest frequency of occurence 
                    n[j]=i;     //the serial number of the word
                }   
                    
            }
            z[n[j]]=0;  //not to repeat words
        }
        for(int y=0;y<m;++y){
            result.add(words.get(n[y])+" - "+t[y]);
        }
        
        return result;
    }
    
    public static int notU(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-tv-z]+\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public static int words4Letters(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-z]{4}\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public static ArrayList<String> seq3Let(String text){
        int p = 0;
        String stext = text;
        String fseq;       
        
        int t=0, m=6, d=0; // m - the number of sequences to perform calculations with
        // d - so as not to repeat the sequence, t - frequency of occurrence
        String seq="";     
        ArrayList<String> all = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        
        for(int q=0;q<m;++q){
            t=0;
            for(int i=3, j=0;i<text.length();++i){
                p=0;
                d=0;
                if(stext.charAt(i-1)==' '){
                    i += 3;
                    j += 3;
                }
                fseq = stext.substring(j, i);
                for(int z=0;z<q;++z){
                    if(fseq.equals(all.get(z))){d = 1;}
                }
                pattern = Pattern.compile(fseq);
                matcher = pattern.matcher(text);
                while(matcher.find() && d!=1){
                    ++p;
                }
                if(p>t){t=p;seq=fseq;}
                ++j;
            }
            all.add(seq);
            result.add(seq+" - "+t);
            }
        return result;
    }
    
}
