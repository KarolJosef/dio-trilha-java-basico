package interfaces.impressora;

public class DeskJet implements  Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Deskjet");
    }

}
