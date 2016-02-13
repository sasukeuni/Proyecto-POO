package anime;

import java.util.ArrayList;

public class ListaGenero {

    private final ArrayList<Genero> generos;

    @SuppressWarnings("unchecked")
    public ListaGenero() {
        generos = new ArrayList<>();
    }

    public void getGenero() {
        for (int i = 0; i < generos.size(); i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("GENEROAREN IZENA: " + generos.get(i).getNombre());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void newGenero() {
        Genero gen = new Genero();
        generos.add(gen);
    }

    public void getAutor() {
    }

    public void newAutor() {
    }
}
