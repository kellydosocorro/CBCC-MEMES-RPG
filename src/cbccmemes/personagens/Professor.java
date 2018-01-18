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
        if (adversario.getItem_equipado() != null){
            
        }else {
            int vida_adv = adversario.getVida();
            int defesa_adv = adversario.getDefesa();
            int ataque_user = this.getAtaque();
            
            if ( defesa_adv < ataque_user )
                if(vida_adv >= 0) {
                    vida_adv -= ataque_user - defesa_adv;
                }
            adversario.setVida(vida_adv);
        }
    }

    @Override
    public String descricaoPerosnagem(Frame parent) {
        return "";
    }
    
}
