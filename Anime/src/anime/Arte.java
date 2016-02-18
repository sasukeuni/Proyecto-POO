package anime;

import java.util.logging.Logger;

public class Arte {

    private static final Logger LOG = Logger.getLogger(Arte.class.getName());

    private String anno;

    private String autor;

    private String capitulos;

    private String genero;

    private String rating;

    private String titulo;
/**
 * 
 * @param titulo
 * @param autor
 * @param capitulos
 * @param genero
 * @param rating 
 */
    public Arte(String titulo, String autor, String capitulos, String genero, String rating) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = capitulos;
        this.genero = genero;
        this.rating = rating;
    }

    public Arte() {
        getTitulo();
        getAutor();
        getAnno();
        getCapitulos();
        getGenero();
        getRating();
    }

    public String getAnno() {
        return anno;
    }

    public String getAutor() {
        return autor;
    }

    public String getCapitulos() {
        return capitulos;
    }

    public String getGenero() {
        return genero;
    }

    public String getRating() {
        return rating;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnno() {
        anno = Lector.lector();
    }

    public void setAutor() {
        autor = Lector.lector();
    }

    public void setCapitulos() {
        try {
            capitulos = Lector.lector();
        } catch (NumberFormatException e) {
            System.out.println("El dato dado no esta en el formato correcto");
        }
    }

    public void setGenero() {
        genero = Lector.lector();
    }

    public void setRating() {
        rating = Lector.lector();
    }

    public void setTitulo() {
        titulo = Lector.lector();
    }
}
