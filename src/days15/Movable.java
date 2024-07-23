package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject
 * @Contents
 */

//                  able : 가능
public interface Movable {
  int COLOR = 1;//public staic final 생략

  void move(int x, int y);//public abstract 생략
}

abstract class Unit {
  int currentHP; //현재 유닛의 체력
  int x;  //현재 유닛의 x좌표
  int y;  //현재 유닛의 y좌표
}

interface Attackable {
  void attack(Unit unit);//이 유닛을 공격
}

interface Fightable extends Movable, Attackable {//multiple inheritance

}

class AirUnit extends Unit {

}

class GroundUnit extends Unit {

}

class DropShip extends AirUnit implements Movable, Attackable {
  @Override
  public void move(int x, int y) {

  }

  @Override
  public void attack(Unit unit) {

  }
}


//군인
class Fighter extends GroundUnit implements Fightable {
  @Override
  public void move(int x, int y) {

  }

  @Override
  public void attack(Unit unit) {

  }
}

class Tank extends GroundUnit implements Fightable, Repairable {
  @Override
  public void move(int x, int y) {
//    무한궤도로 이동
  }

  @Override
  public void attack(Unit unit) {
//    포 공격
  }
}

interface Repairable {
}

//공격, 수리, 건축
//수리 가능 : tank, scv->repairable을 주자
//수리 불가능 : fighter
class SCV extends GroundUnit implements Fightable, Repairable {
  @Override
  public void move(int x, int y) {

  }

  @Override
  public void attack(Unit unit) {

   }
   void repair(Repairable unit) {//repair하는 method, interface parameter polymorphism
      if(unit instanceof Tank){
//        탱크 수리 코딩
      } else if (unit instanceof SCV) {
//        SCV 수리 코딩
      }
   }
}
//해상
class Marine extends Unit implements Fightable, Movable{
  @Override
  public void move(int x, int y) {

  }

  @Override
  public void attack(Unit unit) {

  }
}