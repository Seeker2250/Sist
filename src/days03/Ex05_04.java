package days03;

import org.w3c.dom.ls.LSOutput;

public class Ex05_04 {
  public static void main(String[] args) {

    System.out.println(10 & 3);
//   0000 1010 & 0000 0011 == 0000 0010이므로 10진수로는 2

    System.out.println(10 | 3);//11
    System.out.println(10 ^ 3);//XOR
    //10 == 0000 1010
    //3 == 0000 0011
    //결과 == 0000 1001
    System.out.println(~10);
    //0000 1010
    //1111 0101이 되는 것
    //그러니 음수니까 1을 빼서 1111 0100으로 봐야하고
    //보수를 취하면 0000 1011이 되는거고
    //이건 11이니까 -11이 되는 거
  }


}
