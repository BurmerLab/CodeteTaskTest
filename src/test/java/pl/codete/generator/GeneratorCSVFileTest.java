/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class GeneratorCSVFileTest {
  
  public GeneratorCSVFileTest() {
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
    int minimum = 1;
    int maxRowsInFile = 100000;
    int result = GeneratorCSVFile.generateRandomNumber(minimum, maxRowsInFile);
    assertNotNull(result);
  }

  @Test
  public void testGenerateRandomCost() {
    GeneratorCSVFile instance = new GeneratorCSVFile();
    String result = instance.generateRandomCost();
    assertNotNull(result);
  }

  @Test
  public void testGenerateRandomDateSimple() {
    System.out.println("generateRandomDateSimple");
    GeneratorCSVFile instance = new GeneratorCSVFile();
    String result = instance.generateRandomDate();
    assertNotNull(result);
  }

  @Test
  public void testGenerateRandomDate() {
    System.out.println("generateRandomDate");
    GeneratorCSVFile instance = new GeneratorCSVFile();
    String result = instance.generateRandomDate();
    assertNotNull(result);
  }

  @Test
  public void testRandBetween() {
    System.out.println("randBetween");
    int start = 1;
    int end = 30;
    int result = GeneratorCSVFile.randomNumberBetween(start, end);
    assertNotNull(result);
  }
}
