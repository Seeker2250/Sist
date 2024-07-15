package days06;

public class RepeatPractice {
  public static void main(String[] args) {
    for (int i = 0, lineNum = 1; i < 256; i++) {
      if (i % 10 == 0)
        System.out.print(lineNum++ + "번");
      System.out.print((char) i);
      if (i % 10 == 9)//9개행 찍고 개행
        System.out.println();
    }
  }
}
