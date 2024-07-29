package days21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 */

public class StreamTest {
  public static void main(String[] args) {
    // (1) File inputStream 읽고 OutputStream으로 보내는 거
    // Checked Exception
    FileInputStream oldIn = null;
    FileOutputStream oldOut = null;

    try {
      oldIn = new FileInputStream("./src/days21/test.txt");
      oldOut = new FileOutputStream("./src/days21/test-out-01.txt");// test01 만들어

      int count;
      while ((count = oldIn.read()) != -1) {
        oldOut.write(count);
      }
      System.out.println("[1] FileInputStream에서 FileOutputStream으로 보내는 거");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (oldIn != null)
          oldIn.close();
        if (oldOut != null)
          oldOut.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    System.out.println("______________________________________________");


//    // (2) try - with - resources
//
//    try (FileInputStream in = new FileInputStream("./app/src/days21/test-out-01.txt"); // test01 받아서
//         FileOutputStream out = new FileOutputStream("./app/src/days21/test-out-02.txt")// test02 만들고
//         // 위에 다 resource야(try 안에). 첫 줄만 ;쓰고 나머지는 쓰면 안돼
//    ) {
//      int count;
//      while ((count = in.read()) != -1) {
//        out.write(count);
//      }
//      System.out.println("(2) try - with - resources 성공");
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    System.out.println("______________________________________________");
//
//    // 근데 FileInputStream은 속도가 너무 딸려(Byte 단위로 읽어나가니까)
//    // 그래서 우리는 Buffer단위로 보내버리는, BufferedInputStream 쓸거야
//
//    // (3) BufferedInputStream & BufferedOutputStream
//    try (
//        BufferedInputStream in = new BufferedInputStream(new FileInputStream("./app/src/days21/test-out-02.txt"));//test02 읽어와서
//        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("./app/src/days21/test-out-03.txt"))) {//test03 만들어
//      //BufferedStream은 new FileStream으로 읽어야 해
//      //BufferedInputStream에서 Command + 클릭 해봐 그러면 볼 수 있는데
//      //BufferedInputStream은 InputStream을 받아와
//      int count;
//      while ((count = in.read()) != -1) {
//        out.write(count);
//      }
//      System.out.println("(3) BufferedStream 성공");
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    System.out.println("______________________________________________");
  }
}
