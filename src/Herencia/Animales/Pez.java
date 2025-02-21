package Herencia.Animales;

public abstract class Pez extends Animal {

    Pez(String nombre){
        super(nombre);
    }

    @Override
    public void respirar(){
        System.out.println("Respiro por las branquias");
    }

    @Override
    public void comunicarse(){
        System.out.println("Se comunica mediante burbujas");
    }

    @Override
    public void moverse(){
        System.out.println("Se mueve con las aletas");
    }

    public abstract void perseguirUnObjeto();
}
