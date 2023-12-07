package br.com.alura.escola.academico.dominio.aluno;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || !ddd.matches("^\\d{2}$") || ddd == ""){
            throw new IllegalArgumentException("DDD inválido");
        } else if (numero == null || !numero.matches("^\\d{8,9}$") || numero == "") {
            throw new IllegalArgumentException("Número inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
