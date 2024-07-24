package days18;

import java.time.LocalDate;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex03_05 {
  public static void main(String[] args) {
//    날짜와 시간을 비교 : isAfter(), ifBefore(), isEqual()
//    오늘  홍길동의 시간이 지났냐
    LocalDate today = LocalDate.now();
    LocalDate h_birthday = LocalDate.of(2000,2,25);
//    2000년을 2024로 맞추기
    h_birthday = h_birthday.withYear(today.getYear());
    System.out.println(h_birthday);
    System.out.println(today.isEqual(h_birthday));//false
    System.out.println(today.isBefore(h_birthday));//false
    System.out.println(today.isAfter(h_birthday));//true
    System.out.println(today.compareTo(h_birthday));// 0, 양수, 음수
  }
}
