package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

//Entidade
//DDD -> AGGREGATE ROOT -> Uma entidade que tem relação com um ou muitos Value Objects
public class Aluno {
    private String nome;
    private CPF cpf;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    private String senha;

    public Aluno(String nome, CPF cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(String ddd, String numero){
        if (this.telefones.size() == 2) { //Invariante (ou regra de negócio)
            throw new LimiteDeTelefonesException("Número máximo de telefones atingidos.");
        }
        this.telefones.add(new Telefone(ddd,numero));
    }
}
