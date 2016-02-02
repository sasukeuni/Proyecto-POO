package anime;

import java.util.ArrayList;

public class ListaAutor {

    private ArrayList<Autor> autores;

    public ListaAutor() {
        autores = new ArrayList();
    }

    public void getAutor() {
        for (int i = 0; i < autores.size(); i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("AUTOREAREN IZENA: " + autores.get(i).getNombre());
            System.out.println("AUTOREAREN JAIOTZE URTEA: " + autores.get(i).getFechaNacimiento());
            System.out.println("AUTOREAREN BIOGRAFIA: " + autores.get(i).getBiografia());
            System.out.println("AUTOREAREN GAUR EGUNGO ADINA: " + autores.get(i).getEdad());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void newAutor() {
        Autor aut= new Autor();
        autores.add(aut);
    }
}
