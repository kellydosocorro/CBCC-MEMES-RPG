package cbccmemes.ambientes;

import cbccmemes.extencoes.JPanelImage;

public abstract class Ambiente {
    private final String nome;
    private String descricao;
    private int nivelMinimo;
    private boolean acessivel;
    private Ambiente pai;
    private JPanelImage image;

    public Ambiente(String nome, String descricao, int nivelMinimo){
        this.nome = nome;
        this.descricao = descricao;
        this.pai = null;
        this.image = null;
        this.setNivelMinimo(nivelMinimo);
    }
    
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
     * Usa como parâmetro destino a ser removido.
     * @param destino
     */
    public void removeDestino(Ambiente destino){
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
    /**
     * Recupera lista de destinos possíveis
     * @return ArrayList de Destinos
     */
    
    public Ambiente getDestinos(){
        throw new UnsupportedOperationException();
    }
    /**
     * Escreve dados do Ambiente.
     * E posteriormente os destínos possíveis.
     */
    public void printDados(){
        System.out.println("Nome: "+this.getNome()+"\nDescrição: "+this.getDescricao()+"\nNivel Mínimo: "+this.getNivelMinimo());
        if ( this.pai != null )
            System.out.println("Ambiente Pai: "+this.getPai().getNome());
    }
    
    public Ambiente sair(){
        return this.getPai();
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
}
