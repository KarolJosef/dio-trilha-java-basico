package interfaces.estabelecimento;

import interfaces.digitalizadora.Digitalizadora;
import interfaces.digitalizadora.Scanner;
import interfaces.impressora.Impressora;
import interfaces.multifuncional.EquipamentoMultifuncional;

public class fabrica {
 public static void main(String[] args) {

    Scanner scanner = new Scanner();
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();
    Impressora impressora = em;
    Digitalizadora digitalizadora = scanner;
    interfaces.copiadora.Copiadora copiadora = em;
    
    impressora.imprimir();
    digitalizadora.digitalizar();
    copiadora.Copiar();   
 }
}
