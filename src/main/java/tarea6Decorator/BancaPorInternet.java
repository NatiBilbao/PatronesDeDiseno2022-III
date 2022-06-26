package tarea6Decorator;

public class BancaPorInternet extends NuevasFuncionalidades{

    public BancaPorInternet(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        System.out.println("Banca por Internet");
        System.out.println("HABILITADO");
        cuenta.setBancaInternet(true);
        super.showInfo();
    }
}
