package days14;

import days13.Person;

import java.io.IOException;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class Ex09 {
  public static void main(String[] args) {
//    overloading
//    -중복 함수

//    overriding
//    -재정의
//    -override == overwrite == 위에 덮어쓰다.
//    -parents class로부터 상속받은 method를 재정의한 것

//    overriding 조건
//       method 이름 수정 x
//       parameter 동일
//       return type 동일
//       access modifier는 부모꺼보다 같거나 넓어야 해
//       부모에게 있는 exception handling보다 더 많은 exception declare 못해

  }//main
}//class

class Parents {
  int print(String n, int a) throws IOException {
    return 100;
  }
}

class Child extends Parents {
//  @Override
//  int print(String n, int a) throws IllegalAccessError, NullPointerException, NoClassDefFoundError {
//    return 100;
}

