package days23;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author created by Seeker2250 on 7/31/24.
 * @Subject Lambda Expression
 * @Contents
 * jdk 1,8 추가
 * java = OOP + Functional Language
 * method를 하나의 식(Expression)으로 표현( 수식으로 ), Annonymous function이라고도 해
 *          -> : arrow operator
 *
 *          method를 lambda로 표현할 때
 *          1. method 이름 생략
 *          2. return 생략
 *
 * 모든 method는 반드시 class를 선언한 후에 memeber function으로 선언해야 함
 * static을 안 붙였다면, 선언된 class로부터 객체를 생성을 해야만 객체명.method()로 call 가능
 *
 * lambda도 method 표현인데? 사실 이것도 annonymous class
 * lambda는 이 모든 과정 필요없이 오직 lambda 자체만으로
 * 이 method의 역할을 대신 할 수 있다.
 *
 * lambda는 method의 parameter로 전달되어지는 것이 가능하다.
 *                     method의 return하는 것도 가능하다.
 *
 * Function            /         method
 * 하나의 독립적인 기능               class 안에 선언된 memeber function
 * 클래스 필요없음                   객체의 동작, 기능
 *
 * Lambda Expression 사용법
 * 원래 method가 어떤 형태였는지를 알아야 해.
 * [return type] [method name] (parameter){
 *    명령코딩;
 *    return ~~;}에서
 *
 *    (parameter)->{
 *     명령코딩;
 *     return ~~;
 *     }되는 것
 *
 * method -> Lambda 선언 방법
 * int max(int a, int b){
 *   return a>b? a : b;
 * }라고 가정하면
 *
 * (int a, int b)->{ return a>b? a : b;} 되는
 *
 * return값이 있는 경우 "return 리턴값"형식이 아닌 expression(수식)으로 대신 할 수 있다.
 * (int a, int b)->{a>b? a : b}가 될 수 있다는 뜻
 * 주의 : semicolon(;) 안 붙인다
 * Lambda에 선언된 parameter의 type이 추론 가능할 경우, 생략(대부분 추론 가능하여 생략)
 * (a, b)->{a>b? a : b}가 가능한 것 <Integer>인 경우
 * 생략 가능하다(일부 자료형만 쓰는 건 안돼)
 *
 * parameter가 1개인 경우에만 () 생략할 수 있다.
 * int test(int a) {return a*2;}는
 * a->a*2가 된다는 의미
 * 괄호를 생략하면 자료형은 >>반드시<< 없어야 해
 *
 * (String name, int i) -> {System.out.println(name + " " + i);}라고 하면
 * {} 안에 명령 코딩이 1줄이라면 {}도 생략 가능
 * 명령 코딩 뒤에 semicolon(;)를 붙이지 않는다.
 * (name, i) -> System.out.println(name + " / " + i)
 *
 * {}를 생략할 때 주의사항 : (String name, int i) -> {return name + " " + i;} 라고 하면
 *                      {} 안에 명령이 하나일 지라도 return문인 경우에는 {}를 생략할 수 없다.
 *
 * Functional Interface
 *    1) Interface : abstract, final, default, static 뿐이야
 *    2) Functional Interface : Lambda Expression을 다루기 위한 interface(abstract method 1개야)
 *                              Lambda Expression : interface의 1 : 1 Mapping
 *                              Lambda Expression이 method 1개를 Expression으로 만든 것이니 당연해
 *                              Lambda Expression을 하나의 interface에 담겠다
 *                              interface도 자료형이잖아. 자료형은 결국 기억공간이니까 말이 되지
 *
 *    3) 모든 method는 class member로 선언 돼
 *       그럼 Lambda expression도 어떤 class의 member로 선언되어야 해
 *       -> Annonymous class의 member
 *
 *    4) static, default method는 functional interface에서도 갯수 제약이 없어
 *    5) @FunctionalInterface 라는 Annotation 붙이면 compiler가 functional interface로 인식해서
 *       올바르게 정의되었는 지 확인해 줌
 *
 *    예시 :
 *    Interface
 *    interface MyFunction {
 *      int max(int a, int b);
 *    }
 *
 *    new MyFunction(){
 *      @Override
 *      int max(int a, int b){
 *        return a>b? a:b;
 *      }
 *    }를 받고 싶을 때 MyFunction myfunc = new MyFunction();해야하잖아
 *
 *    여기엔 Lambda가 없어
 *    int max = myfunc.max(1,2);해야하는데
 *
 *    MyFunction myfunc = (a,b) -> a > b ? a : b;라고 Lambda라고 해도
 *    사실 모든 method는 class가 있어야 하니 위 같은 interface가 내부적으로 존재함
 *
 *    Annonymous class = class 선언 + 생성
 *    Annonymous object
 *    new 부모 Interface(){
 *        @Override
 *        max
 *    }
 *
 *
 *    MyFunction Interface를 구현한 Annonymous class(object)를 Lambda로 대체 가능한 이유는
 *    내부적으로 Lambda도 실제로 Annonymous object이기 때문
 *    1개의 abstract method가 선언된 Intereface를 정의해서 Lambda Expression으로 다루자
 *    -> Lambda를 다루기 위한 interface를 functional interface라고 한다.
 *
 * Functional Interface 예제
 * parameter와 return에 대한 설명 예제
 * @FunctionalInterface
 * interface MyFunction{
 *   void test();
 * }
 * MyFunction myfunc = ()-> System.out.println("test");
 *
 * class X{
 *   void disp(MyFunction f){
 *     f.test();
 *   }
 * }
 *
 * obj.disp(() -> ystem.out.println("test")); Lambda가 매개변수로 쓰이는 경우
 * Functional Interface type(Lambda Expression)의 return 자료형인 경우
 * class Y{
 *    MyFunction disp2(){
 *      //MyFunction f = ()->{};
 *      //return f;
 *      return () -> {};
 *  }
 * }
 *
 * Lambda Expression의 type과 casting
 * @FunctionalInterface
 * interface MyFunction{
 *    void myMethod();
 * }
 * MyFunction f = () -> {}; 이거 형이 맞지 않는다는 오류가 생겨
 * MyFunction f = (MyFunction)(() -> {});이렇게 바뀌어야 해
 *
 * Functional Interface로 Lambda를 참조할 수 있을 뿐이지
 * Lambda의 type과 Functional Interface의 type은 일치하지 않는다.
 * 그래서 type에 맞게 casting은 해 주어야 한다.
 *
 * 외부 변수를 참조하는 Lambda Expression
 * 밑에 Outer Class, Inner Class 참고
 *
 * java.util.function package
 * generics method 사용하면 type은 중요하지 않아(compile 할 때 줄 거니까)
 *   대부분의 모든 class 안에 있는 method들은 비슷하다.
 *   매개변수 갯수(대부분 3개 이하), 리턴값(별로 없음)이 비슷~~
 *   자주 사용되는 형식의 method를 Functional Interface로 정의해서 java.util.function이란 package에 정의
 *   이유 : 개발자마다 매번 새로운 functional interface를 정의하지 말고
 *         가능하면 이 package 안에 있는 functional interface를 활용하라는 의미
 *         ( 표준화, 재사용, 유지보수 용이 )
 *
 *  java.util.function 패키지의 주요 함수형 인터페이스
 *        *     1) java.lang.Runnable         void run()           매 0, 리 0
 *        *     2) Supplier<T>                T get()              매 0, 리 1
 *        *     3) Consumer<T>                void accept(T t)     매 1, 리 0
 *        *     4) Function<T,R>              R apply(T t)         매 1, 리 1
 *        *     5) Predicate<T>               boolean test(T t)    매 1, 리턴타입 boolean
 *        *
 *
 * 매개변수가 두 개인 Functional Interface는 "Bi"라는 접두사가 붙어있어.
 *        *    1) BiConsumer<T,U>      void accept(T t, U u)
 *        *    2) BiPredicate<T,U>      boolean test(T t, U u)
 *        *    3) BiFunction<T,U,R>      R apply(T t, U u)
 *
 *
 *
 */
public class Ex01 {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(4);
    al.add(5);
    al.add(32);
    al.removeIf((t)->(t>=10));

    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");

//    Collections.sort(list, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o2.compareTo(o1);//내림차순
//      }
//    });
    Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
    Collections.sort(list, Comparator.reverseOrder());
//    위 둘은 같아

  }

}//class
@FunctionalInterface
interface MyFunction{
  void myMethod();
}
class Outer{
  int val = 10; //Outer.this.val
  class Inner{
    int val = 20; // this.val
    void method(int i){
      int val = 30;//final int val = 30; 상수
      MyFunction f = ()->{
        System.out.println(i);//method의 매개변수 i
        System.out.println(val);//int val = 30;를 나타내는 것
        System.out.println(this.val);//int val = 20;를 의미
        System.out.println(Outer.this.val);//int val = 10;를 의

      };
      f.myMethod();//호출
    }
  }
}