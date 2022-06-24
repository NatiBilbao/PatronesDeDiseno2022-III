package tarea5Composite;

public class Computadora extends Componente{

    public Computadora(String type){
        super(type);
    }

    @Override
    public void mostrarDetalles() {
        this.showInfo();
    }

    @Override
    public void add(Componente component) {
    }

    @Override
    public void remove(Componente component) {
    }
}
