package anime;

import java.util.ArrayList;

public class ListaGenero {

    private final ArrayList<Genero> generos;

    @SuppressWarnings("unchecked")
    public ListaGenero() {
        generos = new ArrayList<>();
    }

    public void getGenero() {
        for (Genero genero : generos) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("GENEROAREN IZENA: " + genero.getNombre());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void setGenero() {
        Genero gen = new Genero();
        generos.add(gen);
    }

    public void returnGenero() {
        for (int i = 0; i < generos.size(); i++) {
            System.out.println(i + ". " + generos.get(i).getNombre());
        }
    }

    public void updateGenero(int objeto, int campo) {

        switch (campo) {
            case 1:
                generos.get(objeto).setNombre();
                break;
            default:
                break;

        }
    }
}
