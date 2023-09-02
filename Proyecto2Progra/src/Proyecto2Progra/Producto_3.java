/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;

/**
 *
 * @author maxru
 */
public class Producto_3 {
    private int telefonoP;
    private String nombreP;
    private String direccionP;
    private int IDProv;
    private static int nextID = 1;

 
    public Producto_3(){
  
    }
    public Producto_3(int telefonoP , String nombreP , String direccionP){
        this.telefonoP = telefonoP;
        this.nombreP = nombreP;
        this.direccionP = direccionP;
        this.IDProv= generateNextID();
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
    
    public int getTelefonoP(){
        return telefonoP;
    }
    public void setTelefonoP(int telefonoP){
        this.telefonoP = telefonoP;
    }        
    public String getNombreP(){
        return nombreP;
    } 
    public void setNombreP(String nombreP){
        this.nombreP = nombreP;
    }        
    public String getDireccionP(){
        return direccionP;
    }
    public void setDireccionP(String direccionP){
        this.direccionP = direccionP;
    }
    public int getIDProv(){
        return IDProv;
    }
    public void setIDProv(int IDProv){
        this.IDProv = IDProv;
    }    
}
    
