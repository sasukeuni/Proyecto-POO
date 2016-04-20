/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.util.Scanner;

/**
 *
 * @author SasukeUni
 */
public class Lector {

    public static String lector() {
        Scanner dato = new Scanner(System.in);
        String leido = dato.nextLine();
        return leido;
    }

    public static int lectorInt() {
        int leido = -1;
        Scanner dato = new Scanner(System.in);
        if (dato.hasNextInt()) {

            leido = dato.nextInt();
        }
        return leido;
    }

    public static float lectorFloat() {
        float leido = -1;
        Scanner dato = new Scanner(System.in);
        if (dato.hasNextFloat()) {
            leido = dato.nextFloat();
        }
        return leido;
    }
}
