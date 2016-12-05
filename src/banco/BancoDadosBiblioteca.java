package banco;

import java.util.List;
import java.util.ArrayList;
import models.Emprestimo;
import models.Livro;
import models.Midia;
import models.Revista;
import models.Aluno;
import models.Professor;


public class BancoDadosBiblioteca {
    private static List<Livro> tabelaLivro;
    private static List<Revista> tabelaRevista;
    private static List<Midia> tabelaMidia;
    private static List<Aluno> tabelaAluno;
    private static List<Professor> tabelaProfessor;
    private static List<Emprestimo> tabelaEmprestimo;

    public static List<Livro> getTabelaLivro() {
        return tabelaLivro;
    }

    public static List<Revista> getTabelaRevista() {
        return tabelaRevista;
    }

    public static List<Midia> getTabelaMidia() {
        return tabelaMidia;
    }

    public static List<Aluno> getTabelaAluno() {
        return tabelaAluno;
    }

    public static List<Emprestimo> getTabelaEmprestimo() {
        return tabelaEmprestimo;
    }
    
    public static List<Professor> getTabelaProfessor() {
        return tabelaProfessor;
    }
    
    public static void inicializarBanco(){
        tabelaLivro = new ArrayList<Livro>();
        tabelaRevista = new ArrayList<Revista>();
        tabelaMidia = new ArrayList<Midia>();
        tabelaAluno = new ArrayList<Aluno>();
        tabelaProfessor = new ArrayList<Professor>();
        tabelaEmprestimo = new ArrayList<Emprestimo>();
    }

}
