package cbccmemes.ambientes;

import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;
import java.util.ArrayList;

public class Mercado extends Ambiente{
    private final ArrayList<Arma> armas;
    private final ArrayList<Item> itens;

    public Mercado(ArrayList<Arma> armas, ArrayList<Item> itens, String nome, int nivel_minimo, String url_image) {
        super(nome, nivel_minimo, url_image);
        this.armas = armas;
        this.itens = itens;
    }
    
}
