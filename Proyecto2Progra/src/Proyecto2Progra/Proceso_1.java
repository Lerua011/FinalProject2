/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;
import java.io.Serializable;
import java.util.ArrayList;

import java.io.Serializable;
import java.util.ArrayList;

public class Proceso_1 implements Serializable {
    private ArrayList<Object> lista1 = new ArrayList<Object>();

    public Proceso_1() {
    }

    public Proceso_1(ArrayList<Object> lista1) {
        this.lista1 = lista1;
    }


    public void modificarRegistro1(int valor1, Producto_1 p1) {
        this.lista1.set(valor1, p1);
    }

    public void eliminarRegistro1(int valor3) {
        this.lista1.remove(valor3);
    }

    public Producto_1 obtenerRegistro1(int valor3) {
        return (Producto_1) lista1.get(valor3);
    }

    public int cantidadRegistro1() {
        return this.lista1.size();
    }

     private int nextID = 1; // Initialize with the highest ID + 1


        public void actualizarNextIDFactura(int loadedIDFactura) {
        if (loadedIDFactura >= nextID) {
            nextID = loadedIDFactura + 1;
        }
    }

    public void agregarRegistro1(Producto_1 p1) {
        if (p1.getIDFactura() == 0) {
            p1.setIDFactura(generateNextID1());
        }
        this.lista1.add(p1);
    }

    private int generateNextID1() {
        if (nextID <= 999) {
            int generatedID = nextID;
            nextID++; // Increment for the next client
            return generatedID;
        } else {
            throw new IllegalStateException("No more available IDs.");
        }
    }
    public int BuscarIdentificacion1(int ide){
        for(int i = 0; i < cantidadRegistro1();i++){
            if(ide == obtenerRegistro1(i).getIDFactura())return i;
        }
    return -1;
    }   
    

}

