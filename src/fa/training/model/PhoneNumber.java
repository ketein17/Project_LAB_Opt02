package fa.training.model;

import fa.training.utils.EmailFormatException;
import fa.training.utils.PhoneNumberFormatException;
import fa.training.utils.Validator;

import static java.lang.Character.isDigit;

public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(){};

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {

        if(Validator.CheckPhoneNumber(phoneNumber)){
            this.phoneNumber=phoneNumber;
            System.out.println("Phone number is correct");
        }
        else{
            boolean x=true;
            int n=phoneNumber.length();
            char[] a=new char[n];
            a=phoneNumber.toCharArray();
            for(int i=0;i<n;i++){
                if(!isDigit(a[i])){
                    x=false;
                    break;
                }
            }
            if(!x) System.out.println("Phone number must is number");
            else if(n!=10) System.out.println("Phone number must is 10 digits");
            throw new PhoneNumberFormatException("Phone number is incorrect!");
        }
    }


}
