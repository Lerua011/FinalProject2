/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;
import java.io.Serializable;
import java.util.ArrayList;

public class Proceso implements Serializable {
    private ArrayList<Object> lista = new ArrayList<Object>();
    
    public Proceso(){
    
}

    public Proceso(ArrayList<Object> lista){        
        this.lista = lista;
    }

    public void modificarRegistro(int valor,Producto p){
        this.lista.set(valor,p);
    }        
    public void eliminarRegistro(int valor){
        this.lista.remove(valor);
    }    


    
        public void actualizarNextIDCliente(int loadedIDCliente) {
        if (loadedIDCliente >= nextID) {
            nextID = loadedIDCliente + 1;
        }
    }
    
    private int nextID = 1; // Initialize with the starting ID value

    public void agregarRegistro(Producto p) {
        if (p.getIDcliente() == 0) {
            p.setIDcliente(generateNextID());
        }
        this.lista.add(p);
    }

    private int generateNextID() {
        if (nextID <= 999) {
            int generatedID = nextID;
            nextID++;
            return generatedID;
        } else {
            throw new IllegalStateException("No more available IDs.");
        }
    }


    
    public Producto obtenerRegistro(int valor1){
        return (Producto)lista.get(valor1);
    }
    public int cantidadRegistro(){
        return this.lista.size();
    }
    public int BuscarIdentificacion(int ide){
        for(int i = 0; i < cantidadRegistro();i++){
            if(ide == obtenerRegistro(i).getIDcliente())return i;
        }
    return -1;
    }        
}
