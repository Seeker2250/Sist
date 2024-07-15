package days04;

public class Ex10 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i<=10;i++){
      sum += i;
      System.out.println("for로 0부터 "+i+" 까지의 합 : "+sum);
    }
    int j = 0;
    sum = 0;
    while(j<10){
      j++;
      sum+=j;
      System.out.println("while로 0부터 "+j+" 까지의 합 : "+sum);
    }

  }
}
