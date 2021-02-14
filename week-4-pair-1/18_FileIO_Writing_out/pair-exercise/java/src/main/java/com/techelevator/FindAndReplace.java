package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.print.event.PrintServiceAttributeEvent;

public class FindAndReplace
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner (System.in);
		System.out.print("Enter file name: ");
		String path = userInput.nextLine();
		System.out.println();
		
		File aliceText = new File(path);
		
		System.out.println(aliceText);
		System.out.println();
		
		//String filePath = "alices_adventures_in_wonderland.txt";
		File alicesAdventuresFile = new File("test.txt");

		Scanner scanner;
		// logic 
		
		
		
		if(aliceText.isFile())
		{
			aliceText.toString();
			
			
		}
		
		try (Scanner lineScanner = new Scanner(aliceText.getAbsoluteFile());
				FileOutputStream fileStream = new FileOutputStream(alicesAdventuresFile);
			PrintStream fileWriter = new PrintStream(fileStream);
			)
		{
			
			
			System.out.print("Enter word to search for: ");
			String enteredWord = userInput.nextLine();
			System.out.println();
			
			
			System.out.print("Enter replacement word: ");
			String replacementWord = userInput.nextLine();
			System.out.println();
			
			
			fileWriter.println(replacementWord);
			

			while (lineScanner.hasNextLine())
			{
				String newTextLine = lineScanner.nextLine();
				fileWriter.println(newTextLine.replaceAll(enteredWord, replacementWord));
				
			}
			lineScanner.close();
			
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
