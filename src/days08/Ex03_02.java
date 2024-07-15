package days08;

import java.util.Calendar;

public class Ex03_02 {//출신지역 배열로 처리해보기

  public static void main(String[] args) {
//    [주민등록번호]
//    5 나이(만 나이 / 세는 나이)
    String rrn = "890123-1742131";
    getYearAge(rrn);

//      2022.12.31생이면     2023년 1월 1일생이면   2024년 12월 31일이 되면     2024년 1월 1일이 되면
//      한국식 나이 : 1살           2살                      2살                       3살
//      한국식 나이 : 올해 년도 - 생일 년도 + 1
//      연나이 = 올해 년도 - 생일 년도
//      만 나이 : 0살              0살                      1살                       1살
//      만 나이 : 올해 년도 - 생일 년도   생일 지났는지 유무에 따라 -1하거나 냅둠(생일 안 지났으면 1살 빼)


    int koreaAge = getKoreaAge(rrn);//한국식 나이
    System.out.print("한국식 세는 나이 : " + koreaAge);
    int globalAge = getGlobalAge(rrn);// 만 나이
    System.out.println(globalAge);
  }//main

  private static int getYearAge(String rrn) {//시험 [만 나이]
    int birthYear = Integer.parseInt(Ex03.getBirth(rrn).substring(0, 4));//"1999"
    Calendar cal = Calendar.getInstance();//Calender class 사용
    int thisYear = cal.get(Calendar.YEAR);
    return thisYear - birthYear;
  }

  private static int getGlobalAge(String rrn) {
    //내 코딩
    int globalAge = getYearAge(rrn);
//    int year = Integer.parseInt((rrn.substring(2, 7)));//월 일
    int birthPass = 710 - Integer.parseInt((rrn.substring(2, 6)));
    ;
    Calendar cal = Calendar.getInstance();//Calender class 사용
    int thisMonth = cal.get(Calendar.MONTH) + 1;
    int thisDay = cal.get(Calendar.DATE);
    int thisMD = 7 * 100 + 10;

    int birthMD = Integer.parseInt((rrn.substring(2, 6)));
    if (thisMD < birthMD) {
      globalAge--;
      return globalAge;
    }
//    if (birthPass>=0)
//
//    강사님 코딩 1차 풀이
//    int globalAge = getYearAge(rrn);
//    int thisMonth = 7, thisDay = 10;
//    int birthMonth, birthDay;
//    birthMonth = Integer.parseInt(rrn.substring(2, 4));
//    birthDay = Integer.parseInt(rrn.substring(4, 6));
//    if (thisMonth < birthMonth || thisMonth == birthMonth && thisDay < birthDay) {
//      globalAge--;
//    }
    return globalAge;
  }

  //    int globalAge = getYearAge(rrn);
//    int thisMonth = 7, thisDay = 10;
//    int birthMonth, birthDay;
//    birthMonth = Integer.parseInt(rrn.substring(2, 4));
//    birthDay = Integer.parseInt(rrn.substring(4, 6));
//    if (thisMonth < birthMonth || thisMonth == birthMonth && thisDay < birthDay) {
//      globalAge--;
  private static int getKoreaAge(String rrn) {
    return getYearAge(rrn + 1);
  }

  private static String getBirth(String rrn) {
//     YYMMDD-G지역2 주민센터2 등록순서1 검증1
//    "000123-3142131"

    int year = Integer.parseInt(rrn.substring(0, 2));//begin index <= substring < end index
    int month = Integer.parseInt(rrn.substring(2, 4));
    int day = Integer.parseInt(rrn.substring(4, 6));

    String gender = getGender(rrn); //"1900/남녀/내외국인"
    int century = Integer.parseInt(gender.split("/")[0]);
    year = century + year;
    String birth = String.format("%d년 %d월 %d일", year, month, day);

    return birth;
  }

  private static String getGender(String rrn) {
    int gender = Integer.parseInt(rrn.substring(7, 8));//하나 가져와, 3가져오겠지

    int century = 1800;
    switch (gender) {
      case 1:
      case 2:
      case 5:
      case 6:
        century = 1900;
        break;

      case 3:
      case 4:
      case 7:
      case 8:
        century = 2000;
        break;
      default:
        century = 1800;
        break;
    }
    char sex = gender % 2 == 1 ? '남' : '여';
    String nationality = "내국인";
    if (5 <= gender && gender <= 8)
      nationality = "외국인";
    return String.format("%d/%c/&s", century, sex, nationality);
  }
}
