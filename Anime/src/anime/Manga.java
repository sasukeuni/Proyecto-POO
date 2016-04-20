package anime;

import java.io.Serializable;

public class Manga extends Arte implements Serializable {



    private String publicadora;

    /**
     *
     * @param titulo
     * @param autor
     * @param anno
     * @param capitulos
     * @param genero
     * @param rating
     * @param publicadora
     */
    public Manga(String titulo, String autor, String anno, String capitulos, String genero, String rating, String publicadora) {
        super(titulo, autor, capitulos, genero, rating);
        this.publicadora = publicadora;
    }

    public Manga() {
        super();
        setPublicadora();
    }

    public String getPublicadora() {
        return publicadora;
    }

    public void setPublicadora() {
        System.out.println("Donde se publicó?");
        publicadora = Lector.lector();
    }
}
