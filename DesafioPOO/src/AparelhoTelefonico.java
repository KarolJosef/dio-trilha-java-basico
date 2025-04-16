import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet{

    public void ligar(String numero){
        System.out.println("Discando : " + numero);
    }
    public void atender(){
        System.out.println("Telefone Chamando clique para atender" );
    };
    public void iniciarCorreioVoz(){
        System.out.println("Chamando coreeio de voz");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");;
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Musica " + " selecionada");
    }

    @Override
    public void exibirPagina(String URL) {
        System.out.println("Exibindo página " + URL);    
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
