package days06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.regex.Pattern.matches;

public class Ex03_02 {
  public static void main(String[] args) throws IOException {
    // if ( one == '#' || one == '@' || one == '$' || one == '!' {}
//  정규 표현식(regexp) 유효성 검사, regular expression
//    matches(String regexp);

    char one;
    String strOne;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("한 문자 입력");
    strOne = br.readLine();

//    String regex = "[#$%@!&]";
    //이거 의미는( one == '#' || one == '@' || one == '$' || one == '!' {} 하나만 일치해도 true
    String regex = "[0-9]";
    //이건 [0123456789]라고 친 거랑 같아
    System.out.println(strOne.matches(regex));

    // \\s는 공백, \\s*는 *이 안오든지 여러 개 와도 좋다
  }
}
