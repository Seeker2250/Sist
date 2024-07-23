package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */



// try with resources 응용
public class Ex02_03 {
  public static void main(String[] args) {

//    Buffer 기능, readLine() : 한 라인을 읽어와서 return
    String fileName = "/Users/junst/Downloads/15일차_복습_김준석.txt";
    int one = -1;
    try {
      FileReader reader = new FileReader(fileName);
      BufferedReader br = new BufferedReader(reader);//다른 객체로부터 다시 Stream object를 만드는 것이기 때문에 보조 stream, 2차 stream이라고 불리운다.
      String line = null;
      int lineNum = 1;
      while ((line = br.readLine()) != null) {
        System.out.printf("%d : %s\n", lineNum++, line);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }//class
}//main
