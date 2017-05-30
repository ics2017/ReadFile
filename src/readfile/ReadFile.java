/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;

/**
 *
 * @author rkaune
 */
//import java.util.Scanner;
 import java.io.*;
 
 /**
  * A program that displays the contents of a file.
  */
 public class ReadFile {

	    public static void main(String[] args) {
		File textFile = new File("wonder.txt");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		
		try {
                    in = new FileReader(textFile);
                    readFile = new BufferedReader(in);
                    while ((lineOfText = readFile.readLine()) != null ) {
                            System.out.println(lineOfText);
                    }
                    readFile.close();
                    in.close();
                } catch (FileNotFoundException e) {
                    System.out.println("File does not exist or could not be found.");
                    System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
                    System.out.println("Problem reading file.");
                    System.err.println("IOException: " + e.getMessage());
    	}
	}	
 }
