package days07;

import java.util.Arrays;

public class Ex04 {
  public static void main(String[] args) {
    //피보나치 수열의 항이 100보다 같거나 작을 때까지의 합 출력
//    int [] strArr = new int[50];
//    strArr[0] = 1;
//    strArr[1] = 1;
//    int i = 0;
//    while(true){
//      i++;
//      strArr[i+2]=strArr[i]+strArr[i+1];
//      if(strArr[i]>=100) {
//        break;
//      }
//      System.out.println(strArr[i]);
//    }

//    강사님 코드
//    int firstTerm = 1;
//    int secondTerm = 1;
//    int nextTerm = 0;
//    int sum = firstTerm + secondTerm;
//    while (true) {
//      nextTerm = firstTerm + secondTerm;
//      if (nextTerm >= 100)
//        break;
//      System.out.println(nextTerm);
//      sum+=nextTerm;
//      firstTerm = secondTerm;
//      secondTerm = nextTerm;
//    }
//    System.out.println(sum);

//    int firstTerm = 1;
//    int secondTerm = 1;
//    int sum = firstTerm + secondTerm;
//    int nextTerm = firstTerm + secondTerm;
//    while (nextTerm <= 100) {
//      System.out.println(nextTerm);
//      sum+=nextTerm;
//      firstTerm = secondTerm;
//      secondTerm = nextTerm;
//      nextTerm = firstTerm + secondTerm;
//    }
//    System.out.println(sum);


    int firstTerm = 1;
    int secondTerm = 1;
    int sum = firstTerm + secondTerm;
//    int nextTerm = firstTerm + secondTerm;
    int nextTerm;
    while ((nextTerm = firstTerm + secondTerm)<= 100) {
      System.out.println(nextTerm);
      sum+=nextTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
//      nextTerm = firstTerm + secondTerm;
    }
    System.out.println(sum);
  }
}
