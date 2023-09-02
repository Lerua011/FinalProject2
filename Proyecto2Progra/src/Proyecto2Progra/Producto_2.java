/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;

/**
 *
 * @author maxru
 */
public class Producto_2 {
    
     private String descripcion;
     private int IDCategorias;
     private static int nextID = 1;

  
    public Producto_2(){
  
    }
    public Producto_2(String descripcion){
        this.descripcion = descripcion;
        this.IDCategorias = generateNextID();
    }
    
    public int getIDCategorias(){
        return IDCategorias;
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
         
    public String getDescripcion(){
        return descripcion;
    } 
    
    
    public void  setDescripcion(String descripcion){
        this.descripcion = descripcion;
    } 
    
    public void setIDCategorias(int IDCategorias){
        this.IDCategorias = IDCategorias;
    }    
    
}
