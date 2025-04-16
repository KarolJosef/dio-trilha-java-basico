public class Iphone extends AparelhoTelefonico {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico cel = new AparelhoTelefonico();

        cel.ligar("12991548909");
        cel.atender();
        cel.atualizarPagina();
    }
}
