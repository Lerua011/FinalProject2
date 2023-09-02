/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;

/**
 *
 * @author maxru
 */
public class Producto_4 {
    private String descripcionP;
    private int IDProv;
    private int precioP;
    private int IDCatP;
    private int IDProdu;
    private static int nextID = 1;
    

  
    public Producto_4(){
  
    }
    public Producto_4(int precioP, String descripcionP, int IDProv, int IDCatP){
        this.precioP = precioP;
        this.IDProv = IDProv;
        this.descripcionP = descripcionP;
        this.IDCatP = IDCatP;
        this.IDProdu = generateNextID();
        
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
         
    public int getPrecioP(){
        return precioP;
    } 
        public void setPrecioP(int precioP){
        this.precioP = precioP;
    }    
   
    
    
    public int getIDProvP(){
        return IDProv;
    } 
    public void setIDProvP(int IDProv){
        this.IDProv = IDProv;
    } 
   public int getIDCatP(){
        return IDCatP;
    } 
    public void setIDCatP(int IDCatP){
        this.IDCatP = IDCatP;
    }        

      
    
    
    
    public String getDescripcionP(){
        return descripcionP;
    } 
    
    public int getIDProdu(){
        return IDProdu;
    }
    
    
    public void  setDescripcionP(String descripcionP){
        this.descripcionP = descripcionP;
    } 
    
    public void setIDProdu(int IDProdu){
        this.IDProdu = IDProdu;
    }    
    
}
