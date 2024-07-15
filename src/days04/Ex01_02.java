package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01_02 {
  public static void main(String[] args) throws IOException {

    String name;
    byte age;
    char level;
    Scanner sc = new Scanner(System.in);
    System.out.println("이름, 나이, 등급을 입력하세요");
    name = sc.next();
    age = sc.nextByte();
    level = sc.next().charAt(0);
    System.out.printf("이름 : \"%s\", 나이 : %d, 등급 : \'%c\'", name, age, level);

    BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
    System.out.println("name 입력해");
    name = br.readLine();//throws IOException
    System.out.println("age 입력해");
    age = Byte.parseByte(br.readLine());//(byte)하면 안돼
    System.out.println("level 입력해");
// A는 식별자 "A"는 문자열 'A'는 문자
// "A"는 사실 'A' + '\0'으로 봐야해(NULL)
    String strLevel = br.readLine();
    level = strLevel.charAt(0);
    System.out.printf("이름 : \"%s\", 나이 : %d, 등급 : \'%c\'", name, age, level);
  }
}
