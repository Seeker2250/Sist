package days21;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
*/
public class Algorithm {
  /*
   * 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
   *  조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해
   *  조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 매개변수로 주어질 때,
   *  머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
   *
   *  1 ≤ babbling의 길이 ≤ 100
      1 ≤ babbling[i]의 길이 ≤ 15
      babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
      즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
      문자열은 알파벳 소문자로만 이루어져 있습니다.
   */
  public static void main(String[] args) {

    String [] a = {"aya", "yee", "u", "maa", "wyeoo"};
    solution(a);
  }

  public static int solution(String[] babbling) {
    int answer = 0;
    List<String> al = Arrays.stream(babbling).toList();
    ArrayList<String> al2 = new ArrayList<>();
    ArrayList<String> al3 = new ArrayList<>();
    al2.add("aya");
    al2.add("ye");
    al2.add("woo");
    al2.add("ma");
    for (int i = 0; i < babbling.length; i++) {
      for (int j = 0; j < babbling.length; j++) {
        if(Objects.equals(al.get(i), al2.get(j))){
        }
      }
    }

    for (int i = 0; i < al3.size(); i++) {
      System.out.println(al3.get(i));
    }
    return answer;

  }
}




