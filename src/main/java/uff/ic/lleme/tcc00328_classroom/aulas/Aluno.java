package uff.ic.lleme.tcc00328_classroom.aulas;

public class Aluno extends Pessoa {

    public String matricula = null;
    public static String depto = null;
    public Inscricao[] inscricoes = new Inscricao[10];

    public Aluno() {

    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

}
