package solid.messages;

import solid.boletim.Boletim;

import java.time.LocalDateTime;

public class SmsSender implements Message{
    private String celular;
    private Boletim boletim;

    public SmsSender(String celular, Boletim boletim) {
        this.celular = celular;
        this.boletim = boletim;
    }

    @Override
    public String relogio(LocalDateTime agora) {
        return Message.super.relogio(agora);
    }

    @Override
    public String mensagem() {
        LocalDateTime agr = LocalDateTime.now();
        System.out.printf("Olá %s, este é o ", celular);
        System.out.println("Relatório de desempenho do(a) aluno(a): \n" + boletim);
        System.out.printf("\n entregue em: %s", relogio(agr));
        return Message.super.mensagem();
    }
}
