import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
   
    /**
     * @param args
     * @throws Exception
     */

     int numero;
     String agencia;
     String nomeCliente;
     double saldo;

    public static void main(String[] args) throws Exception {     
      try{
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        conta.numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência !");
        conta.agencia = scanner.next();   

        System.out.println("Por favor, digite o nome do cliente");
        conta.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        conta.saldo = scanner.nextDouble();

        scanner.close();     

        System.out.println("Olá " + conta.nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +
        conta.agencia + " conta "+ conta.numero + " e seu saldo de "+ conta.saldo + " ja esá disponível para saldo.");
      }
      catch(InputMismatchException e){
        System.out.println("Os campos número, agencia e saldo pcisam ser numericos" + e.getLocalizedMessage()
        );
      }

    }
}
