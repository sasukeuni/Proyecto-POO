package anime;

import java.util.ArrayList;

public class ListaGenero {

    private ArrayList<Genero> generos;

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
        if (!generos.isEmpty()) {
            for (int i = 0; i < generos.size() - 1; i++) {
                System.out.println(i + ". " + generos.get(i).getNombre());
            }
        } else {
            System.out.println("No hay ninguno almacenado");
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
