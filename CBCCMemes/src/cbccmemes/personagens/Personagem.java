/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.personagens;
import cbccmemes.ambientes.Ambiente;
import cbccmemes.mochila.*;
import java.util.Random;

/**
 *
 * @author 201604940039
 */
public abstract class Personagem{
    private static final int LIMITE_MOCHILA = 3;
    
    private final String nome;
    private int nivel;
    private int vida;
    private int ataque;
    private int defesa;
    private int velocidade;
    private Item item_batalha;
    private Arma arma_batalha;
    private Ambiente ambiente;

    public Personagem(String nome, int nivel, int ataque, int defesa, Ambiente ambiente) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = 1000;
        this.ataque = ataque;
        this.defesa = defesa;
        this.item_batalha = null;
        this.arma_batalha = null;
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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }    

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public Item getItem_batalha() {
        return item_batalha;
    }

    public Arma getArma_batalha() {
        return arma_batalha;
    }

    public String getNome() {
        return nome;
    }

    public static int getLIMITE_MOCHILA() {
        return LIMITE_MOCHILA;
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