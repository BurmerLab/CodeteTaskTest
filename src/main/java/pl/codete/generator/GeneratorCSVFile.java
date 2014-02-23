/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.codete.generator;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Michał Burmer
 */

public class GeneratorCSVFile implements FileGenerator{
  
  public final static String HEADER = "kwota;data";
  public final static String FILE_NAME = "c:/test/yourfile5.csv";
  public final static String SEPARATOR = ";";
  public final static String NEW_LINE = "\n";
  
  public static void main(String [] args) throws IOException, InterruptedException{
    generateCSVFileWithRandomValues();    
  }

  public static void generateCSVFileWithRandomValues() throws IOException, InterruptedException {
    final int minimum = 1;
    final int maxRowsInFile = 100000;
    final int maxMillisekunds = 999;
    int filesCount = 1;
    int rowCounts = generateRandomNumber(minimum, maxRowsInFile); 
    int timeSleepBetweenFilesSaved = generateRandomNumber(minimum, maxMillisekunds);
    
    GeneratorCSVFile generator = new GeneratorCSVFile();
    
    for(int x=1; x <= filesCount; x++){
      generator.generatorContentCSVFile(rowCounts, "c:/task/csvFileNumer"+ x +".csv"); 
      Thread.sleep(timeSleepBetweenFilesSaved);
    }   
  }

  public static int generateRandomNumber(final int minimum, final int maxRowsInFile) {
    return minimum + (int)(Math.random()*maxRowsInFile);
  }
  
  @Override
  public String generateRandomCost(){
    BigDecimal randomCost = new BigDecimal(BigInteger.valueOf(new Random().nextInt(100001)), 2);
    return randomCost.toString();
  }
  
  public String generateRandomDateWithoudCalendar(){
    int min = 1;
    int max = 31;
    int result = min + (int)(Math.random() * ((max - min) + 1));
    return "" + result + "/1/2013";
  }
  
  
  @Override
  public String generateRandomDate(){
    GregorianCalendar calendar = new GregorianCalendar();
    final int JANUARY = 1;
    final int YEAR = 2013;

    int dayOfMonth = randBetween(1, 30);
    calendar.set(calendar.YEAR, YEAR);
    calendar.set(calendar.DAY_OF_MONTH, dayOfMonth);
    calendar.set(calendar.MONTH, JANUARY);
    StringBuilder dateContent = new StringBuilder();

    dateContent.append(calendar.get(calendar.DAY_OF_MONTH));
    dateContent.append("/" + calendar.get(calendar.MONTH));
    dateContent.append("/" + calendar.get(calendar.YEAR));

    return dateContent.toString();
  }
  
  @Override
  public void generatorContentCSVFile(int rows, String fileName) throws IOException{
    FileWriter writer = new FileWriter(fileName);
//       writer.append(HEADER);
//       writer.append(NEW_LINE);

       for(int x=1; x<=rows; x++){
         writer.append(generateRandomCost());
         writer.append(SEPARATOR);
//         writer.append(generateRandomDate());
         writer.append(generateRandomDateWithoudCalendar());
         writer.append('\n');

       }
       writer.flush();
       writer.close();
  }
  
  public static int randBetween(int start, int end) {
    return start + (int)Math.round(Math.random() * (end - start));
  }
  
}
