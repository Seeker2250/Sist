package days14;

import java.util.Arrays;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class RepeatYesterday {
  public static void main(String[] args) {
//    Algorithm
    String n = "keNik";
    String m = "kKnie";
//    if (n.length() != m.length())

    char[] nArr = n.toLowerCase().toCharArray();
    char[] mArr = m.toLowerCase().toCharArray();
    Arrays.sort(nArr);
    Arrays.sort(mArr);
    System.out.println(Arrays.equals(nArr, mArr));

    n = String.valueOf(nArr);
    m = String.valueOf(mArr);
    System.out.println(n.equals(m));
  }//main
}//class


//1. [static 키워드]에 대해서 설명하세요.
//class, method,
//class에서는 static 비활성화 되어있어(
//
//2. [생성자(Constructor)]에 대해서 설명하세요.
//return이 없다
//method의 일종이며 이름은 클래스 이름과 동일하게 한다
//overloading은 가능하지만 inheritance는 불가능하다.
//인위적 호출은 불가능하지만 객체를 생성할 때 자동으로 호출된다
//Access modifier는 사용할 수 있지만 그 외의 modifier는 사용할 수 없다
//멤버를 초기화 하기 위해 사용한다.
//
//
//3. [this 키워드]에 대해서 설명하세요.
//  1) 정의
//class내에서 자기 자신의 주소값을 갖는 변수
//class Save 확인
//    private double rate;-> 계속해서 불러내서 메모리 할당하느니 한 번 할당하고 그거 계속 쓰기 위해서
//    save.rate를 불러낼 수 없으니 public [static] getter, setter
//    static Math.method들
//
//  2) this의 3가지 용도
//멤버를 명시하기 위해 사용
//Constructor 내에서 다른 constructor를 호출할 수 있다.
//return이나 parameter로도 쓰인다
//
//4. 필드(멤버변수)를 초기화 하는 방법에 대해서 설명하세요
//명시적 초기화
//생성자에 의한 초기화
//초기화 블록
//4-2. 필드 초기화 우선 처리 순위에 대해서 설명하세요
//class 초기화
//instance 초기화
//Default constructor 초기화
//5. 접근 지정자 설명
//  1) 클래스 앞
//	public 다 접근(참조, 상속 가능)
//	protected 같은 패키지 or 상속일 때 다 접근
//	package 같은 패키지면 다 접근
//	private 같은 클래스면 다 접근
//  2) 멤버 앞
//	public 다 접근(참조, 상속 가능)
//	protected 같은 패키지 or 상속일 때 다 접근
//	package 같은 패키지면 다 접근
//	private 같은 클래스면 다 접근
//
//
//6. [취업 문제] ego(자아)
//  String n = "keNik";
//  String m= "kKnie";
//
//  위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩
//  결과는 같을 경우 true/ 다를 경우 false 로 출력.
//  조건) 대소문자는 구분하지 않는다.
//package days14;
//
///**
// * @author created by Seeker2250 on 7/18/24.
// * @Subject
// * @Contents
// */
//public class RepeatYesterday {
//  public static void main(String[] args) {
//    String n = "keNik";
//    String m = "kKie";
//    n.toLowerCase();
//    m.toLowerCase();
//    for (int i = 0; i < n.length(); i++) {
//      for (int j = 0; j < m.length(); j++) {
//        if (n.equals(m) == true && n.compareTo(m) == 0 && n.charAt(i) == m.charAt(j))
//          System.out.println(true);
//        else
//          System.out.println(false);
//      }//inner for
//    }//outer for
//  }//main
//}//class
//
//

