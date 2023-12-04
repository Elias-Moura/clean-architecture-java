package br.com.alura.escola.aplicacao.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;

public record MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {

    public Aluno criarAluno() {
        return new Aluno(nomeAluno, new CPF(cpfAluno), new Email(emailAluno));
    }
}
