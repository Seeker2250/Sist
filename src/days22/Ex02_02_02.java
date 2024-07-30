package days22;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class Ex02_02_02 {
  public static void main(String[] args) {
    String pathName = "./src/days22";
    File file = new File(pathName);

//    File [] list = file.listFiles(new FilenameFilter() {
//      @Override
//      public boolean accept(File dir, String name) {
//        return name.endsWith(".java");
//      }
//    });
    File [] list = file.listFiles((File dir, String name) -> name.endsWith(".java"));
    for (int i = 0; i < list.length; i++) {
      File f = list[i];
      System.out.println(f.getName());
    }
  }
}
