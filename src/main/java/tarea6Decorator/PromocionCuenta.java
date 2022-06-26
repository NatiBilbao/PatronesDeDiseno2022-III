package tarea6Decorator;

import java.util.Random;

public class PromocionCuenta extends NuevasFuncionalidades{

    public PromocionCuenta(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        int numeroRandom = new Random().nextInt(50);
        if(numeroRandom % 2 == 0){
            System.out.println("Promociones");
            System.out.println("Felicidades! Usted fue ganador del sorteo! El monto de su cuenta sera duplicado!");
            int saldoNuevo = 2 * cuenta.getMonto();
            cuenta.setMonto(saldoNuevo);
            super.showInfo();
        } else {
            super.showInfo();
        }
    }
}
