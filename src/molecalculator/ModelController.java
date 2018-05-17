/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molecalculator;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author modelschoolb
 */
public class ModelController {
    
    Model model = new Model();
    
    Dictionary dict = new Hashtable();
    DecimalFormat f = new DecimalFormat("0.00");
    
    public String calculateA (double ma, String e) {
        
       double moles;
        
        moles = model.massToMole(ma, model.dictionary(e));
        
        return f.format(moles);
        
    }
    
    public String calculateB (double m, String e) {
        
       double mass;
       
       mass = model.moleToMass(m, model.dictionary(e));
       
       return f.format(mass);
    }
    
     public String calculateC (double ma, String e1, String e2, int a, int b) {
        
       double moles;
       
       moles = model.massToMoleC(ma, model.dictionary(e1),model.dictionary(e2),
               a, b);
       
       return f.format(moles);
    }
     
    public String calculateD (double m, String e1, String e2, int a, int b) {
        
       double mass;
       
       mass = model.moleToMassD(m, model.dictionary(e1),model.dictionary(e2),
               a, b);
       
       return f.format(mass);
    }
    
    public void addView(Mole UI) {
        UI.setVisible(true);
    }
}

