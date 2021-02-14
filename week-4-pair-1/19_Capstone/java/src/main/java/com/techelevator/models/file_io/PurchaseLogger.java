package com.techelevator.models.file_io;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PurchaseLogger
{

	  private static final String FILE_EXTENSION = ".log";

	    private String directory;

	    public PurchaseLogger(String directory)
	    {
	        this.directory = directory;
	    }

	    public void logMessage(String message)
	    {
	        String fileName = LocalDate.now().format(DateTimeFormatter.ISO_DATE); //YYYY-MM-DD
	        String logFilePath = directory + "/" + fileName + FILE_EXTENSION;
	        File logFile = new File(logFilePath);

	        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);

	        // open the log file to append 
	        //      new PrintWriter(logFile)

	        // print a new line with the message with the format:
	        //      <currentTime> <message>

	    }
	
}
