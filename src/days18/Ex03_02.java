package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex03_02 {
  public static void main(String[] args) {
    LocalDate ld = LocalDate.now();//현재 시스템의 날짜 정보 가져와
//    System.out.println(ld.toString());//yyyy-MM-dd형식
    LocalDate ld2 = LocalDate.of(2024, 7,24);//년월일 입력->날짜 객체 돌려줘
    System.out.println(ld2.toString());

    LocalTime lt = LocalTime.now();
    System.out.println(lt);//nano second까지
    LocalTime lt2 = LocalTime.of(12,17,5,6);//입력받아서 줘
    System.out.println(lt2);

    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);
    LocalDateTime ldt2 = LocalDateTime.of(2024,07,24,12,18);
    System.out.println(ldt2);
    LocalDateTime ldt3 = LocalDateTime.of(ld2, lt2);
    System.out.println(ldt3);
  }//main
}//class
