package javaProgram;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class Extract {

	ObjectMapper obj=new ObjectMapper();
	File employeeListJson=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\emp.json");
	File transMapJson=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\transaction.json");

	@Test
	public void extractTransactionJson() throws  IOException {
		Map<String,Object> all=obj.readValue(transMapJson, Map.class);
		
		//Print all BU(block) account/balances/transactions/metadata
		for(Map.Entry<String,Object> entry:all.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		
		//Print Only Account
		
		Map<String,Object> acc=(Map<String, Object>) all.get("account");
		for(Map.Entry<String,Object> entry:acc.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		System.out.println("-------------");
		
		//Print Only Account.Customer
		Map<String,Object> cus=(Map<String, Object>) acc.get("customer");
		for(Map.Entry<String,Object> entry:cus.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		System.out.println("-------------");
		List<Map<String,Object>> transaction=(List<Map<String,Object>>) all.get("transactions");
		for(Map<String,Object> ts:transaction) {
			for(Map.Entry<String, Object> entry:ts.entrySet()) {
				System.out.println(entry.getKey()+" -> "+entry.getValue());

			}
		}
		System.out.println("-------------");


		
	}
	
	@Test
	public void extractEmpployeeList() throws  IOException {
		List<Map<String,Object>> all=obj.readValue(employeeListJson, List.class);

	}
}
