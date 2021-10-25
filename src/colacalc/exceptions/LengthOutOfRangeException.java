package colacalc.exceptions;

public class LengthOutOfRangeException extends CustomException{
    public LengthOutOfRangeException(String str){
        super(str);
        super.setEntity("Length");
    }
}
