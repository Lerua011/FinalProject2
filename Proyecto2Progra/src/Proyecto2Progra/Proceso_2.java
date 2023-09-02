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
public class Proceso_2 implements Serializable {
    private ArrayList<Object> lista2 = new ArrayList<Object>();
    public Proceso_2(){
 
    }
    public Proceso_2(ArrayList<Object> lista2){        
        this.lista2 = lista2;
    }
      
    public void modificarRegistro2(int valor5,Producto_2 p2){
        this.lista2.set(valor5,p2);
    }        
    public void eliminarRegistro2(int valor5){
        this.lista2.remove(valor5);
    }        
    public Producto_2 obtenerRegistro2(int valor5){
        return (Producto_2)lista2.get(valor5);
    }
    public int cantidadRegistro2(){
        return this.lista2.size();
    }
    
    
            public void actualizarNextIDCategoria(int loadedIDCategoria) {
        if (loadedIDCategoria >= nextID) {
            nextID = loadedIDCategoria + 1;
        }
    }
    private int nextID = 1; // Initialize with the starting ID value

    public void agregarRegistro2(Producto_2 p2) {
        if (p2.getIDCategorias() == 0) {
            p2.setIDCategorias(generateNextID2());
        }
        this.lista2.add(p2);
    }

    private int generateNextID2() {
        if (nextID <= 999) {
            int generatedID = nextID;
            nextID++; // Increment for the next client
            return generatedID;
        } else {
            throw new IllegalStateException("No more available IDs.");
        }
    }
    public int BuscarIdentificacion2(int ide){
        for(int i = 0; i < cantidadRegistro2();i++){
            if(ide == obtenerRegistro2(i).getIDCategorias())return i;
        }
    return -1;
    }        
}
