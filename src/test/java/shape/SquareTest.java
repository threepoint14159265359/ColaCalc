package shape;

import colacalc.exceptions.LengthOutOfRangeException;
import colacalc.shape.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SquareTest {

    @Test
    void checkArea(){
        try{
            Square square = new Square(3);
            assertEquals(9.0,square.area());
        }
        catch (LengthOutOfRangeException e){
            e.printStackTrace();
        }
    }

    @Test
    void checkPerimeter(){
        try{
            Square square = new Square(3);
            assertEquals(12.0,square.perimeter());
        }
        catch (LengthOutOfRangeException e){
            e.printStackTrace();
        }
    }
}
