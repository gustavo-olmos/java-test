package solid.cadastro;

import solid.notasedisc.LancarNota;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class AlunoInstancia {
    public static void instanciar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome:");
        String name = scan.next();

        System.out.println("Turma:");
        String classe = scan.next();

        System.out.println("Disciplinas:");
        List<String> disc = new ArrayList<>();
        int cnt = 0;
        do{
            String grade = scan.next();
            disc.add(grade);
            cnt++;
        }while(cnt<3);

        Hashtable<String, Integer> discNota = new Hashtable<>();

        LancarNota lanc = new LancarNota();
        lanc.lancamento(disc, discNota, scan);

        Aluno novoAluno = new Aluno(name, classe, discNota);

        Cadastro cad = new Cadastro();
        cad.cadastrarNovoAluno(novoAluno);
    }
}
