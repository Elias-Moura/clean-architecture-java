package br.com.alura.escola.aplicacao.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;


//UseCase
public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    // Pattern command
    public void executa(MatricularAlunoDTO aluno){
        Aluno novo = aluno.criarAluno();
        repositorio.matricular(novo);
        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
        publicador.publicar(evento);
    }
}
