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
public class Rating {

    private static final Logger LOG = Logger.getLogger ( Rating.class.getName () );

    private String valor;

    public Rating ( String valor ) {
        this.valor = valor;
    }

    public Rating () {
        setValor ();
    }

    public String getValor () {
        return valor;
    }

    public void setValor () {
        System.out.println ( "Que puntuación le das? " );
        valor = Metodo.lector ();
    }

}
