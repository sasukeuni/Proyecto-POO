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
public class Anime {

    private static final Logger LOG = Logger.getLogger ( Anime.class.getName () );

    /**
     * @param args the command line arguments
     * <p>
     * @todo make a gui
     * @todo find how to write de gotten data to a file and how to get back from
     * there
     */
    public static void main ( String[] args ) {
        AnimeClass anime01 = new AnimeClass ( null , null , null , null , null , null , null , null );
        ListaManga manga01 = new ListaManga ();
        Autor autor01 = new Autor ( null , null , null );
        int aukera = 0;
        boolean error, again;

        do {
            error = false;
            again = false;
            System.out.println ( "1. Anime" );
            System.out.println ( "2. Manga" );
            System.out.println ( "3. Autor" );
            System.out.println ( "4. Muestra los datos almacenados" );
            System.out.println ( "5. Salir" );
            try {
                aukera = Integer.parseInt ( Metodo.lector () );
            } catch ( NumberFormatException e ) {
                System.out.println ( "Has metido algo que no es un número" );
            }
            switch ( aukera ) {

                case 1:
                    anime01 = new AnimeClass ();

                    break;
                case 2:
                    manga01.newManga ();

                    break;
                case 3:
                    autor01 = new Autor ();

                    break;
                case 4:
                    try {
                        System.out.println ( "\nLos datos almacenados son los siguientes: \n" );
                        Metodo.isVacio ( anime01.getTitulo () );
                        Metodo.isVacio ( anime01.getAnno () );
                        Metodo.isVacio ( anime01.getCapitulos () );
                        Metodo.isVacio ( anime01.getAutor () );
                        Metodo.isVacio ( anime01.getGenero () );
                        Metodo.isVacio ( anime01.getRating () );
                        Metodo.isVacio ( anime01.getPublicacion () );
                        Metodo.isVacio ( anime01.getAdaptacion () );
                        manga01.getManga ();
                        /*
                         * Metodo.isVacio(manga01.getAutor());
                         * Metodo.isVacio(manga01.getCapitulos().toString());
                         * Metodo.isVacio(manga01.getAnno());
                         */
                        Metodo.isVacio ( autor01.getNombre () );
                        Metodo.isVacio ( autor01.getEdad ().toString () );
                        Metodo.isVacio ( autor01.getBiografia () );
                    } catch ( NullPointerException n ) {
                    }
                    break;
                case 5:
                    again = true;
                    break;
                default:
                    error = true;
                    System.out.println ( "try again" );
            }

        } while ( error ||  ! again );
    }

}
