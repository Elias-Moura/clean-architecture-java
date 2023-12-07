package br.com.alura.escola.academico.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        this.aluno = new FabricaDeAluno()
                .criarAlunoComNomeCPFeEmail("Elias", "123.567.789-00", "elias@java.com")
                .criar();
    }

    @Test
    void deveriaPermitirAdicionarUmTelefone(){
        this.aluno.adicionarTelefone("21", "980822343");
        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    void deveriaPermitirAdiconarDoisTelefones(){
        this.aluno.adicionarTelefone("21", "980822343");
        this.aluno.adicionarTelefone("21", "980822343");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    void NaoDeveriaDeixarAdicionarMaisDoQueDoisTelefones(){
        this.aluno.adicionarTelefone("21", "980822343");
        this.aluno.adicionarTelefone("21", "980288432");

        assertThrows(LimiteDeTelefonesException.class,
                () -> aluno.adicionarTelefone("21", "980288432"));
    }
}
