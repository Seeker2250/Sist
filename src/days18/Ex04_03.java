package days18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex04_03 {
  public static void main(String[] args) {
    String 조1 = "[팀장]김재민(전),김선우(전), 김인경(비),  송세호(비), 전재윤(전)";
    String 조2 = "[팀장]김준석(전), 최사랑(비), 박준용(전), 원충희(비), 이시훈(비)";
    String[] 조1arr = 조1.split("\\[팀장\\]|\\(전\\),\\s*|\\(비\\),\\s*");
    ArrayList team1 = new ArrayList();
    System.out.println(Arrays.toString(조1arr));
    for (String name : 조1arr) {
      team1.add(name);
    }


    String[] 조2arr = 조2.split("\\[팀장\\]|\\(전\\),\\s*|\\(비\\),\\s*");
    ArrayList team2 = new ArrayList();
    System.out.println(Arrays.toString(조2arr));
    for (String name : 조2arr) {
      team2.add(name);
    }
    ArrayList class5 = new ArrayList<>();
    class5.addAll(team1);
    class5.addAll(team2);
    System.out.println(class5);

//    class5.removeAll(team1);
//    System.out.println(class5);

    ArrayList class5Clone = (ArrayList) class5.clone();
    Collections.sort(class5);
    System.out.println(class5);



  }
}
