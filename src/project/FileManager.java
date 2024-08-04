package project;

import java.io.File;
import java.io.FileWriter;

/**
 * @author created by Seeker2250 on 8/1/24.
 * @Subject
 * @Contents
 */
public class FileManager {
  String currentDirectory = System.getProperty("user.dir");
  String path = currentDirectory + "\\log_tennis.txt";

  public void log(String line) {
    File file = new File(path);

    try (FileWriter writer = new FileWriter(file,true)){

      writer.write(line);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
