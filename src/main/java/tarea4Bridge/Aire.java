package tarea4Bridge;

public class Aire implements IEnvio{
    @Override
    public void enviar(Paquete paquete) {
        double precioConEnvio = paquete.getPrecio()+ paquete.getPrecio()*0.1;
        System.out.println("***Enviando paquete por aire***");
        paquete.showInfo();
        System.out.println("Precio envio por aire: " + precioConEnvio);
        System.out.println();
    }
}
