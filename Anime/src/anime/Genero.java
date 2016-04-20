package anime;

import java.io.Serializable;

public class Genero implements Serializable{


    private String nombre;
/**
 * 
 * @param nombre 
 */
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
        nombre = Lector.lector();
    }
}
