package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.StandardSocketOptions;

public class Ex02_02 {
  public static void main(String[] args) throws IOException {
    BufferedReader test = new BufferedReader(new InputStreamReader(System.in));

    byte age;

    System.out.println("이름 입력하세요");
    String name = test.readLine();
    System.out.println("나이 입력하세요");
    age = Byte.parseByte(test.readLine());//readLine은 String을 return해주기 때문에 age는 byte이므로 type casting이 필요
    System.out.printf("이름 \"%s\", 나이 = %d", name, age);
    //문제점 : 나이 입력이 잘못된 경우 NumberFormatException이 발생

  }

}
//아래는 강사님 코드

//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         String name;
//         byte age = 20;

//         System.out.print("> 이름 입력 ? ");
//         name = bufferedReader.readLine();

//         System.out.print("> 나이 입력 ? ");
//         // Type mismatch: cannot convert from String to byte
//         // 타입(형) 변환
//         // "20"   -> 20
//         // String -> byte  Byte.parseByte()
//         // String -> int   Integer.parseInt()
//         // String -> short Short.parseShort()
//         // String -> long  Long.parseLong()
//   //      String strAge = bufferedReader.readLine(); // "20"
//   //      age = Byte.parseByte(strAge);
//         age = Byte.parseByte(bufferedReader.readLine());


//         System.out.printf("이름=\"%s\", 나이=%d", name, age);