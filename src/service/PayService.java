package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayService {
	FileReader fread = new FileReader("C:\\Users\\Asus\\Downloads\\students.csv");
	BufferedReader br = new BufferedReader(fread);
	Students student = new Students();
	String read = "";
	String splitBy = ",";	
	List<Students> students = new ArrayList<>();
	int count = 0;
	if(count != 0) {
		
	}
	
	br.close();
	fread.close();
	
}catch (IOException ex) {
	ex.printStackTrace();
}
}