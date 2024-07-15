package days04;

public class Ex11 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i<=10;i++){
      sum += i;
      System.out.println("for로 0부터 " + i + " 까지의 합 : "+sum);
    }
    System.out.println("__________________________________________________");
    int j = 0;
    sum = 0;
    while(j<10) {
      j++;
      sum += j;
      System.out.println("while로 0부터 " + j + " 까지의 합 : " + sum);
    }
    System.out.println("__________________________________________________");
    sum = 0;
    for(int i=0; i<= 10; i++) {
      if(i==5) continue;
      sum+=i;
      System.out.println("for로 0부터 " + i + " 까지의 5 제외 합 : "+sum);
    }
    System.out.println("__________________________________________________");
    int i = 0;
    sum = 0;
    while(i < 10){
      i++;
      if(i==5) continue;
      sum+=i;
      System.out.println("while로 0부터 " + i + " 까지의 5 제외 합 : "+sum);
    }



  }
}
