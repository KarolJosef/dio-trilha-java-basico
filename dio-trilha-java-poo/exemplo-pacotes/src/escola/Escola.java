package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
      

        System.out.println("O aluno " + felipe.getNome() + " tem " +felipe.getIdade() + " anos");

        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
            System.out.println(e.MARANHÃO);
        }
    }
}
