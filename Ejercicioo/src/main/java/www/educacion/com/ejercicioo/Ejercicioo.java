
package www.educacion.com.ejercicioo;

import java.io.*;

public class Ejercicioo {

    public void bufferedWriter(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("./ruta.txt"))){
            
            bw.write("Karen Marcela Bayona " );
            bw.newLine();
            bw.write("hjkd cjd dbfjs sbdjj " );
            
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    
    public void bufferedReader() throws FileNotFoundException, IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("./ruta.txt"))){
            String linea;
            
            while( (linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }catch(IOException e2){
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args) throws IOException {
        Ejercicioo ejercicio     = new Ejercicioo();
        ejercicio.bufferedReader();
        ejercicio.bufferedWriter();
    }
}
