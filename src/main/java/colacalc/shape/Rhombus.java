/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colacalc.shape;

import colacalc.exceptions.PDiagonalOutOfRangeException;
import colacalc.exceptions.QDiagonalOutOfRangeException;

/**
 *
 * @author Daniyal Qureshi
 */

public class Rhombus extends Shape {
    private double pDiagonal; 
    private double qDiagonal; 
    
    public Rhombus(double pDiagonal, double qDiagonal) throws PDiagonalOutOfRangeException,QDiagonalOutOfRangeException{
        if (pDiagonal > 1.340781e+154 || pDiagonal < 0){
            throw new PDiagonalOutOfRangeException("Width out of Bound - Cannot store the number in the memory.");
        }
        if (qDiagonal > 1.340781e+154 || qDiagonal < 0 ){
            throw new QDiagonalOutOfRangeException("Length out of Bound - Cannot store the number in the memory.");
        }
        this.pDiagonal = pDiagonal; 
        this.qDiagonal = qDiagonal;
        this.setEntity("Rhombus"); 
        
    }
    
    //getters
    public double getPDiagonal(){return this.pDiagonal;}
    public double getQDiagonal(){return this.qDiagonal;}
    
    @Override
    public double area(){
        return (this.pDiagonal * this.qDiagonal)/2;
    }
    
    @Override
    public double perimeter(){
       return 4 * (Math.sqrt((this.pDiagonal/2 ) * (this.pDiagonal/2)) + ( (this.qDiagonal/2) * (this.qDiagonal/2))); //find the length of a side, given the diagonals; 4 * side is your area
    }
}
