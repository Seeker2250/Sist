package days14;

//staic import
//import static java.lang.Math.PI;
//import static java.lang.Math.random;
import static java.lang.Math.*;
/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject Package
 * @Contents
 *     1. package
 *     - 서로 관련 있는 클래스, 인터페이스들의 묶음
 *
 *     2. class들의 효율적인 관리를 위해 사용
 *     예시 : java.io, java.util java.net package -> 이름만 봐도 알 수 있어
 *
 *     3. 패키지명 + 동일한 이름의 class
 *     패키지명 충돌을 막기 위해 도메인명==패키지명 사용
 *     ex) naver.com->com.naver.project명
 *
 *     4. 패키지 == 물리적 directory 생성
 *     java.io 패키지명      java directory
 *                                 ㄴ io directory
 *
 *     5. java file의 첫 문장에 package 패키지명;
 *
 *     6. 패키지명은 소문자로 작명
 *
 *     7. 다른 패키지의 클래스를 사용할 때는 import문 사용
 *
 *     8. full name을 적으시오->package명.class명
 *
 *     9. import문이 없는 경우에는 IntelliJ 기준, opt + ent
 *
 *     10. import java.io.*;
 *     java io 패키지 안의 모든 class import하겠다
 *
 *     예시 com.sis에 뭐가 있고  com.sis.asfd에 뭐가 있ㅇ르면
 *     com.sis.*; 하면 asfd꺼 못 가져와
 *
 *     11. import java.lang.*; 컴파일러가 자동 추가
 */
public class Ex10 {
  public static void main(String[] args) {

    System.out.println(random());//이거 가능한 이유?
    System.out.println(PI);//맨 위에
    //import static java.lang.Math.PI;
    //import static java.lang.Math.random;
  }
}
