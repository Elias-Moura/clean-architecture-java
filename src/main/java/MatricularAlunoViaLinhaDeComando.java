import br.com.alura.escola.aplicacao.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.matricular.MatricularAlunoDTO;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Ciclonildo da Silva";
        String cpf = "123.456.789-09";
        String email = "ciclonildo@gmail.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(new MatricularAlunoDTO(nome, cpf, email));


    }

}
