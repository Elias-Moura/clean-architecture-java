package br.com.alura.escola.dominio.aluno;

public class AlunoNaoEncontradoException extends RuntimeException {
    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno não encontrado com CPF: " + cpf.getNumero());
    }
}
