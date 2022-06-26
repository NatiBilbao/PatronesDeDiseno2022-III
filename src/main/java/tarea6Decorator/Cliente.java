package tarea6Decorator;

public class Cliente {
    public static void main (String []args){
        ICuenta cuentaBasica = new CuentaBasica("Cristoffer Mollinedo", 2500, false);
        cuentaBasica.showInfo();

        cuentaBasica = new PromocionCuenta(cuentaBasica);
        cuentaBasica = new SeguroCuenta(cuentaBasica);
        cuentaBasica = new BancaPorInternet(cuentaBasica);

        cuentaBasica.showInfo();
    }
}
