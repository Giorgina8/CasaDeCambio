    package proyectomonedas;

import java.io.*;        //  Paquete de acceso a datos.

public class Monedas {

    public static void main(String[] args) throws FileNotFoundException,
            IOException {

        Formulario1 F1 = new Formulario1();
        F1.setVisible(true);
        F1.setLocationRelativeTo(null);  //  Que el formulario esté centrado.
        
        
        FileInputStream fis;   //  La clase "FileInputStream" sirve para
        //referir a archivos o conexiones (sockets)
        //de una PC.
        DataInputStream Datos; //  La clase "DataInputStream" sirve para
        //leer independientemente del hardware,
        //tipos de datos de una "corriente" o 
        //"stream" que en nuestro caso es un archivo.
        String renglon = null;

        //  Al instanciar o crear el objeto, ABRIMOS el archivo.
        fis = new FileInputStream("C:\\Temp\\Cotizaciones.txt");
        Datos = new DataInputStream(fis);

        //  USAMOS el archivo.
        renglon = Datos.readLine();  //  Leemos un registro.
        while (renglon != null) {  //  Es "null" si encuentra fin del archivo.
            System.out.println(renglon);
            renglon = Datos.readLine();//  Leemos un registro.
        }

        //  CERRAMOS el archivo.
        fis.close();
    }
    
}
