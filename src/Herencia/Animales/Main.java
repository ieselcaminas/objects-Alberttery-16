package Herencia.Animales;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Perro");
        System.out.println(perro);
        perro.traerZapatillas();
        perro.comunicarse();
        perro.respirar();
        perro.moverse();
        perro.mamar();
        System.out.println("------------------------------");

        Gato gato = new Gato("Gato");
        System.out.println(gato);
        gato.jugarConOvillo();
        gato.comunicarse();
        gato.respirar();
        gato.moverse();
        gato.mamar();
        System.out.println("------------------------------");

        Tiburon tiburon = new Tiburon("Tiburon");
        System.out.println(tiburon);
        tiburon.comunicarse();
        tiburon.respirar();
        tiburon.moverse();
        tiburon.atacar();
        System.out.println("------------------------------");

        PezPayaso pezPayaso = new PezPayaso("Pez Payaso");
        System.out.println(pezPayaso);
        pezPayaso.comunicarse();
        pezPayaso.respirar();
        pezPayaso.moverse();

        Entrenador pepe = new Entrenador("pepe");

        pepe.entrenar((Jugar) gato);
        pepe.entrenar((Jugar) tiburon);
        pepe.dejarEntrar(gato);
        perro.setNombre("Óscar");
        System.out.println(perro);

    }
}
