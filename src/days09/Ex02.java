package days09;

//년도 입력 받아서 윤년 평년 체크
public class Ex02 {
  public static void main(String[] args) {
//    4로 나눠 떨어지면 윤년, 그 외는 평년
//    year % 4 == 0;
//    100으로 나눠 떨어지면서 400으로 나눠 안 떨어지면 평년
//    year % 100 == 0 year % 100 != 0 평년
//    (year % 100 == 0&& year % 4 != 0 ) || year % 400 = 0윤년
    int cnt = 0;
    for (int i = 1; i < 2020; i++) {
      if (isLeapYear(i)) {
        System.out.println(i);
        cnt++;
      }
    }
    System.out.println("1~2020 윤년 " + cnt);
  }

  public static boolean isLeapYear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;

    return false;
  }
}
