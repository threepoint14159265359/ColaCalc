package colacalc.exceptions;

public class BaseOutOfRangeException extends CustomException{
    public BaseOutOfRangeException(String str){
        super(str);
        super.setEntity("Base");
    }
}
