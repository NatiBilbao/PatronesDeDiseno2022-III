package tarea4Bridge;

public class Tierra implements IEnvio{
    @Override
    public void enviar(Paquete paquete) {
        double precioConEnvio = paquete.getPrecio()+ paquete.getPrecio()*0.05;
        System.out.println("***Enviando paquete por tierra***");
        paquete.showInfo();
        System.out.println("Precio envio por tierra: " + precioConEnvio);
        System.out.println();
    }
}
