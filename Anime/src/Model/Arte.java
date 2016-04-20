package Model;

import anime.Lector;
import java.io.Serializable;
import java.util.Objects;

public class Arte implements Serializable {

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

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCapitulos(String capitulos) {
        this.capitulos = capitulos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
        System.out.println("Cual de los siguientes es su género principal? ");
        System.out.println("1.  Accion\n"
                + "2.  Artes Marciales\n"
                + "3.  Aventura\n"
                + "4.  Coches\n"
                + "5.  Comedia\n"
                + "6.  Demencia\n"
                + "7.  Demonios\n"
                + "8.  Deportes\n"
                + "9.  Drama\n"
                + "10. Ecchi\n"
                + "11. Escolar\n"
                + "12. Espacio\n"
                + "13. Fantasia\n"
                + "14. Gore\n"
                + "15. Harem\n"
                + "16. Hentai\n"
                + "17. Historico\n"
                + "18. Horror\n"
                + "19. Infantil\n"
                + "20. Josei\n"
                + "21. Juego\n"
                + "22. Magia\n"
                + "23. Mecha(Robots)\n"
                + "24. Militar\n"
                + "25. Misterio\n"
                + "26. Musica\n"
                + "27. Parodia\n"
                + "28. Policia\n"
                + "29. Psicologico\n"
                + "30. Romance\n"
                + "31. Samurai\n"
                + "32. Sci-Fi\n"
                + "33. Seinen\n"
                + "34. Shoujo Ai\n"
                + "35. Shoujo\n"
                + "36. Shounen Ai\n"
                + "37. Shounen\n"
                + "38. Slice of Life\n"
                + "39. Sobrenatular\n"
                + "40. Super Poderes\n"
                + "41. Thriller\n"
                + "42. Vampiro\n"
                + "43. Yaoi\n"
                + "44. Yuri");
        Integer seleccion;
        seleccion = Lector.lectorInt();
        if (Objects.equals(seleccion, Integer.TYPE)) {
            switch (seleccion) {
                case 1:
                    genero = "Accion";
                    break;
                case 2:
                    genero = "Artes Marciales";
                    break;
                case 3:
                    genero = "Aventura";
                    break;
                case 4:
                    genero = "Coches";
                    break;
                case 5:
                    genero = "Comedia";
                    break;
                case 6:
                    genero = "Demencia";
                    break;
                case 7:
                    genero = "Demonios";
                    break;
                case 8:
                    genero = "Deportes";
                    break;
                case 9:
                    genero = "Drama";
                    break;
                case 10:
                    genero = "Ecchi";
                    break;
                case 11:
                    genero = "Escolar";
                    break;
                case 12:
                    genero = "Espacio";
                    break;
                case 13:
                    genero = "Fantasia";
                    break;
                case 14:
                    genero = "Gore";
                    break;
                case 15:
                    genero = "Harem";
                    break;
                case 16:
                    genero = "Hentai";
                    break;
                case 17:
                    genero = "Historico";
                    break;
                case 18:
                    genero = "Horror";
                    break;
                case 19:
                    genero = "Infantil";
                    break;
                case 20:
                    genero = "Josei";
                    break;
                case 21:
                    genero = "Juego";
                    break;
                case 22:
                    genero = "Magia";
                    break;
                case 23:
                    genero = "Mecha";
                    break;
                case 24:
                    genero = "Militar";
                    break;
                case 25:
                    genero = "Misterio";
                    break;
                case 26:
                    genero = "Musica";
                    break;
                case 27:
                    genero = "Parodia";
                    break;
                case 28:
                    genero = "Policia";
                    break;
                case 29:
                    genero = "Psicologico";
                    break;
                case 30:
                    genero = "Romance";
                    break;
                case 31:
                    genero = "Samurai";
                    break;
                case 32:
                    genero = "Sci-fi";
                    break;
                case 33:
                    genero = "Seinen";
                    break;
                case 34:
                    genero = "Shoujo";
                    break;
                case 35:
                    genero = "Shoujo-ai";
                    break;
                case 36:
                    genero = "Shounen";
                    break;
                case 37:
                    genero = "Shounen-ai";
                    break;
                case 38:
                    genero = "Slice of Life";
                    break;
                case 39:
                    genero = "Sobrenatural";
                    break;
                case 40:
                    genero = "Super poderes";
                    break;
                case 41:
                    genero = "Thriller";
                    break;
                case 42:
                    genero = "Vampiro";
                    break;
                case 43:
                    genero = "Yaoi";
                    break;
                case 44:
                    genero = "Yuri";
                    break;
            }
        }
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
