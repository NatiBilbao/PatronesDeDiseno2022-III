package tarea1Visitor;

public class Cliente {
    public static void main(String[] args) {

        LibreCambista libreCambista = new LibreCambista("Cris");

        Argentina argentina = new Argentina();
        Bolivia bolivia = new Bolivia();
        Brasil brasil = new Brasil();
        Italia italia = new Italia();

        libreCambista.darDolares(100);
        libreCambista.darMonedaLocal(100);

        argentina.libreCambistaVisitante(libreCambista, TipoDeCambio.DOLARESALOCAL);
        bolivia.libreCambistaVisitante(libreCambista, TipoDeCambio.DOLARESALOCAL);
        brasil.libreCambistaVisitante(libreCambista, TipoDeCambio.DOLARESALOCAL);
        italia.libreCambistaVisitante(libreCambista, TipoDeCambio.DOLARESALOCAL);

        argentina.libreCambistaVisitante(libreCambista, TipoDeCambio.LOCALADOLARES);
        bolivia.libreCambistaVisitante(libreCambista, TipoDeCambio.LOCALADOLARES);
        brasil.libreCambistaVisitante(libreCambista, TipoDeCambio.LOCALADOLARES);
        italia.libreCambistaVisitante(libreCambista, TipoDeCambio.LOCALADOLARES);

    }

}
