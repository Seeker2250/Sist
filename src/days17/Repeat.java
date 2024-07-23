package days17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;


/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Repeat {
  public static void main(String[] args) {
    //6. "SS21_Team.txt"  파일을 읽어서 본인의 팀원들만의 이름을 teamMember 배열에
    //저장한 후 팀장명을 제외한 나머지 팀원들의 이름을
    //내림차순으로 정렬해서 아래와 같이 출력하는 코딩을 하세요.
    //[실행결과]  예 :
    //[ 2조 ]
    //<ul>
    //	<li class="leader">박우현</li>
    //	<li>이동찬</li>
    //	<li>윤형준</li>
    //	<li>유진</li>
    //	<li>원대안</li>
    //</ul>
    String filePath = "./src/days17/SS21_Team.txt";
    try {
      Stream<String> stream = Files.lines(Path.of(filePath));
      String team = stream.skip(3).findFirst().get();
      team = team.replace("[팀장]", "class=\"leader\">");
      team = team.replace("(전)","");
      team = team.replace("(비)","");
      team = team.replace(",", "</li>\n<li>");
      team = "<ul>\n<li>" + team + "</li>\n</ul>";

      System.out.println(team);
    } catch (IOException e) {
      e.printStackTrace();
    }
    //문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
    //제한사항
    //1 ≤ my_str의 길이 ≤ 100
    //1 ≤ n ≤ my_str의 길이
    //my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
    //입출력 예
    //my_str	n	result
    //"abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
    //"abcdef123"	3	["abc", "def", "123"]
    //입출력 예 설명
    //입출력 예 #1
    //
    //"abc1Addfggg4556b" 를 길이 6씩 잘라 배열에 저장한 ["abc1Ad", "dfggg4", "556b"]를 return해야 합니다.
    //입출력 예 #2
    //
    //"abcdef123" 를 길이 3씩 잘라 배열에 저장한 ["abc", "def", "123"]를 return해야 합니다.
    //유의사항
    //입출력 예 #1의 경우 "abc1Addfggg4556b"를 길이 6씩 자르면 "abc1Ad", "dfggg4" 두개와 마지막 "556b"가 남습니다. 이런 경우 남은 문자열을 그대로 배열에 저장합니다.

    class Solution {
      public String[] solution(String my_str, int n) throws IOException {
        String[] answer = {};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = new String[]{br.readLine()};
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < my_str.length()/n; i++) {
          my_str = answer[i];
          System.out.println(my_str = my_str.substring(i, n));
          i = i+n;
        }
        return answer;
      }
    }

  }
}
