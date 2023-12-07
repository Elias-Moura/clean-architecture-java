package br.com.alura.escola.gameficacao.infra.selo;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gameficacao.dominio.selo.RepositorioSelo;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioSelo {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public List<Selo> pegarTodos() {
        return selos;
    }

    @Override
    public List<Selo> pegarPorNome(String nome) {
        return selos.stream().filter(selo -> selo.getNome().equals(nome)).collect(Collectors.toList());
    }

    @Override
    public void adicionar(Selo selo) {
        selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpf) {
        return this.selos.stream().filter(selo -> selo.getCpfDoAluno().equals(cpf)).collect(Collectors.toList());
    }

    @Override
    public void deletar(Selo selo) {

    }

    @Override
    public void editar(Selo selo) {

    }
}
