/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06_07;

/**
 *
 * @author chipa
 */
public class estudiante_07 {
     // Atributos
    String nombre;
    String apellido;
    int edad;

    // Constructores
    public estudiante_07() {
    }

    public estudiante_07(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad + " años");
    }

    // Métodos con valores de retorno
    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Sobrecarga de métodos
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    public void saludar(String saludoPersonalizado) {
        System.out.println(saludoPersonalizado + " Soy " + nombre);
    }
}
