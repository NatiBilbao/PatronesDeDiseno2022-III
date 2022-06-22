package tarea3Proxy;

public class Cliente {
    public static void main(String[] args) {

        Persona persona=new Persona("Cris",120995);
        Cuenta cuenta=new Cuenta(persona,3000);
        ICuenta tarjetaDeDebito=new TarjetaDeDebito(cuenta);

        Producto mochila=new Producto("Mochila",50,"dolares");
        Producto audifonos=new Producto("Audifonos",180,"bolivianos");
        Producto poleta=new Producto("Polera",17,"euros");

        System.out.println("*** Saldo inicial ***");
        cuenta.showInfo();
        System.out.println("*** Lista de compras ***");
        tarjetaDeDebito.comprar(mochila);
        tarjetaDeDebito.comprar(audifonos);
        tarjetaDeDebito.comprar(poleta);
        cuenta.showPInfo();
        System.out.println("*** Saldo final ***");
        cuenta.showInfo();
    }
}
