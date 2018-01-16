package cbccmemes.ambientes;

import cbccmemes.extencoes.JPanelImage;
import cbccmemes.personagens.Personagem;
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
    private String[] operacoes;
    
    public static final String BATALHAR = "BATALHAR";
    public static final String COMPRAR_ITEM = "COMP_ITEM";    
    public static final String MUDAR_AMBIENTE = "MUDAR_AMB";
    
    public static final String LISTAR_AMBIENTES = "LIST_AMB";
    public static final String LISTAR_ITENS = "LIST_ITENS";    
    public static final String LISTAR_OPONENTES = "LIST_OPONENTES";
        
    public static final String VOLTAR = "VOLTAR";
    public static final String PRINT_MAPA = "PMAP";

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
     * Adiciona oponente que será disponível no Ambiente.
     * @param oponente 
     */
    public void addOponente(Personagem oponente){
        throw new UnsupportedOperationException();
    }
    /**
     * Remove oponente do Ambiente.
     * @param oponente
     */
    public void removeOponente(Personagem oponente){
        throw new UnsupportedOperationException();
    }
    /**
     * Pega um Personagem presente no Ambiente a partir do nome.
     * @param nome
     * @return Personagem
     */
    public Personagem getOponente(String nome){
        throw new UnsupportedOperationException();
    }
    /**
     * Realiza operação de acordo com o parâmetro passado. Requer que o nome da operação exista nas posssibilidades do Ambiente.
     * @see cbccmemes.ambientes.Ambiente
     * @param nome Nome da operação
     */
    public abstract void operacao(String nome);
    /**
     * Imprime operações possíveis do Ambiente.
     */
    public void printOperacoes(){
        if ( operacoes != null)
            for (String str: operacoes)
                System.out.print(str+" ");
        
        System.out.println("");
    }
    /**
     * Imprime mapa completa a partir do ambiente atual.
     */
    public void printDadosCompletoMapa(){
        System.out.println("Nome: "+this.getNome()+"\nDescrição: "+this.getDescricao()+"\nNivel Mínimo: "+this.getNivelMinimo());
        
        if ( this.operacoes != null){
            System.out.print("Operações: ");
            this.printOperacoes();
        }
        if ( this.pai != null )
            System.out.println("Ambiente Pai: "+this.getPai().getNome());
        System.out.println("");
    }
    
    public void printMapaSimples(){
        this.printMapaSimples("");
    }
    
    protected void printMapaSimples(String str){
        System.out.println(str+"| "+this.getNome());
    }
    
    public String getMapaSimples(){
        return this.getMapaSimples("");
    }
    
    public String getMapaSimples(String str){
        return str+"| "+this.getNome()+"\n";
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
        if ( nivel >= 0 && nivel <= cbccmemes.personagens.Aluno.NIVEL_MAXIMO ){
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

    public String[] getOperacoes() {
        return operacoes;
    }

    protected void setOperacoes(String[] operacoes) {
        this.operacoes = operacoes;
    }
}
