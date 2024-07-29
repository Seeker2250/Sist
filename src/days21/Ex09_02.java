package days21;

import java.io.*;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 */
public class Ex09_02 {
  public static void main(String[] args) throws IOException {
//    DataInputStream / DataOutputStream
//    Byte Stream
//    primitive 8가지를 읽기 / 쓰기
    String name = "홍길동";
    int kor, eng, mat;
    int tot;
    double avg;
    boolean gender;
//   student.txt로 저장
    String fileName = "./src/days21/student.txt";
//    홍길동, 98, 57, ... ,로 구분해서 array로 저장


    try (FileInputStream fis = new FileInputStream(fileName);
         DataInputStream dis = new DataInputStream(fis);) {
      name = dis.readUTF();
      kor = dis.readInt();
      eng = dis.readInt();
      mat = dis.readInt();
      tot = dis.readInt();
      avg = dis.readDouble();
      gender = dis.readBoolean();

      System.out.printf("%s %d %d %d %d %f %b\n", name, kor, eng, mat, tot, avg, gender);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }//main
}//class
