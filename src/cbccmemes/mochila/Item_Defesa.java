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
public class Item_Defesa extends Item {
    
    public Item_Defesa(String nome, int poder_defesa) {
        super(nome, poder_defesa);
    }
    
    public Item_Defesa(int vida, int poder_defesa, double dinheiro, String nome) {
        super(vida, poder_defesa, dinheiro, nome);
    }
   
}
