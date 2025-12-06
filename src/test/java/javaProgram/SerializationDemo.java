package javaProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int id;
    String name;
    
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(101, "Geeta");

        // Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
        oos.writeObject(emp);
        oos.close();

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));
        Employee deserializedEmp = (Employee) ois.readObject();
        ois.close();

        System.out.println(deserializedEmp.id + " " + deserializedEmp.name);
    }
}
