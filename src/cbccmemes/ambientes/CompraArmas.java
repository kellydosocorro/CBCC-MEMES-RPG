package cbccmemes.ambientes;

import cbccmemes.mochila.Arma;

public class CompraArmas extends Ambiente{
    Arma armas[];

    public CompraArmas(Arma[] armas, String nome, int nivel_minimo, String url_image) {
        super(nome, nivel_minimo, url_image);
        this.armas = armas;
    }
    
}
