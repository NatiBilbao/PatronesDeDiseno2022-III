package tarea3Proxy;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeDebito implements ICuenta {
    private Cuenta cuenta;
    private List<Producto> comprasNoPermitidas =new ArrayList<>();

    public TarjetaDeDebito(Cuenta cuenta){
        this.cuenta=cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public List<Producto> getComprasNoPermitidas() {
        return comprasNoPermitidas;
    }

    public void setComprasNoPermitidas(List<Producto> comprasNoPermitidas) {
        this.comprasNoPermitidas = comprasNoPermitidas;
    }

    @Override
    public void comprar(Producto producto) {
        int temp;
        if (producto.getTipoDeMoneda().equals("Euros")) {
            temp = producto.getPrecio() * 8;
            if (cuenta.getBolivianos() >= temp) {
                cuenta.comprar(producto);
                cuenta.setBolivianos(cuenta.getBolivianos()- temp);
            } else {
                System.out.println("¡Su Saldo es insuficiente para realizar la comprar! " + producto.getNombre());
                comprasNoPermitidas.add(producto);
            }
        } else if (producto.getTipoDeMoneda().equals("Dolares")) {
            temp = producto.getPrecio() * 7;
            if (cuenta.getBolivianos() >= temp) {
                cuenta.comprar(producto);
                cuenta.setBolivianos(cuenta.getBolivianos() - temp);
            } else {
                comprasNoPermitidas.add(producto);
                System.out.println("¡Su Saldo es insuficiente para realizar la comprar! " + producto.getNombre());
            }
        } else {
            if (cuenta.getBolivianos() >= producto.getPrecio()) {
                cuenta.comprar(producto);
                cuenta.setBolivianos(cuenta.getBolivianos() - producto.getPrecio());
            }else {
                comprasNoPermitidas.add(producto);
                System.out.println("¡Su Saldo es insuficiente para realizar la comprar! " + producto.getNombre());
            }

        }
    }
}
