package www.educacion.com.parcial;

import java.io.*;

public class Archivo {

    //METODO CREAR ARCHIVO
    public static void crear() {
        File file = new File("./datos.txt");
        try {

            if (file.createNewFile()) {
                System.out.println("Archivo creado con exito");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e1) {
            System.out.println("Error");
        }
    }
    
    //METODO LEER ARCHIVO
    public static void leer() throws FileNotFoundException, IOException {
        File file = new File("./datos.txt");

        try (FileReader fr = new FileReader(file);) {
            BufferedReader br = new BufferedReader(fr);
        }

    }

    //METODO ESCRIBIR EN EL ARCHIVO
    public static void escribir() throws IOException {
        File file = new File("./datos.txt");
        
        try(FileWriter fw = new FileWriter(file, true)){
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println("Hola ");
            pw.println("Karen  ");
            pw.println("Karen 2 ");
            pw.println("Karen 3 ");
        
        }
        
    }

}
