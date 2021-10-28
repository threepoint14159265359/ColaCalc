package colacalc.exceptions;

public class CustomException extends Exception {
    protected String entity;

    public CustomException(String message) {
        super(message);
        entity = "Other";
    }

    public void setEntity(String entity) {
        this.entity = entity
        ;
    }

    public String getEntity() {
        return this.entity;
    }
}












