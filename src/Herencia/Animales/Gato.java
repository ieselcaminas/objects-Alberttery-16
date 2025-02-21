package Herencia.Animales;

public class Gato extends Mamifero {

    Gato(String nombre) {
        super(nombre);
    }

    public void jugarConOvillo(){
        System.out.println("Como me gustan los ovillos");
    }

    @Override
    public void comunicarse(){
        System.out.println("Miau");
    }

}
