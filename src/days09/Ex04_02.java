package days09;

public class Ex04_02 {
  public static void main(String[] args) {
    int n = 10; //8진수 출력, 8로 나눠
    int reminder;
    int share;
    String octal = "";
    while (n != 0) {
      share = n / 8;
      reminder = n % 8;
      System.out.print(reminder+"\n");
      octal = reminder + octal;//"12"
      n = share;
    }
    octal="0"+octal;
    System.out.print(octal);
  }
}
