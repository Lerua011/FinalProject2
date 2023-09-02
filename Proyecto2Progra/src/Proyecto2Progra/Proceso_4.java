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
public class Proceso_4  implements Serializable {
    private ArrayList<Object> lista4 = new ArrayList<Object>();
    public Proceso_4(){
 
    }
    public Proceso_4(ArrayList<Object> lista4){        
        this.lista4 = lista4;
    }
        
    public void modificarRegistro4(int valor9,Producto_4 p4){
        this.lista4.set(valor9,p4);
    }        
    public void eliminarRegistro4(int valor9){
        this.lista4.remove(valor9);
    }        
    public Producto_4 obtenerRegistro4(int valor9){
        return (Producto_4)lista4.get(valor9);
    }
    public int cantidadRegistro4(){
        return this.lista4.size();
    }
    public int BuscarIdentificacion4(int ide){
        for(int i = 0; i < cantidadRegistro4();i++){
            if(ide == obtenerRegistro4(i).getIDProdu())return i;
        }
    return -1;
    }      
    
    private int nextID = 1; // Initialize with the starting ID value
    
            public void actualizarNextIDProducto(int loadedIDProducto) {
        if (loadedIDProducto >= nextID) {
            nextID = loadedIDProducto + 1;
        }
    }

    public void agregarRegistro4(Producto_4 p4) {
        if (p4.getIDProdu() == 0) {
            p4.setIDProdu(generateNextID4());
        }
        this.lista4.add(p4);
    }

    private int generateNextID4() {
        if (nextID <= 999) {
            int generatedID = nextID;
            nextID++; // Increment for the next client
            return generatedID;
        } else {
            throw new IllegalStateException("No more available IDs.");
        }
    }
}
