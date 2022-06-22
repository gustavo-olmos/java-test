package solid.boletim;

import solid.cadastro.Aluno;
import solid.cadastro.Cadastro;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Boletim {
    private String name;
    private String classes;
    private Hashtable<String, Integer> hash;

    public Boletim(String name, String classes, Hashtable<String, Integer> hash) {
        this.name = name;
        this.classes = classes;
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "Boletim{" +
                "\n name='" + name + '\'' +
                "\n classes='" + classes + '\'' +
                "\n hash=" + hash +
                '}';
    }

    public static void preparaBoletim(String nome, String turma){
        Cadastro cadastro = new Cadastro();
        List<Aluno> db = cadastro.getDbAlunos();
        for (Aluno aluno : db) {
            String nomeDoAluno = aluno.getNome();
            String turmaDoAluno = aluno.getTurma();
            System.out.println("cheguei a entrar aqui");
            if(nome.equals(nomeDoAluno) && turma.equals(turmaDoAluno)){
                Boletim doAluno = new Boletim(nome, turma, aluno.getDiscNotas());
                enviaBoletim(doAluno);
            }
        }
    }
    public static void enviaBoletim(Boletim boletim){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a forma de envio: " +
                "\n 1 - email \n 2 - sms \n 3 - impresso");
        int choice = scanner.nextInt();
        FormaDeEnvio.escolhaAForma(scanner, choice, boletim);
    }
}
