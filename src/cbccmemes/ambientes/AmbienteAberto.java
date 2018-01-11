package cbccmemes.ambientes;

import cbccmemes.personagens.Personagem;
import java.util.ArrayList;

public class AmbienteAberto extends Ambiente{
    private final ArrayList<Ambiente> destinos;
    private final ArrayList<Personagem> oponentes;
            
    public AmbienteAberto(String nome, String descricao, int nivelMinimo) {
        super(nome, descricao, nivelMinimo);
        this.destinos = new ArrayList<>();
        this.oponentes = new ArrayList<>();
        super.setOperacoes(new String[]{BATALHAR,LISTAR_OPONENTES,LISTAR_AMBIENTES,MUDAR_AMBIENTE,VOLTAR,PRINT_MAPA});
    }

    @Override
    public void addDestino(Ambiente destino) {
        destino.setPai(this);
        this.destinos.add(destino);
    }

    @Override
    public void removeDestino(String nome) {
        destinos.remove(buscaDestino(nome));
    }

    @Override
    public ArrayList<Ambiente> getDestinos() {
        return this.destinos;
    }

    @Override
    public Ambiente getDestino(String nome) {
        return buscaDestino(nome);
    }
    
    @Override
    public void printDadosCompletoMapa() {
        System.out.println("========================");
        super.printDadosCompletoMapa();
        destinos.forEach((amb) -> {
            amb.printDadosCompletoMapa();
        });
    }

    @Override
    protected void printMapaSimples(String str) {
        super.printMapaSimples(str);
        str+="  ";
        for ( Ambiente aux: destinos )
            aux.printMapaSimples(str);
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
    
    //------------MÉTODO LOCAL PARA BUSCA NO ARRAY DESTINOS-------------------//
    /**
     * Realiza busca de destino no array de destinos possíveis de acordo com o nome passado.
     * @param nome
     * @return null - No caso de busca sem resultado, 
     * @return Ambiente - Ao encontrar um nome compatível.
     */
    private Ambiente buscaDestino(String nome){
        for (Ambiente amb : destinos) {
            if (amb.getNome().equalsIgnoreCase(nome)){
                return amb;
            }
        }
        return null;
    }
    
    private Personagem buscaPersonagem(String nome){
        for ( Personagem pers: oponentes )
            if ( pers.getNome().equalsIgnoreCase(nome) )
                return pers;
        
        return null;
    }
}