package views;

import banco.BancoDadosBiblioteca;
import controllers.AlunoController;
import controllers.EmprestimoController;
import controllers.LivroController;
import controllers.MidiaController;
import controllers.ProfessorController;
import controllers.RevistaController;
import java.time.LocalDate;
import java.util.Scanner;
import models.Aluno;
import models.Emprestimo;
import models.Livro;
import models.Midia;
import models.Professor;
import models.Revista;

public class MenuViews {
    
    Scanner scan = new Scanner(System.in);
    
    public boolean exibirMenuViews(){
        boolean x = true;
 
        BancoDadosBiblioteca.inicializarBanco();

        while(x != false){
            System.out.println("");
            System.out.println("Digite:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livro");
            System.out.println("3 - Exibir Livro por Codigo");
            System.out.println("");
            System.out.println("4 - Cadastrar Midia");
            System.out.println("5 - Listar Midia");
            System.out.println("6 - Exibir Midia por Codigo");
            System.out.println("");
            System.out.println("7 - Cadastrar Revista");
            System.out.println("8 - Listar Revista");
            System.out.println("9 - Exibir Revista por Codigo");
            System.out.println("");
            System.out.println("10 - Cadastrar Aluno");
            System.out.println("11 - Listar Alunos");
            System.out.println("12 - Exibir Aluno por Codigo");
            System.out.println("");
            System.out.println("13 - Cadastrar Professor");
            System.out.println("14 - Listar Professor");
            System.out.println("15 - Exibir Professor por Codigo");
            System.out.println("");
            System.out.println("16 - Cadastrar Emprestimo");
            System.out.println("17 - Listar Emprestimo");
            System.out.println("18 - Exibir Emprestimo por Codigo");
            System.out.println("");
            System.out.println("19 - Sair");
            System.out.println("");
            
            int opcao = scan.nextInt();
            scan.nextLine();

            if((opcao <= 0) || (opcao > 19)){
                System.out.println("Opcao invalida!");
            }else{
                switch(opcao){
                    case 1:
                        adicionarLivro();
                        break;
                    case 2:
                        listarLivro();
                        break;     
                    case 3:
                        exibirLivroPorCodigo();
                        break;
                    case 4:
                        adicionarMidia();
                        break;
                    case 5:
                        listarMidia();
                        break;     
                    case 6:
                        exibirMidiaPorCodigo();
                        break;
                    case 7:
                        adicionarRevista();
                        break;
                    case 8:
                        listarRevista();
                        break;     
                    case 9:
                        exibirRevistaPorCodigo();
                        break;
                    case 10:
                        adicionarAluno();
                        break;
                    case 11:
                        listarAluno();
                        break;     
                    case 12:
                        exibirAlunoPorCodigo();
                        break;
                    case 13:
                        adicionarProfessor();
                        break;
                    case 14:
                        listarProfessor();
                        break;     
                    case 15:
                        exibirProfessorPorCodigo();
                        break;
                    case 16:
                        adicionarEmprestimo();
                        break;
                    case 17:
                        listarEmprestimo();
                        break;     
                    case 18:
                        exibirEmprestimoPorCodigo();
                        break;
                    case 19:
                        x = false;
                        break;
                }
            }
        }
        return x;
    }
    
    
    //Livro
    public void adicionarLivro(){
        System.out.println("");
        System.out.print("Digite o codigo do livro: ");
        int cod = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o nome do livro: ");
        String nome = scan.nextLine();

        System.out.print("Digite o editora do livro: ");
        String ator = scan.nextLine();

        LivroController.adicionarLivro(cod, nome, ator);
    }

    public void listarLivro(){
        System.out.println("");
        System.out.println("--- LIVROS ---");

        for(Livro l : BancoDadosBiblioteca.getTabelaLivro()){
            System.out.println("Codigo: " + l.getCod());
            System.out.println("Nome: " + l.getNome());
            System.out.println("Editora: " + l.getEditora());
            System.out.println("");
        }
        System.out.println("---");
    }

    public void exibirLivroPorCodigo(){
        System.out.println("");
        System.out.println("Digite o código do livro: ");
        int cod = scan.nextInt();
        scan.nextLine();

        Livro l = LivroController.buscarPorCodigo(cod);
        
        System.out.println("");
        if(l != null){
            System.out.println("Dados do Livro");
            System.out.println("Codigo: " + l.getCod());
            System.out.println("Nome: " + l.getNome());
            System.out.println("Editora: " + l.getEditora());
            System.out.println("");
        }else{
            System.out.println("Livro não encontrado!");
        }
    }
    
    
    //Midia
    public void adicionarMidia(){
        System.out.println("");
        System.out.print("Digite o codigo do midia: ");
        int cod = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Digite o nome do midia: ");
        String nome = scan.nextLine();
        
        System.out.print("Digite o diretor do midia: ");
        String diretor = scan.nextLine();
        
        MidiaController.adicionarMidia(cod, nome, diretor);
    }
    
    public void listarMidia(){
        System.out.println("");
        System.out.println("--- MIDIAS --");
        
        for(Midia m : BancoDadosBiblioteca.getTabelaMidia()){
            System.out.println("Codigo: " + m.getCod());
            System.out.println("Nome: " + m.getNome());
            System.out.println("Diretor: " + m.getDiretor());
            System.out.println("");
        }
        System.out.println("---");
    }
    
    public void exibirMidiaPorCodigo(){
        System.out.println("");
        System.out.println("Digite o código do midia: ");
        int cod = scan.nextInt();
        scan.nextLine();
       
        Midia m = MidiaController.buscarPorCodigo(cod);
        
        System.out.println("");
        if(m != null){
            System.out.println("Dados da Midia");
            System.out.println("Codigo: " + m.getCod());
            System.out.println("Nome: " + m.getNome());
            System.out.println("Diretor: " + m.getDiretor());
            System.out.println("");
        }else{
            System.out.println("Midia não encontrada!");
        }
    }
    
    
    //Revista
    public void adicionarRevista(){
        System.out.println("");
        System.out.print("Digite o codigo do revista: ");
        int cod = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Digite o nome do revista: ");
        String nome = scan.nextLine();
        
        System.out.print("Digite o editora do revista: ");
        String editora = scan.nextLine();
        
        RevistaController.adicionarRevista(cod, nome, editora);
    }
    
    public void listarRevista(){
        System.out.println("");
        System.out.println("--- REVISTAS --");
        
        for(Revista r : BancoDadosBiblioteca.getTabelaRevista()){
            System.out.println("Codigo: " + r.getCod());
            System.out.println("Nome: " + r.getNome());
            System.out.println("Editora: " + r.getEditora());
            System.out.println("");
        }
        System.out.println("---");
    }
    
    public void exibirRevistaPorCodigo(){
        System.out.println("");
        System.out.println("Digite o código do revista: ");
        int cod = scan.nextInt();
        scan.nextLine();
       
        Revista r = RevistaController.buscarPorCodigo(cod);
        
        System.out.println("");
        if(r != null){
            System.out.println("Dados da Revista");
            System.out.println("Codigo: " + r.getCod());
            System.out.println("Nome: " + r.getNome());
            System.out.println("Editora: " + r.getEditora());
            System.out.println("");
        }else{
            System.out.println("Revista não encontrada!");
        }
    }
    
    
    //Aluno
    public void adicionarAluno(){
        System.out.println("");
        System.out.print("Digite o codigo do aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        
        System.out.print("Digite o CPF do aluno: ");
        String cpf = scan.nextLine();
        
        AlunoController.adicionarAluno(cod, nome, cpf);
    }
    
    public void listarAluno(){
        System.out.println("");
        System.out.println("--- ALUNOS ---");
        
        for(Aluno a : BancoDadosBiblioteca.getTabelaAluno()){
            System.out.println("Codigo: " + a.getCod());
            System.out.println("Nome: " + a.getNome());
            System.out.println("CPF: " + a.getCpf());
            System.out.println("");
        }
        System.out.println("---");
    }
    
    public void exibirAlunoPorCodigo(){
        System.out.println("");
        System.out.println("Digite o código do aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();
       
        Aluno a = AlunoController.buscarPorCodigo(cod);
        
        System.out.println("");
        if(a != null){
            System.out.println("Dados do Aluno");
            System.out.println("Codigo: " + a.getCod());
            System.out.println("Nome: " + a.getNome());
            System.out.println("CPF: " + a.getCpf());
            System.out.println("");
        }else{
            System.out.println("Aluno não encontrado!");
        }
    }
    
    
    //Professor    
    public void adicionarProfessor(){
        System.out.println("");
        System.out.print("Digite o codigo do professor: ");
        int cod = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Digite o nome do professor: ");
        String nome = scan.nextLine();
        
        System.out.print("Digite o CPF do professor: ");
        String cpf = scan.nextLine();
        
        ProfessorController.adicionarProfessor(cod, nome, cpf);
    }
    
    public void listarProfessor(){
        System.out.println("");
        System.out.println("--- PROFESSORES ---");
        
        for(Professor p : BancoDadosBiblioteca.getTabelaProfessor()){
            System.out.println("Codigo: " + p.getCod());
            System.out.println("Nome: " + p.getNome());
            System.out.println("CPF: " + p.getCpf());
            System.out.println("");
        }
        System.out.println("---");
    }
    
    public void exibirProfessorPorCodigo(){
        System.out.println("");
        System.out.println("Digite o código do professor: ");
        int cod = scan.nextInt();
        scan.nextLine();
       
        Professor p = ProfessorController.buscarPorCodigo(cod);
        
        System.out.println("");
        if(p != null){
            System.out.println("Dados do Professor");
            System.out.println("Codigo: " + p.getCod());
            System.out.println("Nome: " + p.getNome());
            System.out.println("CPF: " + p.getCpf());
            System.out.println("");
        }else{
            System.out.println("Professor não encontrado!");
        }
    }
    
    
    //Emprestimo
    private void adicionarEmprestimo() {
        System.out.println("");
        System.out.print("Digite o código do emprestimo: ");
        int cod = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Escolha o produto");
        System.out.println("1 - Livro");
        System.out.println("2 - Midia");
        int prod = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Digite o código do produto: ");
        int codProd = scan.nextInt();
        scan.nextLine();
        
        if(prod == 1){
            Livro l = LivroController.buscarPorCodigo(codProd);
            if(l == null){
                int x = 1; 
                while(x == 1){
                    System.out.println("Código não existe, digite novamente!");
                    codProd = scan.nextInt();
                    scan.nextLine();
                    
                    l = LivroController.buscarPorCodigo(codProd);
                    if(l != null){
                        x = 0;
                    }
                }
            }
        }else{
            Midia m = MidiaController.buscarPorCodigo(codProd);
            if(m == null){
                int x = 1; 
                while(x == 1){
                    System.out.println("Código não existe, digite novamente!");
                    codProd = scan.nextInt();
                    scan.nextLine();
                    
                    m = MidiaController.buscarPorCodigo(codProd);
                    if(m != null){
                        x = 0;
                    }
                }
            }
        }
        
        System.out.println("Escolha o usuario");
        System.out.println("1 - Professor");
        System.out.println("2 - Aluno");
        int usuario = scan.nextInt();
        scan.nextLine();
        
        int codUsuario;
        
        if(usuario == 1){
            System.out.print("Digite o código do Professor: ");
            codUsuario = scan.nextInt();
            scan.nextLine();
            Professor p = ProfessorController.buscarPorCodigo(codUsuario);
            if(p == null){
                int x = 1; 
                while(x == 1){
                    System.out.println("Código não existe, digite novamente!");
                    codUsuario = scan.nextInt();
                    scan.nextLine();
                    
                    p = ProfessorController.buscarPorCodigo(codUsuario);
                    if(p != null){
                        x = 0;
                    }
                }
            }
        }else{
            System.out.print("Digite o código do Aluno: ");
            codUsuario = scan.nextInt();
            scan.nextLine();
            Aluno a = AlunoController.buscarPorCodigo(codUsuario);
            if(a == null){
                int x = 1; 
                while(x == 1){
                    System.out.println("Código não existe, digite novamente!");
                    codUsuario = scan.nextInt();
                    scan.nextLine();
                    
                    a = AlunoController.buscarPorCodigo(codUsuario);
                    if(a != null){
                        x = 0;
                    }
                }
            }
        }

        EmprestimoController.adicionarEmprestimo(cod, prod, codProd, usuario, codUsuario);
        
        LocalDate devolucao = EmprestimoController.devolucao(cod);
        
        System.out.println("data da devolução: " + devolucao);
    }
    
    public void listarEmprestimo(){
        System.out.println("");
        System.out.println("--- EMPRESTIMOS ---");
        
        for(Emprestimo e : BancoDadosBiblioteca.getTabelaEmprestimo()){
            System.out.println("Codigo: " + e.getCod());
            
            if(e.getProduto() == 1){
                System.out.println("Livro: " + e.getLivro().getNome());
                System.out.println("Editora: " + e.getLivro().getEditora());
            }else{
                System.out.println("Midia: " + e.getMidia().getNome());
                System.out.println("Diretor: " + e.getMidia().getDiretor());
            }
            
            System.out.println("Usuario: " + e.getUsuario());
            
            if(e.getUsuario() == 1){
                System.out.println("Professor: " + e.getProfessor().getNome());
                System.out.println("CPF: " + e.getProfessor().getCpf());
            }else{
                System.out.println("Aluno: " + e.getAluno().getNome());
                System.out.println("CPF: " + e.getAluno().getCpf());
            }
            
            System.out.println("Data de Emprestimo: " + e.getInicio());
            System.out.println("Data de Devolução: " + e.getFim());
            System.out.println("");
        }
        System.out.println("---");
    }
    
    public void exibirEmprestimoPorCodigo(){
        System.out.println("");
        System.out.println("Digite o código do emprestimo: ");
        int cod = scan.nextInt();
        scan.nextLine();
       
        Emprestimo e = EmprestimoController.buscarPorCodigo(cod);
        
        System.out.println("");
        if(e != null){
            System.out.println("Codigo: " + e.getCod());
            
            if(e.getProduto() == 1){
                System.out.println("Livro: " + e.getLivro().getNome());
                System.out.println("Editora: " + e.getLivro().getEditora());
            }else{
                System.out.println("Midia: " + e.getMidia().getNome());
                System.out.println("Diretor: " + e.getMidia().getDiretor());
            }
            
            System.out.println("Usuario: " + e.getUsuario());
            
            if(e.getUsuario() == 1){
                System.out.println("Professor: " + e.getProfessor().getNome());
                System.out.println("CPF: " + e.getProfessor().getCpf());
            }else{
                System.out.println("Aluno: " + e.getAluno().getNome());
                System.out.println("CPF: " + e.getAluno().getCpf());
            }
            
            System.out.println("Data de Emprestimo: " + e.getInicio());
            System.out.println("Data de Devolução: " + e.getFim());
            System.out.println("");
        }else{
            System.out.println("Professor não encontrado!");
        }
    }
}
