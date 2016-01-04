/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

/**
 *
 * @author sasukeuni
 */
public class Genero {

    private String nombre;

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public Genero() {
        setNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Dame el nombre del género: ");
        nombre = Metodo.lector();
    }

}
