package cbccmemes.ambientes;
import cbccmemes.personagens.Personagem;
import cbccmemes.mochila.Item;

public class ColetaItens extends Ambiente{
    private Item item;
    //Definir array de Itens abaixo
    private final Item itens[] = {new Item(), new Item()};

    public ColetaItens(Item item, String nome, int nivel_minimo, String url_image) {
        super(nome, nivel_minimo, url_image);
        this.item = item;
    }

    private void setItem(Item item) {
        this.item = item;
    }

    private Item getItem() {
        return item;
    }
    
    public Item procuraItem(Personagem person){
        this.setItem(Item.getItemAleatorio(person, itens));
        
        return this.getItem();
    }
}
