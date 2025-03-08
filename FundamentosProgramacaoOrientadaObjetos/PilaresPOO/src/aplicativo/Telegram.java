package aplicativo;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() 
    {
        this.validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        this.salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() 
    {
        System.out.println("Recebendo mensagem pelo Telegram");
        this.salvarHistoricoMensagem();
    }
    @Override
    protected void validarConectadoInternet() 
    {
        System.out.println("Validando conexão com a internet");
    }
    @Override
    protected void salvarHistoricoMensagem()
    {
        System.out.println("Salvando mensagem");
    }
}
