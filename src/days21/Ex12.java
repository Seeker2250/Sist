package days21;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject [RandomAccess]
 * @Contents Piped[Reader] / Piped[Writer]
 * ㄴ thread 간에 데이터 입출력 할 때 사용하는 stream
 * <p>
 * RandomAccessFile
 * ㄴ 파일 어느 위치에서나 읽기 / 쓰기가 가능한 장점이 있는 Stream
 * ㄴ getFilePoint() vkdlf vhdlsxm
 * seek(위치)
 * readXXX(), writeXXX()
 */
public class Ex12 {
  public static void main(String[] args) throws IOException {
    String s = "I Love normal Java";
    String q = "java book";

    String name = "./src/days21/random.txt";
    String mode = "rw";//read, write
    try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {//mode로 읽기 or 쓰기 설정
      long fp = raf.getFilePointer();
      System.out.println("현재 포인터 위치 : " + fp);
      raf.writeBytes(s);
    } catch (Exception e) {
    }
    // 일시정지 + 엔터 계속.
    System.out.println("엔터 치면 진행할게요.");
    System.in.read();
    System.in.skip(System.in.available()); // 13,10 제거

    try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {//mode로 읽기 or 쓰기 설정
      raf.seek(7);//이동할 위치 설정
      raf.writeBytes(q);
    } catch (Exception e) {
    }    // 일시정지 + 엔터 계속.
    System.out.println("> 엔터치면 진행한다.");
    System.in.read();
    System.in.skip(System.in.available()); // 13,10 제거

    try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {//mode로 읽기 or 쓰기 설정
      raf.seek(2);//이동할 위치 설정
      String line = raf.readLine();
      System.out.println(line);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("end");
  }//main
}//class
