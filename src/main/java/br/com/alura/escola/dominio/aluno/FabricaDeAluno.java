package br.com.alura.escola.dominio.aluno;

//Padrão Builder
//Problemas nessa impl: O dev pode chamar o método addTelefone antes do criarAlunoComNomeCPFeEmail
//Gerando null pointer exception.

public class FabricaDeAluno {
    private Aluno aluno;

    public FabricaDeAluno criarAlunoComNomeCPFeEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(nome, new CPF(cpf), new Email(email));
        return this;
    }

    public FabricaDeAluno addTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return aluno;
    }
}
