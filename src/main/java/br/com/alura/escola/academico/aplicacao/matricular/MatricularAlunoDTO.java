package br.com.alura.escola.academico.aplicacao.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.Email;

public record MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {

    public Aluno criarAluno() {
        return new Aluno(nomeAluno, new CPF(cpfAluno), new Email(emailAluno));
    }
}
