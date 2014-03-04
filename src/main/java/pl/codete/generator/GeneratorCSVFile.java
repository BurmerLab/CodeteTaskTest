package pl.codete.generator;

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
  
  public final static String SEPARATOR = ";";
  public final static String NEW_LINE = "\n";
  
//  public static void main(String [] args) throws IOException, InterruptedException{
//    generateCSVFileWithRandomValues(3);    
//  }

  public static void generateCSVFileWithRandomValues(int filesCount) throws IOException, InterruptedException {
    final int minimum = 1;
    final int maxMillisekunds = 999;
    int timeSleepBetweenFilesSaved = generateRandomNumber(minimum, maxMillisekunds);
    
    GeneratorCSVFile generator = new GeneratorCSVFile();
    
    for(int x=1; x <= filesCount; x++){
      generator.generatorContentCSVFile("c:/task/csvFileNumber"+ x +".csv"); 
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
  
  @Override
  public String generateRandomDate(){
    int min = 1;
    int max = 31;
    int result = min + (int)(Math.random() * ((max - min) + 1));
    return "" + result + "/1/2013";
  }
  
  public String generateRandomCalendarDate(){
    GregorianCalendar calendar = new GregorianCalendar();
    final int JANUARY = 1;
    final int YEAR = 2013;

    int dayOfMonth = randomNumberBetween(1, 30);
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
  public void generatorContentCSVFile( String fileName) throws IOException{
    FileWriter writer = new FileWriter(fileName);
    final int minimum = 1;
    final int maxRowsInFile = 100000;
    int rowCounts = generateRandomNumber(minimum, maxRowsInFile);
    
       for(int x=1; x <= rowCounts; x++){
         writer.append(generateRandomCost());
         writer.append(SEPARATOR);
//         writer.append(generateRandomDate());
         writer.append(generateRandomDate());
         writer.append('\n');

       }
       writer.flush();
       writer.close();
  }
  
  public static int randomNumberBetween(int start, int end) {
    return start + (int)Math.round(Math.random() * (end - start));
  }
  
}
