package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("123", "123456"));
    }
}
