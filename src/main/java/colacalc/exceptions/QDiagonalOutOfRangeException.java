package colacalc.exceptions;

public class QDiagonalOutOfRangeException extends CustomException {
    public QDiagonalOutOfRangeException(String str){
        super(str);
        super.setEntity("PDiagonal");
    }
}

