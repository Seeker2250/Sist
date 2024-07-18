package days14;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class Engine {
//    field
  double speed;



//  constructor



//    method
  void moreFuel(int fuel) {
    this.speed += (double)fuel * 0.05;
  }

  void lessFuel(int fuel) {
    this.speed -= fuel * 0.05;
  }

  void stop() {
    this.speed = 0;
  }
}
