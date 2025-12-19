package javaProgram;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonNodeEx {
	@Test
public void transaction() throws JsonProcessingException, IOException {
	ObjectMapper mapper=new ObjectMapper();
	File f=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\transaction.json");
	JsonNode jsonNode=mapper.readTree(f);
	System.out.println("Root node: " + jsonNode.toString());
	
	String accountId=jsonNode.get("account").get("accountId").asText();
	String fisrtName=jsonNode.get("account").get("customer").get("name").get("firstName").asText();

	System.out.println("accountId :: "+accountId);
	System.out.println("fisrtName :: "+fisrtName);
	
	// Access nested array
    JsonNode scenarios = jsonNode.get("balances");
    for (JsonNode scenario : scenarios) {
    	String id=scenario.get("id").asText();
    	String availableBalance=scenario.get("availableBalance").asText();
    	System.out.println("balances: " + id + " | AvailableBalance: " + availableBalance);
    }
	}
    @Test
    public void transactionUsingMap() throws JsonProcessingException, IOException {
    	ObjectMapper mapper=new ObjectMapper();
    	File f=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\transaction.json");
    	Map<String,Object> all=mapper.readValue(f, Map.class);
    	Map<String,Object> account=(Map<String, Object>) all.get("account");
    	for(Map.Entry<String, Object> entry:account.entrySet()) {
    		System.out.println(entry.getKey() + " : " + entry.getValue());
    	}
    	
    }
    
    @Test
    public void empJson() throws JsonProcessingException, IOException {
    	ObjectMapper mapper=new ObjectMapper();
    	File f=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\emp.json");
    	JsonNode js=mapper.readTree(f);
    	System.out.println(js.toString());
    	
    	JsonNode emp=js.get("email");
    	System.out.println(emp.toString());
    	
    }




}
