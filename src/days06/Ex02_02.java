package days06;

import java.io.IOException;

public class Ex02_02 {
  public static void main(String[] args) throws IOException {
    for (int i = 0, lineNum = 1; i < 256; i++) {
      if (i % 10 == 0)
        System.out.print(lineNum++);
      System.out.printf("[%c]", i);

      if (i % 10 == 9) {
        System.out.println();

        if ((lineNum - 1) % 10 == 0) {
          System.out.println("enter치면 계속");
          System.in.read();
          System.in.skip(System.in.available());
        }
      }

    }
  }
}
