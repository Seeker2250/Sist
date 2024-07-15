package days07;

public class Repeat {
  public static void main(String[] args) {
    //[복습문제]
    //1. 이등변 삼각형
    ////       __*
    ////       _***
    ////       *****

    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print((i + j >= 4) && (j - i <= 2) ? "*" : "_");
      }
      System.out.println();
    }
    //
    //2. 피보나치 수열
    //합이 100 이하인 경우
    int fir = 1;
    int sec = 1;
    while (fir + sec <= 100) {
      int next = fir + sec;
      fir = sec;
      sec = next;
      System.out.println(next);
    }
    //3. 문자열 메서드 정리
//    char charAt()
//    boolean contains()
//    boolean equals()
//    int length()
//    String [] split();
//    String join()
//    String substring()
//    char[] toCharArray()
//    String trim()
//    String valueOf()


    //4. 가변인자 설명
//    굳이 다양한 경우를 overloading하지 않아도 배열을 통해 다양한 parameter를 소화할 수 있다. parameter 중 가장 마지막에 작성해주어야 한다.
//    배열을 활용하기 때문에 똑같은 array type의 parameter와 동시에 정의해서 쓸 순 없다
//    variable arguments(가변인자)를 활용한 overloading이 두 개 이상 있을 경우,
//    컴파일러가 해석이 불가능해 에러가 발생하거나, 개발자가 판단하기에 무엇이 호출되는지 판단할 때 어렵다.
//    VarArgs method는 호출될 때마 새로운 배열을 할당하고 초기화하기 때문에 비효율적일 수 있다.
//    Generic에서 쓰일 때 더욱 유의해야한다(단일 타입이 아니기 때문에 Object[]타입이 될 것이고, down casting이 일어날 수 있기 때문


//    1. 피보나치 수열
//    10개의 항의 값의 합을 출력.
//    1+1+2+3+5+8+13+21+34+55=??
    int arr[] = new int[12];
    int sum = 0;
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 0; i <= 9; i++) {
      arr[i + 2] = arr[i] + arr[i + 1];
      sum += arr[i];
      System.out.println(arr[i]);
      System.out.println("합은 " + sum);
    }
//    2. 용어 설명
//    1) 오버로딩(overloading) 설명
//    같은 기능을 하는 method에 대해 다양한 parameter의 경우를 받게 하기 위해 중첩 선언하는 것.
//    2) 가변인자
//    오버로딩을 덜 하기 위해 배열을 이용하여 다양한 parameter를 한 번의 선언으로 기능하게 만드는 것.
//    3. 가변인자를 사용하여 정수의 합을 구하는 myHap() 메서드를
//    선언하세요.
//    public static int myHap ( int...num){
//      int a = 0;
//      for (int i = 0; i < num.length; i++) {
//        a += num[i];
//      }
//      return a;
//    }

//
//    4. 문자열 다루는 함수(메서드)를 적으세요.
//    char charAt()
//    boolean contains()
//    boolean equals()
//    int length()
//    String [] split();
//    String join()
//    String substring()
//    char[] toCharArray()
//    String trim()
//    String valueOf()
//    5. 알파벳 대문자, 소문자를 아래와 같이 출력되도록 코딩하세요.
//[실행결과]
//    1: A(065)B(066)C(067)D(068)E(069)F(070)G(071)H(072)I(073)J(074)
//    2: K(075)L(076)M(077)N(078)O(079)P(080)Q(081)R(082)S(083)T(084)
//    3: U(085)V(086)W(087)X(088)Y(089)Z(090)a(097)b(098)c(099)d(100)
//    4: e(101)f(102)g(103)h(104)i(105)j(106)k(107)l(108)m(109)n(110)
//    5: o(111)p(112)q(113)r(114)s(115)t(116)u(117)v(118)w(119)x(120)
//    6: y(121)z(122)

    int cnt = 1;
    for (int i = 65; i < 123; i++) {
      if ('Z' < i && i < 'a') continue;
      System.out.printf("%s(%03d)",(char)i, (i));
      if ((i<='a')&&(i % 10 == 4)) {
        System.out.println();
      } else if ('a'<=i&&(i%10==0)) {
        System.out.println();
      }
    }

//    for (int i = 'A'; i <= 'Z' ; i++) {
//      System.out.printf("%c(%03d)", i, i);
//
//    }
//    while ((65 <= i && i <= 90) || (97 <= i && i <= 122)) {
//      if (i % 10 == 4) {
//        cnt++;
//        System.out.println();
//        System.out.print(cnt + ": ");
//      }
//      System.out.printf("%s(%03d)", (char) (i), (i));
//      i++;
//
//    }
  }


}
