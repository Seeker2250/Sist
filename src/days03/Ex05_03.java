package days03;

public class Ex05_03 {
  public static void main(String[] args) {
  int i = 10, j = 3;
    System.out.println(i > j);  //true
    System.out.println(i < j);  //false
    System.out.println(i >= j); //true
    System.out.println(i <= j); //false

    //주의 사항
    System.out.println(i = j); // 3(assignment)
    System.out.println(i == j); //false
    System.out.println(i != j); //true
    //java: bad operand type int for unary operator '!'
  }
}
