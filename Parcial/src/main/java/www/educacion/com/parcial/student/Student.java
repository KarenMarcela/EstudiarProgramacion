
package www.educacion.com.parcial.student;

import java.util.*;

public class Student {
    private String name;
    private String lastName;
//    private GenerateCode generateCode;
    private ArrayList<String> actividades = new ArrayList<>();
    
    //CONSTRUCTOR
    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.actividades = new ArrayList<>();
    }
    
    //GETTERS
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getActividades() {
        return actividades;
    }

    
}

