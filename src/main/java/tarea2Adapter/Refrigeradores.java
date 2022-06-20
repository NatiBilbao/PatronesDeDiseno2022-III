package tarea2Adapter;

public class Refrigeradores implements IArtefactosAdquiridos{
    private int costo;
    private String tiempoDeGarantia;

    public Refrigeradores(int costo, String tiempoDeGarantia){
        this.costo=costo;
        this.tiempoDeGarantia=tiempoDeGarantia;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTiempoDeGarantia() {
        return tiempoDeGarantia;
    }

    public void setTiempoDeGarantia(String tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void costo() {

        System.out.println("El costo es de: " + costo + "Bs");

    }

    @Override
    public void tiempoDeGarantia() {

        System.out.println("El tiempo de garantia es de: " + tiempoDeGarantia);

    }
}
