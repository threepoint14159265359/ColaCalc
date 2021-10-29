package shape;

import colacalc.exceptions.LengthOutOfRangeException;
import colacalc.shape.PrimeNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumbersTest {

    @Test
    void checkIsPrime5(){
        try {
            PrimeNumbers primeNumbers = new PrimeNumbers(5);
            assertEquals(true,primeNumbers.isPrime());
        }
        catch (LengthOutOfRangeException e){
            e.printStackTrace();
        }
    }

    @Test
    void checkIsPrime4(){
        try {
            PrimeNumbers primeNumbers = new PrimeNumbers(4);
            assertEquals(true,primeNumbers.isPrime());
        }
        catch (LengthOutOfRangeException e){
            e.printStackTrace();
        }
    }
}
