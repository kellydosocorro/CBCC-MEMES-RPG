package cbccmemes;

import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;
import cbccmemes.mochila.Item_Ataque;
import cbccmemes.mochila.Item_Defesa;
import cbccmemes.mochila.Item_Vida;
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
    
    
    public void addItensJogo(){
        
        //Itens comuns de ataque
                                    // Nome, Poder de ação
        itens_jogo.add(new Item_Ataque("Xerox", 200));
        itens_jogo.add(new Item_Ataque("Caderno", 150));
        itens_jogo.add(new Item_Ataque("Caneta", 250));
        
                                    // Nome, Classe, Poder, Nível, Dinheiro necessario
        itens_jogo.add(new Item_Ataque("Régua", "Exatas", 400, 0, 0));
        itens_jogo.add(new Item_Ataque("Apostila", "Humanas", 400 , 0, 0));
        itens_jogo.add(new Item_Ataque("Constituição", "Jurídicas", 400 , 0, 0));
        itens_jogo.add(new Item_Ataque("Seringa", "Biológicas", 400 , 0, 0));
        
        //Itens comuns de defesa
                                    // Nome, Poder de ação
        itens_jogo.add(new Item_Defesa("Livro", 100));
        itens_jogo.add(new Item_Defesa("Exercícios feitos", 150));
        itens_jogo.add(new Item_Defesa("Artigo", 350));
        
                            // Vida, Poder de ação, Dinheiro, Nome
        // itens_jogo.add(new Item_Defesa(0, 100, 0, "Livro"));
        
        //Itens de vida
                                    // Valor, Nome, Nível
        itens_jogo.add(new Item_Vida(50, "Garrfa de Água", 0));
        itens_jogo.add(new Item_Vida(100, "Chop da BC", 1));
        itens_jogo.add(new Item_Vida(200, "Lanche do Ver-o-pesinho", 3));
        itens_jogo.add(new Item_Vida(300, "Bandejão do RU", 4));
        
    }
    
}
