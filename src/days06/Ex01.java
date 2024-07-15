package days06;

import java.io.IOException;

public class Ex01 {
  public static void main(String[] args) throws IOException {
//    한 문자를 입력 받아서 출력
    char one;
//    BufferedReader, Scanner class 사용했었음 "A"->charAt() -> 'A 만듦
//    System.in만 써서 해보자!
    System.out.println("한 문자를 입력하세요");
//    int nextByte = System.in.read();
//    System.out.println(nextByte);
    System.in.skip(System.in.available());

    one = (char) System.in.read();
    System.out.println(one);

    System.out.println("한 문자를 입력하세요");
    one = (char) System.in.read();
    System.out.println(one);

  }
}
