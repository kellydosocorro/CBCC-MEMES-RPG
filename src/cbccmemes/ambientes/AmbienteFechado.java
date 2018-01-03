package cbccmemes.ambientes;

public class AmbienteFechado extends Ambiente{
    
    public AmbienteFechado(String nome, String descricao, int nivelMinimo) {
        super(nome, descricao, nivelMinimo);
    }

    @Override
    public void printDados() {
        System.out.println("");
        super.printDados(); //To change body of generated methods, choose Tools | Templates.
    }
}
