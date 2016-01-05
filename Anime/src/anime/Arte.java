/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.util.logging.Logger;

/**
 *
 * @author sasukeuni
 */
public class Arte {
    private static final Logger LOG = Logger.getLogger ( Arte.class.getName () );

    private String anno;      //publicacion de primer capitulo
    private String autor;       //autor o director de la obra original
    private String capitulos;  //cantidad de capitulos hasta el momento
    private String genero;      //genero principal del anime
    private String rating;
    private String titulo; //titulo escrito en romanji

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

    public String getAnno () {
        return anno;
    }

    public String getAutor () {
        return autor;
    }

    public String getCapitulos () {
        return capitulos;
    }

    public String getGenero () {
        return genero;
    }

    public String getRating () {
        return rating;
    }

    public String getTitulo () {
        return titulo;
    }

    public void setAnno () {
        
        anno = Metodo.lector ();
    }

    public void setAutor () {

        autor = Metodo.lector ();
    }

    public void setCapitulos () {

        try {
            capitulos = Metodo.lector ();
        } catch ( NumberFormatException e ) {
            System.out.println ( "El dato dado no esta en el formato correcto" );
        }
    }

    public void setGenero () {
        
        genero = Metodo.lector ();
    }

    public void setRating () {
        
        rating = Metodo.lector ();
    }
    
    public void setTitulo () {
        
        titulo = Metodo.lector ();
    }
}
