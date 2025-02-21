package SocialNetwork;

import java.util.Date;

public abstract class Publicacion {
    private Usuario usuario;
    private Date fecha;
    private int likes;

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;

        this.fecha = new Date();
        this.likes = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    /**
     * Setters pueden haber de 0 a n. En este caso no hemos hecho setLike(),
     * sino que sólo dejamos aumentar o decrementar en 1. Es decir, tenemos dos setters
     * Sin embargo, fecha no tiene setter porque nunca vamos a cambiar la fecha de creación
     */
    //Vamos a crear un setter que permita incrementar los likes
    public void darLike(){
        this.likes++;
    }
    //Vamos a crear un setter que permita decrementar los likes
    public void quitarLike(){
        this.likes--;
    }

    public int getLikes() {
        return likes;
    }

}
