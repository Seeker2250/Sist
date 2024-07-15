package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01_03 {
  public static void main(String[] args) throws IOException {

    String name;
    byte age;
    char level;

    BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
    System.out.println("이름 나이 등급 입력해요");
    String data = br.readLine();
//   "김준석,  25,    A"라고 가정해보자
//    그럼 delimiter 활용해서 김준석을 그대로, 25는 Integer.parseInt()로, A는 charAt(0)으로 하면 되지 않겠어?
    String regex = ",";
    String [] dataArr = data.split(regex);//regex = regular expression
    name = dataArr[0].trim();
    age = Byte.parseByte(dataArr[1].trim());
    level = dataArr[2].trim().charAt(0);
    System.out.printf("이름 : \"%s\", 나이 : %d, 등급 : \'%c\'", name, age, level);

// A는 식별자 "A"는 문자열 'A'는 문자
// "A"는 사실 'A' + '\0'으로 봐야해(NULL)
//    String strLevel = br.readLine();
//    level = strLevel.charAt(0);
//    System.out.printf("이름 : \"%s\", 나이 : %d, 등급 : \'%c\'", name, age, level);
  }
}
