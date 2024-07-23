package days17;

import java.util.Date;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex08_05 {
  public static void main(String[] args) {
//    설문조사
//    설문 시작일 24.6.25 9:00:00
//    설문 종료일 24.7.25 18:00:00

//    1) 24.06.20 12:00:00 -> 시작 전이라 못해
//    2) 24.07.20 12:00:00 -> 설문 진행중
//    3) 24.07.25 19:00:00 -> 종료 후라 못해
//    4) 24.08.20 12:00:00 -> 종료 후라 못해

    Date start = new Date(2024 - 1900, 7 - 1, 25, 9, 0, 0);
    Date end = new Date(2024 - 1900, 8 - 1, 25, 18, 0, 0);
    long startCheck = start.getTime();
    long endCheck = end.getTime();
    Date temp = new Date(2024 - 1900, 7 - 1, 25, 9, 0, 0);
    long tempCheck = temp.getTime();

    if (endCheck < tempCheck) {
      System.out.println("투표가 종료되었습니다.");
    } else if (startCheck > tempCheck) {
      System.out.println("투표가 시작되지 않았습니다");
    }
    temp.before(start);//return boolean
    temp.after(end);
    temp.equals(start);//같은 날이냐
  }
}
