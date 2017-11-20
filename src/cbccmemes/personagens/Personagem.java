package cbccmemes.personagens;
import cbccmemes.DescricaoPersonagem;
import cbccmemes.ambientes.Ambiente;
import cbccmemes.mochila.*;
import java.util.Random;

public abstract class Personagem{
    
    private static final int LIMITE_MOCHILA = 3;
    
    private String nome;
    private int nivel;
    private int vida;
    private int ataque;
    private int defesa;
    private int velocidade;
    private Item item_equipado;
    private Arma arma_equipada;
    private Ambiente ambiente;
    private String url_imagem;

    public Personagem(String nome, int nivel, int vida, int ataque, int defesa, int velocidade, Item item_batalha, Arma arma_batalha, Ambiente ambiente) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.item_equipado = item_batalha;
        this.arma_equipada = arma_batalha;
        this.ambiente = ambiente;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }    

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Item getItem_equipado() {
        return item_equipado;
    }

    public void setItem_equipado(Item item_equipado) {
        this.item_equipado = item_equipado;
    }

    public Arma getArma_equipada() {
        return arma_equipada;
    }

    public void setArma_equipada(Arma arma_equipada) {
        this.arma_equipada = arma_equipada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getLIMITE_MOCHILA() {
        return LIMITE_MOCHILA;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public String getUrl_imagem() {
        return url_imagem;
    }

    public void setUrl_imagem(String url_imagem) {
        this.url_imagem = url_imagem;
    }
    
    public abstract void atacar(Personagem adversario);
    
    public abstract void descricaoPerosnagem(java.awt.Frame parent);
}
