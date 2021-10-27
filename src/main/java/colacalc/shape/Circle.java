/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colacalc.shape;

import colacalc.exceptions.RadiusOutOfRangeException;

/**
 *
 * @author Daniyal Qureshi
 */
public class Circle extends Shape{
    private double pi = 3.14159265359; 
    private double radius;  
    
    
    public Circle(double radius) throws RadiusOutOfRangeException{
        if(radius > 1.340781e+154 || radius < 0){
            throw new RadiusOutOfRangeException("Radius out of bound - Cannot store radius in the memory.");
        }
        this.radius = radius;
        this.setEntity("Circle"); 
    }
    
    //getters
    public double getRadius(){return this.radius;}
    
    
    @Override
    public double perimeter(){
        return 2 * this.pi * this.radius; // 2 times pi times raidus
    }
    
    @Override 
    public double area(){
        return (this.pi * this.radius * this.radius); // pi times raius times radius
    }
    
}
