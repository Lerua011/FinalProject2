/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2Progra;

/**
 *
 * @author maxru
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Producto_1 {
    private String Fecha;
    private int IDCliente;
    private int IDFactura;
    private static int nextID = 1;

    public Producto_1() {
    }

    public Producto_1(String Fecha, int IDCliente) {
        this.Fecha = Fecha;
        this.IDCliente = IDCliente;
        this.IDFactura = generateNextID();
    }

    private int generateNextID() {
        if (nextID <= 999) {
            int generatedID = nextID;
            nextID++; // Increment for the next invoice
            return generatedID;
        } else {
            throw new IllegalStateException("No more available IDs.");
        }
    }

    public String getFecha() {
        return Fecha;
    }

    public int getIDFactura() {
        return IDFactura;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }
    public void setIDFactura(int IDFactura) {
        this.IDFactura = IDFactura;
    }
    
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}

