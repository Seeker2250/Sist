package days06;

import java.util.Scanner;

public class Ex03_05 {
  public static void main(String[] args) {
    //주민등록번호 숫자 13자리
    //우편번호  000-000, 00000받기
//    String perreg="\\s{1,14}";
//    String perStr = "";
//    Scanner sc = new Scanner(System.in);
//    perStr = sc.next();
//
//    System.out.println("입력하신 주민 번호는 " + perStr.matches(perreg) + " 입니다.");

    //---


    String[] rrnArr = {
        "123456-1234567"
        , "123456-123456"
        , "123456-12345678"//이것만 멀쩡해
        , "123a56-12#4567"
        , "1234561234567"
    };//테스트 코드들

    String regex = "\\d{6}-\\d{7}";

      /*
      System.out.println(rrnArr[0].matches(regex) );
      System.out.println(rrnArr[1].matches(regex) );
      System.out.println(rrnArr[2].matches(regex) );
      System.out.println(rrnArr[3].matches(regex) );
      */
    for (int i = 0; i < rrnArr.length; i++) {
      System.out.println(
          rrnArr[i] + "-" + rrnArr[i].matches(regex));
    }


    String[] zipcodeArr = {
        "123-456"
        , "1234-123"
        , "12345"
        , "123a5"
    };//테스트 코드들

    String regex2 = "\\d{3}-\\d{3}||\\d{5}";

      /*
      System.out.println(rrnArr[0].matches(regex) );
      System.out.println(rrnArr[1].matches(regex) );
      System.out.println(rrnArr[2].matches(regex) );
      System.out.println(rrnArr[3].matches(regex) );
      */
    for (int i = 0; i < zipcodeArr.length; i++) {
      System.out.println(
          zipcodeArr[i] + "-" + zipcodeArr[i].matches(regex));
    }
  }
}
