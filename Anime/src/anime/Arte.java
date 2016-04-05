package anime;

public class Arte {

    //private static final Logger LOG = Logger.getLogger(Arte.class.getName());
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
        setTitulo();
        setAutor();
        setAnno();
        setCapitulos();
        setGenero();
        setRating();
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
        System.out.println("Dame el año de publicacion del primer capitulo");
        anno = Lector.lector();
    }

    public void setAutor() {
        System.out.println("Dame el autor");
        autor = Lector.lector();
    }

    public void setCapitulos() {
        System.out.println("Dame el numero total de capitulos hasta el momento");
        try {
            capitulos = Lector.lector();
        } catch (NumberFormatException e) {
            System.out.println("El dato dado no esta en el formato correcto");
        }
    }

    public void setGenero() {
        System.out.println("Dame el géreno principal:");
        genero = Lector.lector();
    }

    public void setRating() {
        System.out.println("Cual es la edad recomendada de este anime? (G(all ages), pg(children), PG-13, R-17, R+(adult))");
        rating = Lector.lector();
    }

    public void setTitulo() {
        System.out.println("Dame el titulo: ");
        titulo = Lector.lector();
    }
}
