package tarea6Decorator;

public class SeguroCuenta extends NuevasFuncionalidades{

    public SeguroCuenta(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        System.out.println("Seguro");
        System.out.println("PAGADO");
        int nuevoSaldo = cuenta.getMonto() - 15;
        cuenta.setMonto(nuevoSaldo);
        super.showInfo();
    }
}
