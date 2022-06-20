package tarea2Adapter;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("Celulares");
        IArtefactosOriginales celulares = new Celulares(1500, "2 años");
        celulares.precio();
        celulares.tiempoDeVida();

        System.out.println("Tablets");
        IArtefactosOriginales tablets = new Tablets(2500, "3 años");
        tablets.precio();
        tablets.tiempoDeVida();

        System.out.println("Computadoras");
        IArtefactosOriginales computadoras = new Computadoras(4000, "5 años");
        computadoras.precio();
        computadoras.tiempoDeVida();


        System.out.println("Televisores");
        IArtefactosOriginales televisores = new ArtefactosAdquiridosAdaptador(new Televisores(8000, "6 años"));
        televisores.precio();
        televisores.tiempoDeVida();

        System.out.println("Lavadoras");
        IArtefactosOriginales lavadoras = new ArtefactosAdquiridosAdaptador(new Lavadoras(5000, "10 años"));
        lavadoras.precio();
        lavadoras.tiempoDeVida();

        System.out.println("Refrigeradores");
        IArtefactosOriginales refrigeradores = new ArtefactosAdquiridosAdaptador(new Refrigeradores(6000, "15 años"));
        refrigeradores.precio();
        refrigeradores.tiempoDeVida();
    }
}
