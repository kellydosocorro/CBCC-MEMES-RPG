/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.ambientes;
import cbccmemes.personagens.Personagem;
import cbccmemes.mochila.Item;

/**
 *
 * @author 201604940039
 */
public class ColetaItens extends Ambiente{
    private Item item;
    //Definir array de Itens abaixo
    private final Item itens[] = {new Item(), new Item()};

    public ColetaItens(Item item, String nome, int nivel_minimo, Personagem personagem, Ambiente anterior) {
        super(nome, nivel_minimo, personagem, anterior);
        this.item = item;
    }

    private void setItem(Item item) {
        this.item = item;
    }

    private Item getItem() {
        return item;
    }
    
    public Item procuraItem(){
        setItem(Item.getItemAleatorio(getPersonagem(), itens));
        
        return getItem();
    }
}
