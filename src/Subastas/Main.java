package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Subasta sub = new Subasta(1, "Subasta Coche");
        Subasta sub2 = new Subasta(2, "Subasta Reloj");

        List<Subasta> casaDeSubastas = new ArrayList<>();

        casaDeSubastas.add(sub);
        casaDeSubastas.add(sub2);

        Lote lote1 = new Lote(1, "Lote 1", sub);

        sub.addLote(lote1);

        Articulo coche1 = new Articulo(1, "Lamborghini Aventador", 1000000, lote1);
        Articulo coche2 = new Articulo(2, "Buggati Beyron", 2000000, lote1);

        lote1.addArticulo(coche1);
        lote1.addArticulo(coche2);


        Lote lote2 = new Lote(2, "Lote 2", sub);
        sub.addLote(lote2);

        Articulo reloj1 = new Articulo(3, "Rolex" , 500000, lote2);
        Articulo reloj2 = new Articulo(3, "Phatek Phillipe" , 750000, lote2);
        lote2.addArticulo(reloj1);
        lote2.addArticulo(reloj2);

        Pujador pepe = new Pujador(1, "Pepe");
        Pujador maria = new Pujador(2, "María");

        Puja puja = new Puja(1, 100, pepe, lote1);
        pepe.addPuja(puja);
        lote1.addPuja(puja);

        puja = new Puja(2, 200, maria, lote1);
        maria.addPuja(puja);
        lote1.addPuja(puja);

        for (Puja p : lote1.getPujas()) {
            System.out.println(" Numero de Pujas: " + p.getN_puj() +
                    ", Monto Final: $" + p.getCuantia() +
                    ", Ganador: " + p.getPujador().getNombre());
        }


    }
}
