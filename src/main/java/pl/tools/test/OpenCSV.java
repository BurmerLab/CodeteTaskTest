/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tools.test;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Michał
 */
public class OpenCSV {
   public static void main(String[] args) throws IOException {
     OpenCSV.testOpenCSV();
   }
  
  
  public static void testOpenCSV() throws IOException{
    CSVWriter writer = new CSVWriter(new FileWriter("c:/test/yourfile2.csv"), '\t');
//     String[] entries = "kwota;data".split(";");
     StringBuilder content = new StringBuilder();
     content.append("kwota;data");
      String[] entries = content.toString().split(";");
     
     writer.writeNext(entries);
	writer.close();
  }
}
