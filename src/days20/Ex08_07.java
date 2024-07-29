package days20;

import java.util.ArrayList;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents
 */
public class Ex08_07 {
  public static void main(String[] args) {
//    일반 class
//    Raw use of parameterized class 'ArrayList'
    ArrayList list = new ArrayList();
//    ArrayList<Object> list = new ArrayList();로 인식

//    generics class
    ArrayList<Integer> list2 = new ArrayList<>();

//    Raw type과 genereics type 간의 casting
//     ㄴ 경고만 발생시키고 자동으로 변환해서 사용 가능
//      ㄴ <T>없으면 <Object> type으로 compile


  }
}
