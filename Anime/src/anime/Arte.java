/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

/**
 *
 * @author sasukeuni
 */
public class Arte {

    private String titulo;      //titulo escrito en romanji
    private String autor;       //autor o director de la obra original
    private String anno;         //publicacion de primer capitulo
    private String capitulos;  //cantidad de capitulos hasta el momento
    private String genero;      //genero principal del anime
    private String rating;

    public Arte ( String titulo , String autor , String capitulos , String genero , String rating ) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = capitulos;
        this.genero = genero;
        this.rating = rating;
    }

    public Arte () {
        getTitulo ();
        getAutor ();
        getAnno ();
        getCapitulos ();
        getGenero ();
        getRating ();
    }

    public String getGenero () {
        return genero;
    }

    public void setGenero () {

        genero = Metodo.lector ();
    }

    public String getRating () {
        return rating;
    }

    public void setRating () {

        rating = Metodo.lector ();
    }

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo () {

        titulo = Metodo.lector ();
    }

    public String getAutor () {
        return autor;
    }

    public void setAutor () {

        autor = Metodo.lector ();
    }

    public String getAnno () {
        return anno;
    }

    public void setAnno () {

        anno = Metodo.lector ();
    }

    public String getCapitulos () {
        return capitulos;
    }

    public void setCapitulos () {

        try {
            capitulos = Metodo.lector ();
        } catch ( NumberFormatException e ) {
            System.out.println ( "El dato dado no esta en el formato correcto" );
        }
    }
}
