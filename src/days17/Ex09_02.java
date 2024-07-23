package days17;

import java.util.Calendar;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex09_02 {
  public static void main(String[] args) {
//    개강일로부터 현재까지 며칠 몇 시간 몇 분 몇 초 몇 밀리초가 지났는가
//    Calendar로
    Calendar start = Calendar.getInstance();
    Calendar present = Calendar.getInstance();
    start.set(2024, 7, 1,9,0,0);
    long now =present.getTimeInMillis()-start.getTimeInMillis();
    int [] t = {(60*60*24),(60*60),(60)};
    for (int i = 0; i < t.length; i++) {
      System.out.println(present.getTimeInMillis() / t[i]);
    }

  }//main
}//class
