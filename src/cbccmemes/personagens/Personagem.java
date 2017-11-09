package cbccmemes.personagens;
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
    private Item item_batalha;
    private Arma arma_batalha;
    private Ambiente ambiente;

    public Personagem(String nome, int nivel, int vida, int ataque, int defesa, int velocidade, Item item_batalha, Arma arma_batalha, Ambiente ambiente) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.item_batalha = item_batalha;
        this.arma_batalha = arma_batalha;
        this.ambiente = ambiente;
    }
    
    public static Personagem geraPersonagemAletarorio(int nivel){
        Random r = new Random();
        
        switch(r.nextInt(3)){
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
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

    public Item getItem_batalha() {
        return item_batalha;
    }

    public void setItem_batalha(Item item_batalha) {
        this.item_batalha = item_batalha;
    }

    public Arma getArma_batalha() {
        return arma_batalha;
    }

    public void setArma_batalha(Arma arma_batalha) {
        this.arma_batalha = arma_batalha;
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
    
    public void atacar(Personagem adversario){
        if (adversario.getItem_batalha() != null){
            
        }else{
            int vida_adv = adversario.getVida();
            int defesa_adv = adversario.getDefesa();
            int ataque_user = this.getAtaque();
            
            if ( defesa_adv < ataque_user)
                vida_adv -= ataque_user - defesa_adv;
            
            adversario.setVida(vida_adv);
        }
    }
    
    public static String getNomeAleatorio(String nomes[]){
        Random r = new Random();
        int id_nome = r.nextInt(nomes.length);
        
        return nomes[id_nome];
    }
}
