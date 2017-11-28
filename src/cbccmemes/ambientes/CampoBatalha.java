package cbccmemes.ambientes;

import cbccmemes.telas.TelaPrincipal;
import cbccmemes.personagens.Aluno;
import cbccmemes.personagens.Personagem;
import java.util.Random;

public class CampoBatalha extends Ambiente{
    private Personagem adversarios[];

    public CampoBatalha(Aluno[] adversarios, String nome, int nivel_minimo, String url_image) {
        super(nome, nivel_minimo, url_image);
        this.adversarios = adversarios;
    }

    public CampoBatalha(String nome, int nivel_minimo) {
        this(null, nome, nivel_minimo, null);
    }

    public Personagem[] getAdversarios() {
        return adversarios;
    }

    public void setAdversarios(Personagem[] adversarios) {
        this.adversarios = adversarios;
    }
    
    public Personagem procuraInimigo(){
        Random r = new Random();
        int id_personagem = r.nextInt(this.getAdversarios().length-1);
        
        return (!TelaPrincipal.isEmpty(this.getAdversarios()) && !TelaPrincipal.isEmpty(this.getAdversarios()[id_personagem]))?this.getAdversarios()[id_personagem]:null;
    }
    
    public Personagem procuraInimigo(int i){
        int id_personagem = i;
        
        return (!TelaPrincipal.isEmpty(this.getAdversarios()) && !TelaPrincipal.isEmpty(this.getAdversarios()[id_personagem]))?this.getAdversarios()[id_personagem]:null;
    }
}
