package solid.cadastro;

import java.util.Hashtable;

public class Aluno {
    private String nome;
    private String turma;
    protected Hashtable<String, Integer> discNotas;

    public Aluno(String nome, String turma, Hashtable<String, Integer> discNotas) {
        this.nome = nome;
        this.turma = turma;
        this.discNotas = discNotas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "\n nome='" + nome + '\'' +
                "\n turma='" + turma + '\'' +
                "\n discNotas=" + discNotas +
                '}';
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTurma() { return turma; }
    public void setTurma(String turma) { this.turma = turma; }

    public Hashtable<String, Integer> getDiscNotas() { return discNotas; }
    public void setDiscNotas(Hashtable<String, Integer> discNotas) { this.discNotas = discNotas; }
}
