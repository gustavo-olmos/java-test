package solid.messages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Message {
    default String mensagem (){
        System.out.println("Atenciosamente. \n - Let's Code develpoment School");
        return null;
    }
    default String relogio (LocalDateTime agora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatado = agora.format(formatter);
        return formatado;
    }
}
