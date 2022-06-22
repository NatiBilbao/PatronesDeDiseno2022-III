package tarea3Proxy;

public class Producto {

    private String nombre;
    private int precio;
    private String tipoDeMoneda;

    public Producto(String nombre, int precio, String tipoDeMoneda) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoDeMoneda = tipoDeMoneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoDeMoneda() {
        return tipoDeMoneda;
    }

    public void setTipoDeMoneda(String tipoDeMoneda) {
        this.tipoDeMoneda = tipoDeMoneda;
    }

    public void showInfo(){
        System.out.println("Nombre del producto: "+nombre);
        System.out.println("Precio: "+precio+" " +tipoDeMoneda);
    }
}
