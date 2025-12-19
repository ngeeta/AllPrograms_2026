package javaProgram;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;

public class POJOReadEmployees {
	@Test
    public void readEmp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\emp.json");
        List<POJOEmployee> employees = mapper.readValue(file, new TypeReference<List<POJOEmployee>>() {});

        // Print details
        for (POJOEmployee emp : employees) {
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
            System.out.println("Email: " + emp.getEmail());
            System.out.println("Position: " + emp.getPosition());
            System.out.println("Skills: " + emp.getSkills());
            System.out.println("City: " + emp.getAddress().getCity());
            System.out.println("-----");
        }

        
	}

}
