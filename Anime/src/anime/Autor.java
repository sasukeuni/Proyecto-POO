/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.time.LocalDate;

/**
 *
 * @author sasukeuni
 */
public class Autor {

    static int cont = 0;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String biografia;
    private Integer CodAutor;

    public Autor ( String nombre , LocalDate fechaNacimiento , String biografia ) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.biografia = biografia;
        cont ++;
    }

    public Autor () {
        setNombre ();
        setFechaNacimiento ();
        setBiografia ();
        cont ++;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre () {
        System.out.println ( "Cual es el nombre del autor? " );
        nombre = Metodo.lector ();
    }

    public LocalDate getFechaNacimiento () {
        return fechaNacimiento;
    }

    public void setFechaNacimiento () {
        System.out.println ( "Cual es la fecha de nacimiento de dicho autor? (YYYY-MM-DD)" );
        try {
            fechaNacimiento = LocalDate.parse ( Metodo.lector () );
        } catch ( java.time.format.DateTimeParseException fecha_error ) {

        }
    }

    public Integer getEdad () {
        int edad;
        edad = Metodo.edad ( fechaNacimiento );
        return edad;
    }

    public String getBiografia () {
        return biografia;
    }

    public void setBiografia () {
        System.out.println ( "Dime un poco sobre la vida de este autor: " );
        biografia = Metodo.lector ();
    }

    public void setCodAutor () {
        CodAutor = cont;
    }
}
