package aplicativo;

public abstract class ServicoMensagemInstantanea 
{
    protected abstract void enviarMensagem();
    protected abstract void receberMensagem();
    protected abstract void validarConectadoInternet();
    protected abstract void salvarHistoricoMensagem();
}
