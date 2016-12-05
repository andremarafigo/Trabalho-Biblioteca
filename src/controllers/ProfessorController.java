package controllers;

import banco.BancoDadosBiblioteca;
import models.Professor;

public class ProfessorController {
    public static void adicionarProfessor(int codigo, String nome, String cpf){
        Professor p = new Professor();
        p.setCod(codigo);
        p.setNome(nome);
        p.setCpf(cpf);
        
        BancoDadosBiblioteca.getTabelaProfessor().add(p);
    }
    
    public static Professor buscarPorCodigo(int codigo){
        for(Professor p : BancoDadosBiblioteca.getTabelaProfessor()){
            if(p.getCod() == codigo){
                return p;
            }
        }    
        return null;
    }
}
