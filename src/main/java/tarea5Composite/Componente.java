package tarea5Composite;

public abstract class Componente {
    private int precio;
    private String tipo;

    public Componente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Componente setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public int getPrecio() {
        return precio;
    }

    public Componente setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public void showInfo(){
        System.out.println("Tipo de objeto: " + tipo);
        System.out.println("Precio: " + precio + " $");
    }

    public abstract void mostrarDetalles();
    public abstract void add(Componente component);
    public abstract void remove(Componente component);
}
