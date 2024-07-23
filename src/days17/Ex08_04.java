package days17;

import java.util.Date;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex08_04 {
  public static void main(String[] args) {
//개강일로부터 지금까지 지난 일수 계산
    Date o = new Date(2024 - 1900, 7 - 1, 1, 9, 0, 0);
    System.out.println(o.toLocaleString());
    Date t = new Date();
    System.out.println(t.toLocaleString());
    long diffMs = t.getTime() - o.getTime();

//    System.out.println(diffMs/1000/60/60/24);//흐른 날짜
//    long days = diffMs / (1000*60*60*24);
//    long hours = diffMs%(1000*60*60);
//    long minutes = diffMs/(1000*60);
//    long seconds = diffMs/1000;
//    System.out.printf("%d일 = %d시간 %d분 %d초",days, hours, minutes, seconds);
    d_day(t, o);
  }//main

  private static void d_day(Date t, Date o) {

    long diffMs = t.getTime() - o.getTime();

    long[] tArr = {(1000 * 60 * 60 * 24), (1000 * 60 * 60), (1000 * 60), 1000};
//    for (int i = 0; i < tArr.length; i++) {
//
//    }
    long days = diffMs / (1000 * 60 * 60 * 24);
    diffMs = diffMs % (1000 * 60 * 60 * 24);

    long hours = diffMs / (1000 * 60 * 60);
    diffMs = diffMs % (1000 * 60 * 60);

    long minutes = diffMs / (1000 * 60);
    diffMs = diffMs % (1000 * 60);

    long seconds = diffMs / (1000);
    diffMs = diffMs % (1000);
    System.out.printf("%d일 %d시간 %d분 %d초 %d밀리초", days, hours, minutes, seconds, diffMs);
    try {
      System.out.println("\n\n\n\n");
      Thread.sleep(10);
      d_day(new Date(), o);//재귀함수

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}//class
