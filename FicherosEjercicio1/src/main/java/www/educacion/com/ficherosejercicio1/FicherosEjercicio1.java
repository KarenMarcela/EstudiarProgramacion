
package www.educacion.com.ficherosejercicio1;

import java.io.File;
import java.io.IOException;

public class FicherosEjercicio1 {

    public static void main(String[] args) {
        File file = new File("./holamundo.txt");
        
        try{
            if(file.createNewFile()){
                System.out.println("El archivo ha sido creado");
            }else{
                System.out.println("El archivo ya existe");
            }
            
        }catch(IOException e){
            System.out.println("Ha ocurrido un error");
        }
        
    }
}
