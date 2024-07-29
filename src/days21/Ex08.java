package days21;

import java.io.FileWriter;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 */
public class Ex08 {
  public static void main(String[] args) {
//    DataInputStream / DataOutputStream
//    Byte Stream
//    primitive 8가지를 읽기 / 쓰기
    String name = "홍길동";
    int kor = 98, eng = 57, mat = 100;
    int tot = kor + eng + mat;
    double avg = (double) tot / 3;
    boolean gender = true;
//   student.txt로 저장
    String fileName = "./src/days21/student.txt";
//    홍길동, 98, 57, ... ,로 구분해서 array로 저장


    try (FileWriter fw = new FileWriter(fileName)) {
      String info = String.format(
          "%s,%d,%d,%d,%d,%f,%b",
          name,kor,eng,mat,tot,avg,gender
      );
      fw.append(info);
      fw.flush();
      System.out.println(info);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }//main
}//class
