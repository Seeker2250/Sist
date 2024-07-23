package days17;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex04 {
  public static void main(String[] args) {
//    Boxing
    int i = 100;//primitive int
//    primitive data type -> wrapper class casting
//    == Auto Boxing
    Integer j = i;//wrapper class int, object
    System.out.println(j);
//     Unboxing
//    Wrapper class -> primitive data type
//    == Auto Unboxing
    int k = j;
    System.out.println(k);

    test(1);//int -> Integer -> Object
    test(3.14);
    test(true);
    test('a');
    test('a', 345, "asfgrgjis", 1.3456, "alkjd");
  }//main
  public static void test(Object... o){

  }
}//class
