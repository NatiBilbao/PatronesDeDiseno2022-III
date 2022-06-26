package tarea6Decorator;

public class NuevasFuncionalidades implements ICuenta{
    protected ICuenta cuenta;

    public NuevasFuncionalidades(ICuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void showInfo() {
        cuenta.showInfo();
    }

    @Override
    public int getMonto() {
        return cuenta.getMonto();
    }

    @Override
    public void setMonto(int monto) {
        cuenta.setMonto(monto);
    }

    @Override
    public void setBancaInternet(boolean bancaInternet) {

    }

}
