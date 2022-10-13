package fa.training.services;

import fa.training.model.DateTime;
import fa.training.model.Email;
import fa.training.model.PhoneNumber;
import fa.training.utils.DateFormatException;
import fa.training.utils.EmailFormatException;
import fa.training.utils.PhoneNumberFormatException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Service {
    public Email createEmail(Scanner scanner){
        Email email=new Email();
        String e;
        do{
            System.out.println("Enter email:");
            e=scanner.nextLine();
            try{
                email.setEmail(e);
            }catch(EmailFormatException exception){
                continue;
            }
            break;
        }while(true);
        return email;
    }

    public PhoneNumber createPhoneNumber(Scanner scanner){
        PhoneNumber phoneNumber;
        String p;
        do{
            phoneNumber=new PhoneNumber();

            System.out.println("Enter phone number:");
            p=scanner.nextLine();
            try{
                phoneNumber.setPhoneNumber(p);
            }catch(PhoneNumberFormatException exception){
                continue;
            }
            break;
        }while(true);
        return phoneNumber;
    }

    public DateTime createDateTime(Scanner scanner){
        DateTime date;
        String d;
        do{
                date=new DateTime();

                System.out.println("Enter date: ");
                d=scanner.nextLine();

            try{
                date.setDate(d);
            }
            catch(DateFormatException e){
                System.out.println("Dinh dang ngay khong dung");
                continue;
            }
            break;
        }while(true);
        return date;
    }
}

