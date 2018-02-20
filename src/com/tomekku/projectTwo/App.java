package com.tomekku.projectTwo;

public class App {

	public static void main(String[] args) {
				
		WriteToFile readWriteTerminal = new WriteToFile("abc.txt");
		
		//readWriteTerminal.displayOnScreen();
		//readWriteTerminal.writeToFile();
		//readWriteTerminal.readFromFile();
		
		TimeIssues fileTime = new TimeIssues();
		fileTime.timeSettings();

	}

}
