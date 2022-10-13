package fa.training.main;

import fa.training.model.DateTime;
import fa.training.model.Email;
import fa.training.model.PhoneNumber;
import fa.training.services.Service;
import fa.training.utils.EmailFormatException;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        Scanner scanner=null;
        String choice;
        DateTime date;
        PhoneNumber phone;
        Email email;
        try{
            scanner=new Scanner(System.in);
            do{
                System.out.println("-----------------------------MENU-----------------------------");
                System.out.println("1.Check Email\n2.Check phone number\n3.Check date\n"
                        +"4.Exit");
                System.out.println("Select: ");
                choice=scanner.nextLine();
                choice.trim();
                switch (choice){
                    case "1":{
                        email=service.createEmail(scanner);
                        break;
                    }

                    case "2":{
                        phone=service.createPhoneNumber(scanner);
                        break;
                    }

                    case "3":{
                        date=service.createDateTime(scanner);
                        break;
                    }

                    default:{
                        choice="4";
                        break;
                    }
                }
            }while(!choice.equals("4"));
        }finally {
            if(scanner!=null){
                scanner.close();
            }
        }
    }
}
