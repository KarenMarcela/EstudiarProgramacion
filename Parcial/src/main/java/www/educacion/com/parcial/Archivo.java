
package www.educacion.com.parcial;

import java.io.*;


public class Archivo {

    
    public static void crear(){
        File file = new File("./datos.txt");
        try{
            
            if(file.createNewFile()){
                System.out.println("Archivo creado con exito");
            }
            else{
                System.out.println("El archivo ya existe");
            }
        }catch(IOException e1){
            System.out.println("Error");
        }
    }
    
    public static void escribir() throws IOException{
        File file = new File("./datos.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.close();
        fw.close();
        
    }
    
    
}
