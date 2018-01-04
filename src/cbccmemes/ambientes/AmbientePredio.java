package cbccmemes.ambientes;

import cbccmemes.personagens.Personagem;
import java.util.ArrayList;

/**
 * Ambiente voltado para salas e predios fechados sem saída.
 * @author 201604940039
 */
public class AmbientePredio extends Ambiente{
    private final ArrayList<Personagem> oponentes;
    
    public AmbientePredio(String nome, String descricao, int nivelMinimo) {
        super(nome, descricao, nivelMinimo);
        this.oponentes = new ArrayList<>();
        super.setOperacoes(new String[]{BATALHAR,LISTAR_OPONENTES,VOLTAR,PRINT_MAPA});
    }

    @Override
    public void addOponente(Personagem oponente) {
        oponentes.add(oponente);
    }

    @Override
    public void removeOponente(Personagem oponente) {
        oponentes.remove(oponente);
    }

    @Override
    public Personagem getOponente(String nome) {
        return buscaPersonagem(nome);
    }
    
    private Personagem buscaPersonagem(String nome){
        for ( Personagem pers: oponentes )
            if ( pers.getNome().equalsIgnoreCase(nome) )
                return pers;
        
        return null;
    }
}
