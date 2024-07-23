package days16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex02 {
  public static void main(String[] args) {
//    try-catch연습
//    file 읽어와서 출력
//    txt file 읽기 작업 or 쓰기 작업 -> FileReader / FileWriter
    FileReader reader = null;
    String fileName = "/Users/junst/Downloads/15일차_복습_김준석.txt";
    int one = -1;
    try {
      reader = new FileReader(fileName);

//      System.out.println((char)one);
      while ((one = reader.read()) != -1){
        System.out.print((char)one);
      };
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(reader != null) {
        try {
          reader.close();
          reader = null;//닫고나서 null로
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }//class
}//main
