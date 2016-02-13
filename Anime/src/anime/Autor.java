package anime;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Autor {

    private static final Logger LOG = Logger.getLogger(Autor.class.getName());

    static int cont = 0;

    private Integer codAutor;

    private String biografia;

    private LocalDate fechaNacimiento;

    private String nombre;

    public Autor(String nombre, LocalDate fechaNacimiento, String biografia) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.biografia = biografia;
        cont++;
    }

    public Autor() {
        setNombre();
        setFechaNacimiento();
        setBiografia();
        cont++;
    }

    public String getBiografia() {
        return biografia;
    }

    public Integer getEdad() {
        int edad;
        edad = Metodo.edad(fechaNacimiento);
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setBiografia() {
        System.out.println("Dime un poco sobre la vida de este autor: ");
        biografia = Metodo.lector();
    }

    public void setCodAutor() {
        codAutor = cont;
    }

    public Integer getCodAutor(){
        return codAutor;
    }
    public void setFechaNacimiento() {
        System.out.println("Cual es la fecha de nacimiento de dicho autor? (YYYY-MM-DD)");
        try {
            fechaNacimiento = LocalDate.parse(Metodo.lector());
        } catch (java.time.format.DateTimeParseException fecha_error) {
        }
    }

    public void setNombre() {
        System.out.println("Cual es el nombre del autor? ");
        nombre = Metodo.lector();
    }
}
