package days08;

public class Ex04_02 {
  public static void main(String[] args) {
//    정처기 실기
//     화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
    int money = 125760;
    int count = 0;
    int unit = 50000;//화폐 단위
    boolean sw = false;

    while (unit >= 1){
      count = money / unit;//몫이면서 화폐의 갯수
      money = money % unit;
      System.out.println(unit+"은 "+count+"개, 남은 돈은 : "+money);
      unit /= sw ? 2 : 5;
      sw = !sw;

    }
  }//main
}//class
