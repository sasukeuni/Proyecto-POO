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
    
    public void returnRating() {
        for (int i = 0; i < edades.size(); i++) {
            System.out.println(i + ". " + edades.get(i).getValor());
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
