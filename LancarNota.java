package solid.notasedisc;

import solid.cadastro.Aluno;
import solid.cadastro.Cadastro;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class LancarNota {
    public void lancamento(List<String> discip, Hashtable<String, Integer> discNt, Scanner sc){
        for (String s : discip) {
            System.out.println("Lance nota à disciplina " + s);
            int nt = sc.nextInt();
            situacao(nt);
            discNt.put(s, nt);
        }
    }
    public static void situacao(int nt){
        if (nt >= 5 && nt <= 10){
            System.out.println("APROVADO");
        } else if (nt < 5 && nt >= 0){
            System.err.println("REPROVADO");
        } else {
            System.out.println("NOTA INVALIDA");
        }
    }
}
