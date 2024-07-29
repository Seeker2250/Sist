package days18;

import java.text.ChoiceFormat;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents ChoiceFormat
 * 1. 특정 범위에 속하는 값을 문자열로 변환해준다
 * 2. 불연속적 범위의 값을 처리(if / switch 쓰던 거 대신 처리)
 * ex) 입력받은 점수를 수우미양가로 변환
 */
public class Ex02_03 {
  public static void main(String[] args) {

    String newPattern = "0#가|60#양|70$미|80#우|90#수"; // 범위, 대체할 문자까지 선언
//    ChoiceFormat cf = new ChoiceFormat(newPattern);
//    System.out.println(cf);

    // 특정 범위
    double[] limits = {0, 60, 70, 80, 90};
    // 문자열
    String[] formats = {"가", "양", "미", "우", "수" };

    ChoiceFormat cf = new ChoiceFormat(limits, formats);
    int[] score = {23, 64, 91, 45, 15, 84, 23, 52, 73};
    for (int i = 0; i < score.length; i++) {
      System.out.printf("%d [%s]\n ", score[i], cf.format(score[i]));
    }
  }
}
