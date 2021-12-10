package colacalc.shape;
import colacalc.exceptions.LengthOutOfRangeException;
import colacalc.exceptions.WidthOutOfRangeException;
public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(double width, double length) throws WidthOutOfRangeException,LengthOutOfRangeException{
        if (width > 1.340781e+154 || this.width < 0){
            throw new WidthOutOfRangeException("Width out of Bound - Cannot store the number in the memory.");
        }
        if (length > 1.340781e+154 || length < 0 ){
            throw new LengthOutOfRangeException("Length out of Bound - Cannot store the number in the memory.");
        }
        this.width = width;
        this.length = length;
        this.setEntity("Rectangle");
    }

    //getters
    public double getLength(){return this.length;}
    public double getWidth(){return this.width;}

    @Override
    public double area(){
        return this.length * width ; //length squared
    }

    @Override
    public double perimeter(){
        return 4 * this.length; //4 times the length
    }
}