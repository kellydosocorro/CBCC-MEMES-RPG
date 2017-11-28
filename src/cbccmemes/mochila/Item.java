package cbccmemes.mochila;

import cbccmemes.personagens.Personagem;
import java.util.Random;

public class Item {
    private int nivel_minimo;
    private String nome;
    private String poder_ataque;
    String classe;
    
    // Item de nível minínimo
    public Item(String nome, String poder_ataque, int nivel_minimo) {
        this.nome = nome;
        this.poder_ataque = poder_ataque;
        this.nivel_minimo = nivel_minimo;
    }
    // Item especial de classes
    public Item(String nome, String poder_ataque, String classe) {
        this.nome = nome;
        this.poder_ataque = poder_ataque;
        this.classe = classe;
    }
    
    public Item(String nome, String poder_ataque){
        this.nome = nome;
        this.poder_ataque = poder_ataque;
                
    }
    
    public static Item getItemAleatorio(Personagem personagem, Item itens[]){
        int quantidade_itens = itens.length;
        int id; //id_item
        Random r = new Random();
        
        id = r.nextInt(quantidade_itens-1);
        
        return(itens[id].nivel_minimo <= personagem.getNivel())?itens[id]:null;
    }

    public void setNivel_minimo(int nivel_minimo) {
        this.nivel_minimo = nivel_minimo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoder_ataque(String poder_ataque) {
        this.poder_ataque = poder_ataque;
    }

    public int getNivel_minimo() {
        return nivel_minimo;
    }

    public String getNome() {
        return nome;
    }

    public String getPoder_ataque() {
        return poder_ataque;
    }
}
