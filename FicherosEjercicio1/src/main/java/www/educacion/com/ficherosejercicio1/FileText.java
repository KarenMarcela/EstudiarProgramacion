package www.educacion.com.ficherosejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileText {

    File file;

    private void createFile() {
        try {
            if (file.createNewFile()) {
                System.out.println("El archivo ha sido creado con exito");
            } else {
                System.out.println("No se pudo crear el archivo");
            }
        } catch (IOException e) {
            System.out.println("Se ha generado un error");
        }
    }
    
    private void fileWriter(){
        try{
            FileWriter writer = new FileWriter(file);
            writer.write("Hola, estoy escribiendo");
            
            writer.close();
            
            System.out.println("Se pudo escribir en el archivo");
            
            
        }catch(IOException e2){
            e2.printStackTrace(System.out);
        }
    }
    
    public static void main(String[] args) {
        FileText fileText = new FileText();
        
        fileText.createFile();
        
        fileText.fileWriter();
        
    }

}
