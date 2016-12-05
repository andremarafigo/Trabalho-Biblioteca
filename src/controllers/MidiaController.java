package controllers;

import banco.BancoDadosBiblioteca;
import models.Midia;

public class MidiaController {
    public static void adicionarMidia(int codigo, String nome, String diretor){
        Midia m = new Midia();
        m.setCod(codigo);
        m.setNome(nome);
        m.setDiretor(diretor);
        
        BancoDadosBiblioteca.getTabelaMidia().add(m);
    }
    
    public static Midia buscarPorCodigo(int codigo){
        for(Midia m : BancoDadosBiblioteca.getTabelaMidia()){
            if(m.getCod() == codigo){
                return m;
            }
        }    
        return null;
    }
}
