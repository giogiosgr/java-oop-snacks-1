package org.snacks.java;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Files {
  public static void main(String[] args) {
    try {
      File myObj = new File("readme.txt");
      Scanner myReader = new Scanner(myObj); 
      String data = myReader.nextLine(); //Il file si trova nella directory radice del progetto
      System.out.println(data);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("errore " + e.getMessage());
      e.printStackTrace();
    }
  }
}