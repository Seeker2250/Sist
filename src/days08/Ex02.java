package days08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
//    검색(search)
//    1) 순차 검색 sequence search
//    2) 이진 검색 binary search
    Scanner sc = new Scanner(System.in);
    //만들어진 Scanner를 필요할 때마다 객체만 넘겨줄거야
//    new operator 쓰면 매번 만들어야 하잖아
    int[] m = new int[100];
//    1~100 임의의 정수 랜덤하게 채워 넣기
    fillM(m);//채워넣어
    dispM(m);//출력
    int searchNum = getSearchNum(sc);
//    Scanner sc = new Scanner(System.in);
//    System.out.print("검색할 정수를 입력하세요.");
//    int searchNum = sc.nextInt();
    int findIndex = sequenceSearch(m, searchNum);//배열 m 안에 searchNum 있는지 확인하고,
    if (findIndex == -1) {
      System.out.println("찾는 정수가 없습니다.");
    } else {
      System.out.println("찾는 정수는 " + findIndex + "번째에 있습니다.");
    }
  }

  private static int sequenceSearch(int[] m, int searchNum) {
    int index = -1;
    for (int i = 0; i < m.length; i++) {
      if (m[i] == searchNum) {
        index = i;
        break;
      }//if
    }//for
    return index;
  }

  private static int getSearchNum(Scanner sc) {//String 받나 Scanner로 받나
    String regex = "\\d+";
    // +는 1~무한
    // *는 0~무한
    // ?는 0개 or 1개
    String strSearchNum;
    do {
      System.out.println("검색할 정수를 입력하세요.");
      strSearchNum = sc.next(regex);
    } while (!strSearchNum.matches(regex));
    int searchNum = Integer.parseInt(strSearchNum);
    return searchNum;
  }

  private static void dispM(int[] m) {
    System.out.println(Arrays.toString(m));
  }

  private static void fillM(int[] m) {
    Random rnd = new Random();
    for (int i = 0; i < m.length; i++) {
      m[i] = rnd.nextInt(100) + 1;
    }//stream으로도 가능해
  }

}
