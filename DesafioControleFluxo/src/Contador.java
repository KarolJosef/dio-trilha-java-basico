import Exceptions.ParametroIvalidosException;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
		
        int parametroUm;
        int parametroDois;
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
        }		
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametroIvalidosException e) {
			System.out.println("erro" + e.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametroIvalidosException {
		if(parametroDois > parametroUm){		
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
					System.out.println("imprimindo numero "+i);
			}
		}
		else{
			throw new ParametroIvalidosException();
		}	
	}
}
