/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tools.test;

/**
 *
 * @author Michał
 */
 
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
 
public class mkyong
{
   public static void main(String [] args) throws ParseException
   {
//	   generateCsvFile("c:/test/yourfile3.csv");
       double zmienna1 = 100.12;
       double dzielnik = 1000;
//       long result = Math.round(zmienna1);
       long zmiennaLong = (long) (zmienna1 * 100);
       System.out.println("test na long: " + zmiennaLong);
//       System.out.println("test na long: " + result);
       
        String dateStr = "1/12/2014";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dateStr);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
       
   }
 
   private static void generateCsvFile(String sFileName)
   {
	try
	{
	    FileWriter writer = new FileWriter(sFileName);
 
	    writer.append("DisplayName");
	    writer.append(',');
	    writer.append("Age");
	    writer.append('\n');
 
	    writer.append("MKYONG");
	    writer.append(',');
	    writer.append("26");
            writer.append('\n');
 
	    writer.append("YOUR NAME");
	    writer.append(',');
	    writer.append("29");
	    writer.append('\n');
 
	    //generate whatever data you want
 
	    writer.flush();
	    writer.close();
	}
	catch(IOException e)
	{
	     e.printStackTrace();
	} 
    }
}
