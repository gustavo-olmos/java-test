package solid.notasedisc;

import solid.cadastro.Aluno;
import solid.cadastro.Cadastro;

import java.util.List;

public class ExibeBoletim {
    
    public static void showBoletim(){
        List<Aluno> novo = Cadastro.getDbAlunos();
        for(Aluno obj : novo){
            System.out.println(obj);
        }
    }
}
