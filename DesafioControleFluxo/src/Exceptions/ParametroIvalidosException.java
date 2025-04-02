package Exceptions;

public class ParametroIvalidosException extends Exception {     
        public ParametroIvalidosException() {
            super("Parâmetro inválido: o primeiro parâmetro deve ser menor que o segundo");
        }
        
        public ParametroIvalidosException(String mensagem) {
            super(mensagem);
        }
    }

