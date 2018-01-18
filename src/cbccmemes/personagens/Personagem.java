package cbccmemes.personagens;
import cbccmemes.mochila.*;
import javax.swing.ImageIcon;

public abstract class Personagem{
    
    private static final int LIMITE_MOCHILA = 5;
    
    private String nome;
    private int nivel;
    private int vida;
    private int limite_vida;
    private int ataque;
    private int defesa;
    private int velocidade;
    private Item item_equipado;
    private Arma arma_equipada;
    private ImageIcon imagem;

    public Personagem(String nome, int nivel, int vida, int ataque, int defesa, int velocidade, Item item_batalha, Arma arma_batalha) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.limite_vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.item_equipado = item_batalha;
        this.arma_equipada = arma_batalha;
        this.imagem = new ImageIcon(getClass().getResource("/cbccmemes/imagens/avatar.png"));
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
    
    public ImageIcon getImagem() {
        return imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.imagem = imagem;
    }
    
    public abstract void atacar(Personagem adversario);
    
    public abstract String descricaoPerosnagem(java.awt.Frame parent);

    public int getLimite_vida() {
        return limite_vida;
    }

    public void setLimite_vida(int limite_vida) {
        this.limite_vida = limite_vida;
    }
}
