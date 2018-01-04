package cbccmemes.ambientes;

import cbccmemes.personagens.Professor;

public class AmbienteBoss extends Ambiente{
    private final Professor boss;
    
    public AmbienteBoss(String nome, String descricao, int nivelMinimo, Professor boss) {
        super(nome, descricao, nivelMinimo);
        this.boss = boss;
        super.setOperacoes(new String[]{BATALHAR,VOLTAR});
    }
}
