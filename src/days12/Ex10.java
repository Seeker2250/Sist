package days12;

/**
 * @author created by Seeker2250 on 7/16/24.
 * @Subject JVM의 memory structure
 * @Contents 자바 응용 프로그램 -> 실헹
 *           Virtual Machine에서 실행된다
 *           ->자바 응용 프로그램이 사용할 메모리를 할당 받아
 *           이 메모리가 세 가지 영역으로 나뉘어져 있어.
 *           1) Call Stack(스택 영역)
 *              int i = 1;
 *              int [] m;
 *              local variable, parameter(매개변수)
 *           2) Heap(동적 영역)
 *              new int[3];
 *              new Studnet();
 *           3) Method Area
 *              processRank() method 등록
 *              class(static) 변수 저장
 *              class file( .class)에 대한 정보 저장
 *              class, interface의 정보 저장 영역
 *
 *
 *           변수의 종류 3가지
 *           1) 선언 위치에 따른 종류
 *             1) local variable
 *             2) fields(member variable)
 *                 ㄴ instance variable
 *                 ㄴ class variable
 */
public class Ex10 {
  public static void main(String[] args) {
    /*
     *
     *
     */
  }
}
