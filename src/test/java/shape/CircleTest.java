package shape;
import colacalc.exceptions.RadiusOutOfRangeException;
import colacalc.shape.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    void checkRadius(){
        try{
           Circle circle = new Circle(2);
            assertEquals(12.56637061436,circle.perimeter());
        }
        catch (RadiusOutOfRangeException e){
            e.printStackTrace();
        }
    }

    @Test
    void checkArea(){
        try{
            Circle circle = new Circle(3);
            assertEquals(28.274333882310003,circle.area());
        }
        catch (RadiusOutOfRangeException e){
            e.printStackTrace();
        }
    }

}
