package days20;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject Generic의 제한
 * @Contents
 */
public class Ex08_03 {
  public static void main(String[] args) {

  }//main
}//class
class Box2<T>{
//  제한 1 : generic class에는 class 변수를 선언할 수 없다
//  static T item2;


//  'days20.Box2.this' cannot be referenced from a static context
//  제한 2 : class method에도 T 타입 변수는 사용할 수 없다
//  static int compare(T a, T b){
//    return 0;
//  }
}