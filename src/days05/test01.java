package days05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test01 {
  public static void main(String[] args) throws IOException {
    /*
     * [복습문제]
     *1. 1~10 까지 합 출력 ( for문, while문 각각)
     *2. 정수 입력받아서 홀수,짝수 출력( if문, switch문 각각)
     *3. 입력값을 split() 해서 처리하는 문제
     *4. 1~N 까지의 홀수의 합 ( for문, while 문 각각)
     *5. 배열 개념 문제... ~~~
     */
//    int sum = 0;
//    for(int i = 0; i<10;i++){
//      i++;
//      sum+=i;
//    }
//    System.out.println(sum);
//
//    System.out.println("________________");
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int num;
//    num = br.read();
//    if(num % 2==0)
//      System.out.println("짝수");
//    else
//      System.out.println("홀수");
//
//    num = 0;
//    num = br.read();
//    switch (num%2){
//      case 0 :
//        System.out.println("짝수");
//      default:
//        System.out.println("홀수");
//    }

//진짜 문제
    //1. 대문자를 소문자로 변환하는 코딩을 하세요.
    //   char uc = 'A';
    //   char lc ;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char uc = 'A'; //문자는 정수 계열이야
    char lc = (char)(uc + 32);
    System.out.println(lc);
    //toLowerCase()랑 toUpperCase()는 String이기 때문에 char가 아니야

    //2.  1+2+3+..+9+10=55   출력하는 코딩( for문 사용 )
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
      if(i==10) {
        System.out.print(i);
        break;
      }
      System.out.print(i+"+");

    }
    System.out.println("="+sum);

    sum = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.print(i==10?+i:i+"+");
      sum+=i;
    }
    System.out.println("="+sum);


    //3. return 문, break 문에 대해서 설명하세요.
    //return은 명시된 type으로 값을 반환하는 것
    //break는 제어문에서 특정 조건일 때 제어문을 빠져나오도록 하는 것

    /*4. for문을 사용해서  아래와 같이 출력하는 코딩을 하세요.
     *[실행결과]
     v01 - 헬로우 월드
     *02 - 헬로우 월드
     *03 - 헬로우 월드
     *04 - 헬로우 월드
     *05 - 헬로우 월드
     *06 - 헬로우 월드
     *07 - 헬로우 월드
     *08 - 헬로우 월드
     * 09 - 헬로우 월드
     * 10 - 헬로우 월드
     */


   for (int j=1; j<10; j++) {
     System.out.println("0"+j+" - "+"헬로우 월드");
   }
    for (int j=1; j<=10; j++) {
      System.out.printf("%02d - 헬로우 월드\n", j);
    }
    /*
     * 5. 배열의 정의
     * 배열 : 메모리의 명확한 위치에 값을 할당하여 저장하는 것
     * 동일한 자료형!
     * new 연산자에 의해 heap memory에 dynamic으로 올라가(이 address를 reference로 삼기 때문에 reference variable
     * 5-2. 배열의 선언 형식
     * (type) [] (field) = new (type) [size]
     * 5-3. 배열의 크기를 알아오는 코딩
     * array.length();
     * 5-4. 배열의 윗첨자값(UpperBound) 알아오는 코딩
     * array.length()-1
     * 5-5. 배열의 각 요소는 어떻게 표현하는 가 ?
     * 배열명[index]
     */

    //6. 우리가 지금까지 배운 문자열(String)을 다루는 메서드를 모두 적으세요.
    //  예) charAt(), 자료형, parameter, 적을 것
//    char String.charAt() 몇 번째에서 빼와
//    WrapperClass.parse~~
//    String [] String.split(String regex) regex를 delimeter로 잘라버려
//    String.toUpperCase() 대문자로
//    String.toLowerCase() 소문자로
//    String.trim() 공백제거
//    boolean String.equals()
//    boolean String.equalsIgnoreCase()
//    String.format()
    /*
    * 7. [입력형식]
   팀원들을 입력하세요 ? 홍길동,이시훈, 송세호
   [출력형식]
   1. 팀원 : 홍길동
   2. 팀원 : 이시훈
   3. 팀원 : 송세호
   * */
    System.out.println("팀원들을 n명 입력하세요.");
    String team = br.readLine();
    String[] name = team.split(",");

    for (int i = 0; i < name.length; i++){
      System.out.println(i+1+". "+"팀원 : " + name[i].trim());
    }
    @SuppressWarnings("resource") //p556
    Scanner sc = new Scanner(System.in);
    System.out.println("팀원들을 세 명 입력하세요.");
    String teamOne = sc.nextLine();
    System.out.println(teamOne);
    String regax = "\\s*,\\s*";
    String [] teamOneArr = teamOne.split(regax);
    System.out.println("1. 팀원 : "+teamOneArr[0]);
    System.out.println("2. 팀원 : "+teamOneArr[1]);
    System.out.println("3. 팀원 : "+teamOneArr[2]);
  }
}
