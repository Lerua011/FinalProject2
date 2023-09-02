package Proyecto2Progra;
import Otros.Limpiar_txt;
import Otros.imgTabla;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

public class BaseDeDatos extends javax.swing.JFrame {

    Limpiar_txt lt = new Limpiar_txt();
    private String carpeta = "Datos";
    private String rutaclientes_txt = "C:\\Users\\laboratorio\\Desktop\\Datos\\Clientes.txt";
    private String rutafacturas_txt = "C:\\Users\\laboratorio\\Desktop\\Datos\\Facturas.txt";
    private String rutacategorias_txt = "C:\\Users\\laboratorio\\Desktop\\Datos\\Categorias.txt";
    private String rutaproveedores_txt = "C:\\Users\\laboratorio\\Desktop\\Datos\\Proveedores.txt";    
    private String rutaproductos_txt = "C:\\Users\\laboratorio\\Desktop\\Datos\\Productos.txt";
    private String rutaventas_txt = "C:\\Users\\laboratorio\\Desktop\\Datos\\Ventas.txt";    

    
    Proceso rp;
    Producto p;
    Producto_1 p1;
    Producto_2 p2;
    Producto_3 p3;
    Producto_4 p4;
    Producto_5 p5;
    Proceso_1 rp1;
    Proceso_2 rp2;
    Proceso_3 rp3;
    Proceso_4 rp4;
    Proceso_5 rp5;

    public BaseDeDatos() {

        initComponents();

        // Crear la carpeta si no existe
        File carpetaDir = new File("C:\\Users\\laboratorio\\Desktop\\" + carpeta);
        if (!carpetaDir.exists()) {
            carpetaDir.mkdirs();
        }

        File archivoclientes;
        File archivofacturas;
        File archivocategorias;
        File archivoproveedores;
        File archivoproductos;
        File archivoventas;
        FileWriter escribir;
        PrintWriter linea;
        
        archivoclientes = new File(rutaclientes_txt);
        if (!archivoclientes.exists()) {
            try {
                archivoclientes.createNewFile();
                escribir = new FileWriter(archivoclientes, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        } else {
            try {
                escribir = new FileWriter(archivoclientes, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        }
        
        archivofacturas = new File(rutafacturas_txt);
        if (!archivofacturas.exists()) {
            try {
                archivofacturas.createNewFile();
                escribir = new FileWriter(archivofacturas, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        } else {
            try {
                escribir = new FileWriter(archivofacturas, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        }
        
        
        archivocategorias = new File(rutacategorias_txt);
        if (!archivocategorias.exists()) {
            try {
                archivocategorias.createNewFile();
                escribir = new FileWriter(archivocategorias, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        } else {
            try {
                escribir = new FileWriter(archivocategorias, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        }

        archivoproveedores = new File(rutaproveedores_txt);
        if (!archivoproveedores.exists()) {
            try {
                archivoproveedores.createNewFile();
                escribir = new FileWriter(archivoproveedores, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        } else {
            try {
                escribir = new FileWriter(archivoproveedores, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        } 
        archivoproductos = new File(rutaproductos_txt);
        if (!archivoproductos.exists()) {
            try {
                archivoproductos.createNewFile();
                escribir = new FileWriter(archivoproductos, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        } else {
            try {
                escribir = new FileWriter(archivoproductos, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        }
        archivoventas = new File(rutaventas_txt);
        if (!archivoventas.exists()) {
            try {
                archivoventas.createNewFile();
                escribir = new FileWriter(archivoventas, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        } else {
            try {
                escribir = new FileWriter(archivoventas, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                // Manejar la excepción, por ejemplo, imprimir el error en la consola
                e.printStackTrace();
            }
        }        
        
        
        rp = new Proceso();
        try {
            cargar_txt();
            listarRegistro();
        } catch (Exception ex) {
            // mensaje("No existe el archivo txt");
        }
        
        rp1 = new Proceso_1();
        try {
            cargar_txt1();
            listarRegistro1();
        } catch (Exception ex) {
            // mensaje("No existe el archivo txt");
        }
        rp2 = new Proceso_2();
        try {
            cargar_txt2();
            listarRegistro2();
        } catch (Exception ex) {
            // mensaje("No existe el archivo txt");
        }
        
        rp3 = new Proceso_3();
        try {
            cargar_txt3();
            listarRegistro3();
        } catch (Exception ex) {
            // mensaje("No existe el archivo txt");
        }
        rp4 = new Proceso_4();
        try {
            cargar_txt4();
            listarRegistro4();
        } catch (Exception ex) {
            // mensaje("No existe el archivo txt");
        }
        
        rp5 = new Proceso_5();
        try {
            cargar_txt5();
            listarRegistro5();
        } catch (Exception ex) {
            // mensaje("No existe el archivo txt");
        }        
    
    }
    
    
    
    
    
    
    
    
    
    public void cargar_txt() {
    File ruta = new File(rutaclientes_txt);
    try {
        FileReader fi = new FileReader(ruta);
        BufferedReader buf = new BufferedReader(fi);
        String linea = null;
        while ((linea = buf.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            int telefono = Integer.parseInt(st.nextToken());
            String nombre = st.nextToken();
            String direccion = st.nextToken();
            int idCliente = Integer.parseInt(st.nextToken()); // Read the IDCliente value

            Producto p = new Producto(telefono, nombre, direccion);
            p.setIDcliente(idCliente);
            rp.agregarRegistro(p);

            // Update the nextID value based on the loaded IDCliente
            rp.actualizarNextIDCliente(idCliente);
        }
        buf.close();
    } catch (Exception ex) {
        mensaje("Error al cargar archivo:" + ex.getMessage());
        System.out.println(ex.getMessage());
    }
}
  
    public void grabar_txt(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(rutaclientes_txt);
            pw = new PrintWriter(fw);
            for(int i= 0; i < rp.cantidadRegistro();i++){
                p = rp.obtenerRegistro(i);
                pw.println(String.valueOf(p.getTelefono()+","+p.getNombre()+","+p.getDireccion()+","+p.getIDcliente()));
            }
            pw.close();
            p.setIDcliente(p.getIDcliente());
        }catch(Exception ex){
            mensaje("Error al grabar archivo:"+ ex.getMessage() );
            System.out.println(ex.getMessage());  
        } 
        
    }
    
    public void ingresarRegistro(File ruta){
        try{
            if(leerTelefono() == -666)mensaje("Ingresar un numero");
            else if(leerNombre() == null)mensaje("Ingrese un Nombre");
            else if(leerDireccion() == null)mensaje("Ingrese una Direccion");
            else{
                p = new Producto(leerTelefono(),leerNombre(),leerDireccion());
                if(rp.BuscarIdentificacion(p.getIDcliente()) != -1) p.setIDcliente(p.getIDcliente()+1);
                else rp.agregarRegistro(p);
            grabar_txt();
            listarRegistro();
            lt.limpiar_texto(panel);
            }      
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }   
    }
    
    public void modificarRegistro(File ruta) {
    try {
        int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ID Cliente a modificar:"));

        int lugar = rp.BuscarIdentificacion(idCliente);
        if (lugar == -1) {
            mensaje("No existe un Cliente con la id " + idCliente);
        } else {
            if(leerTelefono() == -666)mensaje("Ingresar un numero");
            else if(leerNombre() == null)mensaje("Ingrese un Nombre");
            else if(leerDireccion() == null)mensaje("Ingrese una Direccion");
            else {
                if (txtRuta.getText().equalsIgnoreCase("")) {
                    p = new Producto(leerTelefono(), leerNombre(), leerDireccion());
                } else {
                    p = new Producto(leerTelefono(), leerNombre(), leerDireccion());
                }
            }
            rp.modificarRegistro(lugar, p);
            grabar_txt();
            listarRegistro();
            lt.limpiar_texto(panel);
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato de ID invalido");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
public void eliminarRegistro() {
    try {
        String inputID = JOptionPane.showInputDialog("Ingrese el ID del cliente a eliminar:");
        if (inputID != null) { // Check if the user clicked 'Cancel'
            int idCliente = Integer.parseInt(inputID);
            
            int lugar = rp.BuscarIdentificacion(idCliente);
            if (lugar == -1) {
               mensaje("No existe un Cliente con la id " + idCliente);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Seguro desea eliminar este registro?", "Confirme Borrado", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    
                    rp.eliminarRegistro(lugar);
                    grabar_txt();
                    listarRegistro();
                    lt.limpiar_texto(panel);
                   
                }
            }
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato de ID invalido");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
    public void listarRegistro(){
        DefaultTableModel dt = new DefaultTableModel();   
        dt.addColumn("Telefono");
        dt.addColumn("Nombre");
        dt.addColumn("Direccion");
        dt.addColumn("IDCliente");
        //dt.addColumn("");
        tDatosCliente.setDefaultRenderer(Object.class, new imgTabla());
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0;i < rp.cantidadRegistro();i++){
            p = rp.obtenerRegistro(i);
      
            fila[0] = p.getTelefono();
            fila[1] = p.getNombre();
            fila[2] = p.getDireccion();
            fila[3] = p.getIDcliente();
            dt.addRow(fila);
        }
        tDatosCliente.setModel(dt);
        tDatosCliente.setRowHeight(60);
    }
    
    
    
public void cargar_txt1() {
    File ruta1 = new File(rutafacturas_txt);
    try {
        FileReader fi1 = new FileReader(ruta1);
        BufferedReader buf1 = new BufferedReader(fi1);
        String linea1 = null;
        while ((linea1 = buf1.readLine()) != null) {
            StringTokenizer st1 = new StringTokenizer(linea1, ",");
            String fecha = st1.nextToken();
            int idCliente = Integer.parseInt(st1.nextToken());
            int idFactura = Integer.parseInt(st1.nextToken());

            Producto_1 p1 = new Producto_1(fecha,idCliente);
            p1.setFecha(fecha);
            p1.setIDCliente(idCliente);
            p1.setIDFactura(idFactura);
            rp1.agregarRegistro1(p1);

            // Update any relevant data based on the loaded data, similar to cargar_txt
            // For example: rp1.actualizarNextIDFactura(idFactura);
            rp1.actualizarNextIDFactura(idFactura);
        }
        buf1.close();
    } catch (Exception ex) {
        mensaje("Error al cargar archivo:" + ex.getMessage());
        System.out.println(ex.getMessage());
    }
}

  
    public void grabar_txt1(){
        FileWriter fw1;
        PrintWriter pw1;
        try{
            fw1 = new FileWriter(rutafacturas_txt);
            pw1 = new PrintWriter(fw1);
            for(int i= 0; i < rp1.cantidadRegistro1();i++){
                p1 = rp1.obtenerRegistro1(i);
                pw1.println(String.valueOf(p1.getFecha()+","+p1.getIDCliente()+","+p1.getIDFactura()));
            }
            pw1.close();
            p1.setIDFactura(p1.getIDFactura());
        }catch(Exception ex){
            mensaje("Error al grabar archivo:"+ ex.getMessage() );
            System.out.println(ex.getMessage());  
        }   
    }
    
public void ingresarRegistro1(File ruta1){
        try{
             int newIDCliente = leerIDCliente();

        // Check if the newIDFactura exists in the Proceso_1 instance
        if (rp.BuscarIdentificacion(newIDCliente) == -1) {
            mensaje("IDCliente no existe");}
        // Check if the newIDFactura exists in the Proceso_1 instance
        else if (leerIDCliente() == -666)mensaje("Ingrese una ID");
            else if(leerFecha() == null)mensaje("Ingrese una Fecha");
            else{
                p1=new Producto_1(leerFecha(), leerIDCliente());
                if(rp1.BuscarIdentificacion1(p1.getIDFactura()) != -1) p1.setIDFactura(p1.getIDFactura()+1);
                else rp1.agregarRegistro1(p1);
            grabar_txt1();
            listarRegistro1();
            lt.limpiar_texto(panel);
            }      
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }   
    }

    
   public void modificarRegistro1(File ruta1) {
    try {
        int idFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la IDFactura que desea modificar: "));

        int lugar = rp1.BuscarIdentificacion1(idFactura);
        if (lugar == -1) {
            mensaje("No existe ninguna factura con el ID: " + idFactura);
        } else {
            if (leerFecha() == null) mensaje("Ingrese una fecha");
            else {
                if (txtRuta.getText().equalsIgnoreCase("")) {
                    p1 = new Producto_1(leerFecha(), leerIDCliente());
                } else {
                    p1 = new Producto_1(leerFecha(), leerIDCliente());
                }
            }
            if (lugar == -1) rp1.agregarRegistro1(p1);
            else rp1.modificarRegistro1(lugar, p1);
            grabar_txt1();
            listarRegistro1();
            lt.limpiar_texto(panel);
        }
    } catch (NumberFormatException ex) {
        mensaje("");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
  public void eliminarRegistro1() {
    try {
        String inputID = JOptionPane.showInputDialog("Ingrese la IDFactura que desea eliminar: ");
        if (inputID != null) { // Check if the user clicked 'Cancel'
            int idFactura = Integer.parseInt(inputID);
            
            int lugar = rp1.BuscarIdentificacion1(idFactura);
            if (lugar == -1) {
                mensaje("No se encuentra ninguna factura con la id: " + idFactura);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este registro?", "Confirma eliminar", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    
                    rp1.eliminarRegistro1(lugar);
                    grabar_txt1();
                    listarRegistro1();
                    lt.limpiar_texto(panel);
                    
                }
            }
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato de ID Invalido");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
    public void listarRegistro1(){
        DefaultTableModel dt = new DefaultTableModel();   
        dt.addColumn("IDCliente");
        dt.addColumn("Fecha");
        dt.addColumn("IDFactura");
        //dt.addColumn("");
        tDatosFacturas.setDefaultRenderer(Object.class, new imgTabla());
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0;i < rp1.cantidadRegistro1();i++){
            p1 = rp1.obtenerRegistro1(i);
      
            fila[0] = p1.getIDCliente();
            fila[1] = p1.getFecha();
            fila[2] = p1.getIDFactura();
            dt.addRow(fila);
        }
        tDatosFacturas.setModel(dt);
        tDatosFacturas.setRowHeight(60);
    }
 
public void cargar_txt2() {
    File ruta2 = new File(rutacategorias_txt);
    try {
        FileReader fi2 = new FileReader(ruta2);
        BufferedReader buf2 = new BufferedReader(fi2);
        String linea2 = null;
        while ((linea2 = buf2.readLine()) != null) {
            StringTokenizer st2 = new StringTokenizer(linea2, ",");
            String descripcion = st2.nextToken();
            int idCategoria = Integer.parseInt(st2.nextToken());

            Producto_2 p2 = new Producto_2(descripcion);
            p2.setDescripcion(descripcion);
            rp2.agregarRegistro2(p2);

            // If needed, perform any additional tasks after adding the record
            // For example: rp2.actualizarNextIDCategoria();
            rp2.actualizarNextIDCategoria(idCategoria);
        }
        buf2.close();
    } catch (Exception ex) {
        mensaje("Error al cargar archivo:" + ex.getMessage());
        System.out.println(ex.getMessage());
    }
}

  
    public void grabar_txt2(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(rutacategorias_txt);
            pw = new PrintWriter(fw);
            for(int i= 0; i < rp2.cantidadRegistro2();i++){
                p2 = rp2.obtenerRegistro2(i);
                pw.println(String.valueOf(p2.getDescripcion()+","+p2.getIDCategorias()));
            }
            pw.close();
            p2.setIDCategorias(p2.getIDCategorias());
        }catch(Exception ex){
            mensaje("Error al grabar archivo:"+ ex.getMessage() );
            System.out.println(ex.getMessage());  
        }   
    }
    
    public void ingresarRegistro2(File ruta){
        try{
            if(leerDescripcion() == null)mensaje("Ingrese una Descripcion");

            else{
                p2 = new Producto_2(leerDescripcion());
                if(rp2.BuscarIdentificacion2(p2.getIDCategorias()) != -1) p2.setIDCategorias(p2.getIDCategorias()+1);
                else rp2.agregarRegistro2(p2);
            grabar_txt2();
            listarRegistro2();
            lt.limpiar_texto(panel2);
            }      
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }   
    }
    
   public void modificarRegistro2(File ruta) {
    try {
        int idCategorias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ID de la categoría que desea modificar: "));

        int lugar = rp2.BuscarIdentificacion2(idCategorias);
        if (lugar == -1) {
            mensaje("No se encontró una Categoria con la ID " + idCategorias);
        } else {
            if (leerDescripcion() == null) mensaje("Ingrese una descripcion");
            else {
                if (txtRuta.getText().equalsIgnoreCase("")) {
                    p2 = new Producto_2(leerDescripcion());
                } else {
                    p2 = new Producto_2(leerDescripcion());
                }
            }
           
            rp2.modificarRegistro2(lugar, p2);
            grabar_txt2();
            listarRegistro2();
            lt.limpiar_texto(panel);
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato de ID invalido ");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
 public void eliminarRegistro2() {
    try {
        String inputID = JOptionPane.showInputDialog("Ingrese la ID de la categoría que desea eliminar: ");
        if (inputID != null) { // Check if the user clicked 'Cancel'
            int idCategoria = Integer.parseInt(inputID);
            
            int lugar = rp2.BuscarIdentificacion2(idCategoria);
            if (lugar == -1) {
                mensaje("Category with ID " + idCategoria + " not found.");
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Está seguro de que desea eliminar este registro?", "Confirme eliminar", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    
                    rp2.eliminarRegistro2(lugar);
                    grabar_txt2();
                    listarRegistro2();
                    lt.limpiar_texto(panel);
                    
                }
            }
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato de ID Invalido.");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
    public void listarRegistro2(){
        DefaultTableModel dt = new DefaultTableModel();   
        dt.addColumn("Descripcion");
        dt.addColumn("ID Categoria");
        //dt.addColumn("");
        tDatosCategorias.setDefaultRenderer(Object.class, new imgTabla());
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0;i < rp2.cantidadRegistro2();i++){
            p2 = rp2.obtenerRegistro2(i);
      
            fila[0] = p2.getDescripcion();
            fila[1] = p2.getIDCategorias();
            dt.addRow(fila);
        }
        tDatosCategorias.setModel(dt);
        tDatosCategorias.setRowHeight(60);
    }
    
public void cargar_txt3() {
    File ruta3 = new File(rutaproveedores_txt);
    try {
        FileReader fi3 = new FileReader(ruta3);
        BufferedReader buf3 = new BufferedReader(fi3);
        String linea3 = null;
        while ((linea3 = buf3.readLine()) != null) {
            StringTokenizer st3 = new StringTokenizer(linea3, ",");
            int telefonoP = Integer.parseInt(st3.nextToken());
            String nombreP = st3.nextToken();
            String direccionP = st3.nextToken();
            int idProveedor = Integer.parseInt(st3.nextToken());

            Producto_3 p3 = new Producto_3();
            p3.setTelefonoP(telefonoP);
            p3.setNombreP(nombreP);
            p3.setDireccionP(direccionP);
            rp3.agregarRegistro3(p3);

            // If needed, perform any additional tasks after adding the record
            // For example: rp3.actualizarNextIDProveedor();
            rp3.actualizarNextIDProveedor(idProveedor);
        }
        buf3.close();
    } catch (Exception ex) {
        mensaje("Error al cargar archivo:" + ex.getMessage());
        System.out.println(ex.getMessage());
    }
}

  
    public void grabar_txt3(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(rutaproveedores_txt);
            pw = new PrintWriter(fw);
            for(int i= 0; i < rp3.cantidadRegistro3();i++){
                p3 = rp3.obtenerRegistro3(i);
                pw.println(String.valueOf(p3.getTelefonoP()+","+p3.getNombreP()+","+p3.getDireccionP()+","+p3.getIDProv()));
            }
            pw.close();
            p3.setIDProv(p3.getIDProv());
        }catch(Exception ex){
            mensaje("Error al grabar archivo:"+ ex.getMessage() );
            System.out.println(ex.getMessage());  
        }   
    }
    
    public void ingresarRegistro3(File ruta3){
        try{
            if(leerTelefonoProv() == -666)mensaje("Ingresar un Telefono");
            else if(leerNombreProv() == null)mensaje("Ingrese un Nombre");
            else if(leerDireccionProv() == null)mensaje("Ingrese una Direccion");
            else{
                p3 = new Producto_3(leerTelefonoProv(),leerNombreProv(),leerDireccionProv());
                if(rp3.BuscarIdentificacion3(p3.getIDProv()) != -1)p3.setIDProv(p3.getIDProv()+1);
                else rp3.agregarRegistro3(p3);
            grabar_txt3();
            listarRegistro3();
            lt.limpiar_texto(panel3);
            }      
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }   
    }
    
public void modificarRegistro3(File ruta) {
    try {
        int idProveedor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ID del proveedor que desea modificar: "));

        int lugar = rp3.BuscarIdentificacion3(idProveedor);
        if (lugar == -1) {
            mensaje("No se encontró ningun proveedor con la id " + idProveedor);
        } else {
            if (leerTelefonoProv() == -666) mensaje("Ingrese un número de telefono");
            else if (leerNombreProv() == null) mensaje("Ingrese un nombre");
            else if (leerDireccionProv() == null) mensaje("Ingrese una direccion");
            else {
                if (txtRuta.getText().equalsIgnoreCase("")) {
                    p3 = new Producto_3(leerTelefonoProv(), leerNombreProv(), leerDireccionProv());
                } else {
                    p3 = new Producto_3(leerTelefonoProv(), leerNombreProv(), leerDireccionProv());
                }
            }
            rp3.modificarRegistro3(lugar, p3);
            grabar_txt3();
            listarRegistro3();
            lt.limpiar_texto(panel3);
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato de ID invalido.");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
   public void eliminarRegistro3() {
    try {
        String inputID = JOptionPane.showInputDialog("Ingrese la ID del proveedor que desea eliminar: ");
        if (inputID != null) { // Check if the user clicked 'Cancel'
            int idProv = Integer.parseInt(inputID);
            
            int lugar = rp3.BuscarIdentificacion3(idProv);
            if (lugar == -1) {
                mensaje("No se encontró ningun proveedor con la id " + idProv);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Está seguro de que desea eliminar este registro?", "Confirmar eliminar", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    
                    rp3.eliminarRegistro3(lugar);
                    grabar_txt3();
                    listarRegistro3();
                    lt.limpiar_texto(panel3);
                    
                }
            }
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato de ID Invalido.");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
    public void listarRegistro3(){
        DefaultTableModel dt = new DefaultTableModel();   
        dt.addColumn("Telefono");
        dt.addColumn("Nombre");
        dt.addColumn("Direccion");
        dt.addColumn("ID Prov");
        //dt.addColumn("");
        tDatosProveedores.setDefaultRenderer(Object.class, new imgTabla());
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0;i < rp3.cantidadRegistro3();i++){
            p3 = rp3.obtenerRegistro3(i);
      
            fila[0] = p3.getTelefonoP();
            fila[1] = p3.getNombreP();
            fila[2] = p3.getDireccionP();
            fila[3] = p3.getIDProv();
            dt.addRow(fila);
        }
        tDatosProveedores.setModel(dt);
        tDatosProveedores.setRowHeight(60);
    }
    
public void cargar_txt4() {
    File ruta4 = new File(rutaproductos_txt);
    try {
        FileReader fi4 = new FileReader(ruta4);
        BufferedReader buf4 = new BufferedReader(fi4);
        String linea4 = null;
        while ((linea4 = buf4.readLine()) != null) {
            StringTokenizer st4 = new StringTokenizer(linea4, ",");
            String descripcionP = st4.nextToken();
            int precioP = Integer.parseInt(st4.nextToken());
            int idCatP = Integer.parseInt(st4.nextToken());
            int idProvP = Integer.parseInt(st4.nextToken());
            int idProducto = Integer.parseInt(st4.nextToken());

            Producto_4 p4 = new Producto_4();
            p4.setDescripcionP(descripcionP);
            p4.setPrecioP(precioP);
            p4.setIDCatP(idCatP);
            p4.setIDProvP(idProvP);
            rp4.agregarRegistro4(p4);

            // If needed, perform any additional tasks after adding the record
            // For example: rp4.actualizarNextIDProducto();
            rp4.actualizarNextIDProducto(idProducto);
        }
        buf4.close();
    } catch (Exception ex) {
        mensaje("Error al cargar archivo:" + ex.getMessage());
        System.out.println(ex.getMessage());
    }
}

  
    public void grabar_txt4(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(rutaproductos_txt);
            pw = new PrintWriter(fw);
            for(int i= 0; i < rp4.cantidadRegistro4();i++){
                p4 = rp4.obtenerRegistro4(i);
                pw.println(String.valueOf(p4.getDescripcionP()+","+p4.getPrecioP()+","+p4.getIDCatP()+","+p4.getIDProvP()+","+p4.getIDProdu()));
            }
            pw.close();
            p4.setIDProdu(p4.getIDProdu());
        }catch(Exception ex){
            mensaje("Error al grabar archivo:"+ ex.getMessage() );
            System.out.println(ex.getMessage());  
        }   
    }
    
    public void ingresarRegistro4(File ruta){
        try{
            int newIDCategoria = leerIDCategoria();
            int newIDProveedor = leerIDProveedor();

        // Check if the newIDFactura exists in the Proceso_1 instance
        if (rp2.BuscarIdentificacion2(newIDCategoria) == -1) {
            mensaje("IDCategoria no existe");}
        
        

        // Check if the newIDFactura exists in the Proceso_1 instance
        else if (rp3.BuscarIdentificacion3(newIDProveedor) == -1) mensaje("IDProveedor no existe"); 
            
            
            else if (leerPrecio() == -666)mensaje("Ingresar un Precio");
            else if(leerDescripcionProd() == null)mensaje("Ingrese una Descripcion");
            else if(leerIDCategoria() == -666)mensaje("Ingresar una Identificación");
            else if(leerIDProveedor() == -666)mensaje("Ingresar una Identificación");
            else{
                p4 = new Producto_4(leerPrecio(),leerDescripcionProd(),leerIDCategoria(),leerIDProveedor());
                if(rp4.BuscarIdentificacion4(p4.getIDProdu()) != -1) p4.setIDProdu(p4.getIDProdu()+1);
                else rp4.agregarRegistro4(p4);
            grabar_txt4();
            listarRegistro4();
            lt.limpiar_texto(panel4);
            }      
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }   
    }
    
   public void modificarRegistro4(File ruta) {
    try {
        int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto que desea modificar: "));

        int lugar = rp4.BuscarIdentificacion4(idProducto);
        if (lugar == -1) {
            mensaje("No se encontró ningún producto con la ID " + idProducto );
        } else {
            if (leerPrecio() == -666) mensaje("Enter a Price");
            else if (leerDescripcionProd() == null) mensaje("Enter a Description");
            else {
                if (txtRuta.getText().equalsIgnoreCase("")) {
                    p4 = new Producto_4(leerPrecio(), leerDescripcionProd(), leerIDCategoria(), leerIDProveedor());
                } else {
                    p4 = new Producto_4(leerPrecio(), leerDescripcionProd(), leerIDCategoria(), leerIDProveedor());
                }
            }
             rp4.modificarRegistro4(lugar, p4);
            grabar_txt4();
            listarRegistro4();
            lt.limpiar_texto(panel4);
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato invalido.");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
    public void eliminarRegistro4() {
    try {
        String inputID = JOptionPane.showInputDialog("Ingrese el ID del producto que desea eliminar: ");
        if (inputID != null) { // Check if the user clicked 'Cancel'
            int idProdu = Integer.parseInt(inputID);
            
            int lugar = rp4.BuscarIdentificacion4(idProdu);
            if (lugar == -1) {
                mensaje("No se encontró ningún producto con la ID " + idProdu );
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Está seguro de que desea eliminar este registro?", "Confirmar eliminar", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    
                    rp4.eliminarRegistro4(lugar);
                    grabar_txt4();
                    listarRegistro4();
                    lt.limpiar_texto(panel4);
                    
                }
            }
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato invalido.");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
    public void listarRegistro4(){
        DefaultTableModel dt = new DefaultTableModel();   
        dt.addColumn("Descripcion");
        dt.addColumn("Precio");
        dt.addColumn("IDCat");
        dt.addColumn("IDProv");
        dt.addColumn("IDProdu");

        //dt.addColumn("");
        tDatosProductos.setDefaultRenderer(Object.class, new imgTabla());
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0;i < rp4.cantidadRegistro4();i++){
            p4 = rp4.obtenerRegistro4(i);
      
            fila[0] = p4.getDescripcionP();
            fila[1] = p4.getPrecioP();
            fila[2] = p4.getIDCatP();
            fila[3] = p4.getIDProvP();
            fila[4] = p4.getIDProdu();
            dt.addRow(fila);
        }
        tDatosProductos.setModel(dt);
        tDatosProductos.setRowHeight(60);
    }

public void cargar_txt5() {
    File ruta5 = new File(rutaventas_txt);
    try {
        FileReader fi5 = new FileReader(ruta5);
        BufferedReader buf5 = new BufferedReader(fi5);
        String linea5 = null;
        while ((linea5 = buf5.readLine()) != null) {
            StringTokenizer st5 = new StringTokenizer(linea5, ",");
            int idFacturaV = Integer.parseInt(st5.nextToken());
            int idProductoV = Integer.parseInt(st5.nextToken());
            int cantidadV = Integer.parseInt(st5.nextToken());
            int idVenta = Integer.parseInt(st5.nextToken());

            Producto_5 p5 = new Producto_5(cantidadV, idFacturaV, idProductoV);
            p5.setIDFacturaV(idFacturaV);
            p5.setIDProductoV(idProductoV);
            p5.setCantidadV(cantidadV);
            p5.setIDVenta(idVenta);
            rp5.agregarRegistro5(p5);

            // If needed, perform any additional tasks after adding the record
            // For example: rp5.actualizarNextIDVenta();
            rp5.actualizarNextIDVenta(idVenta);
        }
        buf5.close();
    } catch (Exception ex) {
        mensaje("Error al cargar archivo:" + ex.getMessage());
        System.out.println(ex.getMessage());
    }
}

  
    public void grabar_txt5(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(rutaventas_txt);
            pw = new PrintWriter(fw);
            for(int i= 0; i < rp5.cantidadRegistro5();i++){
                p5 = rp5.obtenerRegistro5(i);
                pw.println(String.valueOf(p5.getIDFacturaV()+","+p5.getIDProductoV()+","+p5.getCantidadV()+","+p5.getIDVenta()));
            }
            pw.close();
            p5.setIDVenta(p5.getIDVenta());
        }catch(Exception ex){
            mensaje("Error al grabar archivo:"+ ex.getMessage() );
            System.out.println(ex.getMessage());  
        }   
    }
    
    public void ingresarRegistro5(File ruta) {
    try {
        int newIDFactura = leerIDFactura();
        int newIDProducto = leerIDProducto();

        // Check if the newIDFactura exists in the Proceso_1 instance
        if (rp1.BuscarIdentificacion1(newIDFactura) == -1) {
            mensaje("IDFactura does not exist");}
        
        

        // Check if the newIDFactura exists in the Proceso_1 instance
        else if (rp4.BuscarIdentificacion4(newIDProducto) == -1) {
            mensaje("IDProducto does not exist");            
            
            
        } else if ( leerCantidad() == -666) {
            mensaje("Por favor ingrese una cantidad");
        } else {
            p5 = new Producto_5(newIDFactura, leerIDProducto(), leerCantidad());
             if(rp5.BuscarIdentificacion5(p5.getIDVenta()) != -1) p5.setIDVenta(p5.getIDVenta()+1);
             else rp5.agregarRegistro5(p5);
            grabar_txt5();
            listarRegistro5();
            lt.limpiar_texto(panel5);
        }
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
   public void modificarRegistro5(File ruta) {
    try {
        int idVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ID de la venta que desea modificar: "));

        int lugar = rp5.BuscarIdentificacion5(idVenta);
        if (lugar == -1) {
            mensaje("No se encontró ninguna venta con la id " + idVenta);
        } else {
            if (leerIDFactura() == -666) mensaje("Ingrese una identifiicacion");
            else if (leerIDProducto() == -666) mensaje("Ingrese una identificacion");
            else if (leerCantidad() == -666) mensaje("Ingrese una cantidad");
            else {
                if (txtRuta.getText().equalsIgnoreCase("")) {
                    p5 = new Producto_5(leerIDFactura(), leerIDProducto(), leerCantidad());
                } else {
                    p5 = new Producto_5(leerIDFactura(), leerIDProducto(), leerCantidad());
                }
            }
            rp5.modificarRegistro5(lugar, p5);
            grabar_txt5();
            listarRegistro5();
            lt.limpiar_texto(panel5);
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato Invalido.");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
  public void eliminarRegistro5() {
    try {
        String inputID = JOptionPane.showInputDialog("Ingrese la ID de la venta que desea modificar: ");
        if (inputID != null) { // Check if the user clicked 'Cancel'
            int idVenta = Integer.parseInt(inputID);
            
            int lugar = rp5.BuscarIdentificacion5(idVenta);
            if (lugar == -1) {
                mensaje("No se encontró ninguna venta con la id " + idVenta);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Está seguro de que desea eliminar este registro?", "Confirmar eliminar.", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    
                    rp5.eliminarRegistro5(lugar);
                    grabar_txt5();
                    listarRegistro5();
                    lt.limpiar_texto(panel5);
                    
                }
            }
        }
    } catch (NumberFormatException ex) {
        mensaje("Formato Invalido.");
    } catch (Exception ex) {
        mensaje(ex.getMessage());
    }
}

    
    public void listarRegistro5(){
        DefaultTableModel dt = new DefaultTableModel();   
        dt.addColumn("ID Factura");
        dt.addColumn("Cantidad");
        dt.addColumn("ID Producto");
        dt.addColumn("ID Venta");
        //dt.addColumn("");
        tDatosVentas.setDefaultRenderer(Object.class, new imgTabla());
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0;i < rp5.cantidadRegistro5();i++){
            p5 = rp5.obtenerRegistro5(i);
      
            fila[0] = p5.getIDFacturaV();
            fila[1] = p5.getIDProductoV();
            fila[2] = p5.getCantidadV();
            fila[3] = p5.getIDVenta();
            dt.addRow(fila);
        }
        tDatosVentas.setModel(dt);
        tDatosVentas.setRowHeight(60);
    }      
    
    
    
    
    
    
    
    public int leerTelefono(){
        try{
            int identificacion = Integer.parseInt(TxtTelefonoCliente.getText().trim());
            return identificacion;
        }catch(Exception ex){
            return -666;
        }   
    }
    
    public String leerNombre(){
        try{
            String nombre = TxtNombreCliente.getText().trim();
            return nombre;
        }catch(Exception ex){
            return null;
        }   
    }
    
    public String leerDireccion(){
        try{
            String direccion = TxtDireccionCliente.getText().trim();
            return direccion;
        }catch(Exception ex){
            return null;
        }   
    }
    
    
    
    
    
    
    public String leerFecha(){
        try{
            String ano = TxtAno.getText().trim();
            String mes = SpMes.getValue().toString();
            String dia = SpDia.getValue().toString();
            String Fecha = (dia + " / " + mes + " / " + ano);
            return Fecha;
        }catch(Exception ex){
            return null;
        } 
    }
        
public int leerIDCliente(){
     try{
            int IDcliente = Integer.parseInt(TxtIDCliente.getText().trim());
            return IDcliente;
        }catch(Exception ex){
            return -666;
        }   

}





public String leerDescripcion(){
        try{
            String descripcion = TxtDescripcionCategorias.getText().trim();
            return descripcion;
        }catch(Exception ex){
            return null;
        }   
    }






public int leerTelefonoProv(){
        try{
            int identificacion = Integer.parseInt(TxtTelefonoProveedores.getText().trim());
            return identificacion;
        }catch(Exception ex){
            return -666;
        }   
    }
    
    public String leerNombreProv(){
        try{
            String nombre = TxtNombreProveedores.getText().trim();
            return nombre;
        }catch(Exception ex){
            return null;
        }   
    }
    
    public String leerDireccionProv(){
        try{
            String direccion = TxtDireccionProveedores.getText().trim();
            return direccion;
        }catch(Exception ex){
            return null;
        }   
    }

	
    
    
    
    
public String leerDescripcionProd(){
        try{
            String descripcion = TxtDescripcionProductos.getText().trim();
            return descripcion;
        }catch(Exception ex){
            return null;
        }   
    }
    public int leerPrecio(){
        try{
            int precio = Integer.parseInt(TxtPrecio.getText().trim());
            return precio;
        }catch(Exception ex){
            return -666;
        }   
    }  
public int leerIDProveedor(){
     try{
            int IDproveedor = Integer.parseInt(TxtIDProveedor.getText().trim());
            return IDproveedor;
        }catch(Exception ex){
            return -666;
        }   
    }  
    
public int leerIDCategoria(){
     try{
            int IDcategoria = Integer.parseInt(TxtIDCategoria.getText().trim());
            return IDcategoria;
        }catch(Exception ex){
            return -666;
        }   

}








public int leerCantidad(){
        try{
            int cantidad = Integer.parseInt(TxtCantidad.getText().trim());
            return cantidad;
        }catch(Exception ex){
            return -666;
        }   
    }
public int leerIDFactura(){
     try{
            int IDfactura = Integer.parseInt(TxtIDFactura.getText().trim());
            return IDfactura;
        }catch(Exception ex){
            return -666;
        }   
    }  

public int leerIDProducto(){
 try{
            int IDproducto = Integer.parseInt(TxtIDProducto.getText().trim());
            return IDproducto;
        }catch(Exception ex){
            return -666;
        }   
    }  




    public int leerIDcliente(){
        try{
            int id = p.getIDcliente();
            return id;
        }catch(Exception ex){
            return -666;
        }   
    }
    
        public int leerIDfactura(){
        try{
           int id1 = p1.getIDFactura();
           return id1;
        }catch(Exception ex){
            return -666;
        }   
    }
            public int leerIDcategorias(){
        try{
           int  id2 = p2.getIDCategorias();
           return id2;
        }catch(Exception ex){
            return -666;
        }   
    }
                public int leerIDprov(){
        try{
            int id3= p3.getIDProv();
            return id3;
        }catch(Exception ex){
            return -666;
        }   
    }
                    public int leerIDprodu(){
        try{
            int id4=p4.getIDProdu();
            return id4;
        }catch(Exception ex){
            return -666;
        }   
    }
                    
                  public int leerIDventa(){
        try{
            int id5 = p5.getIDVenta();
            return id5;
        }catch(Exception ex){
            return -666;
        }   
    }                    

















    
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        PanGestorEquipos = new javax.swing.JPanel();
        LblGestorEquipos = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        mCliente = new javax.swing.JPanel();
        ButEliminarCliente = new javax.swing.JButton();
        ButLimpiarCliente = new javax.swing.JButton();
        ButModificarCliente = new javax.swing.JButton();
        LblTelefonoCliente = new javax.swing.JLabel();
        LblNombreCliente = new javax.swing.JLabel();
        TxtNombreCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDatosCliente = new javax.swing.JTable();
        LblDireccionCliente = new javax.swing.JLabel();
        TxtDireccionCliente = new javax.swing.JTextField();
        ButAgregarCliente = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        txtRuta = new javax.swing.JTextField();
        TxtTelefonoCliente = new javax.swing.JTextField();
        mFacturas = new javax.swing.JPanel();
        ButEliminarFacturas = new javax.swing.JButton();
        ButLimpiarFacturas = new javax.swing.JButton();
        ButModificarFacturas = new javax.swing.JButton();
        LblFechaFacturas = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tDatosFacturas = new javax.swing.JTable();
        LblIDCliente = new javax.swing.JLabel();
        TxtIDCliente = new javax.swing.JTextField();
        ButAgregarFacturas = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        txtRuta4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SpMes = new javax.swing.JSpinner();
        SpDia = new javax.swing.JSpinner();
        TxtAno = new javax.swing.JTextField();
        mCategorias = new javax.swing.JPanel();
        ButEliminarCategorias = new javax.swing.JButton();
        ButLimpiarCategorias = new javax.swing.JButton();
        ButModificarCategorias = new javax.swing.JButton();
        LblDescripcionCategorias = new javax.swing.JLabel();
        TxtDescripcionCategorias = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tDatosCategorias = new javax.swing.JTable();
        ButAgregarCategorias = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        txtRuta2 = new javax.swing.JTextField();
        mProveedores = new javax.swing.JPanel();
        ButEliminarProveedores = new javax.swing.JButton();
        ButLimpiarProveedores = new javax.swing.JButton();
        ButModificarProveedores = new javax.swing.JButton();
        LblTelefonoProveedores = new javax.swing.JLabel();
        LblNombreProveedores = new javax.swing.JLabel();
        TxtNombreProveedores = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tDatosProveedores = new javax.swing.JTable();
        LblDireccionProveedores = new javax.swing.JLabel();
        TxtDireccionProveedores = new javax.swing.JTextField();
        ButAgregarProveedores = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        txtRuta3 = new javax.swing.JTextField();
        TxtTelefonoProveedores = new javax.swing.JTextField();
        mProductos = new javax.swing.JPanel();
        ButEliminarProductos = new javax.swing.JButton();
        ButLimpiarProductos = new javax.swing.JButton();
        ButModificarProductos = new javax.swing.JButton();
        LblIDCategoría = new javax.swing.JLabel();
        LblDescripcionProductos = new javax.swing.JLabel();
        TxtDescripcionProductos = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tDatosProductos = new javax.swing.JTable();
        LblPrecio = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        ButAgregarProductos = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        txtRuta5 = new javax.swing.JTextField();
        TxtIDCategoria = new javax.swing.JTextField();
        LblIDProveedor = new javax.swing.JLabel();
        TxtIDProveedor = new javax.swing.JTextField();
        mVentas = new javax.swing.JPanel();
        ButEliminarVentas = new javax.swing.JButton();
        ButLimpiarVentas = new javax.swing.JButton();
        ButModificarVentas = new javax.swing.JButton();
        LblCantidad = new javax.swing.JLabel();
        LblIDFactura = new javax.swing.JLabel();
        TxtIDFactura = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tDatosVentas = new javax.swing.JTable();
        LblIDProducto = new javax.swing.JLabel();
        TxtIDProducto = new javax.swing.JTextField();
        ButAgregarVentas = new javax.swing.JButton();
        panel6 = new javax.swing.JPanel();
        txtRuta6 = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();
        PanMenu = new javax.swing.JPanel();
        ButClientes = new javax.swing.JButton();
        ButFacturas = new javax.swing.JButton();
        ButSali = new javax.swing.JButton();
        ButVentas = new javax.swing.JButton();
        ButProductos = new javax.swing.JButton();
        ButCategorias = new javax.swing.JButton();
        ButProveedores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel6.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanGestorEquipos.setBackground(new java.awt.Color(0, 153, 153));

        LblGestorEquipos.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        LblGestorEquipos.setForeground(new java.awt.Color(255, 255, 255));
        LblGestorEquipos.setText("Base de Datos");

        javax.swing.GroupLayout PanGestorEquiposLayout = new javax.swing.GroupLayout(PanGestorEquipos);
        PanGestorEquipos.setLayout(PanGestorEquiposLayout);
        PanGestorEquiposLayout.setHorizontalGroup(
            PanGestorEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanGestorEquiposLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LblGestorEquipos)
                .addContainerGap(736, Short.MAX_VALUE))
        );
        PanGestorEquiposLayout.setVerticalGroup(
            PanGestorEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanGestorEquiposLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LblGestorEquipos)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel6.add(PanGestorEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 500));

        mCliente.setPreferredSize(new java.awt.Dimension(1000, 500));

        ButEliminarCliente.setText("Eliminar");
        ButEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEliminarClienteActionPerformed(evt);
            }
        });

        ButLimpiarCliente.setText("Limpiar");
        ButLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimpiarClienteActionPerformed(evt);
            }
        });

        ButModificarCliente.setText("Modificar");
        ButModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButModificarClienteActionPerformed(evt);
            }
        });

        LblTelefonoCliente.setText("Teléfono");

        LblNombreCliente.setText("Nombre");

        tDatosCliente.setBackground(new java.awt.Color(153, 255, 153));
        tDatosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dirección", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(tDatosCliente);

        LblDireccionCliente.setText("Dirección");

        ButAgregarCliente.setText("Agregar");
        ButAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        txtRuta.setText(" ");

        javax.swing.GroupLayout mClienteLayout = new javax.swing.GroupLayout(mCliente);
        mCliente.setLayout(mClienteLayout);
        mClienteLayout.setHorizontalGroup(
            mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mClienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mClienteLayout.createSequentialGroup()
                        .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mClienteLayout.createSequentialGroup()
                                .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblNombreCliente)
                                    .addComponent(LblDireccionCliente)
                                    .addComponent(LblTelefonoCliente))
                                .addGap(81, 81, 81)
                                .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(282, 282, 282)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mClienteLayout.createSequentialGroup()
                        .addComponent(ButAgregarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButEliminarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButLimpiarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButModificarCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mClienteLayout.setVerticalGroup(
            mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblNombreCliente)
                        .addComponent(TxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDireccionCliente)
                    .addComponent(TxtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mClienteLayout.createSequentialGroup()
                        .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblTelefonoCliente)
                            .addComponent(TxtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButAgregarCliente)
                    .addComponent(ButEliminarCliente)
                    .addComponent(ButLimpiarCliente)
                    .addComponent(ButModificarCliente))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", mCliente);

        mFacturas.setPreferredSize(new java.awt.Dimension(1000, 500));

        ButEliminarFacturas.setText("Eliminar");
        ButEliminarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEliminarFacturasActionPerformed(evt);
            }
        });

        ButLimpiarFacturas.setText("Limpiar");
        ButLimpiarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimpiarFacturasActionPerformed(evt);
            }
        });

        ButModificarFacturas.setText("Modificar");
        ButModificarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButModificarFacturasActionPerformed(evt);
            }
        });

        LblFechaFacturas.setText("Mes");

        tDatosFacturas.setBackground(new java.awt.Color(153, 255, 153));
        tDatosFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "ID Cliente"
            }
        ));
        jScrollPane5.setViewportView(tDatosFacturas);

        LblIDCliente.setText("ID Cliente");

        ButAgregarFacturas.setText("Agregar");
        ButAgregarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAgregarFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        txtRuta4.setText(" ");

        jLabel4.setText("Día");

        jLabel5.setText("Año");

        SpMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        SpDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        TxtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mFacturasLayout = new javax.swing.GroupLayout(mFacturas);
        mFacturas.setLayout(mFacturasLayout);
        mFacturasLayout.setHorizontalGroup(
            mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mFacturasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mFacturasLayout.createSequentialGroup()
                        .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mFacturasLayout.createSequentialGroup()
                                .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblIDCliente)
                                    .addGroup(mFacturasLayout.createSequentialGroup()
                                        .addComponent(LblFechaFacturas)
                                        .addGap(18, 18, 18)
                                        .addComponent(SpMes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mFacturasLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(SpDia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addComponent(TxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRuta4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(282, 282, 282)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mFacturasLayout.createSequentialGroup()
                        .addComponent(ButAgregarFacturas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButEliminarFacturas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButLimpiarFacturas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButModificarFacturas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mFacturasLayout.setVerticalGroup(
            mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mFacturasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblFechaFacturas)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(SpMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SpDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRuta4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblIDCliente)
                    .addComponent(TxtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButAgregarFacturas)
                    .addComponent(ButEliminarFacturas)
                    .addComponent(ButLimpiarFacturas)
                    .addComponent(ButModificarFacturas))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", mFacturas);

        ButEliminarCategorias.setText("Eliminar");
        ButEliminarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEliminarCategoriasActionPerformed(evt);
            }
        });

        ButLimpiarCategorias.setText("Limpiar");
        ButLimpiarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimpiarCategoriasActionPerformed(evt);
            }
        });

        ButModificarCategorias.setText("Modificar");
        ButModificarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButModificarCategoriasActionPerformed(evt);
            }
        });

        LblDescripcionCategorias.setText("Descripción");

        TxtDescripcionCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescripcionCategoriasActionPerformed(evt);
            }
        });

        tDatosCategorias.setBackground(new java.awt.Color(153, 255, 153));
        tDatosCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción"
            }
        ));
        jScrollPane3.setViewportView(tDatosCategorias);

        ButAgregarCategorias.setText("Agregar");
        ButAgregarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAgregarCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        txtRuta2.setText(" ");

        javax.swing.GroupLayout mCategoriasLayout = new javax.swing.GroupLayout(mCategorias);
        mCategorias.setLayout(mCategoriasLayout);
        mCategoriasLayout.setHorizontalGroup(
            mCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mCategoriasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCategoriasLayout.createSequentialGroup()
                        .addGroup(mCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mCategoriasLayout.createSequentialGroup()
                                .addComponent(LblDescripcionCategorias)
                                .addGap(58, 58, 58)
                                .addComponent(TxtDescripcionCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(282, 282, 282)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mCategoriasLayout.createSequentialGroup()
                        .addComponent(ButAgregarCategorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButEliminarCategorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButLimpiarCategorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButModificarCategorias)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mCategoriasLayout.setVerticalGroup(
            mCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mCategoriasLayout.createSequentialGroup()
                .addGroup(mCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCategoriasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblDescripcionCategorias)
                        .addComponent(TxtDescripcionCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(mCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCategoriasLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mCategoriasLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(mCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButModificarCategorias)
                    .addComponent(ButLimpiarCategorias)
                    .addComponent(ButEliminarCategorias)
                    .addComponent(ButAgregarCategorias))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", mCategorias);

        mProveedores.setPreferredSize(new java.awt.Dimension(1000, 500));

        ButEliminarProveedores.setText("Eliminar");
        ButEliminarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEliminarProveedoresActionPerformed(evt);
            }
        });

        ButLimpiarProveedores.setText("Limpiar");
        ButLimpiarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimpiarProveedoresActionPerformed(evt);
            }
        });

        ButModificarProveedores.setText("Modificar");
        ButModificarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButModificarProveedoresActionPerformed(evt);
            }
        });

        LblTelefonoProveedores.setText("Teléfono");

        LblNombreProveedores.setText("Nombre");

        tDatosProveedores.setBackground(new java.awt.Color(153, 255, 153));
        tDatosProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dirección", "Teléfono"
            }
        ));
        jScrollPane4.setViewportView(tDatosProveedores);

        LblDireccionProveedores.setText("Dirección");

        ButAgregarProveedores.setText("Agregar");
        ButAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAgregarProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        txtRuta3.setText(" ");

        javax.swing.GroupLayout mProveedoresLayout = new javax.swing.GroupLayout(mProveedores);
        mProveedores.setLayout(mProveedoresLayout);
        mProveedoresLayout.setHorizontalGroup(
            mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mProveedoresLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mProveedoresLayout.createSequentialGroup()
                        .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mProveedoresLayout.createSequentialGroup()
                                .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblNombreProveedores)
                                    .addComponent(LblDireccionProveedores)
                                    .addComponent(LblTelefonoProveedores))
                                .addGap(81, 81, 81)
                                .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtNombreProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDireccionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTelefonoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRuta3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(282, 282, 282)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mProveedoresLayout.createSequentialGroup()
                        .addComponent(ButAgregarProveedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButEliminarProveedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButLimpiarProveedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButModificarProveedores)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mProveedoresLayout.setVerticalGroup(
            mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mProveedoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblNombreProveedores)
                        .addComponent(TxtNombreProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRuta3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDireccionProveedores)
                    .addComponent(TxtDireccionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mProveedoresLayout.createSequentialGroup()
                        .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblTelefonoProveedores)
                            .addComponent(TxtTelefonoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButAgregarProveedores)
                    .addComponent(ButEliminarProveedores)
                    .addComponent(ButLimpiarProveedores)
                    .addComponent(ButModificarProveedores))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", mProveedores);

        mProductos.setPreferredSize(new java.awt.Dimension(1000, 500));

        ButEliminarProductos.setText("Eliminar");
        ButEliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEliminarProductosActionPerformed(evt);
            }
        });

        ButLimpiarProductos.setText("Limpiar");
        ButLimpiarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimpiarProductosActionPerformed(evt);
            }
        });

        ButModificarProductos.setText("Modificar");
        ButModificarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButModificarProductosActionPerformed(evt);
            }
        });

        LblIDCategoría.setText("ID Categoría");

        LblDescripcionProductos.setText("Descripción");

        tDatosProductos.setBackground(new java.awt.Color(153, 255, 153));
        tDatosProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción", "Precio", "ID Categoría", "ID Proveedor"
            }
        ));
        tDatosProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDatosProductosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tDatosProductos);

        LblPrecio.setText("Precio");

        ButAgregarProductos.setText("Agregar");
        ButAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAgregarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        txtRuta5.setText(" ");

        LblIDProveedor.setText("ID Proveedor");

        javax.swing.GroupLayout mProductosLayout = new javax.swing.GroupLayout(mProductos);
        mProductos.setLayout(mProductosLayout);
        mProductosLayout.setHorizontalGroup(
            mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mProductosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIDProveedor)
                    .addGroup(mProductosLayout.createSequentialGroup()
                        .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mProductosLayout.createSequentialGroup()
                                .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblDescripcionProductos)
                                    .addComponent(LblPrecio)
                                    .addComponent(LblIDCategoría))
                                .addGap(81, 81, 81)
                                .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtDescripcionProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtIDCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRuta5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(282, 282, 282)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mProductosLayout.createSequentialGroup()
                        .addComponent(ButAgregarProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButEliminarProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButLimpiarProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButModificarProductos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mProductosLayout.setVerticalGroup(
            mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mProductosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblDescripcionProductos)
                        .addComponent(TxtDescripcionProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRuta5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPrecio)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mProductosLayout.createSequentialGroup()
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(mProductosLayout.createSequentialGroup()
                        .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblIDCategoría)
                            .addComponent(TxtIDCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblIDProveedor)
                            .addComponent(TxtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(mProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButAgregarProductos)
                    .addComponent(ButEliminarProductos)
                    .addComponent(ButLimpiarProductos)
                    .addComponent(ButModificarProductos))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", mProductos);

        mVentas.setPreferredSize(new java.awt.Dimension(1000, 500));

        ButEliminarVentas.setText("Eliminar");
        ButEliminarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEliminarVentasActionPerformed(evt);
            }
        });

        ButLimpiarVentas.setText("Limpiar");
        ButLimpiarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimpiarVentasActionPerformed(evt);
            }
        });

        ButModificarVentas.setText("Modificar");
        ButModificarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButModificarVentasActionPerformed(evt);
            }
        });

        LblCantidad.setText("Cantidad");

        LblIDFactura.setText("ID Factura");

        tDatosVentas.setBackground(new java.awt.Color(153, 255, 153));
        tDatosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Factura", "ID Producto", "Cantidad"
            }
        ));
        jScrollPane7.setViewportView(tDatosVentas);

        LblIDProducto.setText("ID Producto");

        ButAgregarVentas.setText("Agregar");
        ButAgregarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAgregarVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        txtRuta6.setText(" ");

        javax.swing.GroupLayout mVentasLayout = new javax.swing.GroupLayout(mVentas);
        mVentas.setLayout(mVentasLayout);
        mVentasLayout.setHorizontalGroup(
            mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mVentasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mVentasLayout.createSequentialGroup()
                        .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mVentasLayout.createSequentialGroup()
                                .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblIDFactura)
                                    .addComponent(LblIDProducto)
                                    .addComponent(LblCantidad))
                                .addGap(81, 81, 81)
                                .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRuta6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(282, 282, 282)
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mVentasLayout.createSequentialGroup()
                        .addComponent(ButAgregarVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButEliminarVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButLimpiarVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButModificarVentas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mVentasLayout.setVerticalGroup(
            mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mVentasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblIDFactura)
                        .addComponent(TxtIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRuta6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblIDProducto)
                    .addComponent(TxtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mVentasLayout.createSequentialGroup()
                        .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCantidad)
                            .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButAgregarVentas)
                    .addComponent(ButEliminarVentas)
                    .addComponent(ButLimpiarVentas)
                    .addComponent(ButModificarVentas))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", mVentas);

        jPanel6.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 860, 610));

        PanMenu.setBackground(new java.awt.Color(153, 255, 255));

        ButClientes.setBackground(new java.awt.Color(51, 255, 51));
        ButClientes.setText("Clientes");
        ButClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButClientesMouseClicked(evt);
            }
        });
        ButClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButClientesActionPerformed(evt);
            }
        });

        ButFacturas.setBackground(new java.awt.Color(255, 255, 254));
        ButFacturas.setText("Facturas");
        ButFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButFacturasMouseClicked(evt);
            }
        });
        ButFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButFacturasActionPerformed(evt);
            }
        });

        ButSali.setBackground(new java.awt.Color(255, 255, 254));
        ButSali.setText("Salir");
        ButSali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSaliActionPerformed(evt);
            }
        });

        ButVentas.setBackground(new java.awt.Color(255, 255, 254));
        ButVentas.setText("Ventas");
        ButVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButVentasMouseClicked(evt);
            }
        });
        ButVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButVentasActionPerformed(evt);
            }
        });

        ButProductos.setBackground(new java.awt.Color(255, 255, 254));
        ButProductos.setText("Productos");
        ButProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButProductosMouseClicked(evt);
            }
        });
        ButProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButProductosActionPerformed(evt);
            }
        });

        ButCategorias.setBackground(new java.awt.Color(255, 255, 254));
        ButCategorias.setText("Categorías");
        ButCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCategoriasMouseClicked(evt);
            }
        });
        ButCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCategoriasActionPerformed(evt);
            }
        });

        ButProveedores.setBackground(new java.awt.Color(255, 255, 254));
        ButProveedores.setText("Proveedores");
        ButProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButProveedoresMouseClicked(evt);
            }
        });
        ButProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButProveedoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        jLabel2.setText("Servicio");

        jLabel3.setText("Producto");

        javax.swing.GroupLayout PanMenuLayout = new javax.swing.GroupLayout(PanMenu);
        PanMenu.setLayout(PanMenuLayout);
        PanMenuLayout.setHorizontalGroup(
            PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanMenuLayout.createSequentialGroup()
                .addGroup(PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanMenuLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButSali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanMenuLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PanMenuLayout.setVerticalGroup(
            PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButClientes)
                .addGap(18, 18, 18)
                .addComponent(ButFacturas)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButVentas)
                .addGap(48, 48, 48)
                .addComponent(ButSali)
                .addGap(181, 181, 181))
        );

        jPanel6.add(PanMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAgregarClienteActionPerformed
        File ruta = new File(txtRuta.getText());
        this.ingresarRegistro(ruta);
    }//GEN-LAST:event_ButAgregarClienteActionPerformed

    private void ButModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButModificarClienteActionPerformed
           File ruta1 = new File(txtRuta.getText());
        this.modificarRegistro(ruta1);
       TxtNombreCliente.setText("");
       TxtTelefonoCliente.setText("");
        TxtDireccionCliente.setText("");


    }//GEN-LAST:event_ButModificarClienteActionPerformed

    private void ButSaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ButSaliActionPerformed

    private void ButLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimpiarClienteActionPerformed
        // TODO add your handling code here:
         TxtNombreCliente.setText("");
       TxtTelefonoCliente.setText("");
        TxtDireccionCliente.setText("");


    }//GEN-LAST:event_ButLimpiarClienteActionPerformed

    private void ButEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEliminarClienteActionPerformed
        this.eliminarRegistro();
        // TODO add your handling code here:
    }//GEN-LAST:event_ButEliminarClienteActionPerformed

    private void ButClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButClientesMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_ButClientesMouseClicked

    private void ButFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButFacturasMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_ButFacturasMouseClicked

    private void ButClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButClientesActionPerformed
        if(ButClientes.isSelected()){
        }else{
            ButClientes.setBackground(new Color(51,255,51));
            ButFacturas.setBackground(new Color(255,255,254));
            ButCategorias.setBackground(new Color(255,255,254));
            ButProveedores.setBackground(new Color(255,255,254));
            ButProductos.setBackground(new Color(255,255,254));
            ButVentas.setBackground(new Color(255,255,254));
        }
    }//GEN-LAST:event_ButClientesActionPerformed

    private void ButFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButFacturasActionPerformed
        if(ButClientes.isSelected()){
        }else{
            ButClientes.setBackground(new Color(255,255,254));
            ButFacturas.setBackground(new Color(51,255,51));
            ButCategorias.setBackground(new Color(255,255,254));
            ButProveedores.setBackground(new Color(255,255,254));
            ButProductos.setBackground(new Color(255,255,254));
            ButVentas.setBackground(new Color(255,255,254));
        }
    }//GEN-LAST:event_ButFacturasActionPerformed

    private void ButEliminarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEliminarCategoriasActionPerformed
        // TODO add your handling code here:
        this.eliminarRegistro2();
    }//GEN-LAST:event_ButEliminarCategoriasActionPerformed

    private void ButLimpiarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimpiarCategoriasActionPerformed
        // TODO add your handling code here:
        TxtDescripcionCategorias.setText("");
    }//GEN-LAST:event_ButLimpiarCategoriasActionPerformed

    private void ButModificarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButModificarCategoriasActionPerformed
        // TODO add your handling code here:
                   File ruta1 = new File(txtRuta3.getText());
        this.modificarRegistro2(ruta1);
       TxtDescripcionCategorias.setText("");

    }//GEN-LAST:event_ButModificarCategoriasActionPerformed

    private void TxtDescripcionCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescripcionCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescripcionCategoriasActionPerformed

    private void ButAgregarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAgregarCategoriasActionPerformed
        // TODO add your handling code here:
                File ruta = new File(txtRuta3.getText());
        this.ingresarRegistro2(ruta);
    }//GEN-LAST:event_ButAgregarCategoriasActionPerformed

    private void ButVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButVentasMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_ButVentasMouseClicked

    private void ButVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButVentasActionPerformed
        if(ButClientes.isSelected()){
        }else{
            ButClientes.setBackground(new Color(255,255,254));
            ButFacturas.setBackground(new Color(255,255,254));
            ButCategorias.setBackground(new Color(255,255,254));
            ButProveedores.setBackground(new Color(255,255,254));
            ButProductos.setBackground(new Color(255,255,254));
            ButVentas.setBackground(new Color(51,255,51));
        }
    }//GEN-LAST:event_ButVentasActionPerformed

    private void ButProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButProductosMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_ButProductosMouseClicked

    private void ButProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButProductosActionPerformed
        if(ButClientes.isSelected()){
        }else{
            ButClientes.setBackground(new Color(255,255,254));
            ButFacturas.setBackground(new Color(255,255,255));
            ButCategorias.setBackground(new Color(255,255,254));
            ButProveedores.setBackground(new Color(255,255,254));
            ButProductos.setBackground(new Color(51,255,51));
            ButVentas.setBackground(new Color(255,255,254));
        }
    }//GEN-LAST:event_ButProductosActionPerformed

    private void ButCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCategoriasMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_ButCategoriasMouseClicked

    private void ButCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCategoriasActionPerformed
        if(ButClientes.isSelected()){
        }else{
            ButClientes.setBackground(new Color(255,255,254));
            ButFacturas.setBackground(new Color(255,255,254));
            ButCategorias.setBackground(new Color(51,255,51));
            ButProveedores.setBackground(new Color(255,255,254));
            ButProductos.setBackground(new Color(255,255,254));
            ButVentas.setBackground(new Color(255,255,254));
        }
    }//GEN-LAST:event_ButCategoriasActionPerformed

    private void ButProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButProveedoresMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_ButProveedoresMouseClicked

    private void ButProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButProveedoresActionPerformed
        if(ButClientes.isSelected()){
        }else{
            ButClientes.setBackground(new Color(255,255,254));
            ButFacturas.setBackground(new Color(255,255,254));
            ButCategorias.setBackground(new Color(255,255,254));
            ButProveedores.setBackground(new Color(51,255,51));
            ButProductos.setBackground(new Color(255,255,254));
            ButVentas.setBackground(new Color(255,255,254));
        }
    }//GEN-LAST:event_ButProveedoresActionPerformed

    private void ButEliminarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEliminarProveedoresActionPerformed
        // TODO add your handling code here:
        this.eliminarRegistro3();
    }//GEN-LAST:event_ButEliminarProveedoresActionPerformed

    private void ButLimpiarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimpiarProveedoresActionPerformed
        // TODO add your handling code here:
            TxtNombreProveedores.setText("");
       TxtDireccionProveedores.setText("");
       TxtTelefonoProveedores.setText("");
    }//GEN-LAST:event_ButLimpiarProveedoresActionPerformed

    private void ButModificarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButModificarProveedoresActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
                   File ruta1 = new File(txtRuta4.getText());
        this.modificarRegistro3(ruta1);
       TxtNombreProveedores.setText("");
       TxtDireccionProveedores.setText("");
       TxtTelefonoProveedores.setText("");

        
        
    }//GEN-LAST:event_ButModificarProveedoresActionPerformed

    private void ButAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAgregarProveedoresActionPerformed
        // TODO add your handling code here:
        File ruta = new File(txtRuta4.getText());
        this.ingresarRegistro3(ruta);
    }//GEN-LAST:event_ButAgregarProveedoresActionPerformed

    private void ButEliminarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEliminarFacturasActionPerformed
        // TODO add your handling code here:
        this.eliminarRegistro1();
    }//GEN-LAST:event_ButEliminarFacturasActionPerformed

    private void ButLimpiarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimpiarFacturasActionPerformed
        // TODO add your handling code here:
           TxtIDCliente.setText("");
    }//GEN-LAST:event_ButLimpiarFacturasActionPerformed

    private void ButModificarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButModificarFacturasActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
                // TODO add your handling code here:
                   File ruta1 = new File(txtRuta2.getText());
        this.modificarRegistro1(ruta1);
       TxtIDCliente.setText("");

        
        
    }//GEN-LAST:event_ButModificarFacturasActionPerformed

    private void ButAgregarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAgregarFacturasActionPerformed
        // TODO add your handling code here:
        File ruta = new File(txtRuta2.getText());
        this.ingresarRegistro1(ruta);
    }//GEN-LAST:event_ButAgregarFacturasActionPerformed

    private void ButEliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEliminarProductosActionPerformed
        // TODO add your handling code here:
        this.eliminarRegistro4();
    }//GEN-LAST:event_ButEliminarProductosActionPerformed

    private void ButLimpiarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimpiarProductosActionPerformed
        // TODO add your handling code here:
         TxtDescripcionProductos.setText("");
       TxtPrecio.setText("");
       TxtIDCategoria.setText("");
       TxtIDProveedor.setText("");
    }//GEN-LAST:event_ButLimpiarProductosActionPerformed

    private void ButModificarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButModificarProductosActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
                // TODO add your handling code here:
                   File ruta1 = new File(txtRuta5.getText());
        this.modificarRegistro4(ruta1);
       TxtDescripcionProductos.setText("");
       TxtPrecio.setText("");
       TxtIDCategoria.setText("");
       TxtIDProveedor.setText("");

    }//GEN-LAST:event_ButModificarProductosActionPerformed

    private void ButAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAgregarProductosActionPerformed
        // TODO add your handling code here:
                File ruta = new File(txtRuta5.getText());
        this.ingresarRegistro4(ruta);
    }//GEN-LAST:event_ButAgregarProductosActionPerformed

    private void ButEliminarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEliminarVentasActionPerformed
        // TODO add your handling code here:
        this.eliminarRegistro5();
    }//GEN-LAST:event_ButEliminarVentasActionPerformed

    private void ButLimpiarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimpiarVentasActionPerformed
        // TODO add your handling code here:
          TxtIDFactura.setText("");
       TxtIDProducto.setText("");
       TxtCantidad.setText("");
    }//GEN-LAST:event_ButLimpiarVentasActionPerformed

    private void ButModificarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButModificarVentasActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
                // TODO add your handling code here:
                // TODO add your handling code here:
                   File ruta1 = new File(txtRuta6.getText());
        this.modificarRegistro5(ruta1);
       TxtIDFactura.setText("");
       TxtIDProducto.setText("");
       TxtCantidad.setText("");

    }//GEN-LAST:event_ButModificarVentasActionPerformed

    private void ButAgregarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAgregarVentasActionPerformed
        // TODO add your handling code here:
        File ruta = new File(txtRuta6.getText());
        this.ingresarRegistro5(ruta);
    }//GEN-LAST:event_ButAgregarVentasActionPerformed

    private void TxtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAnoActionPerformed

    private void tDatosProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDatosProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tDatosProductosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAgregarCategorias;
    private javax.swing.JButton ButAgregarCliente;
    private javax.swing.JButton ButAgregarFacturas;
    private javax.swing.JButton ButAgregarProductos;
    private javax.swing.JButton ButAgregarProveedores;
    private javax.swing.JButton ButAgregarVentas;
    private javax.swing.JButton ButCategorias;
    private javax.swing.JButton ButClientes;
    private javax.swing.JButton ButEliminarCategorias;
    private javax.swing.JButton ButEliminarCliente;
    private javax.swing.JButton ButEliminarFacturas;
    private javax.swing.JButton ButEliminarProductos;
    private javax.swing.JButton ButEliminarProveedores;
    private javax.swing.JButton ButEliminarVentas;
    private javax.swing.JButton ButFacturas;
    private javax.swing.JButton ButLimpiarCategorias;
    private javax.swing.JButton ButLimpiarCliente;
    private javax.swing.JButton ButLimpiarFacturas;
    private javax.swing.JButton ButLimpiarProductos;
    private javax.swing.JButton ButLimpiarProveedores;
    private javax.swing.JButton ButLimpiarVentas;
    private javax.swing.JButton ButModificarCategorias;
    private javax.swing.JButton ButModificarCliente;
    private javax.swing.JButton ButModificarFacturas;
    private javax.swing.JButton ButModificarProductos;
    private javax.swing.JButton ButModificarProveedores;
    private javax.swing.JButton ButModificarVentas;
    private javax.swing.JButton ButProductos;
    private javax.swing.JButton ButProveedores;
    private javax.swing.JButton ButSali;
    private javax.swing.JButton ButVentas;
    private javax.swing.JLabel LblCantidad;
    private javax.swing.JLabel LblDescripcionCategorias;
    private javax.swing.JLabel LblDescripcionProductos;
    private javax.swing.JLabel LblDireccionCliente;
    private javax.swing.JLabel LblDireccionProveedores;
    private javax.swing.JLabel LblFechaFacturas;
    private javax.swing.JLabel LblGestorEquipos;
    private javax.swing.JLabel LblIDCategoría;
    private javax.swing.JLabel LblIDCliente;
    private javax.swing.JLabel LblIDFactura;
    private javax.swing.JLabel LblIDProducto;
    private javax.swing.JLabel LblIDProveedor;
    private javax.swing.JLabel LblNombreCliente;
    private javax.swing.JLabel LblNombreProveedores;
    private javax.swing.JLabel LblPrecio;
    private javax.swing.JLabel LblTelefonoCliente;
    private javax.swing.JLabel LblTelefonoProveedores;
    private javax.swing.JPanel PanGestorEquipos;
    private javax.swing.JPanel PanMenu;
    private javax.swing.JSpinner SpDia;
    private javax.swing.JSpinner SpMes;
    private javax.swing.JTextField TxtAno;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtDescripcionCategorias;
    private javax.swing.JTextField TxtDescripcionProductos;
    private javax.swing.JTextField TxtDireccionCliente;
    private javax.swing.JTextField TxtDireccionProveedores;
    private javax.swing.JTextField TxtIDCategoria;
    private javax.swing.JTextField TxtIDCliente;
    private javax.swing.JTextField TxtIDFactura;
    private javax.swing.JTextField TxtIDProducto;
    private javax.swing.JTextField TxtIDProveedor;
    private javax.swing.JTextField TxtNombreCliente;
    private javax.swing.JTextField TxtNombreProveedores;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtTelefonoCliente;
    private javax.swing.JTextField TxtTelefonoProveedores;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel mCategorias;
    private javax.swing.JPanel mCliente;
    private javax.swing.JPanel mFacturas;
    private javax.swing.JPanel mProductos;
    private javax.swing.JPanel mProveedores;
    private javax.swing.JPanel mVentas;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JTable tDatosCategorias;
    private javax.swing.JTable tDatosCliente;
    private javax.swing.JTable tDatosFacturas;
    private javax.swing.JTable tDatosProductos;
    private javax.swing.JTable tDatosProveedores;
    private javax.swing.JTable tDatosVentas;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtRuta2;
    private javax.swing.JTextField txtRuta3;
    private javax.swing.JTextField txtRuta4;
    private javax.swing.JTextField txtRuta5;
    private javax.swing.JTextField txtRuta6;
    // End of variables declaration//GEN-END:variables
}
