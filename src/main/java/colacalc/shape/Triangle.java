package colacalc.shape;
import colacalc.exceptions.LengthOutOfRangeException;
public class Triangle extends Shape{
    private double len1, len2, len3;
    public Triangle(double len1, double len2, double le3) throws LengthOutOfRangeException{
        if((this.len1 > 1.340781e+154 || this.len1 < 0) || (this.len3 > 1.340781e+154 || this.len3 < 0) || (this.len2 > 1.340781e+154 || this.len2 < 0)){
            throw new LengthOutOfRangeException("Radius out of bound - Cannot store radius in the memory.");
        }
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
        this.setEntity("Square");
    }

    //getters
    public double getLen1(){return this.len1;}
    public double getLen2(){return this.len2;}
    public double getLen3(){return this.len3;}

    @Override
    public double area(){
        double h = (this.len1 + this.len2 + this.len3)/2;
        return  Math.sqrt(h * (h - this.len1) * (h - this.len2) * (h - this.len3)); //Heron's Formula for calculating area
    }

    @Override
    public double perimeter(){
        return len1 + len2 + len3;
    }
}