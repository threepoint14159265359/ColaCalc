
package colacalc.shape;
import colacalc.exceptions.LengthOutOfRangeException;


public class PrimeNumbers {
    private long number; 
    
    public PrimeNumbers(long number) throws LengthOutOfRangeException{
        if(number > 2147483647 || number <= 1){
            throw new LengthOutOfRangeException("Input number is out of range.");
        }
        this.number = number; 
    }
    
    public Boolean isPrime(){
        Boolean res = true; 
        if (this.number <= 1){
            res = false; 
        }
        for (int i = 2; i<=this.number/2 ; i++){
            if (this.number % i == 0){
                res =  false; 
            }
        }
        return res;
    }
}
