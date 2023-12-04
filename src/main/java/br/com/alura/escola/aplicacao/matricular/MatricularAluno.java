package br.com.alura.escola.aplicacao.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;


//UseCase
public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    // Pattern command
    public void executa(MatricularAlunoDTO aluno){
        Aluno novo = aluno.criarAluno();
        repositorio.matricular(novo);
    }
}
