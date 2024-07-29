package days21;

import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject Annotation : 주석 비스무리한 거
 * @Contents 프로그램의 소스코드 안에 compiler한테
 * 다른 프로그램을 위해서 미리 약속된 형식을 포함시키는 것
 * 보통 다른 프로그램은 Compiler
 * <p>
 * ex) @Override : compiler에게 overriding한 method라고 알려주는 것
 * <p>
 * jdk에서 기본적으로 제공하는 annotation : standard annotation
 * <p>
 * standard annotation 종류
 * @Override
 * @Deprecated : constructor, fields, method가 앞으로 없어질 예정이다(취소선 그어져)
 * @SuppressWarnings : compiler에게 특정 경고 메시지가 안 뜨도록 만드는 것
 * @FunctionInterface : 함수형 인터페이스
 * @SafeVarargs : generics type인 variable arguments에 사용되는 annotation
 * @Native : C언어 method를 java에 사용할 때
 *
 * 또 다른 annotaion에 사용되는 annotaion : meta annotation
 * @Target, @Documented, @Inheritedm @Retention, @Repeatable
 */

public class Ex02 {
  public static void main(String[] args) {
//    Variable 'sc' is never used
    @SuppressWarnings({"Variable 'sc' is never used"})
    Scanner sc = new Scanner(System.in);

  }
}
