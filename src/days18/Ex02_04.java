package days18;

import java.security.MessageDigest;
import java.text.MessageFormat;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents SimpleDateFormat, DecimalFormat, ChoiceFormat 했으니
 * 이제 MessageFormat
 */
public class Ex02_04 {
  public static void main(String[] args) {
//      Data를 특정 형식으로 출력하는 형식화 클래스
    String name = "권맑음";
    int age = 26;
    boolean gender = true;
    double height = 178.67;
    char grade = 'A';

  /* 기존 방법
      System.out.printf("이름:%s, 나이:%d살, 성별:%s, 키:%.2f, 등급:%c 입니다.\n"
            , name, age, gender?"남자":"여자", height, grade );
 */

    String pattern = "이름:{0}, 나이:{1}살, 성별:{2}, 키:{3}, 등급:{4} 입니다.";
    //MessageFormat mf = new MessageFormat(pattern );
    //String s = mf.format(pattern,  name, age, gender?"남자":"여자", height, grade );

    String s = MessageFormat.format(pattern, name, age, gender ? "남자" : "여자", height, grade);


  }//main
}//class
