/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;

/**
 *
 * @author maxru
 */
public class Producto_5 {
    private int IDFacturaV;
    private int cantidadV;
    private int IDProductoV;
    private int IDVenta;
    private static int nextID = 1;
    

  
    public Producto_5(){
  
    }
    public Producto_5(int cantidadV, int IDFacturaV, int IDProductoV){
        this.cantidadV = cantidadV;
        this.IDFacturaV = IDFacturaV;
        this.IDProductoV = IDProductoV;
        this.IDVenta=generateNextID5();
    }
    

    
         
    public int getCantidadV(){
        return cantidadV;
    } 
        public void setCantidadV(int cantidadV){
        this.cantidadV = cantidadV;
    }    
    
    
    
    public int getIDFacturaV(){
        return IDFacturaV;
    } 
    public void setIDFacturaV(int IDFacturaV){
        this.IDFacturaV = IDFacturaV;
    } 
   public int getIDProductoV(){
        return IDProductoV;
    } 
    public void setIDProductoV(int IDProductoV){
        this.IDProductoV = IDProductoV;
    }        
    public int getIDVenta(){
        return IDVenta;
    }
    public void setIDVenta(int IDVenta){
        this.IDVenta = IDVenta;
    }  
    
    private int generateNextID5() {
        if (nextID <= 999) {
            int generatedID = nextID;
            nextID++; // Increment for the next client
            return generatedID;
        } else {
            throw new IllegalStateException("No more available IDs.");
        }
    }
    
}
