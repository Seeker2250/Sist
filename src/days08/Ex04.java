package days08;

public class Ex04 {
  public static void main(String[] args) {
//    정처기 실기
//     화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
//    5만 : 2개->25760
//    1만 : 2개->5760
//    5천 : 1개->760
//    1천 : 0개->760
//    5뱍 : 1개->260
//    1백 : 2개->60
//    5십 : 1개->10
//    1십 : 1개->0
//    5 : 0개->0
//    1 : 0개->0


    int money = 125760;
    int result = 0;
    int rest = 0;
    int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
    for (int i = 0; i < 10; i++) {
      result = money / arr[i];
      rest = money % arr[i];
      money = rest;
      System.out.println(arr[i] + "는 " + result + "개, 남은 돈은 " + rest);
    }


//    int money = 125760;
//    int count = 0;
//    int share, reminder;//몫, 나머지
//    count = share = money / 50000;
//    reminder = money % 50000;
//    System.out.println("5만원은 " + count + "개 " + reminder);
//    reminder = money % 10000;
//    money = reminder;


//    int money = 125760;
//    // 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
//    int count = 0;
//    int share, reminder; // 몫, 나머지 변수
//
//    int [] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
//    String [] sunit = { "5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원" };
//
//    for (int i = 0; i < unit.length; i++) {
//      count = share = money / unit[i];
//      reminder = money % unit[i];
//      System.out.printf("%s원 : %d 개\t\t %d\n"
//          ,sunit[i], count, reminder);
//      money = reminder;
//    }
  }//main
}//class
