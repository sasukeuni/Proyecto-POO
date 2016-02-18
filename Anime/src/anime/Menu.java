package anime;

/**
 *
 * @author sasukeuni
 */
public class Menu {

    static void menuAnime() {
        System.out.println(""
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "1. Añadir un nuevo Anime\n"
                + "2. Ver titulos\n"
                + "3. Modificar un Anime\n"
                + "4. Borrar un Anime"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    static void modificacionAnime() {
        ListaAnime animes = new ListaAnime();

        System.out.println(""
                + "Cual es el número del que quieres cambiar?\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        animes.returnAnime();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
        );
    }
    
    static void modSelAnime(){
        System.out.println(""
                + "Que campo quieres modificar?\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "1. Titulo\n"
                + "2. Autor\n"
                + "3. Año\n"
                + "4. Capitulos\n"
                + "5. Genero\n"
                + "6. Rating\n"
                + "7. Publicacion\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }

    static void menuAutor() {
        System.out.println(""
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "1. Añadir un nuevo Autor\n"
                + "2. Ver titulos\n"
                + "3. Modificar un Autor\n"
                + "4. Borrar un Autor\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
    
    static void modificacionAutor() {
        ListaAutor autores = new ListaAutor();

        System.out.println(""
                + "Cual es el número del que quieres cambiar?\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        autores.returnAutor();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
        );
    }
    
    static void modSelAutor(){
        System.out.println(""
                + "Que campo quieres modificar?\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "1. Nombre\n"
                + "2. Fecha Nacimiento\n"
                + "3. Biografia\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }
    
    
    

    static void menuGenero() {
        System.out.println(""
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "1. Añadir un nuevo Genero\n"
                + "2. Ver titulos\n"
                + "3. Modificar un Genero\n"
                + "4. Borrar un Genero\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    static void menuManga() {
        System.out.println(""
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "1. Añadir un nuevo Manga\n"
                + "2. Ver titulos\n"
                + "3. Modificar un Manga\n"
                + "4. Borrar un Manga\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
    
    static void modificacionManga() {
        ListaManga mangas = new ListaManga();

        System.out.println(""
                + "Cual es el número del que quieres cambiar?\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        mangas.returnManga();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
        );
    }
    
    static void modSelManga(){
        System.out.println(""
                + "Que campo quieres modificar?\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "1. Titulo\n"
                + "2. Autor\n"
                + "3. Año\n"
                + "4. Capitulos\n"
                + "5. Genero\n"
                + "6. Rating\n"
                + "7. Publicadora\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }
    
    

    static void menuRating() {
        System.out.println(""
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "1. Añadir un nuevo Rating\n"
                + "2. Ver titulos\n"
                + "3. Modificar un Rating\n"
                + "4. Borrar un Rating\n"
                + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
