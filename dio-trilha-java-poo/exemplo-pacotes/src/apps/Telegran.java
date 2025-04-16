package apps;
public class Telegran extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem  pelo Telegran");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem  pelo Telegran");
    }

}
