package days19;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 */
public class Repeat {

  public static void main(String[] args) throws ParseException {

//2. 현재 날짜와 시간 정보를   LocalDateTime 클래스를 사용해서
//     아래와 같은 형식으로 출력하세요 . ( 5분 )
//  [출력형식]
//  2023/08/11 금요일   07:02:32.259
    LocalDateTime ldt = LocalDateTime.of(2023, 8, 11, 7, 2, 32, 259);
    String pattern = "yyyy.MM.dd E요일 hh:mm:ss.SSS";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
    String sdt = dtf.format(ldt);
    System.out.println(sdt);


//2-2. String s = "2023.08.11 (금)" 문자열을 LocalDate 클래스로 변환시키세요.
//  ( 5분 )
//    String a = "2023.08.11 (금)";
//    String pattern2 = "yyyy.MM.dd (E)";
//    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(pattern);
//    LocalDate d = LocalDate.parse(a,dtf2);
//    System.out.println(d);

//    SimpleDateFormat sdf1 = new SimpleDateFormat(pattern2);
//    Date d = sdf1.parse(a);
//    LocalDate ld = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//    System.out.println(ld);

//3-2. ArrayList 컬렉션 클래스를 사용해서 ( 10분 )
//  1) 팀원들의 이름을 요소로 추가    add(), addAll()
    ArrayList team = new ArrayList<>();
    team.add("김준석");
    team.add("원충희");
    team.add("이시훈");
    team.add("최사랑");
    team.add("박준용");

//  2) 반복자를 사용해서 모든 요소(팀원들) 출력
    Iterator ir = team.iterator();
    while (ir.hasNext()) {
      Object elements = ir.next();
      System.out.println(elements);
    }
//  3) 팀원들의 인원수를 출력
    System.out.println(team.size() + "명");
//  4) 두 번째 팀원이 누구인지 확인 후 "홍길동" 팀원으로 수정
    System.out.println(team.get(1));
    System.out.println(team.set(1, "홍길동"));
    System.out.println(team);
//  5) "홍길동" 팀원의 존재 유무를 확인 후 삭제
    System.out.println(team.contains("홍길동"));
    System.out.println(team.remove("홍길동"));
    System.out.println(team);
//  6) "이"씨 팀원들만 삭제 후 확인.
    for (int i = 0; i < team.size(); i++) {
      String name = (String) team.get(i);
//      if(name.charAt(0)=='이'){-->1번째 풀이
//        team.remove(i);
//      }
//      if(name.startsWith("이")){-->2번째 풀이
//        team.remove(i);
//    }
    }
//    team.removeIf(new Predicate<String>() {-->3번째 풀이
//      @Override
//      public boolean test(String t) {
//        return t.startsWith("이");
//      }
//    });

    team.removeIf((t) -> ((String) t).startsWith("이"));// --> 4번째 풀이
    System.out.println(team);

//
//4. java.time.LocalDateTime 클래스 사용 ( 10분 )
//   1) 설문 시작일 : 23.8.10   9:00:00
//   2) 설문 종료일 : 23.8.15  18:00:00
//
//   지금 현재 설문 가능여부에 대해서 출력하세요.  ( 가능, 불가능 )
    LocalDateTime start = LocalDateTime.of(2023, 8, 10, 9, 0, 0);
    LocalDateTime end = LocalDateTime.of(2023, 8, 15, 18, 0, 0);
    LocalDateTime temp = LocalDateTime.of(2023, 8, 15, 18, 0, 0);
    System.out.println(temp.isBefore(start));
    if (temp.isBefore(start) || temp.isAfter(end)) {
      System.out.println("설문이 불가능합니다");
    } else System.out.println("설문이 가능합니다");
//
//
//5. 이름, 나이 필드를 가진 Person 클래스를 선언하고
//   ArrayList 컬렉션 클래스에  Person 객체를 요소로 추가하고
//   이름으로 오름차순 정렬해서    출력하는 코딩을 하세요 ..
    ArrayList al = new ArrayList<>();
    al.add(new Person("김준석", 25));
    al.add(new Person("야옹", 11));
    al.add(new Person("멍뭉", 3));
//    Iterator ir2 = al.iterator();--->풀이 1
//    while (ir2.hasNext()){
//      Person p = (Person) ir2.next();
//      System.out.println(p);
//    }
//    al.sort(new Comparator<Person>() {  --->풀이 1
//      @Override
//      public int compare(Person o1, Person o2) {
//        return o1.getName().compareTo(o2.getName());
//      }
//    });
//    al.sort((o1, o2)->{((Person)o1).getName().compareTo(o2.getName())});


//   https://school.programmers.co.kr/learn/courses/30/lessons/120913
//6. days17.Ex02.java 풀이 파일에서  ( 5분 )
//   solution() 메서드의
//   String[] answer = new String[length]; 이 배열을
//   ArrayList를 사용하여 수정하세요.
//
  }//main

  //6. days17.Ex02.java 풀이 파일에서  ( 5분 )
//   solution() 메서드의
//   String[] answer = new String[length]; 이 배열을
//   ArrayList를 사용하여 수정하세요.
  public String[] solution(String my_str, int n) {
    ArrayList list = new ArrayList();
    int i = 0;
    String str = null;
    try {
      while (true) {
        str = my_str.substring(i * n, (i + 1) * n);
        System.out.println(i + " : " + str);
        list.add(str);
        i++;
      }
    } catch (StringIndexOutOfBoundsException e) {
      str = my_str.substring(i * n);
      if (str.length() != 0) {
        System.out.println(i + " : " + str);
        list.add(str);
      }
    }

//    String [] -> ArrayList 변환
//    ArrayList -> String [] 변환
    String[] answer = (String[]) list.toArray(new String[list.size()]);
    return answer;
  }
}//class


@Data
@AllArgsConstructor
class Person {
  private String name;
  private int age;
}