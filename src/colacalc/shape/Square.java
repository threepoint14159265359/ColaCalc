/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colacalc.shape;

import colacalc.exceptions.LengthOutOfRangeException;

/**
 *
 * @author Daniyal Qureshi
 */
public class Square extends Shape{
    
    private double length; 
    
    public Square(double length) throws LengthOutOfRangeException{
        if(this.length > 1.340781e+154 || this.length < 0){
        throw new LengthOutOfRangeException("Radius out of bound - Cannot store radius in the memory.");
    }
    this.length = length;
    this.setEntity("Square"); 
    }
    
    //getters 
    private double getSide(){return this.length;}
    
    @Override
    public double area(){
        return this.length * length; //length squared  
    }
    
    @Override
    public double perimeter(){
        return 4 * this.length; //4 times the length
    }
    
    
}
