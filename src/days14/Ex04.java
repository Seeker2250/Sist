package days14;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject class들 간의 관계
 * @Contents is-a(상속), has-a(포함)관계
 *           has-a 관계
 *           A class와 B class를 가지는 관계
 *           예시) 차 - 엔진
 */
public class Ex04 {
  public static void main(String[] args) {

    Engine engine = new Engine();

//    의존성 주입(DI), Dependency Injection
    Car myCar = new Car(engine);//생성자로 주입

//    생성자로 주입
//    setter로 주입
    myCar.setEngine(engine);//setter로 주입
    myCar.speedUp(10);
    double currentSpeed = myCar.getEngine().speed;//private이니까 get으로 떠오자

    System.out.println("현재 속도는 : "+currentSpeed);
    Car myCar2 = new Car(engine);
    myCar2.speedUp(1000);
    double currentSpeed2 = myCar2.getEngine().speed;
    System.out.println("현재 속도는 : "+currentSpeed2);
    System.out.println();//println은 out꺼야. speed가 engine소속인 거랑 같아


  }
}
