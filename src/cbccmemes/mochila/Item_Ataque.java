/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.mochila;

/**
 *
 * @author 201604940040
 */
public class Item_Ataque extends Item {

    public Item_Ataque(String nome, String classe, int poder_ataque, int nivel_minimo) {
        super(nome, classe, poder_ataque, nivel_minimo);
    }
    
    public Item_Ataque(String nome, int poder_ataque) {
        super(nome, poder_ataque);
    }
    
}
