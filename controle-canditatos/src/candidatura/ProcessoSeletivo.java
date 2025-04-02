package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUTO"};
        //selecaoCandidatos();
        //imprimirSelecionados();
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);   
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
       do {
        atendeu = atender();
        continuarTentando = !atendeu;
        if (continuarTentando) {
            tentativasRealizadas++;
        }else{
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        }      
       }while (continuarTentando && tentativasRealizadas <3);
       
       if (atendeu) {
        System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas + "  tentativa" );
        
       }else{
        System.out.println("Não  conseguimos contato com " + candidato + " Numero máximo de tentativas " + tentativasRealizadas + " realizadas");
       }       
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUTO"};

        for(int i=0;  i< candidatos.length; i++) {

            System.out.println("O candidato número " + (i+1) +  " é o: " + candidatos[i] );
        }
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUTO", "MONICA", "FABRICIO", "MIRELA","DANIELA", "JORGE" }; 

        int candidatosSelecionados=0;
        int candidatoAtual=0;
        double salarioBase=2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual <candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + "Solicitou este salario: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static boolean  atender(){
        return ThreadLocalRandom.current().nextInt(3)==1;
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase  > salarioPretendido) {
            System.out.println("Ligar para candidato");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Aguardando para o candidato com contra proposta");

        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
