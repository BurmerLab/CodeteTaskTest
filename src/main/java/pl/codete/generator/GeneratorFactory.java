package pl.codete.generator;

/**
 *
 * @author Michał
 */
public class GeneratorFactory {
    public static FileGenerator createGenerator(String systemType){
       
     if(systemType.equals("windows")){
           return new GeneratorCSVFileForWindows();
           
       }else if(systemType.equals("linux")){
           return new GeneratorCSVFileForLinux();
       }
     
       throw new UnsupportedOperationException("There is no strategy");
  }
}
