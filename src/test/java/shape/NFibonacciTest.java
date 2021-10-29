package shape;

import colacalc.exceptions.LengthOutOfRangeException;
import colacalc.shape.NFibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NFibonacciTest {

    @Test
    void checkNthFibonacciNumber(){
        try {
            NFibonacci fibonacci = new NFibonacci(4);
            assertEquals(3,fibonacci.getNthFibonacciNumber());
        }
        catch (LengthOutOfRangeException e){
            e.printStackTrace();
        }
    }
}
