package com.checked_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
	
	public static void main(String[] args) {
		
	//	FileInputStream fis = new FileInputStream("excelr.txt");  //FileNotFoundException
		
		try
		{
			FileInputStream fis = new FileInputStream("excelr.txt");
		}catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		
	}

}

// note: FileNotFoundException occurs when an attempt to open the file denoted by a specified pathname has failed.
	// here is an example of how to handle FileNotFoundException using a try-catch block.