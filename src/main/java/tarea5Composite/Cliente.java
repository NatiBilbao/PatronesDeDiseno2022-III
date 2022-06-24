package tarea5Composite;

public class Cliente {
    public static void main(String[] args){
        CompositeComputadora labo1 = new CompositeComputadora("Laboratorio1");
        labo1.add(new Computadora("Computadora1").setPrecio(250));
        labo1.add(new Computadora("Computadora2").setPrecio(250));
        labo1.add(new Computadora("Computadora3").setPrecio(250));

        CompositeComputadora labo2 = new CompositeComputadora("Laboratorio2");
        labo2.add(new Computadora("Computadora4").setPrecio(250));
        labo2.add(new Computadora("Computadora5").setPrecio(250));
        labo2.add(new Computadora("Computadora6").setPrecio(250));
        labo2.add(new Computadora("Computadora7").setPrecio(250));

        CompositeComputadora conte1 = new CompositeComputadora("Contenedor1");
        conte1.add(labo1);
        conte1.add(labo2);

        conte1.mostrarDetalles();

    }
}
