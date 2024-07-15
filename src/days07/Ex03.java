package days07;

import java.util.Arrays;
import java.util.Random;

public class Ex03 {
  public static void main(String[] args) {
//    신용카드
    String card = "0000-0000-0000-0000";
    String regex = "-";
//    카드 결제 영수증
    String[] cardArr = card.split(regex);
//    for (String string: cardArr
//         ) {
//      System.out.println(string);
//    }
    System.out.println(Arrays.toString(cardArr));

    //0~3 임의의 정수
    Random rnd = new Random();
    int index = rnd.nextInt(4); //0 <= int <4니까 array index랑 같아서 그냥 index에 담아버려
    cardArr[index] = "*".repeat(4);
    System.out.println(Arrays.toString(cardArr));
//    System.out.printf("%s-%s-%s-%s", cardArr[0], cardArr[1], cardArr[2], cardArr[3]);
    String printCard = String.join("-", cardArr);//delimiter로 합칠 때 사용
    System.out.println(printCard);
  }//main
}//class
