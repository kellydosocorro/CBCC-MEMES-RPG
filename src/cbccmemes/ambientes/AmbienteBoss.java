package cbccmemes.ambientes;

import cbccmemes.personagens.Professor;

public class AmbienteBoss extends AmbienteSala{
    
    public AmbienteBoss(String nome, String descricao, int nivelMinimo, Professor boss) {
        super(nome, descricao, nivelMinimo);
        super.getOponentes().add(boss);
        super.setOperacoes(new String[]{BATALHAR,VOLTAR});
    }
}
