package pl.codete.generator;

import java.io.IOException;

/**
 *
 * @author Michał Burmer
 */
public interface FileGenerator {
    public String generateRandomDate();
    
    public void generatorContentCSVFile(String fileName) throws IOException;
    
    public String generateRandomCost();
  
}
