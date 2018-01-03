package cbccmemes.ambientes;

import cbccmemes.mochila.Item;
import cbccmemes.personagens.Personagem;
import java.util.ArrayList;
import java.util.Random;

public class Interno extends Ambiente{
    private ArrayList<Personagem> adversarios;


    public ArrayList<Personagem> getAdversarios() {
        return adversarios;
    }
    
    public Personagem retornaInimigo(){
        Random r = new Random();
        int id_personagem = r.nextInt(getAdversarios().size()-1);
        
        return retornaInimigo(id_personagem);
    }
    
    public Personagem retornaInimigo(int index){
        return ( !getAdversarios().isEmpty() && getAdversarios().get(index) != null )?getAdversarios().get(index):null;
    }
}