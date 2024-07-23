package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject
 * @Contents
 */
public class Ex09 {
  public static void main(String[] args) {
//    Relationship of Class
//    1) has-a  : Engine, Car
//    2) is-a   : Employee, Regular

//    HEngine
    Engine hengine = new HEngine();
    Car c1 = new Car(null);
    System.out.println(c1.hashCode());
    Car c2 = new Car();
    System.out.println(c2.hashCode());
    Engine kengine = new KEngine();
    Car c100001 = new Car();
    System.out.println(c100001.hashCode());
    Engine sengine = new SEngine();
    Car c928421 = new Car();
    System.out.println(c928421.hashCode());
  }//main
}//class
