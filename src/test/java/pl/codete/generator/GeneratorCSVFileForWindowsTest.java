package pl.codete.generator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michał
 */
public class GeneratorCSVFileForWindowsTest {
  
  public GeneratorCSVFileForWindowsTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }



  @Test
  public void testGenerateRandomNumber() {
    System.out.println("generateRandomNumber");
    int minimum = 0;
    int maxRowsInFile = 0;
    GeneratorCSVFileForWindows instance = new GeneratorCSVFileForWindows();
    int result = instance.generateRandomNumber(minimum, maxRowsInFile);
    assertNotNull(result);
  }

  @Test
  public void testGenerateRandomCost() {
    System.out.println("generateRandomCost");
    GeneratorCSVFileForWindows instance = new GeneratorCSVFileForWindows();
    String result = instance.generateRandomCost();
    assertNotNull(result);
  }

  @Test
  public void testGenerateRandomDate() {
    System.out.println("generateRandomDate");
    GeneratorCSVFileForWindows instance = new GeneratorCSVFileForWindows();
    String result = instance.generateRandomDate();
    assertNotNull(result);
  }

  @Test
  public void testGenerateRandomCalendarDate() {
    System.out.println("generateRandomCalendarDate");
    GeneratorCSVFileForWindows instance = new GeneratorCSVFileForWindows();
    String expResult = "";
    String result = instance.generateRandomCalendarDate();
    assertNotNull(result);
  }

  @Test
  public void testRandomNumberBetween() {
    System.out.println("randomNumberBetween");
    int start = 0;
    int end = 0;
    GeneratorCSVFileForWindows instance = new GeneratorCSVFileForWindows();
    int result = instance.randomNumberBetween(start, end);
    assertNotNull(result);
  }

}
