package days16;

import java.util.StringTokenizer;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex08 {
  public static void main(String[] args) {
//    StringTokenizer
    String s = "이시훈, 원충희, 김준석, 송세호";
    String regex = "\\s, \\s*";
//    String[] names = s.split(regex); 이걸 권장
//    for (String name : names) {
//      System.out.println(name);
//    }
    s = s.replace(" ", "");
    System.out.println(s);
    StringTokenizer st = new StringTokenizer(s, ",");
    System.out.println(st.hasMoreTokens());
    while (st.hasMoreTokens()){
      System.out.println(st.nextToken());
    }

  }//main
}//class
