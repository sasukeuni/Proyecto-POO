/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sasukeuni
 */
public class ListaManga {
    
    ArrayList<Manga> mangas;
    
    public ListaManga() {
        mangas = new ArrayList();
    }
    
    public void newManga() {
        Manga mng = new Manga();
        mangas.add(mng);
    }
    
    public void getManga() {
        Iterator<Manga> it = mangas.iterator();
        while (it.hasNext()) {
            Manga next = it.next();
            
            System.out.println("------------------------" + (next) + "------------------------------");
            System.out.println("MANGAREN IZENA: " + next.getTitulo());
            System.out.println("MANGAREN AUTOREA: " + next.getAutor());
            System.out.println("MANGAREN URTEA: " + next.getAnno());
            System.out.println("MANGAREN KAPITULU KOPURUA: " + next.getCapitulos());
            System.out.println("MANGAREN GENEROA: " + next.getGenero());
            System.out.println("MANGAREN RATINGA (G(all ages), pg(children), PG-13, R-17, R+(adult)): " +next.getRating());
            System.out.println("MANGAREN PUBLIKATZAILEA: " + next.getPublicadora());
            System.out.println("----------------------------------------------------------------");
        }
    }
}


