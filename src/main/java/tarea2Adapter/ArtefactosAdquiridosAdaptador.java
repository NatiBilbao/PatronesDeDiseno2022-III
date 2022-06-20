package tarea2Adapter;

public class ArtefactosAdquiridosAdaptador implements IArtefactosOriginales{

    private IArtefactosAdquiridos artefactosAdquiridos;

    public ArtefactosAdquiridosAdaptador(IArtefactosAdquiridos artefactosAdquiridos){
        this.artefactosAdquiridos=artefactosAdquiridos;
    }

    public void setArtefactosAdquiridos(IArtefactosAdquiridos artefactosAdquiridos) {
        this.artefactosAdquiridos = artefactosAdquiridos;
    }

    @Override
    public void precio() {

        artefactosAdquiridos.costo();

    }

    @Override
    public void tiempoDeVida() {

        artefactosAdquiridos.tiempoDeGarantia();

    }
}
