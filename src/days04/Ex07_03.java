package days04;

public class Ex07_03 {
  public static void main(String[] args) {
//    조건 if
//    분기 switch
//    반복 for, foreach
//    조건반복 while, do~while
//    기타 break continue

    int n = 10;
    switch (n%2) { //field, 수식
      case 1:
        System.out.println("정수");
        break;

      default:
        System.out.println("홀수");
    }
  }

}
