package solid.cadastro;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    protected static List<Aluno> dbAlunos = new ArrayList<>();

    public static List<Aluno> getDbAlunos() { return dbAlunos; }

    public void cadastrarNovoAluno(Aluno novo){
        dbAlunos.add(novo);
    }
}
