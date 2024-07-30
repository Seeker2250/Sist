package days21;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 * 10 ≤ price ≤ 1,000,000
 * price는 10원 단위로(1의 자리가 0) 주어집니다.
 * 소수점 이하를 버린 정수를 return합니다.
 */
public class Algorithm {
  public static void main(String[] args) {
    solution(100010);
  }

  public static void solution(int price) {
    int answer = 0;
    if ((300000 > price) && price >= 100000) {
      price = price - price / 20;
      price = (int) Math.floor(price);

    } else if ((500000 > price) && price >= 300000) {
      price = price - price / 10;
      price = (int) Math.floor(price);
    } else if (price >= 500000) {
      price = price - price / 5;
      price = (int) Math.floor(price);
    }

    System.out.println(price);
  }
}



