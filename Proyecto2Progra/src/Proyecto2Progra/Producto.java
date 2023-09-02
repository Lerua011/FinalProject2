/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;

public class Producto {
    private int telefono;
    private String nombre;
    private String direccion;
    private int IDcliente;
    private static int nextID = 1;

 
    public Producto(){
  
    }
    public Producto(int telefono, String nombre, String direccion){
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.IDcliente = generateNextID();
    }
    
    private int generateNextID() {
        if (nextID <= 999) {
            int generatedID = nextID;
            nextID++; // Increment for the next client
            return generatedID;
        } else {
            throw new IllegalStateException("No more available IDs.");
        }
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }        
    public String getNombre(){
        return nombre;
    } 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }        
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public int getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(int IDcliente) {
        this.IDcliente = IDcliente;
    }
    
}
