/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colacalc.shape;
import colacalc.exceptions.LengthOutOfRangeException;

/**
 *
 * @author izhussai
 */
public class NFibonacci {
    private long number;
    
    public NFibonacci(long number) throws LengthOutOfRangeException{
        if(number > 255 || number < 0){
            throw new LengthOutOfRangeException("The given number is out of range. We can't comput 255th Fibonacci number on this computer.");
        }
        this.number = number;
    }
    
    public long getNthFibonacciNumber(){
        if ( this.number <= 1){
            return this.number;
        }
        long prev = 0, curr = 1; 
        for(int i = 0; i< this.number - 1; i++){
            long temp = prev + curr;
            prev = curr; 
            curr = temp; 
        }
        return curr; 
    }
    
}
