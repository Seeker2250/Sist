package days21;

import java.io.*;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 */
public class Ex09 {
  public static void main(String[] args) throws IOException {
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


    try (FileOutputStream fos = new FileOutputStream(fileName);
         DataOutputStream dos = new DataOutputStream(fos)) {
      dos.writeUTF(name);
      dos.writeInt(kor);
      dos.writeInt(mat);
      dos.writeInt(eng);
      dos.writeInt(tot);
      dos.writeDouble(avg);
      dos.writeBoolean(gender);
      dos.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }//main
}//class
