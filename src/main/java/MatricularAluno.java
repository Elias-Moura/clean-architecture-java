import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {
    public static void main(String[] args) {
        String nome = "Ciclonildo da Silva";
        CPF cpf = new CPF("123.456.789-09");
        Email email = new Email("ciclonildo@gmail.com");
        Aluno aluno = new Aluno(nome, cpf, email);

        RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
        repositorio.matricular(aluno);
    }

}
