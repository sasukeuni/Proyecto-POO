package anime;

import java.util.ArrayList;

public class ListaRating {

    private final ArrayList<Rating> edades;

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
}
