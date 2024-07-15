package days08;

public class Ex03 {//출신지역 배열로 처리해보기
  public static void main(String[] args) {
//    [주민등록번호]
//    Resident registration number, RRN
//    1 생년월일 해결
//    2 성별 해결
//    3 내국인 / 외국인 해결
//    4 출신 지역 (숙제)
//    5 나이(만 나이 / 세는 나이)
//    6 검증
    String rrn = "890123-1142131";
//    주민등록번호 -> 생년월일 가져오기
//    "2000년 1월 23일"이라는 출력서식
    String birth = getBirth(rrn);
    System.out.println(birth);

    String gender = getGender(rrn).split("/")[1];
    System.out.println(gender);

    System.out.println(getGender(rrn).split("/")[2]);
  }//main

  public static String getBirth(String rrn) {
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

  public static String getGender(String rrn) {
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
    return String.format("%d/%c/%s", century, sex, nationality);
  }
}
