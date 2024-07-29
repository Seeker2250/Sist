package days20;

import java.util.ArrayList;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject <? extends T>
 * @Contents <? super T>
 * <?> == <? extends Object>
 * 와일드카드
 */
public class Ex08_06 {
  public static void main(String[] args) {

    FruitBox<Fruit> fruitBox = new FruitBox<>();
    FruitBox<Apple> appleBox = new FruitBox<>();
    FruitBox<Grape> grapeBox = new FruitBox<>();

    Juice juice = Juicer.makeJuice(fruitBox);
    Juice juice2 = Juicer.makeJuice(appleBox);
    Juice juice3 = Juicer.makeJuice(grapeBox);


  }//main
}//class

class Fruit extends Object {
  public String toString() {
    return "Fruit";
  }
}

class Apple extends Fruit {
  public String toString() {
    return "Apple";
  }
}

class Grape extends Fruit {
  @Override
  public String toString() {
    return "Grape";
  }
}

class Box5<T> {//Fruit에서 상속 받았으면서 eatable의 concreete class(Fruit가 eatable이라 ㄱㅊ)
  ArrayList<T> list = new ArrayList<T>();

  void add(T item) {
    this.list.add(item);
  }

  int size() {
    return this.list.size();
  }

  T get(int i) {
    return this.list.get(i);
  }

  public String toString() {
    return this.list.toString();
  }

}

class Toy {
  public String toString() {
    return "Toy";
  }
}

class FruitBox<T extends Fruit> extends Box5<T> {

}
//일반 class = Juice
class Juice {//과일 상자로부터 만들어질 것

}

//과일 (사과, 포도)로부터 쥬스를 만드는 기기
class Juicer {/*
  static Juice makeJuice(FruitBox<?> box){//juice instance 안 만들어도 되도록 static
    return new Juice();
  }*/
//  위의 static method(makeJuice)를 generic method로 수정
//  [generic method] - method 선언부에 generic type이 선언된 method를 generic method라고 함
//  선언 형식 : [access modifier] [static] <T> [return type] [generic method name] (parameter)
static <T extends Fruit>Juice makeJuice(FruitBox<T>box){//juice instance 안 만들어도 되도록 static
  return new Juice();//generic method
}

  /* 제네릭 타입의 매개변수는 overloading 허용 안해
  해결 방안 : ?(wildcard, object와 같은 의미)
  static Juice makeJuice(FruitBox<Fruit> box){//juice instance 안 만들어도 되도록 static
    return new Juice();-> 위에 generic method랑 같은 놈이야
  }
  static Juice makeJuice(FruitBox<Apple> box){//juice instance 안 만들어도 되도록 static
    return new Juice();
  }
  static Juice makeJuice(FruitBox<Grape> box){//juice instance 안 만들어도 되도록 static
    return new Juice();
  }*/
}//generic method example
//public static void printAll(ArrayList<? extends Product> list,
//                            ArrayList<? extends Product> list2)
//{}
//      위 아래는 같아
//public static <T extends Product> void printAll(ArrayList<T> list,
//                                                ArrayList<T> list2)
//{}

//              <T extends Comparable<? super T>> Comparable로부터 모든 부모들까지 포함