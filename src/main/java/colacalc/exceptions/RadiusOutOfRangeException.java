package colacalc.exceptions;

public class RadiusOutOfRangeException extends CustomException{
    public RadiusOutOfRangeException(String str){
        super(str);
        super.setEntity("radius");
    }
}
