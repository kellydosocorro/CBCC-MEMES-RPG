package cbccmemes.mochila;

import cbccmemes.personagens.Personagem;
import java.util.Random;

public abstract class Item {
    private int nivel_minimo;
    private String nome;
    private int poder;
    private int poder_defesa;
    String classe;
    public double preco;
    private int vida;
    
    // Item para vida
    public Item(int vida, String nome, int nivel_minimo) {
        this.vida = vida;
        this.nome = nome;
        this.nivel_minimo = nivel_minimo;
    }
    
    public Item(String nome, String classe, int poder_ataque, int nivel_minimo, double preco) {
        this.nome = nome;
        this.classe = classe;
        this.poder = poder_ataque;
        this.nivel_minimo = nivel_minimo;
        this.preco = preco;
    }
    
    // Item para defesa
    public Item(int vida, int poder_defesa, double preco, String nome) {
        this.vida = vida;
        this.nome = nome;
        this.nivel_minimo = poder_defesa;
        this.preco = preco;
    }
    
    // Item de nível minínimo
    public Item(String nome, int poder_ataque, int nivel_minimo) {
        this.nome = nome;
        this.poder = poder_ataque;
        this.nivel_minimo = nivel_minimo;
    }
    // Item especial de classes
    public Item(String nome, int poder_ataque, String classe) {
        this.nome = nome;
        this.poder = poder_ataque;
        this.classe = classe;
    }
    
    public Item(String nome, int poder){
        this.nome = nome;
        this.poder = poder;        
    }
    
    public abstract int incrementValue(Personagem user);
    
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

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getNivel_minimo() {
        return nivel_minimo;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }
}
