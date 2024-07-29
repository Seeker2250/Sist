package days21;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 */
public class Ex04_03 {
  public static void main(String[] args) {
    String parent = "./src/days21";
    String child;
    char con = 'y';
    String content;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("저장할 파일 이름을 적으세요");
      child = sc.next();
      File file = new File(parent, child);
      try (FileWriter writer = new FileWriter(file, true)) {
        do {
          System.out.println("저장할 문자열 입력");
          content = sc.nextLine();
          writer.write(content);

          System.out.println("계속 할래?");
          con = (char) System.in.read();
          System.in.skip(System.in.available());
        } while (Character.toUpperCase(con) == 'Y');
      } catch (Exception e) {
        e.printStackTrace();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }//main
}//class
