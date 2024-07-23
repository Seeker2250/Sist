package days15;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class Car {
  //  field
  String name;
  String gearType;
  int door=0;

  //  Engine engine = new Engine();//class type, has-a relation 이거 new Engine() 안해주면 null pointer exception
//근데 이거 결합도가 너무 높으니까 버리자
  private Engine engine = null;

  //  constructor
  Car(Engine engine) {
  //  this.engine = engine;
  }

  Car() {

    //this.engine = engine;
  }

  //  getter setter
  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  //  method
  void speedUp(int fuel) {
    this.engine.moreFuel(fuel);
  }

  void speedDown(int fuel) {
    this.engine.lessFuel(fuel);
  }

  void stop() {
    this.engine.stop();
  }

  ;
}
