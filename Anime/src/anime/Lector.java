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
        
    static String lector() {
        Scanner dato = new Scanner(System.in);
        String leido=dato.nextLine();
        return leido;
    }
    
    static int lectorInt() {
	Scanner dato = new Scanner(System.in);
	int leido=dato.nextInt();
	return leido;
    }
    
    static float lectorFloat() {
	Scanner dato = new Scanner(System.in);
	float leido=dato.nextFloat();
	return leido;
    }
}

