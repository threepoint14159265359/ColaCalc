package colacalc.exceptions;

public class WidthOutOfRangeException extends CustomException{
    public WidthOutOfRangeException(String str){
        super(str);
        super.setEntity("Width");
    }
}
