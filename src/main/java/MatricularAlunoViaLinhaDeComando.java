import br.com.alura.escola.academico.aplicacao.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.matricular.MatricularAlunoDTO;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Ciclonildo da Silva";
        String cpf = "123.456.789-09";
        String email = "ciclonildo@gmail.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());
        MatricularAluno matricular = new MatricularAluno(
                new RepositorioDeAlunosEmMemoria(),
                publicador
        );
        matricular.executa(new MatricularAlunoDTO(nome, cpf, email));


    }

}
