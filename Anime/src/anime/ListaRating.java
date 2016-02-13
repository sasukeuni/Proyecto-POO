package anime;

import java.util.ArrayList;

public class ListaRating {

    private final ArrayList<Rating> edades;

    @SuppressWarnings("unchecked")
    public ListaRating() {
        edades = new ArrayList<>();
    }

    public void getRating() {
        for (int i = 0; i < edades.size(); i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("RATINGEN IZENA: " + edades.get(i).getValor());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void setRating() {
        Rating rat = new Rating();
        edades.add(rat);
    }
}
