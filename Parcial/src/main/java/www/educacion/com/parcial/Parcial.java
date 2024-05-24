
package www.educacion.com.parcial;

import java.io.IOException;
import www.educacion.com.parcial.student.Student;

public class Parcial {

    public static void main(String[] args) throws IOException {
        
        //OBJETO ESTUDIATE
        Student student1 = new Student ("Karen ","Bayona");
        Student student2 = new Student ("Jesus ","Moreno");
        Student student3 = new Student ("Vanessa ","Vergel");
        
        //ACTIVIDADES
        
        
        //CREAR ARCHIVO
        Archivo.crear();
        
        //LEER EL ARCHIVO
        Archivo.leer();
        
        //ESCRIBIR EN EL ARCHIVO
        Archivo.escribir();
        
       
        
        
        
    }
}
