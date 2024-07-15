package days04;

public class Ex09 {
  public static void main(String[] args) {
//    [break]

//    for(int i = 1; i <=10; i++){
//      if(i == 6) break; //statement 1rㅐ면 curly brackets 생략 가능, 1줄 코딩 가능
//      System.out.println(i);
//    }
    int i = 0;
    while(i<5){
      i++;
      System.out.print(i+"+");
    }
    System.out.println();
    for(int j = 1; j <=10; j++){
      if( j== 6) break;
      System.out.print(j+"+");
    }
  }
}
