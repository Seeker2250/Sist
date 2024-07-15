package days03;

public class Ex03 {
  public static void main(String[] args) {
    int i =10;

    System.out.println(Integer.toBinaryString(i));//1010이 나오겠지
    //method 알려면 기능, 매개변수, 리턴값 알아야지 toBinaryString 모르니까 확인해(이진수로 만들어준대)
//    10진수, 8진수, 16진수 값으로 출력
    System.out.printf("%d\n", i);
    System.out.printf("%o\n", i);
    System.out.printf("%x\n", i);

    //%o 8진수 %x : 16진수
    System.out.println();

    System.out.printf("%d\n", i);
    System.out.printf("%#o\n", i);
    System.out.printf("%#x\n", i);
    //#붙이면 flag 생겨서 진수 표시 돼

    System.out.println();

    int money = 23535790;
    System.out.printf("%,d \n", money);
    //이런 식으로 flag 사용 가능
  }
}
