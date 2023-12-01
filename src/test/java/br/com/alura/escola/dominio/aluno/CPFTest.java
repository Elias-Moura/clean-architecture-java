package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {
    @Test
    void naoDeveriaCriarCPFComInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("CPF invalido"));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("1234567890"));
    }
}
