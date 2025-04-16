import apps.FacebookMessenger;
import apps.MSNMensager;
import apps.ServicoMensagemInstantanea;
import apps.Telegran;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = new Telegran();

        String app = "MSN";
        if(app.equals("MSN"))
            smi = new MSNMensager();
        else if (app.equals("FacebookMessenger"))
            smi = new FacebookMessenger();
        else if (app.equals("Telegran")) 
            smi = new Telegran();
        else
            System.out.println("Entrada errada");    
      
        smi.enviarMensagem();
        smi.receberMensagem();
        
      


    }
}
