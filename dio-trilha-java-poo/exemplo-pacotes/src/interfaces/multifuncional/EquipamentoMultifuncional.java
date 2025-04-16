package interfaces.multifuncional;

import interfaces.copiadora.Copiadora;
import interfaces.digitalizadora.Digitalizadora;
import interfaces.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora  {

    @Override
    public void Copiar() {
       System.out.println("Copiando Via Equipamento Mult");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando Via Equipamento Mult");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Via Equipamento Mult");
    }

}
