package solid.messages;

import solid.boletim.Boletim;

import java.time.LocalDateTime;

public class EmailSender implements Message {
    private String email;
    private Boletim boletim;

    public EmailSender(String email, Boletim boletim) {
        this.email = email;
        this.boletim = boletim;
    }

    @Override
    public String relogio(LocalDateTime agora) {
        return Message.super.relogio(agora);
    }

    @Override
    public String mensagem() {
        LocalDateTime agr = LocalDateTime.now();
        System.out.printf("Olá usuário de email %s, este é o ", email);
        System.out.println("Relatório de desempenho do(a) aluno(a) \n" + boletim);
        System.out.printf("\n entregue em: %s", relogio(agr));
        return Message.super.mensagem();
    }
}
