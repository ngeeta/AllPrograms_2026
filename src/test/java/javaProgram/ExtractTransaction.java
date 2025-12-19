package javaProgram;

import java.io.File;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtractTransaction {

	@Test
	public void ext() throws IOException {
		String json="{\r\n"
				+ "    \"account\": {\r\n"
				+ "        \"accountId\": \"123456789\",\r\n"
				+ "        \"accountType\": \"SAVINGS\",\r\n"
				+ "        \"currency\": \"AUD\",\r\n"
				+ "        \"status\": \"ACTIVE\",\r\n"
				+ "        \"customer\": {\r\n"
				+ "            \"customerId\": \"CUST001\",\r\n"
				+ "            \"name\": {\r\n"
				+ "                \"firstName\": \"John\",\r\n"
				+ "                \"lastName\": \"Doe\"\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "    },\r\n"
				+ "    \"balances\": {\r\n"
				+ "        \"availableBalance\": 1500.75,\r\n"
				+ "        \"ledgerBalance\": 1520,\r\n"
				+ "        \"overdraftLimit\": 500,\r\n"
				+ "        \"lastUpdated\": \"2025-12-02T10:15:00Z\"\r\n"
				+ "    },\r\n"
				+ "    \"transactions\": [\r\n"
				+ "        {\r\n"
				+ "            \"transactionId\": \"TXN001\",\r\n"
				+ "            \"date\": \"2025-12-01\",\r\n"
				+ "            \"description\": \"ATM Withdrawal\",\r\n"
				+ "            \"amount\": -100,\r\n"
				+ "            \"currency\": \"AUD\",\r\n"
				+ "            \"balanceAfter\": 1500.75\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"transactionId\": \"TXN002\",\r\n"
				+ "            \"date\": \"2025-11-30\",\r\n"
				+ "            \"description\": \"Salary Credit\",\r\n"
				+ "            \"amount\": 2000,\r\n"
				+ "            \"currency\": \"AUD\",\r\n"
				+ "            \"balanceAfter\": 1600.75\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"metadata\": {\r\n"
				+ "        \"requestId\": \"abc123xyz\",\r\n"
				+ "        \"timestamp\": \"2025-12-02T10:16:00Z\",\r\n"
				+ "        \"sourceSystem\": \"CoreBanking\"\r\n"
				+ "    }\r\n"
				+ "}";
		
		ObjectMapper mapper=new ObjectMapper();
		//File f=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\transaction.json");
		Map<String,Object> map=mapper.readValue(json, Map.class);
		//Code to print transactions List/Array
		List<Map<String,Object>> transaction=(List<Map<String,Object>>) map.get("transactions");
		System.out.println(transaction);
		for(Map<String,Object> ts:transaction) {
			for(Map.Entry<String,Object> entry:ts.entrySet()) {
				System.out.println(entry.getKey() +" : "+entry.getValue());
			}
			System.out.println(ts.get("balanceAfter"));
		}
		System.out.println("-----");
		//Code to print only Account Map
		Map<String,Object> acc=(Map<String, Object>) map.get("account");
		System.out.println(acc);
		
		for(Map.Entry<String,Object> entry:acc.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		
		//Code to print only Customer Map
				Map<String,Object> cus=(Map<String, Object>) acc.get("customer");
				System.out.println(cus);
				
				for(Map.Entry<String,Object> entry:cus.entrySet()) {
					System.out.println(entry.getKey() +" : "+entry.getValue());
				}
				
				//Code to print only name Map
				Map<String,Object> name=(Map<String, Object>) cus.get("name");
				System.out.println(name);
				
				for(Map.Entry<String,Object> entry:name.entrySet()) {
					System.out.println(entry.getKey() +" : "+entry.getValue());
				}

	}
	
	
}
