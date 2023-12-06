package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;

import java.time.format.DateTimeFormatter;

//Ouvinte do evento
public class LogDeAlunoMatriculado extends Ouvinte {
    @Override
    public void reageAo(Evento evento) {
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(
                String.format("Aluno com CPF %s matriculado em: %s",
                        //casting
                        ((AlunoMatriculado) evento).getCpfDoAluno(),
                        momentoFormatado
                )
        );
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
