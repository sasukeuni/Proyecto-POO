package anime;

import java.util.ArrayList;

public class ListaRating {

    private ArrayList<Rating> edades;

    public ListaRating() {
        edades = new ArrayList();
    }

    public void getRating() {
        for (int i = 0; i < edades.size(); i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("RATINGEN IZENA: " + edades.get(i).getValor());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void newRating() {
        Rating rat=new Rating();
        edades.add(rat);
    }
}
