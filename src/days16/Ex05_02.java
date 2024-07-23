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
public class Ex05_02 {
  public static void main(String[] args) {

////    days16.Ex01.Java 읽어와서
////    "예외"라는 문자열이 있는 위치값을 모두 출력하기.
//    String content = " ";
//    String fileName = "/Users/junst/SsEducation/src/days16/Ex01";
//    System.out.println(content);
//    FileReader reader = null;
//    BufferedReader br = null;
//    try {
//      reader = new FileReader(fileName);
//      br = new BufferedReader(reader);
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }

    String fileName = "./src/days16/Ex01.java";//. 하면 project directory까지 잡혀(현재 directory)
    String content = getFileContent(fileName);
    System.out.println(content);

    /*int index, fromIndex = 0;
    while ((index = content.indexOf("예외", fromIndex)) != -1) {//끝까지 다 돌면 return -1되니까
      System.out.println(index);//찾은 곳 찍어
      fromIndex = index + 1;//day11.Ex03.java과 같은 코딩이야. m배열에서 n(71) 모든 위치값
    }*/

//    예외 문자열을 모두 찾아서 삭제하기.
//    replaceAll의 parameter는 regex
//    replace의 paremeter는 그냥 oldChar

    content.replaceAll("예외", "[예외]");//CharSequence가 Parameter지만 up casting으로 String도 가능
//    String을 immutable이야 그냥 return할 뿐이야 그러니 다시 담아야지
    content = content.replaceAll("예외", "");
    System.out.println(content);
  }//main

  private static String getFileContent(String fileName) {
    FileReader reader = null;
//    Buffer 기능, readLine() : 한 라인을 읽어와서 return
    BufferedReader br = null;
    int one = -1;

    String content = "";
    try {
      reader = new FileReader(fileName);
      br = new BufferedReader(reader);//다른 객체로부터 다시 Stream object를 만드는 것이기 때문에 보조 stream, 2차 stream이라고 불리운다.

//      System.out.println((char)one);
      String line = null;
      int lineNum = 1;
      while ((line = br.readLine()) != null) {
//        System.out.printf("%d : %s\n", lineNum++, line);
        content += line + "\r\n";
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
    return content;
  }
}//class
