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
public class Ex02_02 {
  public static void main(String[] args) {
//    try-catch연습
//    file 읽어와서 출력
//    txt file 읽기 작업 or 쓰기 작업 -> FileReader / FileWriter
//    라인 번호 붙여서 출력해보기
    FileReader reader = null;
//    Buffer 기능, readLine() : 한 라인을 읽어와서 return
    BufferedReader br = null;
    String fileName = "/Users/junst/Downloads/15일차_복습_김준석.txt";
    int one = -1;
    try {
      reader = new FileReader(fileName);
      br = new BufferedReader(reader);//다른 객체로부터 다시 Stream object를 만드는 것이기 때문에 보조 stream, 2차 stream이라고 불리운다.

//      System.out.println((char)one);
      String line = null;
      int lineNum = 1;
      while((line = br.readLine())!=null){
        System.out.printf("%d : %s\n", lineNum++, line);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(reader != null) {
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
  }//class
}//main
