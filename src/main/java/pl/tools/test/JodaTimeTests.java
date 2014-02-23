package pl.tools.test;

import java.util.Random;
import org.apache.abdera.model.DateTime;
import java.util.GregorianCalendar;

/**
 *
 * @author Michał
 */
public class JodaTimeTests {
  
     public static void main(String [] args) {
	    GregorianCalendar calendar = new GregorianCalendar();
        final int JANUARY = 1;
        final int YEAR = 2013;
        
        int dayOfMonth = randBetween(1, 20);
        calendar.set(calendar.YEAR, YEAR);
        calendar.set(calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(calendar.MONTH, JANUARY);
        
        System.out.println(calendar.get(calendar.DAY_OF_MONTH) 
                   + "/" + calendar.get(calendar.MONTH) 
                   + "/" + calendar.get(calendar.YEAR));
   }
     //  1/1/2013 - 31/1/2013
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

}
