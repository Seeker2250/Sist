package days11;

import java.util.Arrays;

public class Ex03 {
  public static void main(String[] args) {
    int n = 71;
    int[] m = {3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 71, 37};
//    int idx = indexOf(m, n);//m이란 array 속에 n 찾기
    int index, beginIndex = 0;
    while ((index = indexOf(m, n, beginIndex)) != -1) {//끝까지 다 돌면 return -1되니까
      System.out.println(index);//찾은 곳 찍어
      beginIndex = index+1;//다음 찾을 때는 이 다음부터
    }

//    System.out.println(idx);

//    Question : m Array에서 n을 찾아, 모든 index값을 출력하기를 바란다.
//    ex) 여러 군데에 있을 경우에 출력
  }//main

  private static int indexOf(int[] m, int n, int beginIndex) {
//    "".indexOf(3); from index parameter가 여기부터 찾아라, 우리의 beginIndex와 같아
//    beginIndex부터 찾을거야
    for (int i = beginIndex; i < m.length; i++) {
      if (m[i] == n) {
        return i;
      }//if
    }//for
    return -1;
  }//indexOf method
}//class

//  private static int indexOf(int[] m, int n) {
//    int [] position = new int [m.length];
//    for (int i = 0; i < m.length; i++) {
//      if(m[i]==n) {
//        System.out.println(i);
//      }//if
//    }//for
//    return -1;
//  }//indexOf method
//}//class

