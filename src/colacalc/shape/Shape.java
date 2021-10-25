/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colacalc.shape;

/**
 *
 * @author Daniyal Qureshi
 */
public abstract class Shape {
    private String entity;
    public void setEntity(String str){
        this.entity = str; 
    } 
    
    public String getEntity(){return this.entity;}
    
    public abstract double area(); 
    public abstract double perimeter();
}
