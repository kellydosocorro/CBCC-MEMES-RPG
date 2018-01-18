package cbccmemes.personagens;

import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;
import java.awt.Frame;

public class Professor extends Personagem{

    public Professor(String nome, int nivel, int vida, int ataque, int defesa, int velocidade, Item item_batalha, Arma arma_batalha, double dinheiro) {
        super(nome, nivel, vida, ataque, defesa, velocidade, item_batalha, arma_batalha);
    }

    @Override
    public void atacar(Personagem adversario) {
        int soma = this.getAtaque()+adversario.getDefesa();
            double percent = (this.getAtaque()*100)/soma;
            
            int ataque = (int) (this.getAtaque()*(percent/100));
        
            adversario.setVida(adversario.getVida()-ataque);
    }

    @Override
    public String descricaoPerosnagem(Frame parent) {
        return "";
    }
    
}
