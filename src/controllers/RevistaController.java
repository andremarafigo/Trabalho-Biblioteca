package controllers;

import banco.BancoDadosBiblioteca;
import models.Revista;

public class RevistaController {
    public static void adicionarRevista(int codigo, String nome, String editora){
        Revista r = new Revista();
        r.setCod(codigo);
        r.setNome(nome);
        r.setEditora(editora);
        
        BancoDadosBiblioteca.getTabelaRevista().add(r);
    }
    
    public static Revista buscarPorCodigo(int codigo){
        for(Revista r : BancoDadosBiblioteca.getTabelaRevista()){
            if(r.getCod() == codigo){
                return r;
            }
        }    
        return null;
    }
}
