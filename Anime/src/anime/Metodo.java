package anime;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Logger;

public class Metodo {

    private static final Logger LOG = Logger.getLogger(Metodo.class.getName());

    static int ejecutado = 0;

    static Integer edad(LocalDate annoNacimiento) {
        LocalDate today = LocalDate.now();
        int edad = 0;
        try {
            edad = today.getYear() - annoNacimiento.getYear();
        } catch (NullPointerException n) {
        }
        return edad;
    }

    static void isVacio(String dato) {
        try {
            if (dato.length() != 0) {
                System.out.println(dato);
                ejecutado++;
            }
        } catch (NullPointerException e) {
        }
    }

    static String lector() {
        Scanner dato = new Scanner(System.in);
        String leido=dato.nextLine();
        return leido;
    }
}
