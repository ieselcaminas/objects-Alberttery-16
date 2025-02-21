package Herencia.Animales;

public class Tiburon extends Pez{

    Tiburon(String nombre){
        super(nombre);
    }

    public void atacar(){
        System.out.println("Ataca mordiendo");
    }

    @Override
    public void perseguirUnObjeto(){
        System.out.println("Sé perseguir una objeto");
    }

}
