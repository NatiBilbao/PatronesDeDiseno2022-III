package tarea4Bridge;

public class Mar implements IEnvio{
    @Override
    public void enviar(Paquete paquete) {
        double precioConEnvio = paquete.getPrecio()+ paquete.getPrecio()*0.5;
        System.out.println("***Enviando paquete por mar***");
        paquete.showInfo();
        System.out.println("Precio envio por mar: " + precioConEnvio);
        System.out.println();
    }
}
