package cbccmemes.mochila;

import cbccmemes.personagens.Personagem;
import java.util.Random;

public abstract class Item {
    private int nivel_minimo;
    private String nome;
    private int poder_ataque;
    private int poder_defesa;
    String classe;
    public double dinheiro;
    private int vida;
    
    // Item para vida
    public Item(int vida, String nome, int nivel_minimo) {
        this.vida = vida;
        this.nome = nome;
        this.nivel_minimo = nivel_minimo;
    }
    
    // Item para defesa
    public Item(int vida, int poder_defesa, String nome) {
        this.vida = vida;
        this.nome = nome;
        this.nivel_minimo = poder_defesa;
    }
    
    // Item de nível minínimo
    public Item(String nome, int poder_ataque, int nivel_minimo) {
        this.nome = nome;
        this.poder_ataque = poder_ataque;
        this.nivel_minimo = nivel_minimo;
    }
    // Item especial de classes
    public Item(String nome, int poder_ataque, String classe) {
        this.nome = nome;
        this.poder_ataque = poder_ataque;
        this.classe = classe;
    }
    
    public Item(String nome, int poder_ataque){
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

    public void setPoder_ataque(int poder_ataque) {
        this.poder_ataque = poder_ataque;
    }

    public int getNivel_minimo() {
        return nivel_minimo;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder_ataque() {
        return poder_ataque;
    }
}
