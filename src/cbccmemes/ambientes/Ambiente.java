package cbccmemes.ambientes;

public abstract class Ambiente {
    private final String nome;
    private final int nivel_minimo;
    private Ambiente anterior = null;
    private Ambiente ambientes_internos[];
    private String url_image;

    public Ambiente(String nome, int nivel_minimo, String url_image) {
        this.nome = nome;
        this.nivel_minimo = nivel_minimo;
        this.url_image = url_image;
    }

    public int getNivel_minimo() {
        return nivel_minimo;
    }

    public String getNome() {
        return nome;
    }

    public Ambiente getAnterior() {
        return anterior;
    }

    public void setAnterior(Ambiente anterior) {
        this.anterior = anterior;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public Ambiente[] getAmbientes_internos() {
        return ambientes_internos;
    }

    public void setAmbientes_internos(Ambiente[] ambientes_internos) {
        this.ambientes_internos = ambientes_internos;
    }
}
