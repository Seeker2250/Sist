package days18;

import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Repeat {
  public static void main(String[] args) throws IOException {
//    1.  년도 year를 입력받아서
//    입력받은 년도의 1월~12월 까지의 마지막 날짜를 출력하는 코딩을 하세요.
//    ( 조건 : Date 클래스 사용 )
//    ( 조건 : Scanner 클래스 사용 + try~with~resource문 사용)
//
//    실행결과 예제)
//    2005년
//
//	1월 : 31일
//	2월 : 28일
//	3월 : 31일
//	4월 : 30일
//	5월 : 31일
//	6월 : 30일
//	7월 : 31일
//	8월 : 31일
//	9월 : 30일
//	10월 : 31일
//	11월 : 30일
//	12월 : 31일
//
    Date day = new Date();
    String[] last = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" };
    try (Scanner sc = new Scanner(System.in)) {
      int year = sc.nextInt();
      for (int i = 0; i < 12; i++) {
        System.out.printf("%d월 %ddlf", i, getLastDay(year, i));
      }
    } catch (Exception e) {
    }


//2. days17.Ex01.java 파일을 읽어서 알파벳 대문자, 소문자
//, 숫자를 가변 배열에 저장하고 #으로 출력하는 코딩을 하세요.
    String fileName = "./src/days17/Ex01.java";
    int[][] varArr = new int[3][];
    varArr[0] = new int[26];
    varArr[1] = new int[26];
    varArr[2] = new int[10];
    try (FileReader reader = new FileReader(fileName)){
      int c;
      while ((c = reader.read()) != -1) {
        if (Character.isUpperCase((char) c)) {
          varArr[0][c - 'A']++;
        } else if (Character.isLowerCase((char) c)) {
          varArr[1][c - 'a']++;
        } else if (Character.isDigit(c)) {
          varArr[2][c - '0']++;
        }
      }
    } catch (IOException e) {
    }

    for (int i = 0; i < varArr.length; i++) {
      for (int j = 0; j < varArr[i].length; j++) {
        if (i == 0) {
          System.out.println((char) (j + 'A') + "#".repeat(varArr[i][j]));
        } else if (i == 1) {
          System.out.println((char) (j + 'a') + "#".repeat(varArr[i][j]));
        } else if (i == 2) {
          System.out.println((char) (j + '0') + "#".repeat(varArr[i][j]));
        }
      }
    }

//3. 수료일(2024.12.14. 18:00:00)로 부터 오늘까지 남은 일수 계산을 하세요..
    Date endTime = new Date(2024, 12, 14, 18, 0, 0);
    Date present = new Date(2024, 7, 24, 9, 50, 0);
    long dif = endTime.getTime() - present.getTime();
    System.out.println(dif / 1000 / 60 / 60 / 24 + "일 남았습니다");

//4. 설문조사 기간이
//   시작일  2024.7.20  00:00:00
//   종료일  2024.7.24  00:00:00
//   일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.
    Date start = new Date(2024, 7, 20, 0, 0, 0);
    Date end = new Date(2024, 7, 24, 0, 0, 0);
    Date now = new Date(2024, 7, 24, 9, 50, 0);
    boolean adjust1 = now.before(end);
    boolean adjust2 = now.after(start);
    if (adjust2 && adjust1) {
      System.out.println("가능합니다");
    } else System.out.println("불가능합니다");

  }//main
//  private static int getLastDay(int year, int month) {
//    Date d = new Date(year - 1900, month-1, 1);
//    d.setMonth(d.getMonth()+1);
//    d.setDate(d.getDate()-1);
//    return d.getDate();
//
//  }

    private static int getLastDay(int year, int month) {
//    Calendar c = Calendar.getInstance();
//    c.set(Calendar.YEAR, year);
//    c.set(Calendar.MONTH, month -1);
//    c.set(Calendar.DATE, 1);
      Calendar c = new GregorianCalendar(year, month-1, 1);
      return c.getActualMaximum(Calendar.DATE);
  }
}//class

