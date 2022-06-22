package tarea3Proxy;

import java.util.ArrayList;
import java.util.List;

public class Cuenta implements ICuenta{
    private Persona persona;
    private int bolivianos;

    private List<Producto> productosComprados=new ArrayList<>();

    public Cuenta(Persona persona, int bolivianoss) {
        this.persona = persona;
        this.bolivianos = bolivianoss;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getBolivianos() {
        return bolivianos;
    }

    public void setBolivianos(int bolivianos) {
        this.bolivianos = bolivianos;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }
    public void showInfo(){
        System.out.println("Persona: "+persona.getNombre());
        System.out.println("Saldo: "+this.bolivianos);

    }
    public void showPInfo(){
        System.out.println("*** Productos Comprados ***");
        for (Producto producto:productosComprados) {
            producto.showInfo();
        }
    }

    @Override
    public void comprar(Producto producto) {
        productosComprados.add(producto);
        System.out.println("Usted compro: "+ producto.getNombre()+" a "+producto.getPrecio()+" "+producto.getTipoDeMoneda());
    }
}
