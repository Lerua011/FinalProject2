/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author maxru
 */
public class Proceso_5  implements Serializable {
    private ArrayList<Object> lista5 = new ArrayList<Object>();
    public Proceso_5(){
 
    }
    public Proceso_5(ArrayList<Object> lista5){        
        this.lista5 = lista5;
    }
    public void modificarRegistro5(int valor11,Producto_5 p5){
        this.lista5.set(valor11,p5);
    }        
    public void eliminarRegistro5(int valor11){
        this.lista5.remove(valor11);
    }        
    public Producto_5 obtenerRegistro5(int valor11){
        return (Producto_5)lista5.get(valor11);
    }
    public int cantidadRegistro5(){
        return this.lista5.size();
    }
    public int BuscarIdentificacion5(int ide){
        for(int i = 0; i < cantidadRegistro5();i++){
            if(ide == obtenerRegistro5(i).getIDVenta())return i;
        }
    return -1;
    }      
    
    private int nextID = 1; // Initialize with the starting ID value
    
            public void actualizarNextIDVenta(int loadedIDVenta) {
        if (loadedIDVenta >= nextID) {
            nextID = loadedIDVenta + 1;
        }
    }

    public void agregarRegistro5(Producto_5 p5) {
        if (p5.getIDVenta() == 0) {
            p5.setIDVenta(generateNextID5());
        }
        this.lista5.add(p5);
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