package apps;
public abstract class ServicoMensagemInstantanea {
    // public void enviarMensagem(){
    //     validarConectadoInternet();
    //     salvarHistoricoMensagem();
    //     System.out.println("Envando mensagem");
    // }
    // public void receberMensagem(){
    //     System.out.println("Recebendo mensagem");
    // }
    // private  void validarConectadoInternet(){
    //     System.out.println("Validando se esta conectado");
    // }
    // private  void salvarHistoricoMensagem(){
    //     System.out.println("Salvando o histórico de mensagens");
    // }
    public abstract void enviarMensagem();
    public abstract  void receberMensagem();
    protected void validarConectadoInternet(){
        System.out.println("Valdando se esta comnectado a internet");
    }
}
