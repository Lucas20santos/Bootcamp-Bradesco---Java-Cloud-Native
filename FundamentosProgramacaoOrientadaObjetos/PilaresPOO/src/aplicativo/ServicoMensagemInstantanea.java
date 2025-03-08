package aplicativo;

public class ServicoMensagemInstantanea 
{
    public void enviarMensagem() 
    {
        this.validarConectadoInternet();
        System.out.println("Enviando mensagem.");
        this.salvarHistoricoMensagem();
    }

    public void receberMensagem() 
    {
        System.out.println("Recebendo mensagem");
        this.salvarHistoricoMensagem();
    }

    private void validarConectadoInternet() 
    {
        System.out.println("Validando conexão com a internet");
    }
    private void salvarHistoricoMensagem() 
    {
        System.out.println("Salvando mensagem");
    }
}
