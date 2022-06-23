package tarea4Bridge;

public class EmpresaSA implements IEmpresa{
    private IEnvio envio;

    public EmpresaSA() {
    }

    public IEnvio getEnvio() {
        return envio;
    }

    public void setEnvio(IEnvio envio) {
        this.envio = envio;
    }

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("La Empresa SA recibio un paquete");
        envio.enviar(paquete);
    }
}
