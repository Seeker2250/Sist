package days18;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 * jdk 1.0 java.util.Date
 * jdk 1.1 java.util.Calendar
 *
 * Simple Data format, Decimal Data format, Choice Data format, Message Data format
 * Formatter class
 *
 * jdk 1.8에 새로 추가된 날짜, 시간 class
 *(1)
 *    java.time
 *    ㄴjava.time.chrono;  -> 표준(150)이 아닌 달력 시스템을 위한 시스템 제공
 *    ㄴjava.time.format;  -> 형식화(파싱) 클래스 제공
 *    ㄴjava.time.temporal;-> 날짜, 시간의 field와 단위(unit) class 제공
 *    ㄴjava.time.zone;    -> time zone class 제공
 *
 *(2)
 *    java.time : 날짜와 시간을 다루는 핵심 클래스
 *    1) 날짜만을 다루는 LacalDate class
 *    2) 시간만을 다루는 LocalTime class
 *    3) 날짜 + 시간 LocalDateTime class
 *    4) 날짜 + 시간 + 시간대 ZonedDateTime class
 *    -> Temporal, TemporalAdjuster interface 구현한 class들임
 *
 * (3)
 *    Period class -> 날짜와 날짜 사이의 간격
 *    Duration class -> 시간과 시간 사이의 간격
 *      -> TemporalAmount interface 구현한 class들임
 *
 * (4)
 *      java.time에 있는 핵심 클래스들은 new constructor로 객체를 생성하지 않아
 *      : of(), now()로 생성 Ex03_02.java
 *
 * (5)
 *      날짜와 시간의 단위를 정의해 놓은 interface : TemporalUnit
 *      위의 interface를 구현한 class :          ChronoUnit
 *
 * (6)
 *      날짜+시간의 field를 정의해 놓은 interface : TemporalField
 *      위의 interface를 구현한 class :          ChronoField
 *
 * (7)
 *      특정 field(년, 월, 시, 분)를 날짜로부터 얻어올 때 사용하는 method
 *      get(field 값)->get(년도)
 *      getField()->getYear()
 *
 * (8)
 *      특정 field 수정할 때 사용하는 method
 *      with()
 *      plus()
 *      minus()
 *      roll() / add()
 *
 *
 */
public class Ex03 {
  public static void main(String[] args) {

  }//main
}//class
