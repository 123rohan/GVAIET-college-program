package com.iopackage.readwritedata;

import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.WriteAbortedException;
import java.nio.Buffer;
import java.security.cert.TrustAnchor;

public class ReadWriteData {

	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bReader=new BufferedReader(isr);
		
//		try {
//			System.out.println("Enter the Number: ");
//			int number=Integer.parseInt(bReader.readLine());
//			System.out.println(number);
//			
//			//System.out.println(isr.read());
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		finally {
//			isr.close();
//			bReader.close();
//		}
	
		
		//file read write operation
//			try (
//					Writer fr=new FileWriter("demo.txt");
//					BufferedWriter bWriter=new BufferedWriter(fr);
//					)
//			{
//				//bWriter.write("abc");
//				bWriter.write(bReader.readLine());
//			}
	
		
		
		String line="";
		
		try (
				Writer fr=new FileWriter("demo.txt");
				BufferedWriter bWriter=new BufferedWriter(fr);
				){
			while(!line.equals("$")) {
				line=bReader.readLine();
				if (!line.equals("$")) {
					bWriter.write(line);
					bWriter.newLine();
				}
			}
			
		}
				
	
	}
	
	
	
	
	
	
	
	
}
