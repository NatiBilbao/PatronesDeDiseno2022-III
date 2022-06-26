package tarea6Decorator;

public class CuentaBasica implements ICuenta{
    private String nombrePropietario;
    private int monto;
    private boolean bancaInternet;

    public CuentaBasica(String nombrePropietario, int monto, boolean bancaInternet) {
        this.nombrePropietario = nombrePropietario;
        this.monto = monto;
        this.bancaInternet = bancaInternet;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    @Override
    public int getMonto(){
        return monto;
    }

    @Override
    public void setMonto(int monto){
        this.monto=monto;
    }

    @Override
    public void setBancaInternet(boolean bancaInternet){
        this.bancaInternet=bancaInternet;
    }

    @Override
    public void showInfo() {
        System.out.println("INFORMACION DE LA CUENTA");
        System.out.println("Nombre del propietario: " + nombrePropietario);
        System.out.println("Monto total de la cuenta: " + monto + "bs");
        System.out.println("Banca por internet: " + bancaInternet);
        System.out.println();
    }
}
