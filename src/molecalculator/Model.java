/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molecalculator;

import java.util.*;


/**
 *
 * @author modelschoolb
 */

public class Model {
    
    private double mole;   // mole value
    private double mass;   // mass value
    
    // default constructor
    
    public Model () {
        mole = 0;
        mass = 0;
    }
    
    // initialized constructor
    
    public Model (double m, double ma) {
        mole = m;
        mass = ma;
    }
    
    // getters
    
    public double getMole() {
        return mole;
    }
    
    public double getMass() {
        return mass;
    }
    
    // setters
    
    public void setMole(double m) {
        mole = m;
    }
    
    public void setMass(double ma) {
        mass = ma;
    }
    
    // calculators
    
    public double moleToMass(double m, double e) {
        mole = m;
        
        mass = mole * e;
        
        return mass;
    }
    
     public double moleToMassD(double m, Double e1, Double e2, int a, int b) {
        mole = m;
        
        double molarMass = ((e1 * a) + (e2 * b));
        
        mass = mole * molarMass;
        
        return mass;
    }
    
    public double massToMole(double ma, double e) {
        mass = ma;
        
        mole = mass / e;
        
        return mole;
    }
    
    public double massToMoleC(double ma, Double e1, Double e2, int a, int b) {
        mass = ma;
        
        double molarMass = ((e1 * a) + (e2 * b));
        
        mole = mass / molarMass;
        
        return mole;
    }
    
    public double dictionary (String e) {
    Dictionary dict = new Hashtable();
    
        dict.put("H", 1.01); dict.put("Li", 6.94);dict.put("Na", 22.99);
        dict.put("K", 39.10);dict.put("Rb", 85.47);
        
        
        dict.put("Be", 9.01);dict.put("Mg", 24.31);dict.put("Ca", 40.08);
        dict.put("Sr", 87.62);
        
        
        dict.put("Sc", 44.96);dict.put("Y", 88.91);
        
        dict.put("Ti", 47.86);dict.put("Zr", 91.224);
        
        dict.put("V", 50.94);dict.put("Nb", 92.91);
        
        dict.put("Cr", 51.996);dict.put("Mo", 95.96);
        
        dict.put("Mn", 54.938);dict.put("Tc", 97.9072);
        
        dict.put("Fe", 55.85);dict.put("Ru", 101.07);
        
        dict.put("Co", 58.93);dict.put("Rh", 102.905);
        
        dict.put("Ni", 58.69);dict.put("Pd", 106.42);
        
        dict.put("Cu", 63.55);dict.put("Ag", 107.868);dict.put("Au", 196.966);
        
        dict.put("Zn", 65.38);dict.put("Cd", 112.411);
        
        dict.put("B", 10.81);dict.put("Al", 26.98);dict.put("Ga", 69.72);
        dict.put("In", 114.82);
        
        dict.put("C", 12.01);dict.put("Si", 28.09);dict.put("Ge", 72.64);
        dict.put("Sn", 118.71);dict.put("Pb", 207.2);
        
        dict.put("N", 14.01);dict.put("p", 30.97);dict.put("As", 74.92);
        dict.put("Sb", 121.79);
        
        dict.put("O", 15.99);dict.put("S", 32.065);dict.put("Se", 78.95);
        dict.put("Te", 127.60);
        
        dict.put("F", 18.99);dict.put("Cl", 35.45);dict.put("Br", 79.90);
        dict.put("I", 126.90);
        
        dict.put("He", 4.00);dict.put("Ne", 20.18);dict.put("Ar", 39.95);
        dict.put("Kr", 83.798);dict.put("Xe", 131.293);
        
        
        
        
        dict.put("C", 12.01);
        dict.put("N", 14.01);
        dict.put("O", 15.99);
        dict.put("F", 18.99);
        dict.put("Ne", 20.18);
        
        return (double)dict.get(e);
    }
}
