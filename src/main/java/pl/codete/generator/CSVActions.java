package pl.codete.generator;

import java.io.IOException;

/**
 *
 * @author Michał
 */
public class CSVActions {
  
  private FileGenerator fileGenerator;

  public CSVActions(FileGenerator fileGenerator) {
    this.fileGenerator = fileGenerator;
  }
    public void runApplication(int filesCount) throws IOException, InterruptedException{
      fileGenerator.generateCSVFileWithRandomValues(filesCount);
    }
  
  
   
}
