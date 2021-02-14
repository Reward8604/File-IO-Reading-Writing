package com.techelevator;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class WordCount
{

	public static void main(String[] args)
	{
		readAlicesAdventuresInWonderlandFile();
	}

	public static void readAlicesAdventuresInWonderlandFile()
	{
		String filePath = "alices_adventures_in_wonderland.txt";
		File alicesAdventuresFile = new File(filePath);

		Scanner scanner;

		try
		{

			scanner = new Scanner(alicesAdventuresFile.getAbsoluteFile());
			int wordCounter = 0;
			int counterSentence = 0;

			while (scanner.hasNext())
			{

				String aliceAdventures = scanner.next();
				wordCounter++;

				if (aliceAdventures.endsWith(".") || aliceAdventures.endsWith("!") || aliceAdventures.endsWith("?"))
				{
					counterSentence++;
				}
			}

			displayString(wordCounter, counterSentence);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File: " + filePath + " was not found.");
		}
	}

	private static void displayString(int numberOfWords, int numberOfSentences)
	{
		System.out.println("Word Count: " + numberOfWords);
		System.out.println("Sentence Count: " + numberOfSentences);
	}
}