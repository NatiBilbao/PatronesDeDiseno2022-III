package tarea2Adapter;

public class Celulares implements IArtefactosOriginales{
    private int precio;
    private String tiempoDeVida;

    public Celulares(int precio, String tiempoDeVida){
        this.precio=precio;
        this.tiempoDeVida =tiempoDeVida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(String tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void precio(){
        System.out.println("El precio es de: " + precio + "Bs");
    }

    @Override
    public void tiempoDeVida(){
        System.out.println("El tiempo de vida es de: " + tiempoDeVida);
    }
}
