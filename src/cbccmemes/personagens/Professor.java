package cbccmemes.personagens;

import cbccmemes.ambientes.Ambiente;
import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;

public class Professor extends Personagem{

    public Professor(String nome, int nivel, int vida, int ataque, int defesa, int velocidade, Item item_batalha, Arma arma_batalha, Ambiente ambiente) {
        super(nome, nivel, vida, ataque, defesa, velocidade, item_batalha, arma_batalha, ambiente);
    }

}
