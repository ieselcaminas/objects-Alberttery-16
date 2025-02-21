package Herencia.Animales;

public class PezPayaso extends Pez {

    PezPayaso (String nombre){
        super(nombre);
    }

    @Override
    public void comunicarse()
    {
        System.out.println("Me comunico haciendo burbujas");
    }

    @Override
    public void perseguirUnObjeto() {

    }
}
