package days08;

import java.util.Calendar;
import java.util.Scanner;

public class Repeat {
  //주민번호 입력 받아서 만 나이 계산 method
  public static void main(String[] args) {
    System.out.println("주민등록번호를 입력하세요.");
    Scanner sc = new Scanner(System.in);
    String rrn = sc.next();
    System.out.println(globalAge(rrn));
    sc.close();
  }


  private static int globalAge(String rrn) {
    int pYear = 0;
    int year = Integer.parseInt(rrn.substring(0, 3));
    int pMD = Integer.parseInt(rrn.substring(2,6));
    Calendar c = Calendar.getInstance();
    int nowMonth = c.get(Calendar.MONTH)+1;
    int nowDate = c.get(Calendar.DATE);
    int check = rrn.charAt(7) - '0';
    int a;
    int test = 0;

    switch (check) {
      case 1://남 내국
      case 2://녀 내국
      case 5:// 남 외국
      case 6:// 녀 외국
        test = 1900;
        break;
      case 3:
      case 4:
      case 7:
      case 8:
        test = 2000;
        break;
      default:
        test = 1800;
    }
    pYear = year + test;
    int globalAge = c.get(Calendar.YEAR)-pYear;
    globalAge = ((nowMonth*100) + nowDate)>=pMD? globalAge+1: globalAge;
    return globalAge;
  }
}
