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
public class AnimeClass extends Arte {

    private static final Logger LOG = Logger.getLogger ( AnimeClass.class.getName () );

    private String adaptacion;  //si tiene base en un manga poner el titulo
    private String publicacion; //tv, ova(original video animation), ona(original net animation), movie, special

    public AnimeClass ( String titulo , String autor , String anno , String capitulos , String genero , String adaptacion , String rating , String publicacion ) {
        super ( titulo , autor , capitulos , genero , rating );
        this.adaptacion = adaptacion;
        this.publicacion = publicacion;
    }

    public AnimeClass () {
        System.out.println ( "Dame el titulo: " );
        super.setTitulo ();
        System.out.println ( "Dame el autor" );
        super.setAutor ();
        System.out.println ( "Dame el año de publicacion del primer capitulo" );
        super.setAnno ();
        System.out.println ( "Dame el numero total de capitulos hasta el momento" );
        super.setCapitulos ();
        System.out.println ( "Dame el géreno primario del anime:" );
        super.setGenero ();
        setAdaptacion ();
        System.out.println ( "Cual es la edad recomendada de este anime? (G(all ages), pg(children), PG-13, R-17, R+(adult))" );
        super.setRating ();
        setPublicacion ();
    }

    public String getAdaptacion () {
        return adaptacion;
    }

    public String getPublicacion () {
        return publicacion;
    }

    public void setAdaptacion () {
        char x;
        System.out.println ( "Este anime es una adaptacion de algun manga? s/n" );
        String siNo = Metodo.lector ();
        x = siNo.charAt ( 0 );
        if ( x == 'S' || x == 's' ) {
            adaptacion = Metodo.lector ();
        } else {
            adaptacion = "Es una serie original";
        }
    }

    public void setPublicacion () {
        System.out.println ( "Que tipo de publicación ha tenido? (tv, ova(original video animation), ona(original net animation), movie, special)" );
        publicacion = Metodo.lector ();
    }

}
