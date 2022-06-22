package solid.messages;

import solid.boletim.Boletim;

import java.time.LocalDateTime;

public class BoletimImpresso implements Message {
    private Boletim boletim;

    public BoletimImpresso(Boletim boletim) {
        this.boletim = boletim;
    }

    @Override
    public String relogio(LocalDateTime agora) {
        return Message.super.relogio(agora);
    }

    @Override
    public String mensagem() {
        LocalDateTime agr = LocalDateTime.now();
        System.out.println("Olá, este é o Relatório de desempenho do(a) aluno(a): \n" + boletim);
        System.out.printf("\n entregue em: %s", relogio(agr));
        return Message.super.mensagem();
    }
}
