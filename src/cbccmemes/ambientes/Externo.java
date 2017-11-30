package cbccmemes.ambientes;
import cbccmemes.personagens.Personagem;
import cbccmemes.mochila.Item;
import java.util.ArrayList;

public class Externo extends Interno{
    private final ArrayList<Item> itens = null;
    
    public Externo(ArrayList<Personagem> adversarios, String nome, int nivel_minimo, String url_image) {
        super(adversarios, nome, nivel_minimo, url_image);
    }
    
    public Externo(ArrayList<Personagem> adversarios, ArrayList<Item> itens, String nome, String url_image){
        super(adversarios, nome, 0, url_image);
        //this.itens = itens;
    }    
}
