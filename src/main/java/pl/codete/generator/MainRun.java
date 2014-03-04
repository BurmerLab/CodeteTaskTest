package pl.codete.generator;

import java.io.IOException;

/**
 *
 * @author Michał
 */
public class MainRun {

  public static void main(String[] args) throws IOException, InterruptedException {
    String systemType = "linux";
    int filesCount = 3;
    CSVActions actions = new CSVActions(GeneratorFactory.createGenerator(systemType));
    actions.runApplication(filesCount); 
  }
}
