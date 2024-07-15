package days04;

public class Ex04 {
  public static void main(String[] args) {
//    shift operator
    System.out.println(10);
    System.out.println(Integer.toBinaryString(10));
//    00000000 00000000 00000000 00001010라고 4byte가 있다고 가정
    System.out.println(10>>2);
    System.out.println(Integer.toBinaryString(10>>2));
//    00000000 00000000 00000000 00000010이 되겠지.
//    부호 비트가 0이니까 0으로 채운거고 만약에 부호 비트가 1이면 1로 채우겠지 shift된 만큼
    System.out.println(10>>>2);
//    이건 무조건 0으로 채우라는 의미
    System.out.println(10<<2);
    System.out.println(Integer.toBinaryString(10<<2));
//  00000000 00000000 00000000 00101000이 되겠지.

  }
}
