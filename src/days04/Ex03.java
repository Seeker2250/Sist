package days04;

public class Ex03 {
  public static void main(String[] args) {
    //대문자 -> 소문자 변환
    //소문자 -> 대문자 변환
//    A는 65, a는 97

    char lowerCase = 'x', upperCase;
    upperCase = (char)(lowerCase - 32);//소문자를 대문자로
    System.out.println(upperCase);
  }
}
