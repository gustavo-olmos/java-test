package solid.boletim;

import solid.messages.BoletimImpresso;
import solid.messages.EmailSender;
import solid.messages.SmsSender;

import java.util.Scanner;

public class FormaDeEnvio {
    public static void escolhaAForma(Scanner scanner, int choice, Boletim boletim){
        do{
            if(choice == 1){
                System.out.println("Informe o email");
                String email = scanner.next();
                EmailSender eSender = new EmailSender(email, boletim);
                eSender.mensagem();
            }else if(choice == 2){
                System.out.println("Informe o celular");
                String celular = scanner.next();
                SmsSender sms = new SmsSender(celular, boletim);
                sms.mensagem();
            }else {
                BoletimImpresso impresso = new BoletimImpresso(boletim);
                impresso.mensagem();
            }
        }while(choice != 1 && choice != 2 && choice != 3);
    }
}
