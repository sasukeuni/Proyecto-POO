package anime;

import java.util.logging.Logger;

public class Rating {

    private static final Logger LOG = Logger.getLogger(Rating.class.getName());

    private String valor;

    public Rating(String valor) {
        this.valor = valor;
    }

    public Rating() {
        setValor();
    }

    public String getValor() {
        return valor;
    }

    public void setValor() {
        System.out.println("Que puntuación le das? ");
        valor = Metodo.lector();
    }
}
