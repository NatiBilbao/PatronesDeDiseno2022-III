package tarea1Visitor;

public class Argentina implements IPaises{
    @Override
    public void libreCambistaVisitante(ILibreCambista libreCambista, TipoDeCambio tipoDeCambio) {
        libreCambista.visitarPais(this, tipoDeCambio);
    }
}
