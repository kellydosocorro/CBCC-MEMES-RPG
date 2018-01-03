package cbccmemes.ambientes;

public abstract class Ambiente {
    private String nome;
    private String descricao;
    private String url_image;
    private int nivel_minimo;
    private boolean acessivel;
    
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
     * Printa dados do Ambiente.
     */
    public void printDados(){
        System.out.println("Nome:"+this.getNome()+"\nDescrição:"+this.getDescricao());
    }

    //---------------MÉTODOS GETERS E SETTERS------------------//
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public int getNivel_minimo() {
        return nivel_minimo;
    }

    public boolean isAcessivel() {
        return acessivel;
    }

    public void setAcessivel(boolean acessivel) {
        this.acessivel = acessivel;
    }
}
