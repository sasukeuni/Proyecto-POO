package anime;

import java.util.ArrayList;

public class ListaGenero {

    private ArrayList<Genero> generos;

    public ListaGenero() {
        generos = new ArrayList();
    }

    public void getAutor() {
        for (int i = 0; i < generos.size(); i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("GENEROAREN IZENA: " + generos.get(i).getNombre());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void newAutor() {
        Genero gen = new Genero();
        generos.add(gen);
    }
}
