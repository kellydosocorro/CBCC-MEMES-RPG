package cbccmemes.ambientes;

import cbccmemes.extencoes.JPanelImage;
import java.util.ArrayList;
/**
 * Calsse abstrata para representação de interface de Ambiente, seguindo o padrão de projeto 'Composite'.
 * @see cbccmemes.ambientes.AmbienteAberto
 * @see cbccmemes.ambientes.AmbienteFechado
 * @author 201604940039
 */
public abstract class Ambiente {
    private final String nome;
    private String descricao;
    private int nivelMinimo;
    private boolean acessivel;
    private Ambiente pai;
    private JPanelImage image;
    private ArrayList<String> operacoes;

    public Ambiente(String nome, String descricao, int nivelMinimo){
        this.nome = nome;
        this.descricao = descricao;
        this.pai = null;
        this.image = null;
        this.operacoes = null;
        this.setNivelMinimo(nivelMinimo);
    }
    
    //------------MÉTODOS DO PADRÃO COMPOSITE - COMPOSTO----------------------//
    /**
     * Adiciona destino na árvore de caminhos possíveis.
     * Requer um destino do tipo Ambiente para ser adicionado.
     * @param destino 
     */
    public void addDestino(Ambiente destino){
        throw new UnsupportedOperationException();
    }
    /**
     * Remove destinos.
     * Usa como parâmetro o nome do destino a ser removido.
     * @param nome Nome do destino
     */
    public void removeDestino(String nome){
        throw new UnsupportedOperationException();
    }
    /**
     * Método para recuperar nó filho de acordo com o nome passado.
     * Requer um nome de Ambiente de Destino Válido.
     * @param nome
     * @return Ambiente de Destino
     */
    public Ambiente getDestino(String nome){
        throw new UnsupportedOperationException();
    }
    //-----------MÉTODOS DE ITERAÇÕES POSSÍVEIS DOS AMBIENTES-----------------//
    /**
     * Recupera lista de destinos possíveis
     * @return ArrayList de Destinos
     */
    public ArrayList<Ambiente> getDestinos(){
        throw new UnsupportedOperationException();
    }
    /**
     * Realiza operação de acordo com o parâmetro passado. Requer que o nome da operação exista nas posssibilidades do Ambiente.
     * @see cbccmemes.ambientes.Ambiente
     * @param nome Nome da operação
     */
    public void operacao(String nome){
        throw new UnsupportedOperationException();
    }
    /**
     * Imprime operações possíveis do Ambiente.
     */
    public void printOperacoes(){
        System.out.println(operacoes);
    }
    /**
     * Escreve dados do Ambiente.
     * E posteriormente os destínos possíveis.
     */
    public void printDados(){
        System.out.println("Nome: "+this.getNome()+"\nDescrição: "+this.getDescricao()+"\nNivel Mínimo: "+this.getNivelMinimo());
        
        if ( this.operacoes != null){
            System.err.print("Operações: ");
            this.printOperacoes();
        }
        if ( this.pai != null )
            System.out.println("Ambiente Pai: "+this.getPai().getNome());
    }
    
    //---------------MÉTODOS GETERS E SETTERS------------------//
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivelMinimo() {
        return nivelMinimo;
    }

    public JPanelImage getImage() {
        return image;
    }

    public void setImage(JPanelImage image) {
        this.image = image;
    }
    
    private void setNivelMinimo(int nivel){
        if ( nivel > 0 && nivel <= cbccmemes.personagens.Aluno.NIVEL_MAXIMO ){
            nivelMinimo = nivel;
            if ( this.getNivelMinimo() == 1 )
                this.setAcessivel(true);
            else
                this.setAcessivel(false);
        }
        else
            throw new IllegalArgumentException();
    }

    public boolean isAcessivel(){
        return acessivel;
    }

    public void setAcessivel(boolean acessivel) {
        this.acessivel = acessivel;
    }

    public Ambiente getPai() {
        return pai;
    }

    public void setPai(Ambiente pai) {
        this.pai = pai;
    }

    public ArrayList<String> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(ArrayList<String> operacoes) {
        this.operacoes = operacoes;
    }
}
