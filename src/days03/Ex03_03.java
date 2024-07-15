package days03;
// type casting
public class Ex03_03 {
  public static void main(String[] args) {
    // (1) Auto Casting
    int i = 100; // [] [] [] []
    long l = i;  // [] [] [] [] [] [] [] []
    //작은 곳에서 큰 곳으로 가는 건 괜찮아
    i = (int)100L;//(cast)
    long k = l + i;//큰 자료형 + 작은 자료형 = 큰 자료형
    //(2) Explicit Casting

    
  }
}
