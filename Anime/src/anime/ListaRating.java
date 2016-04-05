package anime;

import java.util.ArrayList;

public class ListaRating {

    private ArrayList<Rating> edades;

    @SuppressWarnings("unchecked")
    public ListaRating() {
        edades = new ArrayList<>();
    }

    public void getRating() {
        for (Rating edade : edades) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("RATINGEN IZENA: " + edade.getValor());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void setRating() {
        Rating rat = new Rating();
        edades.add(rat);
    }

    public void returnRating() {
        if (!edades.isEmpty()) {
            for (int i = 0; i < edades.size() - 1; i++) {
                System.out.println("\n" + i + ". " + edades.get(i).getValor());
            }
        } else {
            System.out.println("No hay ninguno almacenado");
        }
    }

    public void updateGenero(int objeto, int campo) {

        switch (campo) {
            case 1:
                edades.get(objeto).getClass();
                break;
            default:
                break;

        }
    }

}
