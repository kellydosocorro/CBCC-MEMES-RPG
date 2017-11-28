package cbccmemes;

import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;
import cbccmemes.telas.TelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Kelly
 * Classe principal
 */
public class Main {
    private final ArrayList<Arma> armas_jogo = new ArrayList<>();
    private final ArrayList<Item> itens_jogo = new ArrayList<>();
    private TelaPrincipal tela;
    
    public static void main(String[] args) {
        Main my_class = new Main();
        my_class.addArmasDeJogo();
        
        my_class.tela = new TelaPrincipal(my_class.itens_jogo, my_class.armas_jogo);
        my_class.tela.setVisible(true);
    }
    
    public void addArmasDeJogo(){
        //Armas Comuns
        armas_jogo.add(new Arma("TCC", 500));
        armas_jogo.add(new Arma("Livro", 300));
        armas_jogo.add(new Arma("Caderno", 100));
        armas_jogo.add(new Arma("Celular tocando", 200));
        armas_jogo.add(new Arma("Catuaba", 400, 2));
        //Armas de Biologia
        armas_jogo.add(new Arma("Bisturi", 150,"Biológicas"));
        armas_jogo.add(new Arma("Vírus", 350,"Biológicas"));
        armas_jogo.add(new Arma("Injeção", 250,"Biológicas"));
        //Armas de Exatas
        armas_jogo.add(new Arma("Calculadora", 150, "Exatas"));
        armas_jogo.add(new Arma("PC", 250, "Exatas"));
        armas_jogo.add(new Arma("Hacker", 350, "Exatas"));
        //Armas de Humanas
        armas_jogo.add(new Arma("Miçangas", 150,"Humanas"));
        armas_jogo.add(new Arma("Xerox", 250,"Humanas"));
        armas_jogo.add(new Arma("Ocupação", 350,"Humanas"));
    }
}
