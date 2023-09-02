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
public class Proceso_3  implements Serializable {
    private ArrayList<Object> lista3 = new ArrayList<Object>();
    public Proceso_3(){
 
    }
    public Proceso_3(ArrayList<Object> lista3){        
        this.lista3 = lista3;
    }
   
    public void modificarRegistro3(int valor7,Producto_3 p3){
        this.lista3.set(valor7,p3);
    }        
    public void eliminarRegistro3(int valor7){
        this.lista3.remove(valor7);
    }        
    public Producto_3 obtenerRegistro3(int valor7){
        return (Producto_3)lista3.get(valor7);
    }
    public int cantidadRegistro3(){
        return this.lista3.size();
    }
    
            public void actualizarNextIDProveedor(int loadedIDProveedor) {
        if (loadedIDProveedor >= nextID) {
            nextID = loadedIDProveedor + 1;
        }
    }
    
    private int nextID = 1; // Initialize with the starting ID value

    public void agregarRegistro3(Producto_3 p3) {
        if (p3.getIDProv() == 0) {
            p3.setIDProv(generateNextID3());
        }
        this.lista3.add(p3);
    }

    private int generateNextID3() {
        if (nextID <= 999) {
            int generatedID = nextID;
            nextID++; // Increment for the next client
            return generatedID;
        } else {
            throw new IllegalStateException("No more available IDs.");
        }
    }
    public int BuscarIdentificacion3(int ide){
        for(int i = 0; i < cantidadRegistro3();i++){
            if(ide == obtenerRegistro3(i).getIDProv())return i;
        }
    return -1;
    }        
}