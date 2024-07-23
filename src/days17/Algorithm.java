package days17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Algorithm {
  public static void main(String[] args) {
//출력 예 #1
//
//5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.
//입출력 예 #2
//5,500	[1, 0]
//15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.
//15,000	[2, 4000]

  }
  class Solution {
    public int[] solution(int money) {
      int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
      return answer;
    }
  }
}
