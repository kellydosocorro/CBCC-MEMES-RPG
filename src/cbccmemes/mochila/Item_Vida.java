/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.mochila;

import cbccmemes.personagens.Personagem;

/**
 *
 * @author 201604940040
 */
public class Item_Vida extends Item {
    
    public Item_Vida(int vida, String nome, int nivel_minimo) {
        super(vida, nome, nivel_minimo);
    }
    
    public Item_Vida(String nome, String classe, int poder, int nivel_minimo, double preco) {
        super(nome, classe, poder, nivel_minimo, preco);
    }

    @Override
    public int incrementValue(Personagem user) {
        int soma = user.getVida()+this.getPoder();
        double percent = (getPoder()*100)/soma;
        
        return (int) (user.getVida()*(percent/100));
    }
    
    
    
}
