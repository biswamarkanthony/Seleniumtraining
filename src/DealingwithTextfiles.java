import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class DealingwithTextfiles {

	//@Test 
	public void CreateNewFile() throws IOException
	{
		File file = new File("C:\\aUTOMATION1903\\today.txt");
		
		file.createNewFile();
		
	}
	
	//@Test 
	public void Filewriting() throws IOException
	{
		File file = new File("C:\\aUTOMATION1903\\today.txt");
		
		FileWriter writer = new FileWriter(file); 
		
		BufferedWriter actualwriter = new BufferedWriter(writer);
		
		actualwriter.write("Biswajit is a great teacher");
		actualwriter.newLine();		
		actualwriter.write("Elizabeth is a great student");
		
		actualwriter.flush();		
		
		
	}
	
	@Test
	public void Filereading() throws IOException 
	{
		File file = new File("C:\\aUTOMATION1903\\today.txt");
		FileReader reader = new FileReader(file); 
		
		BufferedReader actualreader = new BufferedReader(reader);
	
		String i;
		
		while((i=actualreader.readLine())!=null)
		{
		System.out.println(i);
		}

		
		
		
	
	}
	
}
