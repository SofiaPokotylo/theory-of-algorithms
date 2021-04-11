/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

import java.text.DecimalFormat;
import org.springframework.stereotype.Service;

/**
 *
 * @author macbook
 */

@Service
public class Lab2Show {
    
    DecimalFormat df = new DecimalFormat("###.##");
    
    public String showResult(String xString){
        
        if(xString.equals("")){return "Please enter x";}
        Float x = Float.parseFloat(xString);
        if(MyEquation.solve(x)==Integer.MAX_VALUE){return "Division by 0. "
                + "Please enter new x";}
        else if(x<0){return "Wrong x. Must be positive";}
        else{return "The result is " + df.format(MyEquation.solve(x));}
    }
    
}
