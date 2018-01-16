package cbccmemes.personagens;

import cbccmemes.ambientes.Ambiente;
import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;

public class Professor extends Personagem{

    public Professor(String nome, int nivel, int vida, int ataque, int defesa, int velocidade, Item item_batalha, Arma arma_batalha, double dinheiro) {
        super(nome, nivel, vida, ataque, defesa, velocidade, item_batalha, arma_batalha, dinheiro);
    }

    public Professor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar(Personagem adversario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descricaoPerosnagem(java.awt.Frame parent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
