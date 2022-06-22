package solid;

import solid.cadastro.AlunoInstancia;
import solid.boletim.Boletim;
import solid.notasedisc.ExibeBoletim;

import java.util.Scanner;

public class SchoolSystemRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ciclo = true;
        do{
            System.out.println("-----------------------");
            System.out.println("Digite o que gostaria de fazer" +
                    "\n 1 - Cadastrar Aluno \n 2 - Exibir alunos \n 3 - Enviar Boletim \n 4 - sair");
            System.out.println("_______________________");

            String action = scanner.next();
            String escolha;
            switch (action){
                case "1" :
                    do{
                        AlunoInstancia.instanciar();

                        System.out.println("Digite N para sair ou algo para cadastrar novamente");
                        escolha = scanner.next().toUpperCase();
                    }while(!escolha.equals("N"));
                    break;
                case "2" :
                    System.out.println("Exibindo...");
                    ExibeBoletim.showBoletim();
                    break;
                case "3" :
                    System.out.println("Qual o aluno?");
                    String nomeDoAluno = scanner.next();
                    System.out.println("Qual a turma?");
                    String turmaDoAluno = scanner.next();

                    Boletim.preparaBoletim(nomeDoAluno, turmaDoAluno);
                    break;
                case "4":
                    System.out.println("ENCERRANDO SISTEMA...");
                    System.out.println("_____________________");
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente");
            }
        }while(ciclo);
    }
}
