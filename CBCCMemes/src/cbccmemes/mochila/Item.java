package cbccmemes.mochila;

import cbccmemes.personagens.Personagem;
import java.util.Random;

public class Item {
    private int nivel_minimo;
    private String nome;
    private String poder;
    
    public static Item getItemAleatorio(Personagem personagem, Item itens[]){
        int quantidade_itens = itens.length;
        int id; //id_item
        Random r = new Random();
        
        id = r.nextInt(quantidade_itens);
        
        return(itens[id].nivel_minimo <= personagem.getNivel())?itens[id]:null;
    }
}
