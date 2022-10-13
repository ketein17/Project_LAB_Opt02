package fa.training.model;

import fa.training.utils.EmailFormatException;
import fa.training.utils.Validator;

public class Email {
    private String email;

    public Email(){};
    public String getEmail(){
        return email;
    }

    public void setEmail(String email) throws EmailFormatException{
        if(Validator.CheckEmail(email)){
            this.email=email;
            System.out.println("Email is correct");
        }
        else{
            System.out.println("Email must is correct format");
            throw new EmailFormatException("Email is invalid!");
        }
    }
}
