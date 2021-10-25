package colacalc.exceptions;


public class PDiagonalOutOfRangeException extends CustomException{
    public PDiagonalOutOfRangeException(String str){
        super(str);
        super.setEntity("PDiagonal");
    }
}
