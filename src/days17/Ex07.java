package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject Regular Expression(regex)
 * @Contents  미리 정의된 기호
 *            문자열 속에서 원하는 패턴(조건)과 일치하는 문자열을 찾아내기 위해서 사용
 *            boolean String.matches(regex)
 *            java.util.regex 패키지
 *                        ㄴPattern class
 *                        ㄴMatcher class
 */
public class Ex07 {
  public static void main(String[] args) {
    String [] data = {
        "bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
        , "combat", "count", "date", "disc", "fx"
    };
//    1) c문자로 시작하는 문자열 찾아서 출력.
    for (int i = 0; i < data.length; i++) {
//      if(data[i].startsWith("c")) {//data[i]가 c로 시작하냐?
//        System.out.println(data[i]);
//      String regex = "c";
      String regex = "^c.*";//.은 아무 문자 하나, *은 와도 좋고 안와도 좋다
      if(data[i].matches(regex)) {
        System.out.println(data[i]);
      }//if
    }//for
    String regex ="c.*";
    regex ="c[a-zA-Z]*";
    regex ="c[a-zA-Z0-9]*";
    regex ="c\\w*";  // [a-zA-Z0-9]  == \\w
    regex ="c.";
    regex ="c\\.";//진짜 실제 점
    regex ="c[0-9]";
    regex ="c\\d";//위랑 같아
    regex ="c.*t";//c로 시작하고 t로 끝나는 아무거나 ( ^c.*t$ )
    regex ="c[^0-9]";// 숫자가 아닌 거
    regex ="c\\D";   // [^0-9] == \\D
    regex ="(b|c).{2}";//b나 c로 시작하는 3글자
    regex ="[bc].{2}";//위랑 같아
    regex ="[bcd].{2,3}";//아무 문자가 2번 오든 3번 오든
    regex ="[b-d].{2,3}";//위랑 같아
    // bcd 문자는 제외한 알파벳 대소문자
    regex ="[A-Za-z&&[^b-d]].*";  // *  0개 이상    b,c,d 만 아니면 돼
    regex ="[A-Za-z&&[^b-d]].+";  // *  1개 이상
    regex ="[A-Za-z&&[^b-d]].?";  // ?  0,1

    //패턴 객체 만들어
    Pattern p = Pattern.compile(regex);
    for (int i = 0; i < data.length; i++) {
//     패턴 객체와 일치하는 Matcher 객체 만들어
      Matcher m = p.matcher(data[i]);
      if(m.matches())
        System.out.println(data[i]);
    }

//    [문제]
//    비밀번호 입력 받아서
//    비밀번호의 길이가 8~15문자
//    비밀번호 입력된 값 안에 숫자가 반드시 1개 이상
//    소문자가 반드시 1개 이상
//    대문자가 반드시 1개 이상
//    특수문자가 반드시 1개 이상 ~!@#$%^&*()_+
  }//main
}//class
