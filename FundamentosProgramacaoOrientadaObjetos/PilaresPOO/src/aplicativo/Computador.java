package aplicativo;

public class Computador 
{
    public static void main(String[] args) 
    {
        // abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        // abrindo Facebook Messenger
        FacebookMessenger face = new FacebookMessenger();
        face.enviarMensagem();
        face.receberMensagem();

        // abrindo Telegram
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
