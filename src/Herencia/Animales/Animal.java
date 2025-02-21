package Herencia.Animales;

public class Animal {
    private String nombre;
    private int peso;

    public Animal(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comunicarse() {}

    public void respirar() {}

    public void moverse() {}

    @Override
    public String toString()
    {
        return "Animal: " + nombre;
    }
}
