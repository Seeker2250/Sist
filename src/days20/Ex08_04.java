package days20;

import java.util.ArrayList;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject generic class에 객체 생성 및 사용
 * @Contents
 */
public class Ex08_04 {
  public static void main(String[] args) {
//    Box3<Fruit> fruitBox = new Box3<>();
//    Box3<Apple> appleBox = new Box3<>();
//    Box3<Grape> grapeBox = new Box3<>();
//    Box3<Toy> toyBox = new Box3<>();
//
////    Box3<Apple> box1 = new Box3<Grape>(); 타입이 일치해야지
////    Box3<Fruit> box1 = new Box3<Grape>(); 이것도 안되지. 공변, 반공변 지원 안해
//    fruitBox.add(new Apple());
//    fruitBox.add(new Grape());
////    fruitBox.add(new Toy()); 상속 관계가 없으니 당연히 안되지

  }
}
/*
class Fruit extends Object{
  public String toString() {
    return "Fruit";
  }
}
class Apple extends Fruit{
  public String toString() {
    return "Apple";
  }
}
class Grape extends Fruit{
  public String toString() {
    return "Grape";
  }
}

class Toy{
  public String toString() {
    return "Toy";
  }

}
class Box3 <T> {
  ArrayList<T> list = new ArrayList<T>();
  void add(T item) {  this.list.add(item); }
  int size() { return this.list.size(); }
  T get(int i) { return this.list.get(i); }
  public String toString() { return  this.list.toString();  }
}
*/