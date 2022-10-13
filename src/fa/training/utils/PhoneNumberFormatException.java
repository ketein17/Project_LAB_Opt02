package fa.training.utils;

public class PhoneNumberFormatException extends  Exception{
    private static final long serialVersionUID=1L;
    public PhoneNumberFormatException(){
        super();
    }
    public PhoneNumberFormatException(String message){
        super(message);
    }
}
