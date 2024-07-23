package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex06 {
  public static void main(String[] args) {
    String fileName = "./src/days16/SS21.txt";
//    System.out.println(System.getProperty("user.dir"));//project name 나타남( .과 같아 )

    String[] nameArr = getFileContent(fileName);
    String content = "<ol><li>" + String.join("</li><li>", nameArr) + "</li></ol>";
    System.out.println(content);
  }//main

  private static String[] getFileContent(String fileName) {
    FileReader reader = null;
    BufferedReader br = null;
    int one = -1;
    String[] nameArr = new String[10];

    try {
      reader = new FileReader(fileName);
      br = new BufferedReader(reader);

      String line = null;
      int lineNum = 1;
      int index = 0;
      while ((line = br.readLine()) != null) {
        nameArr[index++] = line;
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
          reader = null;//닫고나서 null로
          br.close();
          br = null;//닫고나서 null로
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return nameArr;
  }
}//class
