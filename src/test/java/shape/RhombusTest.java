package shape;

import colacalc.exceptions.PDiagonalOutOfRangeException;
import colacalc.exceptions.QDiagonalOutOfRangeException;
import colacalc.shape.Rhombus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RhombusTest {

    @Test
    void checkArea(){
        try{
            Rhombus rhombus = new Rhombus(2,3);
            assertEquals(3.0,rhombus.area());
        }
        catch (PDiagonalOutOfRangeException | QDiagonalOutOfRangeException e){
            e.printStackTrace();
        }
    }

    @Test
    void checkPerimeter(){
        try{
            Rhombus rhombus = new Rhombus(2,3);
            assertEquals(13.0,rhombus.perimeter());
        }
        catch (PDiagonalOutOfRangeException | QDiagonalOutOfRangeException e){
            e.printStackTrace();
        }
    }
}
