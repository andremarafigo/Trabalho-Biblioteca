package controllers;

import banco.BancoDadosBiblioteca;
import java.time.LocalDate;
import models.Aluno;
import models.Emprestimo;
import models.Livro;
import models.Midia;
import models.Professor;

public class EmprestimoController {
    public static void adicionarEmprestimo(int codigo, int produto, int codProduto, int usuario, int codUsuario){
        Emprestimo e = new Emprestimo();
        LocalDate hoje =  LocalDate.now();
        LocalDate fim;
        
        e.setCod(codigo);
        e.setProduto(produto);
        
        if(produto == 1){
            Livro l = LivroController.buscarPorCodigo(codProduto);
            e.setLivro(l);
        }else{
            Midia m = MidiaController.buscarPorCodigo(codProduto);
            e.setMidia(m);
        }
        
        e.setUsuario(usuario);
        
        if(usuario == 1){
            Professor p = ProfessorController.buscarPorCodigo(codUsuario);
            e.setProfessor(p);
        }else{
            Aluno a = AlunoController.buscarPorCodigo(codUsuario);
            e.setAluno(a);
        }

        e.setInicio(hoje);
                
        if(usuario == 1){     
            fim = hoje.plusDays(10);
            e.setFim(fim);
        }else{   
            fim = hoje.plusDays(5);
            e.setFim(fim);
        }
        
        BancoDadosBiblioteca.getTabelaEmprestimo().add(e);
    }
    
    public static Emprestimo buscarPorCodigo(int codigo){
        for(Emprestimo e : BancoDadosBiblioteca.getTabelaEmprestimo()){
            if(e.getCod() == codigo){
                return e;
            }
        }    
        return null;
    }
    
    public static LocalDate devolucao(int codigo){
        for(Emprestimo e : BancoDadosBiblioteca.getTabelaEmprestimo()){
            if(e.getCod() == codigo){
                return e.getFim();
            }
        }    
        return null;
    }
}
