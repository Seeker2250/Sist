package days03;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    String input = "1 fish 2 fish red fish blue fish";
    Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
    //Regular Expression으로 사용된 Delimiter
    // \s는 space란 뜻, 공백은 안와도 좋고, 여러 개가 와도 좋다는 의미
    //그러므로   String input = "1               fish2fish red fish blue fish"; 여도 똑같은 결과라는 뜻
    //따라서 Scanner는 file이나 등등 다른 것도 읽을 수 있다는 걸 의미
    //그래서 input자리에 내가 읽고 싶은 거 넣으면 돼
    System.out.println(s.nextInt());
    System.out.println(s.nextInt());

    System.out.println(s.next());
    System.out.println(s.next());
    s.close();
  }
}
