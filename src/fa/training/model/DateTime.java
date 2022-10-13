package fa.training.model;

import fa.training.utils.DateFormatException;
import fa.training.utils.Validator;

public class DateTime {
    private String date;
    public DateTime(){};
    public DateTime(String date){
        this.date=date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) throws DateFormatException {
        if(Validator.CheckDate(date)){
            this.date=date;
            System.out.println("Date is correct");
        }
        else{
            System.out.println("Date must is correct format");
            throw new DateFormatException();
        }
    }
}
