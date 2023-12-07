package br.com.alura.escola.academico.aplicacao.matricular;

import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        var repositorio = new RepositorioDeAlunosEmMemoria();
        var publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());

        var useCase = new MatricularAluno(repositorio, publicador);

        MatricularAlunoDTO dados = new MatricularAlunoDTO(
                "Ciclonildo",
                "123.456.789-00",
                "ciclonildo@gmail.com"
        );
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        assertEquals("Ciclonildo", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf().toString());
        assertEquals("ciclonildo@gmail.com", encontrado.getEmail());


    }

}
