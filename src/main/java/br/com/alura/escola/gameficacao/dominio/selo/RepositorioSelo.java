package br.com.alura.escola.gameficacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioSelo {
    List<Selo> pegarTodos();
    List<Selo> pegarPorNome(String name);
    void adicionar(Selo selo);
    List<Selo> selosDoAlunoDeCPF(CPF cpf);
    void deletar(Selo selo);
    void editar(Selo selo);

}
