package controllers;

import banco.BancoDadosBiblioteca;
import models.Livro;

public class LivroController {
    public static void adicionarLivro(int codigo, String nome, String ator){
        Livro l = new Livro();
        l.setCod(codigo);
        l.setNome(nome);
        l.setEditora(ator);
        
        BancoDadosBiblioteca.getTabelaLivro().add(l);
    }
    
    public static Livro buscarPorCodigo(int codigo){
        for(Livro l : BancoDadosBiblioteca.getTabelaLivro()){
            if(l.getCod() == codigo){
                return l;
            }
        }    
        return null;
    }
}
