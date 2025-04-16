package ingresso;

public sealed  abstract class Ingressso permits  MeiaEntrada, Familia {
    protected String nome;
    protected double valor;
    protected boolean isDoubbed;

    abstract double calculaValorIngresso(double valor);
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    

}
