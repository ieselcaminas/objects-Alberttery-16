package Herencia.Animales;

public class Mamifero extends Animal{

    Mamifero(String nombre){
        super(nombre);
    }

    public void mamar()
    {
        System.out.println("Cuando soy pequeño mamo");
    }

    @Override
    public void respirar(){
        System.out.println("Respiro por la nariz");
    }

    @Override
    public void moverse() {
        System.out.println("Me muevo a 4 patas");
    }
}
