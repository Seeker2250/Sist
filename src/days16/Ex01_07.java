package days16;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject 예외 고의로 발생시키기
 * @Contents throw문
 * 점수 받아서 반환하는 getScore()
 * 점수가 0~100이 아니라면 강제로 예외 발생
 */
public class Ex01_07 {
  public static void main(String[] args) {

    try {
      int kor = getScore("국어");
      System.out.println(kor);
    } catch (IOException e) {
      throw new RuntimeException(e);//이래도 되지만 굳이? RunTimeexception으로 바뀌잖아
    }
  }

  public static int getScore(String subject) throws IOException {//호출한 곳에서 처리해라
    Scanner sc = new Scanner(System.in);
    int score;
    System.out.println(subject + "점수를 입력히세요");
    String input = sc.next();
    String regex = "100|[1-9]?\\d";
    if (input.matches(regex)) {
      score = Integer.parseInt(input);
      return score;
    } else {
//      강제로 예외 발생
//      사용자  예외 처리 객체
      throw new IOException("점수 범위는 0~100입니다.");
    }

  }
}