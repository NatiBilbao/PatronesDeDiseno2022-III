package tarea1Visitor;

public class LibreCambista implements ILibreCambista{
    private String nombre;
    private int saldoMonedaLocal;
    private int saldoDolares;

    public LibreCambista(String nombre) {
        this.nombre = nombre;

    }

    public void darDolares(int dolares) {

        saldoDolares += dolares;

    }

    public void darMonedaLocal(int monedaPais) {

        saldoMonedaLocal += monedaPais;

    }

    @Override
    public void visitarPais(Argentina argentina, TipoDeCambio tipoDeCambio) {

        System.out.println(nombre + " se encuentra en Argentina");
        if(tipoDeCambio.equals(TipoDeCambio.DOLARESALOCAL)) {
            System.out.println(nombre + " su saldo es de: " + saldoDolares + "$");
            System.out.println("Un dolar equivale a 122.86$ ");
            System.out.println(saldoDolares + "$ " + "en pesos argentinos son: " + String.format("%.2f", saldoDolares * 122.86) + "$");
            System.out.println("*************************************************************************************");

        } else {
            System.out.println(nombre + " su saldo es de: " + saldoMonedaLocal + "$");
            System.out.println("Un peso argentino equivale a 0.0081$");
            System.out.println(saldoMonedaLocal + "$ " + "en dolares son: " + String.format("%.2f", saldoMonedaLocal * 0.0081) + "$");
            System.out.println("*************************************************************************************");
        }

    }

    public void visitarPais(Bolivia bolivia, TipoDeCambio tipoDeCambio) {

        System.out.println(nombre + " se encuentra en Bolivia");
        if(tipoDeCambio.equals(TipoDeCambio.DOLARESALOCAL)) {
            System.out.println(nombre + " su saldo es de: " + saldoDolares + "$");
            System.out.println("Un dolar equivale a 6.88Bs");
            System.out.println(saldoDolares + "$ " + "en bolivianos son: " + String.format("%.2f", saldoDolares * 6.88) + "Bs");
            System.out.println("*************************************************************************************");

        } else {
            System.out.println(nombre + " su cuenta es de: " + saldoMonedaLocal + "Bs.");
            System.out.println("Un boliviano equivale a 0.15$");
            System.out.println(saldoMonedaLocal + "Bs " + "en dolares son: " + String.format("%.2f", saldoMonedaLocal * 0.15) + "$");
            System.out.println("*************************************************************************************");

        }
    }

    @Override
    public void visitarPais(Brasil brasil, TipoDeCambio tipoDeCambio) {

        System.out.println(nombre + " se encuentra en Brasil");
        if(tipoDeCambio.equals(TipoDeCambio.DOLARESALOCAL)) {
            System.out.println(nombre + " su saldo es de: " + saldoDolares + "$");
            System.out.println("Un dolar equivale a 5.12R$");
            System.out.println(saldoDolares + "$ " + "en reales brasileños son: " + String.format("%.2f", saldoDolares * 5.12) + "R$");
            System.out.println("*************************************************************************************");

        } else {
            System.out.println(nombre + " su saldo es de: " + saldoMonedaLocal + "R$");
            System.out.println("Un real equivale a 0.20$");
            System.out.println(saldoMonedaLocal + "R$ " + "en dolares son: " + String.format("%.2f", saldoMonedaLocal * 0.20) + "$");
            System.out.println("*************************************************************************************");
        }

    }

    @Override
    public void visitarPais(Italia italia, TipoDeCambio tipoDeCambio) {

        System.out.println(nombre + " se encuentra en Italia");

        if(tipoDeCambio.equals(TipoDeCambio.DOLARESALOCAL)) {

            System.out.println(nombre + " su saldo es de: " + saldoDolares  + "$");
            System.out.println("Un dolar equivale a 0.95EUR" );
            System.out.println(saldoDolares + "$ " + "en euros son: " + String.format("%.2f", saldoDolares*0.95) + "EUR");
            System.out.println("*************************************************************************************");

        } else {
            System.out.println(nombre + " su saldo es de: " + saldoMonedaLocal + "EUR");
            System.out.println("Un euro equivale a 1.05$");
            System.out.println(saldoMonedaLocal + "EUR " + "en dolares son: " + String.format("%.2f", saldoMonedaLocal*1.05) + "$");
        }
    }
}
