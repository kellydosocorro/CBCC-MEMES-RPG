package cbccmemes.ambientes;

import java.util.ArrayList;

public class AmbienteAberto extends Ambiente{
    private ArrayList<Ambiente> destinos = new ArrayList<>();
            
    public AmbienteAberto(String nome, String descricao, int nivelMinimo) {
        super(nome, descricao, nivelMinimo);
    }

    @Override
    public void addDestino(Ambiente destino) {
        destino.setPai(this);
        this.destinos.add(destino);
    }

    @Override
    public void removeDestino(Ambiente destino) {
        this.destinos.remove(destino);
    }
    
    @Override
    public void printDados() {
        System.out.println("========================");
        super.printDados();
        for (Ambiente amb: destinos)
            amb.printDados();
    }
    
}
