package controllers;

import banco.BancoDadosBiblioteca;
import models.Aluno;

public class AlunoController {
    public static void adicionarAluno(int codigo, String nome, String cpf){
        Aluno a = new Aluno();
        a.setCod(codigo);
        a.setNome(nome);
        a.setCpf(cpf);
        
        BancoDadosBiblioteca.getTabelaAluno().add(a);
    }
    
    public static Aluno buscarPorCodigo(int codigo){
        for(Aluno a : BancoDadosBiblioteca.getTabelaAluno()){
            if(a.getCod() == codigo){
                return a;
            }
        }    
        return null;
    }
}
