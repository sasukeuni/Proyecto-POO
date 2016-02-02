package anime;

import java.util.logging.Logger;

public class Genero {

    private static final Logger LOG = Logger.getLogger(Genero.class.getName());

    private String nombre;

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public Genero() {
        setNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Dame el nombre del género: ");
        nombre = Metodo.lector();
    }
}
