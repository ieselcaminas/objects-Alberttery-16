package Herencia.Fotografo;

public class Main {
    public static void main(String[] args) {
        Camara c = new Camara("Camara de Televisión");
        Fotografo pepe = new Fotografo("Pepe", c);
        pepe.tomarFoto();

        Movil movil = new Movil("Iphone 15 Pro Max");
        Fotografo juan = new Fotografo("Juan", movil);
        juan.tomarFoto();

        /*
        GoPro GoPro = new GoPro("v4");
        Fotografo andres = new Fotografo("Andrés", GoPro);
        andres.tomarFoto();
        */

    }
}
