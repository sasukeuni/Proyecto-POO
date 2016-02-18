package anime;

import java.util.ArrayList;

public class ListaAutor {

    private final ArrayList<Autor> autores;

    @SuppressWarnings("unchecked")
    public ListaAutor() {
        autores = new ArrayList<>();
    }

    public void getAutor() {
        for (Autor autore : autores) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("AUTOREAREN IZENA: " + autore.getNombre());
            System.out.println("AUTOREAREN JAIOTZE URTEA: " + autore.getFechaNacimiento());
            System.out.println("AUTOREAREN BIOGRAFIA: " + autore.getBiografia());
            System.out.println("AUTOREAREN GAUR EGUNGO ADINA: " + autore.getEdad());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void setAutor() {
        Autor aut = new Autor();
        autores.add(aut);
    }


    public void returnAutor() {
        for (int i = 0; i < autores.size(); i++) {
            System.out.println(i + ". " + autores.get(i).getNombre());
        }
    }

    public void updateAutor(int objeto, int campo) {

        switch (campo) {
            case 1:
                autores.get(objeto).setNombre();
                break;
            case 2:
                autores.get(objeto).setFechaNacimiento();
                break;
            case 3:
                autores.get(objeto).setBiografia();
                break;
            default:
                break;

        }
    }
}
