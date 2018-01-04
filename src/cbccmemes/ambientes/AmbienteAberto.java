package cbccmemes.ambientes;

import cbccmemes.personagens.Personagem;
import java.util.ArrayList;

public class AmbienteAberto extends Ambiente{
    private final ArrayList<Ambiente> destinos;
    private final ArrayList<Personagem> personagens;
            
    public AmbienteAberto(String nome, String descricao, int nivelMinimo) {
        super(nome, descricao, nivelMinimo);
        this.destinos = new ArrayList<>();
        this.personagens = new ArrayList<>();
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
    public void printDados() {
        System.out.println("========================");
        super.printDados();
        destinos.forEach((amb) -> {
            amb.printDados();
        });
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
    
}