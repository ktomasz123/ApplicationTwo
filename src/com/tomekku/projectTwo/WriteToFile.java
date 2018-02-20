package com.tomekku.projectTwo;

import java.io.BufferedWriter;
import java.util.Calendar;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class WriteToFile {

	public String fileName;
	public BufferedWriter writer;
	public File logFile;
	public String timeLogInner;
	Scanner sc;
	Scanner inp;
	
	public	WriteToFile(String fileName){
		
		this.fileName =  fileName;
		
		this.logFile = new File(fileName);
		
		timeLogInner = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		
		sc = new Scanner(System.in);
		
		
		try {
			writer = new BufferedWriter(new FileWriter(logFile, true));
			
			inp = new Scanner(logFile);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("W konstruktorze: " + fileName);
	}
	
	
	 void writeToFile(){
		 
		 try {
			 System.out.println(logFile.getCanonicalPath());
			 
			 writer.write("\n"+timeLogInner+"\t");
			 System.out.println("\n co wpisac do pliku?: \n");
			 writer.write(sc.next());
			 
		 } catch (Exception e) {			 
			 e.printStackTrace();			 
		 }finally {
	            try {
	                // Close the writer regardless of what happens...
	                writer.close();
	                sc.close();
	            } catch (Exception e) {
	            }
	        }		 
	 }
	 
	 
	 
	 void readFromFile() {
		 String infoFromFile = null ;
		 
		 
		while(inp.hasNext())
		 {
		 infoFromFile = inp.next();
		 System.out.println(infoFromFile);
		 }
		 
	 }
	 
	 
	 void displayOnScreen() {
	 System.out.println("W klasie: " + fileName);
	 }
}
