package biblioteca;

import views.MenuViews;
import banco.BancoDadosBiblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        MenuViews menuViews = new MenuViews();
        boolean x = true;
        
        while (x == true){
            x = menuViews.exibirMenuViews();
        }
    }    
}
