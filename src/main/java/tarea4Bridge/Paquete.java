package tarea4Bridge;

public class Paquete {
    private int precio;
    private String nombreDelPaquete;

    public Paquete(int precio, String nombreDelPaquete) {
        this.precio=precio;
        this.nombreDelPaquete=nombreDelPaquete;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombreDelPaquete() {
        return nombreDelPaquete;
    }

    public void setNombreDelPaquete(String nombreDelPaquete) {
        this.nombreDelPaquete = nombreDelPaquete;
    }

    public void showInfo(){
        System.out.println("Informacion del paquete");
        System.out.println("Nombre del paquete: " + nombreDelPaquete);
        System.out.println("Precio: " + precio);
    }
}
