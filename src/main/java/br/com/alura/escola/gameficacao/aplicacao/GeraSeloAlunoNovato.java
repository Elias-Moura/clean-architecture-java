package br.com.alura.escola.gameficacao.aplicacao;

import br.com.alura.escola.gameficacao.dominio.selo.RepositorioSelo;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioSelo repositorioSelo;

    public GeraSeloAlunoNovato(RepositorioSelo repositorioSelo) {
        this.repositorioSelo = repositorioSelo;

    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpfDoAluno = (CPF) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpfDoAluno, "Aluno Novato");
        repositorioSelo.adicionar(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
