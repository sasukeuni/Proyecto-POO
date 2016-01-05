/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

/**
 *
 * @author sasukeuni
 */
public class Metodo {

    static int ejecutado = 0;

    static String lector () {
        InputStreamReader isr = new InputStreamReader ( System.in );
        BufferedReader flujoE = new BufferedReader ( isr );
        String dato = "";
        try {
            dato = flujoE.readLine ();
        } catch ( IOException gaizki ) {
        }
        return dato;
    }

    static Integer edad ( LocalDate annoNacimiento ) {

        LocalDate today = LocalDate.now ();
        int edad = 0;
        try {
            edad = today.getYear () - annoNacimiento.getYear ();
        } catch ( NullPointerException n ) {
        }
        return edad;
    }

    static void isVacio ( String dato ) {
        try {
            if ( dato.length () != 0 ) {
                System.out.println ( dato );
                ejecutado ++;
            }

        } catch ( NullPointerException e ) {

        }

    }
}
