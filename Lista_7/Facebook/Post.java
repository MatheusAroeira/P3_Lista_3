package Lista_7.Facebook;

public class Post {

    private String texto, link;
    private int numeroCurtidas, numeroCompartilhamentos;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
    }

    public void curtir(){
        this.numeroCurtidas++;
    }

    public void compartilhar(){
        this.numeroCompartilhamentos++;
    }

    public String getLink() {
        return link;
    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }



}