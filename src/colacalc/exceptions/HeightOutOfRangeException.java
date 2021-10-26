package colacalc.exceptions;


public class HeightOutOfRangeException extends CustomException{
    public HeightOutOfRangeException(String str){
        super(str);
        super.setEntity("Height");
    }
}
